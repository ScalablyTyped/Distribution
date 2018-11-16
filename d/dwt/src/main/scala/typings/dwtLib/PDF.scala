package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * @class
 */
@js.native
trait PDF extends js.Object {
  /**
       * Download and install pdf rasterizer add-on on the local system.
       * @method Dynamsoft.WebTwain#Download
       * @param {string} remoteFile specifies the value of which frame to get.
       * @param {function} optionalAsyncSuccessFunc optional.
       * The function to call when the download succeeds. Please refer to the function prototype OnSuccess.
       * @param {function} optionalAsyncFailureFunc optional.
       * The function to call when the download fails. Please refer to the function prototype OnFailure.
       * @return {boolean}
       */
  def Download(remoteFile: java.lang.String): scala.Boolean = js.native
  /**
       * Download and install pdf rasterizer add-on on the local system.
       * @method Dynamsoft.WebTwain#Download
       * @param {string} remoteFile specifies the value of which frame to get.
       * @param {function} optionalAsyncSuccessFunc optional.
       * The function to call when the download succeeds. Please refer to the function prototype OnSuccess.
       * @param {function} optionalAsyncFailureFunc optional.
       * The function to call when the download fails. Please refer to the function prototype OnFailure.
       * @return {boolean}
       */
  def Download(remoteFile: java.lang.String, optionalAsyncSuccessFunc: js.Function0[scala.Unit]): scala.Boolean = js.native
  /**
       * Download and install pdf rasterizer add-on on the local system.
       * @method Dynamsoft.WebTwain#Download
       * @param {string} remoteFile specifies the value of which frame to get.
       * @param {function} optionalAsyncSuccessFunc optional.
       * The function to call when the download succeeds. Please refer to the function prototype OnSuccess.
       * @param {function} optionalAsyncFailureFunc optional.
       * The function to call when the download fails. Please refer to the function prototype OnFailure.
       * @return {boolean}
       */
  def Download(
    remoteFile: java.lang.String,
    optionalAsyncSuccessFunc: js.Function0[scala.Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ scala.Double, /* errorString */ java.lang.String, scala.Unit]
  ): scala.Boolean = js.native
  /**
       * Judges whether the local PDF is text-based or not.
       * @method Dynamsoft.WebTwain#ReadRect
       * @param {string} localFile specifies the local path of the target PDF.
       * @return {boolean}
       */
  def IsTextBasedPDF(localFile: java.lang.String): scala.Boolean = js.native
  /**
       *  Set the image convert mode for PDF Rasterizer in Dynamic Web TWAIN.
       * @method Dynamsoft.WebTwain#SetConvertMode
       * @param {EnumDWT_ConvertMode | EnumDWT_ConverMode} convertMode Specifies the image convert mode.
       * @return {boolean}
       */
  def SetConvertMode(convertMode: EnumDWT_ConverMode): scala.Boolean = js.native
  /**
       *  Set the image convert mode for PDF Rasterizer in Dynamic Web TWAIN.
       * @method Dynamsoft.WebTwain#SetConvertMode
       * @param {EnumDWT_ConvertMode | EnumDWT_ConverMode} convertMode Specifies the image convert mode.
       * @return {boolean}
       */
  def SetConvertMode(convertMode: EnumDWT_ConvertMode): scala.Boolean = js.native
  /**
       *  Input the password to decrypt PDF files using PDF Rasterizer add-on.
       * @method Dynamsoft.WebTwain#SetPassword
       * @param {string} password Specifies the PDF password.
       * @return {boolean}
       */
  def SetPassword(password: java.lang.String): scala.Boolean = js.native
  /**
       *  Set the output resolution for the PDF Rasterizer in Dynamic Web TWAIN.
       * @method Dynamsoft.WebTwain#ReadRect
       * @param {float} fResolution Specifies the resolution for convert image from PDF file.
       * @return {boolean}
       */
  def SetResolution(fResolution: scala.Double): scala.Boolean = js.native
}

