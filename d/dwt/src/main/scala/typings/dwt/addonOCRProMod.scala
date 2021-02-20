package typings.dwt

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRFindTextAction
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRFindTextFlags
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProOutputFormat
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProPDFAVersion
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProPDFVersion
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProRecognitionModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addonOCRProMod {
  
  @js.native
  trait Error extends StObject {
    
    /**
      * Return the index of the image or path of the file.
      */
    def GetInput(): Double | String = js.native
    
    /**
      * Return the error message.
      */
    def GetMessage(): String = js.native
    
    /**
      * Return the number of the page on which the error was thrown.
      * If the input is a file, this returns the index of the page in that file.
      * If the input is an image in the buffer, this always returns 0.
      */
    def GetPage(): Double = js.native
  }
  object Error {
    
    @scala.inline
    def apply(GetInput: () => Double | String, GetMessage: () => String, GetPage: () => Double): Error = {
      val __obj = js.Dynamic.literal(GetInput = js.Any.fromFunction0(GetInput), GetMessage = js.Any.fromFunction0(GetMessage), GetPage = js.Any.fromFunction0(GetPage))
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetInput(value: () => Double | String): Self = StObject.set(x, "GetInput", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMessage(value: () => String): Self = StObject.set(x, "GetMessage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPage(value: () => Double): Self = StObject.set(x, "GetPage", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Letter extends StObject {
    
    /**
      * Return the coordinates for the rectangle that contains the specified letter. The coordinates are in the sequence of "left,top,right,bottom" like "121,125,123,143".
      */
    def GetLetterRect(): String = js.native
    
    /**
      * Return the text of the letter.
      */
    def GetText(): Double = js.native
  }
  object Letter {
    
    @scala.inline
    def apply(GetLetterRect: () => String, GetText: () => Double): Letter = {
      val __obj = js.Dynamic.literal(GetLetterRect = js.Any.fromFunction0(GetLetterRect), GetText = js.Any.fromFunction0(GetText))
      __obj.asInstanceOf[Letter]
    }
    
    @scala.inline
    implicit class LetterMutableBuilder[Self <: Letter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetLetterRect(value: () => String): Self = StObject.set(x, "GetLetterRect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetText(value: () => Double): Self = StObject.set(x, "GetText", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait OCRPro extends StObject {
    
    /**
      * Download and install the OCR Professional add-on on the local system.
      * @param path The URL to download the add-on (typically a ZIP file).
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def Download(
      path: String,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Return whether the OCR Professional engine has been installed.
      */
    def IsModuleInstalled(): Boolean = js.native
    
    /**
      * Perform OCR on the specified image in the buffer.
      * @param index Specify the image.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument imageId The imageId of the image which can be used to find the index.
      * @argument result The OCR result.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def Recognize(
      index: Double,
      successCallback: js.Function2[/* imageId */ Double, /* result */ OCRProResult, Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Perform OCR on the specified local file.
      * @param path Specify a local file.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument path The file path.
      * @argument result The OCR result.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def RecognizeFile(
      path: String,
      successCallback: js.Function2[/* path */ String, /* result */ OCRProResult, Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Perform OCR on the specified rectangular area(s) on the image.
      * @param index Specify the image.
      * @param aryRects Specify the rectangle(s).
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument imageId The imageId of the image which can be used to find the index.
      * @argument result The OCR result.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def RecognizeRect(
      index: Double,
      aryRects: js.Array[Rect],
      successCallback: js.Function3[/* imageId */ Double, /* aryRects */ js.Array[Rect], /* result */ OCRProResult, Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Perform OCR on the selected images in the buffer.
      * @param index Specify the image.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument result The OCR result.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def RecognizeSelectedImages(
      successCallback: js.Function1[/* result */ OCRProResult, Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Return or set the current settings of the OCR engine.
      */
    var Settings: typings.dwt.addonOCRProMod.Settings | Boolean | Null = js.native
  }
  object OCRPro {
    
    @scala.inline
    def apply(
      Download: (String, js.Function0[Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit,
      IsModuleInstalled: () => Boolean,
      Recognize: (Double, js.Function2[/* imageId */ Double, /* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit,
      RecognizeFile: (String, js.Function2[/* path */ String, /* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit,
      RecognizeRect: (Double, js.Array[Rect], js.Function3[/* imageId */ Double, /* aryRects */ js.Array[Rect], /* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit,
      RecognizeSelectedImages: (js.Function1[/* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit
    ): OCRPro = {
      val __obj = js.Dynamic.literal(Download = js.Any.fromFunction3(Download), IsModuleInstalled = js.Any.fromFunction0(IsModuleInstalled), Recognize = js.Any.fromFunction3(Recognize), RecognizeFile = js.Any.fromFunction3(RecognizeFile), RecognizeRect = js.Any.fromFunction4(RecognizeRect), RecognizeSelectedImages = js.Any.fromFunction2(RecognizeSelectedImages))
      __obj.asInstanceOf[OCRPro]
    }
    
    @scala.inline
    implicit class OCRProMutableBuilder[Self <: OCRPro] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownload(
        value: (String, js.Function0[Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit
      ): Self = StObject.set(x, "Download", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIsModuleInstalled(value: () => Boolean): Self = StObject.set(x, "IsModuleInstalled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRecognize(
        value: (Double, js.Function2[/* imageId */ Double, /* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit
      ): Self = StObject.set(x, "Recognize", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRecognizeFile(
        value: (String, js.Function2[/* path */ String, /* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit
      ): Self = StObject.set(x, "RecognizeFile", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRecognizeRect(
        value: (Double, js.Array[Rect], js.Function3[/* imageId */ Double, /* aryRects */ js.Array[Rect], /* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit
      ): Self = StObject.set(x, "RecognizeRect", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRecognizeSelectedImages(
        value: (js.Function1[/* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit
      ): Self = StObject.set(x, "RecognizeSelectedImages", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSettings(value: Settings | Boolean): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsNull: Self = StObject.set(x, "Settings", null)
    }
  }
  
  @js.native
  trait OCRProResult extends StObject {
    
    /**
      * Return a base64 string that contains the result of the OCR.
      */
    def Get(): String = js.native
    
    /**
      * Return the number of pages already OCR'd on the machine.
      */
    def GetAlreadyOCRCount(): String = js.native
    
    /**
      * Return the error code.
      */
    def GetErrorCode(): Double = js.native
    
    /**
      * Return an array which contains detailed error information for each page that was OCR'd
      */
    def GetErrorDetailList(): js.Array[Error] = js.native
    
    /**
      * Return the error string.
      */
    def GetErrorString(): String = js.native
    
    /**
      * Return the source information. It could be the index of the OCR'd image or the path of the OCR'd file.
      */
    def GetInput(): Double | String = js.native
    
    /**
      * Return the number of pages allowed by the current license.
      */
    def GetOCRTotalCount(): String = js.native
    
    /**
      * Return the content of a page.
      * @param index Specify the page
      */
    def GetPageContent(index: Double): Page = js.native
    
    /**
      * Return the number of pages in the OCR result.
      */
    def GetPageCount(): String = js.native
    
    /**
      * Save the OCR result as a file.
      * @param path The path to save the file.
      */
    def Save(path: String): Boolean = js.native
  }
  object OCRProResult {
    
    @scala.inline
    def apply(
      Get: () => String,
      GetAlreadyOCRCount: () => String,
      GetErrorCode: () => Double,
      GetErrorDetailList: () => js.Array[Error],
      GetErrorString: () => String,
      GetInput: () => Double | String,
      GetOCRTotalCount: () => String,
      GetPageContent: Double => Page,
      GetPageCount: () => String,
      Save: String => Boolean
    ): OCRProResult = {
      val __obj = js.Dynamic.literal(Get = js.Any.fromFunction0(Get), GetAlreadyOCRCount = js.Any.fromFunction0(GetAlreadyOCRCount), GetErrorCode = js.Any.fromFunction0(GetErrorCode), GetErrorDetailList = js.Any.fromFunction0(GetErrorDetailList), GetErrorString = js.Any.fromFunction0(GetErrorString), GetInput = js.Any.fromFunction0(GetInput), GetOCRTotalCount = js.Any.fromFunction0(GetOCRTotalCount), GetPageContent = js.Any.fromFunction1(GetPageContent), GetPageCount = js.Any.fromFunction0(GetPageCount), Save = js.Any.fromFunction1(Save))
      __obj.asInstanceOf[OCRProResult]
    }
    
    @scala.inline
    implicit class OCRProResultMutableBuilder[Self <: OCRProResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: () => String): Self = StObject.set(x, "Get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAlreadyOCRCount(value: () => String): Self = StObject.set(x, "GetAlreadyOCRCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetErrorCode(value: () => Double): Self = StObject.set(x, "GetErrorCode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetErrorDetailList(value: () => js.Array[Error]): Self = StObject.set(x, "GetErrorDetailList", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetErrorString(value: () => String): Self = StObject.set(x, "GetErrorString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInput(value: () => Double | String): Self = StObject.set(x, "GetInput", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOCRTotalCount(value: () => String): Self = StObject.set(x, "GetOCRTotalCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPageContent(value: Double => Page): Self = StObject.set(x, "GetPageContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPageCount(value: () => String): Self = StObject.set(x, "GetPageCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSave(value: String => Boolean): Self = StObject.set(x, "Save", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Page extends StObject {
    
    /**
      * Return the content of the specified letter.
      * @index Specify the letter.
      */
    def GetLetterContent(index: Double): Letter = js.native
    
    /**
      * Return the number of letters in the page.
      */
    def GetLetterCount(): Double = js.native
    
    /**
      * Return the base64-encoded content of the specified rectangle.
      * @index Specify the line.
      */
    def GetZoneContent(index: Double): String = js.native
    
    /**
      * Return the number of recognized rectangles in the page.
      */
    def GetZoneCount(): Double = js.native
  }
  object Page {
    
    @scala.inline
    def apply(
      GetLetterContent: Double => Letter,
      GetLetterCount: () => Double,
      GetZoneContent: Double => String,
      GetZoneCount: () => Double
    ): Page = {
      val __obj = js.Dynamic.literal(GetLetterContent = js.Any.fromFunction1(GetLetterContent), GetLetterCount = js.Any.fromFunction0(GetLetterCount), GetZoneContent = js.Any.fromFunction1(GetZoneContent), GetZoneCount = js.Any.fromFunction0(GetZoneCount))
      __obj.asInstanceOf[Page]
    }
    
    @scala.inline
    implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetLetterContent(value: Double => Letter): Self = StObject.set(x, "GetLetterContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLetterCount(value: () => Double): Self = StObject.set(x, "GetLetterCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetZoneContent(value: Double => String): Self = StObject.set(x, "GetZoneContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetZoneCount(value: () => Double): Self = StObject.set(x, "GetZoneCount", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Rect extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
  }
  object Rect {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): Rect = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    @scala.inline
    implicit class RectMutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Redaction extends StObject {
    
    /**
      * Specify the text to redact.
      */
    var FindText: String = js.native
    
    /**
      * Specify how redaction is done.
      */
    var FindTextAction: EnumDWTOCRFindTextAction | Double = js.native
    
    /**
      * Specify how the text is found.
      */
    var FindTextFlags: EnumDWTOCRFindTextFlags | Double = js.native
  }
  object Redaction {
    
    @scala.inline
    def apply(
      FindText: String,
      FindTextAction: EnumDWTOCRFindTextAction | Double,
      FindTextFlags: EnumDWTOCRFindTextFlags | Double
    ): Redaction = {
      val __obj = js.Dynamic.literal(FindText = FindText.asInstanceOf[js.Any], FindTextAction = FindTextAction.asInstanceOf[js.Any], FindTextFlags = FindTextFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Redaction]
    }
    
    @scala.inline
    implicit class RedactionMutableBuilder[Self <: Redaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindText(value: String): Self = StObject.set(x, "FindText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindTextAction(value: EnumDWTOCRFindTextAction | Double): Self = StObject.set(x, "FindTextAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindTextFlags(value: EnumDWTOCRFindTextFlags | Double): Self = StObject.set(x, "FindTextFlags", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Settings extends StObject {
    
    /**
      * Specify the target language.
      */
    var Languages: String = js.native
    
    /**
      * Specify the URL for the license checker.
      */
    var LicenseChecker: String = js.native
    
    /**
      * Specify the output format.
      */
    var OutputFormat: EnumDWTOCRProOutputFormat | String = js.native
    
    /**
      * Specify the PDF/A version.
      */
    var PDFAVersion: EnumDWTOCRProPDFAVersion | String = js.native
    
    /**
      * Specify the PDF version.
      */
    var PDFVersion: EnumDWTOCRProPDFVersion | String = js.native
    
    /**
      * Specify the recognition module.
      */
    var RecognitionModule: EnumDWTOCRProRecognitionModule | String = js.native
    
    /**
      * Configure the redaction.
      */
    var Redaction: typings.dwt.addonOCRProMod.Redaction = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(
      Languages: String,
      LicenseChecker: String,
      OutputFormat: EnumDWTOCRProOutputFormat | String,
      PDFAVersion: EnumDWTOCRProPDFAVersion | String,
      PDFVersion: EnumDWTOCRProPDFVersion | String,
      RecognitionModule: EnumDWTOCRProRecognitionModule | String,
      Redaction: Redaction
    ): Settings = {
      val __obj = js.Dynamic.literal(Languages = Languages.asInstanceOf[js.Any], LicenseChecker = LicenseChecker.asInstanceOf[js.Any], OutputFormat = OutputFormat.asInstanceOf[js.Any], PDFAVersion = PDFAVersion.asInstanceOf[js.Any], PDFVersion = PDFVersion.asInstanceOf[js.Any], RecognitionModule = RecognitionModule.asInstanceOf[js.Any], Redaction = Redaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguages(value: String): Self = StObject.set(x, "Languages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseChecker(value: String): Self = StObject.set(x, "LicenseChecker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFormat(value: EnumDWTOCRProOutputFormat | String): Self = StObject.set(x, "OutputFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPDFAVersion(value: EnumDWTOCRProPDFAVersion | String): Self = StObject.set(x, "PDFAVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPDFVersion(value: EnumDWTOCRProPDFVersion | String): Self = StObject.set(x, "PDFVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecognitionModule(value: EnumDWTOCRProRecognitionModule | String): Self = StObject.set(x, "RecognitionModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedaction(value: Redaction): Self = StObject.set(x, "Redaction", value.asInstanceOf[js.Any])
    }
  }
}
