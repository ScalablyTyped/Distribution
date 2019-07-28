package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
@js.native
trait OCR extends js.Object {
  /**
    *  Downloads and installs the ocr add-on on the local system. 
    * @method Dynamsoft.WebTwain#Download 
    * @param {string} remoteFile specifies the value of which frame to get.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the download succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the download fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def Download(remoteFile: String): Unit = js.native
  def Download(remoteFile: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Unit = js.native
  def Download(
    remoteFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function0[Unit]
  ): Unit = js.native
  /**
    *  Downloads and deploys the OCR language package on the local system. 
    * @method Dynamsoft.WebTwain#DownloadLangData 
    * @param {string} remoteFile specifies the value of which frame to get.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the download succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the download fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def DownloadLangData(remoteFile: String): Unit = js.native
  def DownloadLangData(remoteFile: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Unit = js.native
  def DownloadLangData(
    remoteFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function0[Unit]
  ): Unit = js.native
  /**
    *  Returns whether PDF output should use the fonts detected by the OCR system, or the default/provided fonts instead.
    * @method Dynamsoft.WebTwain#GetIfUseDetectedFont 
    * @return {boolean} Returns whether PDF output should use the fonts detected by the OCR system, or the default/provided fonts instead.
    */
  def GetIfUseDetectedFont(): Unit = js.native
  /**
    *  Returns the font size base to apply higher-level regional accarate OCR which is set through Addon.OCR.SetMinFontSizeforMoreAccurateResult.
    * @method Dynamsoft.WebTwain#GetMinFontSizeforMoreAccurateResult 
    * @return {boolean} Returns the font size base to apply higher-level regional accarate OCR. If the return value is 0, it indicates no regional accurate OCR is performed.
    */
  def GetMinFontSizeforMoreAccurateResult(): Unit = js.native
  /**
    *  Returns the detected OCR font name. 
    * @method Dynamsoft.WebTwain#GetUnicodeFontName 
    * @return {string} Returns the detected OCR font name.
    */
  def GetUnicodeFontName(): Unit = js.native
  /**
    *  Performs OCR on a given image. 
    * @method Dynamsoft.WebTwain#Read 
    * @param {number} sImageIndex Specifies the index of the image.
    * @param {function} AsyncSuccessFunc  The function to call when OCR operation succeeds. Please refer to the function prototype OnOCRSuccess.
    * @param {function} AsyncFailureFunc  The function to call when OCR operation fails. Please refer to the function prototype OnOCRFailure.
    * @return {boolean}
    */
  def Recognize(sImageIndex: Double): Unit = js.native
  def Recognize(sImageIndex: Double, optionalAsyncSuccessFunc: js.Function0[Unit]): Unit = js.native
  def Recognize(
    sImageIndex: Double,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function0[Unit]
  ): Unit = js.native
  /**
    *   Performs OCR on one or multiple specified local file(s) directly.
    * @method Dynamsoft.WebTwain#Read 
    * @param {string} fileNames Specifies the local paths of the target files. If multiple files are given, they should be separated by the '|' character.
    * @param {function} AsyncSuccessFunc  The function to call when OCR operation succeeds. Please refer to the function prototype OnOCRSuccess.
    * @param {function} AsyncFailureFunc  The function to call when OCR operation fails. Please refer to the function prototype OnOCRFailure.
    * @return {boolean}
    */
  def RecognizeFile(fileNames: String): Unit = js.native
  def RecognizeFile(fileNames: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Unit = js.native
  def RecognizeFile(
    fileNames: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function0[Unit]
  ): Unit = js.native
  /**
    *  Peforms OCR on the given rectangle on a specified image. 
    * @method Dynamsoft.WebTwain#ReadRect 
    * @param {number} sImageIndex Specifies the index of the image.
    * @param {number} left specifies the x-coordinate of the upper-left corner of the rectangle.
    * @param {number} top specifies the y-coordinate of the upper-left corner of the rectangle.
    * @param {number} right specifies the x-coordinate of the lower-right corner of the rectangle.
    * @param {number} bottom specifies the y-coordinate of the lower-right corner of the rectangle.
    * @param {function} AsyncSuccessFunc  The function to call when OCR operation succeeds. Please refer to the function prototype OnOCRSuccess.
    * @param {function} AsyncFailureFunc  The function to call when OCR operation fails. Please refer to the function prototype OnOCRFailure.
    * @return {boolean}
    */
  def RecognizeRect(sImageIndex: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  def RecognizeRect(
    sImageIndex: Double,
    left: Double,
    top: Double,
    right: Double,
    bottom: Double,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Unit = js.native
  def RecognizeRect(
    sImageIndex: Double,
    left: Double,
    top: Double,
    right: Double,
    bottom: Double,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function0[Unit]
  ): Unit = js.native
  /**
    *   Performs OCR on the currently selected images in the buffer.
    * @method Dynamsoft.WebTwain#Read 
    * @param {function} AsyncSuccessFunc  The function to call when OCR operation succeeds. Please refer to the function prototype OnOCRSuccess.
    * @param {function} AsyncFailureFunc  The function to call when OCR operation fails. Please refer to the function prototype OnOCRFailure.
    * @return {boolean}
    */
  def RecognizeSelectedImages(): Unit = js.native
  def RecognizeSelectedImages(optionalAsyncSuccessFunc: js.Function0[Unit]): Unit = js.native
  def RecognizeSelectedImages(optionalAsyncSuccessFunc: js.Function0[Unit], optionalAsyncFailureFunc: js.Function0[Unit]): Unit = js.native
  /**
    *  Determines whether PDF output should use the fonts detected by the OCR system, or the default/provided fonts instead.
    * @method Dynamsoft.WebTwain#SetIfUseDetectedFont 
    * @param {boolean} bValue By default this is true, indicating detected fonts should be used. The detected fonts must exist on the user's system for this to be successful.
    * @return {boolean}
    */
  def SetIfUseDetectedFont(bValue: Boolean): Unit = js.native
  /**
    *  Sets the target language for OCR operations.
    * @method Dynamsoft.WebTwain#SetLanguage 
    * @param {string} value Specifies the target language for OCR operation.
    * @return {boolean}
    */
  def SetLanguage(value: String): Unit = js.native
  /**
    *  Applies higher-level accuracy of OCR to the area of the image where the font size is bigger than the value set here.
    * @method Dynamsoft.WebTwain#SetIfUseDetectedFont 
    * @param {number} nValue Specifies the font size base to apply the higher-level accracy OCR. The default value is 0 which means no regional accurate OCR is performed.
    * @return {boolean}
    */
  def SetMinFontSizeforMoreAccurateResult(nValue: Double): Unit = js.native
  /**
    * Sets the OCR result format. Determines whether the OCR output is in text or PDF format.
    * @method Dynamsoft.WebTwain#SetOutputFormat 
    * @param {EnumDWT_OCROutputFormat} value Specifies the OCR result format.
    * @return {boolean}
    */
  def SetOutputFormat(value: EnumDWT_OCROutputFormat): Unit = js.native
  /**
    *  Sets the mode for OCR page layout analysis. Determines how pages are determined when processing OCR.
    * @method Dynamsoft.WebTwain#SetPageSetMode 
    * @param {EnumDWT_OCRPageSetMode} value Specifies the OCR Page layout analysis mode. 
    * @return {boolean}
    */
  def SetPageSetMode(value: EnumDWT_OCRPageSetMode): Unit = js.native
  /**
    *  Specifies a font to be used by OCR when Addon.OCR.SetIfUseDetectedFont is set to false.  
    * @method Dynamsoft.WebTwain#SetUnicodeFontName 
    * @param {string} name Specifies a font to be used by 
    * @return {boolean}
    */
  def SetUnicodeFontName(name: String): Unit = js.native
}

