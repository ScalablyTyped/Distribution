package typings.dwt

import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRLanguage
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCROutputFormat
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRPageSetMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addonDotOCRMod {
  
  trait Line extends StObject {
    
    /**
      * Return the coordinates for the rectangle that contains the specified line. The coordinates are in the sequence of "left,top,right,bottom" like "121,125,892,143".
      */
    def GetLineRect(): String
    
    /**
      * Return the content of the specified word.
      * @param index Specify the word.
      */
    def GetWordContent(index: Double): Word
    
    /**
      * Return the number of words in the line.
      */
    def GetWordCount(): Double
  }
  object Line {
    
    inline def apply(GetLineRect: () => String, GetWordContent: Double => Word, GetWordCount: () => Double): Line = {
      val __obj = js.Dynamic.literal(GetLineRect = js.Any.fromFunction0(GetLineRect), GetWordContent = js.Any.fromFunction1(GetWordContent), GetWordCount = js.Any.fromFunction0(GetWordCount))
      __obj.asInstanceOf[Line]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
      
      inline def setGetLineRect(value: () => String): Self = StObject.set(x, "GetLineRect", js.Any.fromFunction0(value))
      
      inline def setGetWordContent(value: Double => Word): Self = StObject.set(x, "GetWordContent", js.Any.fromFunction1(value))
      
      inline def setGetWordCount(value: () => Double): Self = StObject.set(x, "GetWordCount", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait OCR extends StObject {
    
    /**
      * Download and install the OCR add-on on the local system.
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
      * Download and install an OCR language package.
      * @param path The URL to download the package (typically a ZIP file).
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def DownloadLangData(
      path: String,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Return whether the output uses the fonts detected by the OCR system or the default/provided ones. Only valid when the result format is PDF.
      */
    def GetIfUseDetectedFont(): Boolean = js.native
    
    /**
      * Return the font size base to apply higher-level regional accurate OCR.
      */
    def GetMinFontSizeforMoreAccurateResult(): Double = js.native
    
    /**
      * Return the font name for OCR. Only valid when the output format is PDF.
      */
    def GetUnicodeFontName(): String = js.native
    
    /**
      * Return whether the OCR engine has been installed.
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
      successCallback: js.Function2[/* imageId */ Double, /* result */ OCRResult, Unit],
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
      successCallback: js.Function2[/* path */ String, /* result */ OCRResult, Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Perform OCR on the specified rectangular area on the image.
      * @param index Specify the image.
      * @param left Specify the rectangle (leftmost coordinate).
      * @param top Specify the rectangle (topmost coordinate).
      * @param right Specify the rectangle (rightmost coordinate).
      * @param bottom Specify the rectangle (bottommost coordinate).
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument imageId The imageId of the image which can be used to find the index.
      * @argument result The OCR result.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def RecognizeRect(
      index: Double,
      left: Double,
      top: Double,
      right: Double,
      bottom: Double,
      successCallback: js.Function6[
          /* imageId */ Double, 
          /* left */ Double, 
          /* top */ Double, 
          /* right */ Double, 
          /* bottom */ Double, 
          /* result */ OCRResult, 
          Unit
        ],
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
      successCallback: js.Function1[/* result */ OCRResult, Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Set whether the output uses the fonts detected by the OCR system or the default/provided ones. Only valid when the result format is PDF.
      * @param value Whether to use or not the detected font.
      */
    def SetIfUseDetectedFont(value: Boolean): Boolean = js.native
    
    def SetLanguage(language: String): Boolean = js.native
    /**
      * Configure the OCR operation.
      * @param language Specify the target language.
      */
    def SetLanguage(language: EnumDWTOCRLanguage): Boolean = js.native
    
    /**
      * Set the font size base to apply higher-level regional accurate OCR.
      * @param size Specify the size.
      */
    def SetMinFontSizeforMoreAccurateResult(size: Double): Double = js.native
    
    def SetOutputFormat(format: Double): Boolean = js.native
    /**
      * Configure the OCR operation.
      * @param format Specify the output format.
      */
    def SetOutputFormat(format: EnumDWTOCROutputFormat): Boolean = js.native
    
    def SetPageSetMode(mode: Double): Boolean = js.native
    /**
      * Configure the OCR operation.
      * @param mode Specify the OCR page layout analysis mode.
      */
    def SetPageSetMode(mode: EnumDWTOCRPageSetMode): Boolean = js.native
    
    /**
      * Set the font name for OCR. Only valid when the output format is PDF.
      * @param name Specify a font to be used for the OCR.
      */
    def SetUnicodeFontName(name: String): Boolean = js.native
  }
  
  trait OCRResult extends StObject {
    
    /**
      * Return a base64 string that contains the result of the OCR.
      * Newlines are represented by the newline character: '\n'.
      */
    def Get(): String
    
    /**
      * Return the error code.
      */
    def GetErrorCode(): Double
    
    /**
      * Return the error string.
      */
    def GetErrorString(): String
    
    /**
      * Return the output format.
      */
    def GetFormat(): Double
    
    /**
      * Return the source information. It could be the index of the OCR'd image or the path of the OCR'd file.
      */
    def GetInput(): Double | String
    
    /**
      * Return the content of a pageset.
      * @param index Specify the pageset
      */
    def GetPageSetContent(index: Double): PageSet
    
    /**
      * Return the number of pagesets in the OCR result.
      */
    def GetPageSetCount(): Double
    
    /**
      * Save the OCR result as a file.
      * @param path The path to save the file.
      */
    def Save(path: String): Boolean
  }
  object OCRResult {
    
    inline def apply(
      Get: () => String,
      GetErrorCode: () => Double,
      GetErrorString: () => String,
      GetFormat: () => Double,
      GetInput: () => Double | String,
      GetPageSetContent: Double => PageSet,
      GetPageSetCount: () => Double,
      Save: String => Boolean
    ): OCRResult = {
      val __obj = js.Dynamic.literal(Get = js.Any.fromFunction0(Get), GetErrorCode = js.Any.fromFunction0(GetErrorCode), GetErrorString = js.Any.fromFunction0(GetErrorString), GetFormat = js.Any.fromFunction0(GetFormat), GetInput = js.Any.fromFunction0(GetInput), GetPageSetContent = js.Any.fromFunction1(GetPageSetContent), GetPageSetCount = js.Any.fromFunction0(GetPageSetCount), Save = js.Any.fromFunction1(Save))
      __obj.asInstanceOf[OCRResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OCRResult] (val x: Self) extends AnyVal {
      
      inline def setGet(value: () => String): Self = StObject.set(x, "Get", js.Any.fromFunction0(value))
      
      inline def setGetErrorCode(value: () => Double): Self = StObject.set(x, "GetErrorCode", js.Any.fromFunction0(value))
      
      inline def setGetErrorString(value: () => String): Self = StObject.set(x, "GetErrorString", js.Any.fromFunction0(value))
      
      inline def setGetFormat(value: () => Double): Self = StObject.set(x, "GetFormat", js.Any.fromFunction0(value))
      
      inline def setGetInput(value: () => Double | String): Self = StObject.set(x, "GetInput", js.Any.fromFunction0(value))
      
      inline def setGetPageSetContent(value: Double => PageSet): Self = StObject.set(x, "GetPageSetContent", js.Any.fromFunction1(value))
      
      inline def setGetPageSetCount(value: () => Double): Self = StObject.set(x, "GetPageSetCount", js.Any.fromFunction0(value))
      
      inline def setSave(value: String => Boolean): Self = StObject.set(x, "Save", js.Any.fromFunction1(value))
    }
  }
  
  trait Page extends StObject {
    
    /**
      * Return the content of the specified line.
      * @param index Specify the line.
      */
    def GetLineContent(index: Double): Line
    
    /**
      * Return the number of lines in the page.
      */
    def GetLineCount(): Double
  }
  object Page {
    
    inline def apply(GetLineContent: Double => Line, GetLineCount: () => Double): Page = {
      val __obj = js.Dynamic.literal(GetLineContent = js.Any.fromFunction1(GetLineContent), GetLineCount = js.Any.fromFunction0(GetLineCount))
      __obj.asInstanceOf[Page]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
      
      inline def setGetLineContent(value: Double => Line): Self = StObject.set(x, "GetLineContent", js.Any.fromFunction1(value))
      
      inline def setGetLineCount(value: () => Double): Self = StObject.set(x, "GetLineCount", js.Any.fromFunction0(value))
    }
  }
  
  trait PageSet extends StObject {
    
    /**
      * Return the content of the specified page.
      * @param index Specify the page.
      */
    def GetPageContent(index: Double): Page
    
    /**
      * Return the number of pages in the pageset.
      */
    def GetPageCount(): Double
  }
  object PageSet {
    
    inline def apply(GetPageContent: Double => Page, GetPageCount: () => Double): PageSet = {
      val __obj = js.Dynamic.literal(GetPageContent = js.Any.fromFunction1(GetPageContent), GetPageCount = js.Any.fromFunction0(GetPageCount))
      __obj.asInstanceOf[PageSet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageSet] (val x: Self) extends AnyVal {
      
      inline def setGetPageContent(value: Double => Page): Self = StObject.set(x, "GetPageContent", js.Any.fromFunction1(value))
      
      inline def setGetPageCount(value: () => Double): Self = StObject.set(x, "GetPageCount", js.Any.fromFunction0(value))
    }
  }
  
  trait Word extends StObject {
    
    /**
      * Return the font name/size of the word.
      */
    def GetFontName(): String
    
    def GetFontSize(): Double
    
    /**
      * Return the text of the word.
      */
    def GetText(): String
    
    /**
      * Return the coordinates for the rectangle that contains the specified word. The coordinates are in the sequence of "left,top,right,bottom" like "121,126,157,139".
      * @param index Specify the word.
      */
    def GetWordRect(index: Double): String
  }
  object Word {
    
    inline def apply(
      GetFontName: () => String,
      GetFontSize: () => Double,
      GetText: () => String,
      GetWordRect: Double => String
    ): Word = {
      val __obj = js.Dynamic.literal(GetFontName = js.Any.fromFunction0(GetFontName), GetFontSize = js.Any.fromFunction0(GetFontSize), GetText = js.Any.fromFunction0(GetText), GetWordRect = js.Any.fromFunction1(GetWordRect))
      __obj.asInstanceOf[Word]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Word] (val x: Self) extends AnyVal {
      
      inline def setGetFontName(value: () => String): Self = StObject.set(x, "GetFontName", js.Any.fromFunction0(value))
      
      inline def setGetFontSize(value: () => Double): Self = StObject.set(x, "GetFontSize", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => String): Self = StObject.set(x, "GetText", js.Any.fromFunction0(value))
      
      inline def setGetWordRect(value: Double => String): Self = StObject.set(x, "GetWordRect", js.Any.fromFunction1(value))
    }
  }
}
