package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OCRPro extends js.Object {
  /**
    *  Downloads and installs the ocr add-on on the local system. 
    * @param {string} remoteFile specifies the URL to download a ZIP which contains the OCR Pro addon
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the download succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the download fails. Please refer to the function prototype OnFailure.
    * @return {void}
    */
  def Download(remoteFile: String): Unit = js.native
  def Download(remoteFile: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Unit = js.native
  def Download(
    remoteFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function0[Unit]
  ): Unit = js.native
  /**
    * Returns whether OCR Pro addon is installed
    * @return {boolean}
    */
  def IsModuleInstalled(): Boolean = js.native
  def NewOCRError(): OCRError = js.native
  def NewOCRReadPara(): OCRReadPara = js.native
  def NewOCRZone(): OCRZone = js.native
  def NewSettings(): Settings = js.native
  /**
    *  Performs OCR on a given image. 
    * @param {number} sImageIndex Specifies the index of the image.
    * @param {function} AsyncSuccessFunc  The function to call when OCR operation succeeds. Please refer to the function prototype OnOCRSuccess.
    * @param {function} AsyncFailureFunc  The function to call when OCR operation fails. Please refer to the function prototype OnOCRFailure.
    * @return {void}
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
    * @param {string} fileNames Specifies the local paths of the target files. If multiple files are given, they should be separated by the '|' character.
    * @param {function} AsyncSuccessFunc  The function to call when OCR operation succeeds. Please refer to the function prototype OnOCRSuccess.
    * @param {function} AsyncFailureFunc  The function to call when OCR operation fails. Please refer to the function prototype OnOCRFailure.
    * @return {void}
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
    * @param {number} sImageIndex Specifies the index of the image.
    * @param {number[]} aryZone specifies the coordinates of the rectangle.
    * @param {function} AsyncSuccessFunc  The function to call when OCR operation succeeds. Please refer to the function prototype OnOCRSuccess.
    * @param {function} AsyncFailureFunc  The function to call when OCR operation fails. Please refer to the function prototype OnOCRFailure.
    * @return {void}
    */
  def RecognizeRect(sImageIndex: Double, aryZone: js.Array[Double]): Unit = js.native
  def RecognizeRect(sImageIndex: Double, aryZone: js.Array[Double], optionalAsyncSuccessFunc: js.Function0[Unit]): Unit = js.native
  def RecognizeRect(
    sImageIndex: Double,
    aryZone: js.Array[Double],
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function0[Unit]
  ): Unit = js.native
  /**
    *   Performs OCR on the currently selected images in the buffer.
    * @param {function} AsyncSuccessFunc  The function to call when OCR operation succeeds. Please refer to the function prototype OnOCRSuccess.
    * @param {function} AsyncFailureFunc  The function to call when OCR operation fails. Please refer to the function prototype OnOCRFailure.
    * @return {void}
    */
  def RecognizeSelectedImages(): Unit = js.native
  def RecognizeSelectedImages(optionalAsyncSuccessFunc: js.Function0[Unit]): Unit = js.native
  def RecognizeSelectedImages(optionalAsyncSuccessFunc: js.Function0[Unit], optionalAsyncFailureFunc: js.Function0[Unit]): Unit = js.native
}

