package typings.dwt.addonOCRMod

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRLanguage
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCROutputFormat
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRPageSetMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OCR extends js.Object {
  
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
