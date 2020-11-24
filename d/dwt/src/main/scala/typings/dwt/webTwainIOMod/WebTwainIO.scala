package typings.dwt.webTwainIOMod

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTImageType
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPDFCompressionType
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUploadDataFormat
import typings.dwt.webTwainUtilMod.WebTwainUtil
import typings.std.ArrayBuffer
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebTwainIO extends WebTwainUtil {
  
  /**
    * Clear all the custom fields from the HTTP Post Form.
    */
  def ClearAllHTTPFormField(): Boolean = js.native
  
  /**
    * Clear the content of all custom tiff tags.
    */
  def ClearTiffCustomTag(): Boolean = js.native
  
  def ConvertToBase64(
    indices: js.Array[Double],
    `type`: Double,
    successCallback: js.Function3[/* result */ Base64Result, /* indices */ js.Array[Double], /* type */ Double, Unit],
    failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  /**
    * Convert the specified images to a base64 string.
    * @param indices Specify one or multiple images.
    * @param type The file type.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument result The resulting base64 string.
    * @argument indices The indices of the converted images.
    * @argument type The file type.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def ConvertToBase64(
    indices: js.Array[Double],
    `type`: EnumDWTImageType,
    successCallback: js.Function3[/* result */ Base64Result, /* indices */ js.Array[Double], /* type */ Double, Unit],
    failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  def ConvertToBlob(
    indices: js.Array[Double],
    `type`: Double,
    successCallback: js.Function3[/* result */ Blob, /* indices */ js.Array[Double], /* type */ Double, Unit],
    failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  /**
    * Convert the specified images to a blob.
    * @param indices Specify one or multiple images.
    * @param type The file type.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument result The resulting blob.
    * @argument indices The indices of the converted images.
    * @argument type The file type.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def ConvertToBlob(
    indices: js.Array[Double],
    `type`: EnumDWTImageType,
    successCallback: js.Function3[/* result */ Blob, /* indices */ js.Array[Double], /* type */ Double, Unit],
    failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  /**
    * Download the specified file via FTP
    * @param host The FTP Host.
    * @param path Specify the file to download.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def FTPDownload(
    host: String,
    path: String,
    successCallback: js.Function0[Unit],
    failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  def FTPDownloadEx(
    host: String,
    path: String,
    `type`: Double,
    successCallback: js.Function0[Unit],
    failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  /**
    * Download the specified file via FTP.
    * @param host The FTP Host.
    * @param path Specify the file to download.
    * @param type The format of the file.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def FTPDownloadEx(
    host: String,
    path: String,
    `type`: EnumDWTImageType,
    successCallback: js.Function0[Unit],
    failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  /**
    * The password to connect to the FTP.
    */
  var FTPPassword: String = js.native
  
  /**
    * The port to connect to the FTP.
    */
  var FTPPort: Double = js.native
  
  /**
    * Upload the specified image via FTP.
    * @param host The FTP Host.
    * @param index Specify the image.
    * @param path The path to save the file.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def FTPUpload(
    host: String,
    index: Double,
    path: String,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  /**
    * Upload all images as a multi-page TIFF via FTP.
    * @param host The FTP Host.
    * @param path Specify the path to save the file.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def FTPUploadAllAsMultiPageTIFF(
    host: String,
    path: String,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  /**
    * Upload all images as a multi-page PDF via FTP.
    * @param host The FTP Host.
    * @param path Specify the path to save the file.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def FTPUploadAllAsPDF(
    host: String,
    path: String,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  /**
    * Upload selected images as a multi-page PDF via FTP.
    * @param host The FTP Host.
    * @param path Specify the path to save the file.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def FTPUploadAsMultiPagePDF(
    host: String,
    path: String,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  def FTPUploadAsMultiPageTIFF(
    host: String,
    path: String,
    `type`: Double,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  /**
    * Upload selected images as a multi-page TIFF via FTP.
    * @param host The FTP Host.
    * @param path Specify the path to save the file.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def FTPUploadAsMultiPageTIFF(
    host: String,
    path: String,
    `type`: EnumDWTImageType,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  def FTPUploadEx(
    host: String,
    index: Double,
    path: String,
    `type`: Double,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  /**
    * Upload the specified image via FTP.
    * @param host The FTP Host.
    * @param index Specify the image.
    * @param path The path to save the file.
    * @param type The format of the file.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def FTPUploadEx(
    host: String,
    index: Double,
    path: String,
    `type`: EnumDWTImageType,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  /**
    * The password to connect to the FTP.
    */
  var FTPUserName: String = js.native
  
  /**
    * Download the specified file via a HTTP Get request.
    * @param host The HTTP Host.
    * @param path Specify the path of the file to download.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def HTTPDownload(
    host: String,
    path: String,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  /**
    * Download the specified file via a HTTP Get request.
    * @param host The HTTP Host.
    * @param path Specify the path of the file to download.
    * @param localPath Specify where to save the file.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def HTTPDownloadDirectly(
    host: String,
    path: String,
    localPath: String,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  def HTTPDownloadEx(
    host: String,
    path: String,
    `type`: Double,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  /**
    * Download the specified file via a HTTP Get request.
    * @param host The HTTP Host.
    * @param path Specify the path of the file to download.
    * @param type The format of the file.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def HTTPDownloadEx(
    host: String,
    path: String,
    `type`: EnumDWTImageType,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  def HTTPDownloadThroughPost(
    host: String,
    path: String,
    `type`: Double,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  /**
    * Download the specified file via a HTTP Post request.
    * @param host The HTTP Host.
    * @param path Specify the path of the file to download.
    * @param type The format of the file.
    * @param onEmptyResponse A callback function that is executed if the response is empty.
    * @param onServerReturnedSomething A callback function that is executed if the response is not empty.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    * @argument response The response string.
    */
  def HTTPDownloadThroughPost(
    host: String,
    path: String,
    `type`: EnumDWTImageType,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  
  /**
    * [Deprecation] Return or set the password used to log into the HTTP server.
    */
  var HTTPPassword: String = js.native
  
  /**
    * Return or set the HTTP Port.
    */
  var HTTPPort: Double = js.native
  
  /**
    * Return the response string of the latest HTTP Post request.
    */
  val HTTPPostResponseString: String = js.native
  
  def HTTPUpload(
    URL: String,
    indices: js.Array[Double],
    `type`: Double,
    dataFormat: Double,
    fileName: String,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  def HTTPUpload(
    URL: String,
    indices: js.Array[Double],
    `type`: Double,
    dataFormat: Double,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  def HTTPUpload(
    URL: String,
    indices: js.Array[Double],
    `type`: Double,
    dataFormat: EnumDWTUploadDataFormat,
    fileName: String,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  def HTTPUpload(
    URL: String,
    indices: js.Array[Double],
    `type`: Double,
    dataFormat: EnumDWTUploadDataFormat,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  def HTTPUpload(
    URL: String,
    indices: js.Array[Double],
    `type`: EnumDWTImageType,
    dataFormat: Double,
    fileName: String,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  def HTTPUpload(
    URL: String,
    indices: js.Array[Double],
    `type`: EnumDWTImageType,
    dataFormat: Double,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  /**
    * Upload the specified image(s) via a HTTP Post.
    * @param URL The server-side script to receive the post.
    * @param indices Specify the image(s).
    * @param type The format of the file.
    * @param dataFormat Whether to upload the file as binary or a base64 string.
    * @param fileName The file name.
    * @param onEmptyResponse A callback function that is executed if the response is empty.
    * @param onServerReturnedSomething A callback function that is executed if the response is not empty.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    * @argument response The response string.
    */
  def HTTPUpload(
    URL: String,
    indices: js.Array[Double],
    `type`: EnumDWTImageType,
    dataFormat: EnumDWTUploadDataFormat,
    fileName: String,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  def HTTPUpload(
    URL: String,
    indices: js.Array[Double],
    `type`: EnumDWTImageType,
    dataFormat: EnumDWTUploadDataFormat,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  def HTTPUpload(
    URL: String,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  
  /**
    * Upload all images in the buffer as a TIFF file via a HTTP Post request.
    * @param host The HTTP Host.
    * @param target The target wherethe request is sent.
    * @param fileName The file name.
    * @param onEmptyResponse A callback function that is executed if the response is empty.
    * @param onServerReturnedSomething A callback function that is executed if the response is not empty.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    * @argument response The response string.
    */
  def HTTPUploadAllThroughPostAsMultiPageTIFF(
    host: String,
    target: String,
    fileName: String,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  
  /**
    * Upload all images in the buffer as a PDF file via a HTTP Post request.
    * @param host The HTTP Host.
    * @param target The target wherethe request is sent.
    * @param fileName The file name.
    * @param onEmptyResponse A callback function that is executed if the response is empty.
    * @param onServerReturnedSomething A callback function that is executed if the response is not empty.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    * @argument response The response string.
    */
  def HTTPUploadAllThroughPostAsPDF(
    host: String,
    target: String,
    fileName: String,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  
  /**
    * Upload the specified image via a HTTP Post request.
    * @param host The HTTP Host.
    * @param index Specify the image.
    * @param target The target wherethe request is sent.
    * @param type The format of the file.
    * @param fileName The file name.
    * @param onEmptyResponse A callback function that is executed if the response is empty.
    * @param onServerReturnedSomething A callback function that is executed if the response is not empty.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    * @argument response The response string.
    */
  def HTTPUploadThroughPost(
    host: String,
    index: Double,
    target: String,
    fileName: String,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  
  /**
    * Upload all selected images in the buffer as a PDF file via a HTTP Post request.
    * @param host The HTTP Host.
    * @param target The target wherethe request is sent.
    * @param fileName The file name.
    * @param onEmptyResponse A callback function that is executed if the response is empty.
    * @param onServerReturnedSomething A callback function that is executed if the response is not empty.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    * @argument response The response string.
    */
  def HTTPUploadThroughPostAsMultiPagePDF(
    host: String,
    target: String,
    fileName: String,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  
  /**
    * Upload all selected images in the buffer as a TIFF file via a HTTP Post request.
    * @param host The HTTP Host.
    * @param target The target wherethe request is sent.
    * @param fileName The file name.
    * @param onEmptyResponse A callback function that is executed if the response is empty.
    * @param onServerReturnedSomething A callback function that is executed if the response is not empty.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    * @argument response The response string.
    */
  def HTTPUploadThroughPostAsMultiPageTIFF(
    host: String,
    target: String,
    fileName: String,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  
  /**
    * Upload the specified file via a HTTP Post request.
    * @param host The HTTP Host.
    * @param path Specify the file to upload.
    * @param target The target wherethe request is sent.
    * @param fileName The file name.
    * @param onEmptyResponse A callback function that is executed if the response is empty.
    * @param onServerReturnedSomething A callback function that is executed if the response is not empty.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    * @argument response The response string.
    */
  def HTTPUploadThroughPostDirectly(
    host: String,
    path: String,
    target: String,
    fileName: String,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  
  def HTTPUploadThroughPostEx(
    host: String,
    index: Double,
    target: String,
    fileName: String,
    `type`: Double,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  /**
    * Upload the specified image via a HTTP Post request.
    * @param host The HTTP Host.
    * @param index Specify the image.
    * @param target The target wherethe request is sent.
    * @param fileName The file name.
    * @param type The format of the file.
    * @param onEmptyResponse A callback function that is executed if the response is empty.
    * @param onServerReturnedSomething A callback function that is executed if the response is not empty.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    * @argument response The response string.
    */
  def HTTPUploadThroughPostEx(
    host: String,
    index: Double,
    target: String,
    fileName: String,
    `type`: EnumDWTImageType,
    onEmptyResponse: js.Function0[Unit],
    onServerReturnedSomething: js.Function3[/* errorCode */ Double, /* errorString */ String, /* response */ String, Unit]
  ): Unit = js.native
  
  def HTTPUploadThroughPutEx(
    host: String,
    index: Double,
    path: String,
    `type`: Double,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  /**
    * Upload the specified image via a HTTP Put request.
    * @param host The HTTP Host.
    * @param index Specify the image.
    * @param path Specify the path to put the file.
    * @param type The format of the file.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def HTTPUploadThroughPutEx(
    host: String,
    index: Double,
    path: String,
    `type`: EnumDWTImageType,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  /**
    * [Deprecation] Return or set the user name used to log into the HTTP server.
    */
  var HTTPUserName: String = js.native
  
  /**
    * Return or set the field name for the uploaded file.
    * By default, it's "RemoteFile".
    */
  var HttpFieldNameOfUploadedImage: String = js.native
  
  /**
    * Return or set whether to insert or append images when they are scanned/loaded.
    */
  var IfAppendImage: Boolean = js.native
  
  /**
    * Return or set whether to use passive mode when connect to the FTP.
    */
  var IfPASVMode: Boolean = js.native
  
  /**
    * Return or set whether to use SSL in HTTP requests.
    */
  var IfSSL: Boolean = js.native
  
  /**
    * Return or set whether to show the progress of an operation with a button to cancel it.
    */
  var IfShowCancelDialogWhenImageTransfer: Boolean = js.native
  
  /**
    * Return or set whether to show open/save file dialog when saving images in the buffer or loading images from a local directory.
    */
  var IfShowFileDialog: Boolean = js.native
  
  /**
    * Return or set whether to show the progressbar.
    */
  var IfShowProgressBar: Boolean = js.native
  
  /**
    * Return or set whether to append to or replace an existing TIFF file with the same name.
    */
  var IfTiffMultiPage: Boolean = js.native
  
  /**
    * Return or set the quality for JPEG compression.
    * The values range from 0 to 100.
    */
  var JPEGQuality: Double = js.native
  
  /**
    * Load an image from the system clipboard. The image must be in DIB format.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def LoadDibFromClipboard(): Unit | Boolean = js.native
  def LoadDibFromClipboard(
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  def LoadDibFromClipboard(successCallback: js.Function0[Unit]): Unit | Boolean = js.native
  def LoadDibFromClipboard(
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  
  /**
    * Load image(s) specified by its absolute path.
    * @param fileName The path of the image to load.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def LoadImage(fileName: String): Unit | Boolean = js.native
  def LoadImage(
    fileName: String,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  def LoadImage(fileName: String, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
  def LoadImage(
    fileName: String,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  
  def LoadImageEx(fileName: String, `type`: Double): Unit | Boolean = js.native
  def LoadImageEx(
    fileName: String,
    `type`: Double,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  def LoadImageEx(fileName: String, `type`: Double, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
  def LoadImageEx(
    fileName: String,
    `type`: Double,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  /**
    * Load image(s) specified by its absolute path.
    * @param fileName The path of the image to load.
    * @param type The format of the image.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def LoadImageEx(fileName: String, `type`: EnumDWTImageType): Unit | Boolean = js.native
  def LoadImageEx(
    fileName: String,
    `type`: EnumDWTImageType,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  def LoadImageEx(fileName: String, `type`: EnumDWTImageType, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
  def LoadImageEx(
    fileName: String,
    `type`: EnumDWTImageType,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  
  /**
    * Load image(s) from a base64 string.
    * @param imageData The image data which is a base64 string without the data URI scheme.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def LoadImageFromBase64Binary(imageData: String, imageType: EnumDWTImageType): Unit | Boolean = js.native
  def LoadImageFromBase64Binary(
    imageData: String,
    imageType: EnumDWTImageType,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  def LoadImageFromBase64Binary(imageData: String, imageType: EnumDWTImageType, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
  def LoadImageFromBase64Binary(
    imageData: String,
    imageType: EnumDWTImageType,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  
  def LoadImageFromBinary(
    imageData: ArrayBuffer,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  /**
    * Load image(s) from a binary object (Blob | ArrayBuffer).
    * @param imageData The image data.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def LoadImageFromBinary(
    imageData: Blob,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  /**
    * [Deprecation] Return or set how many threads can be used when you upload files through POST.
    */
  var MaxInternetTransferThreads: Double = js.native
  
  /**
    * Return or set the maximum allowed size of a file to upload (in bytes).
    */
  var MaxUploadImageSize: Double = js.native
  
  /**
    * Return or set the name of the person who creates the PDF document.
    */
  var PDFAuthor: String = js.native
  
  /**
    * Return or set the compression type of PDF files. This is a runtime property.
    */
  var PDFCompressionType: EnumDWTPDFCompressionType = js.native
  
  /**
    * Return or set the date when the PDF document is created.
    */
  var PDFCreationDate: String = js.native
  
  /**
    * Return or set the name of the application that created the original document, if the PDF document is converted from another form.
    */
  var PDFCreator: String = js.native
  
  /**
    * Return or set the keywords associated with the PDF document.
    */
  var PDFKeywords: String = js.native
  
  /**
    * Return or set the date when the PDF document is last modified.
    */
  var PDFModifiedDate: String = js.native
  
  /**
    * Return or set the name of the application that converted the PDF document from its native.
    */
  var PDFProducer: String = js.native
  
  /**
    * Return or set the subject of the PDF document.
    */
  var PDFSubject: String = js.native
  
  /**
    * Return or set the title of the PDF document.
    */
  var PDFTitle: String = js.native
  
  /**
    * Return or set the value of the PDF version.
    */
  var PDFVersion: String = js.native
  
  /**
    * Export all image data in the buffer to a new browser window and use the browser's built-in print feature to print the image(s).
    * @param useOSPrintWindow Whether to use the print feature of the operating system instead.
    */
  def Print(): Boolean = js.native
  def Print(useOSPrintWindow: Boolean): Boolean = js.native
  
  /**
    * Saves all the images in buffer as a multi-page TIFF file.
    * @param fileName The name to save to.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def SaveAllAsMultiPageTIFF(fileName: String): Unit | Boolean = js.native
  def SaveAllAsMultiPageTIFF(
    fileName: String,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  def SaveAllAsMultiPageTIFF(fileName: String, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
  def SaveAllAsMultiPageTIFF(
    fileName: String,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  
  /**
    * Saves all the images in buffer as a multi-page PDF file.
    * @param fileName The name to save to.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def SaveAllAsPDF(fileName: String): Unit | Boolean = js.native
  def SaveAllAsPDF(
    fileName: String,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  def SaveAllAsPDF(fileName: String, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
  def SaveAllAsPDF(
    fileName: String,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  
  /**
    * Save the specified image as a BMP file.
    * @param fileName The name to save to.
    * @param index The index which specifies the image to save.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def SaveAsBMP(fileName: String, index: Double): Unit | Boolean = js.native
  def SaveAsBMP(
    fileName: String,
    index: Double,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  def SaveAsBMP(fileName: String, index: Double, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
  def SaveAsBMP(
    fileName: String,
    index: Double,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  
  /**
    * Save the specified image as a JPEG file.
    * @param fileName The name to save to.
    * @param index The index which specifies the image to save.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def SaveAsJPEG(fileName: String, index: Double): Unit | Boolean = js.native
  def SaveAsJPEG(
    fileName: String,
    index: Double,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  def SaveAsJPEG(fileName: String, index: Double, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
  def SaveAsJPEG(
    fileName: String,
    index: Double,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  
  /**
    * Save the specified image as a PDF file.
    * @param fileName The name to save to.
    * @param index The index which specifies the image to save.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def SaveAsPDF(fileName: String, index: Double): Unit | Boolean = js.native
  def SaveAsPDF(
    fileName: String,
    index: Double,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  def SaveAsPDF(fileName: String, index: Double, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
  def SaveAsPDF(
    fileName: String,
    index: Double,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  
  /**
    * Save the specified image as a PNG file.
    * @param fileName The name to save to.
    * @param index The index which specifies the image to save.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def SaveAsPNG(fileName: String, index: Double): Unit | Boolean = js.native
  def SaveAsPNG(
    fileName: String,
    index: Double,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  def SaveAsPNG(fileName: String, index: Double, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
  def SaveAsPNG(
    fileName: String,
    index: Double,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  
  /**
    * Save the specified image as a TIFF file.
    * @param fileName The name to save to.
    * @param index The index which specifies the image to save.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def SaveAsTIFF(fileName: String, index: Double): Unit | Boolean = js.native
  def SaveAsTIFF(
    fileName: String,
    index: Double,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  def SaveAsTIFF(fileName: String, index: Double, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
  def SaveAsTIFF(
    fileName: String,
    index: Double,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  
  /**
    * Saves all selected images in buffer as a multi-page PDF file.
    * @param fileName The name to save to.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def SaveSelectedImagesAsMultiPagePDF(fileName: String): Unit | Boolean = js.native
  def SaveSelectedImagesAsMultiPagePDF(
    fileName: String,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  def SaveSelectedImagesAsMultiPagePDF(fileName: String, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
  def SaveSelectedImagesAsMultiPagePDF(
    fileName: String,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  
  /**
    * Saves all selected images in buffer as a multi-page TIFF file.
    * @param fileName The name to save to.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def SaveSelectedImagesAsMultiPageTIFF(fileName: String): Unit | Boolean = js.native
  def SaveSelectedImagesAsMultiPageTIFF(
    fileName: String,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  def SaveSelectedImagesAsMultiPageTIFF(fileName: String, successCallback: js.Function0[Unit]): Unit | Boolean = js.native
  def SaveSelectedImagesAsMultiPageTIFF(
    fileName: String,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit | Boolean = js.native
  
  /**
    * [Deprecation] Saves the selected images in the buffer to a base64 string.
    * [Alternative] Use ConvertToBase64 instead.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument result The resulting array of strings.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def SaveSelectedImagesToBase64Binary(): String | Boolean = js.native
  /**
    * [Deprecation] Return an index from the selected indices array. Read SelectedImagesIndices instead.
    * [Alternative] Read SelectedImagesIndices instead.
    * @param indexOfIndices Specify the index of the specified image.
    */
  def SaveSelectedImagesToBase64Binary(indexOfIndices: Double): Double = js.native
  def SaveSelectedImagesToBase64Binary(
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): String | Boolean = js.native
  def SaveSelectedImagesToBase64Binary(successCallback: js.Function1[/* result */ js.Array[String], Unit]): String | Boolean = js.native
  def SaveSelectedImagesToBase64Binary(
    successCallback: js.Function1[/* result */ js.Array[String], Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): String | Boolean = js.native
  
  /**
    * [Deprecation] Set a cookie string into the Http Header to be used when uploading scanned images through POST.
    * @param cookie The cookie.
    */
  def SetCookie(cookie: String): Boolean = js.native
  
  /**
    * Add a binary file to the HTTP Post Form.
    * @param name The name of the field.
    * @param content The content of the file.
    * @param fileName The name of the file.
    */
  def SetHTTPFormField(name: String, content: Blob): Boolean = js.native
  def SetHTTPFormField(name: String, content: Blob, fileName: String): Boolean = js.native
  /**
    * Add a custom field to the HTTP Post Form.
    * @param name The name of the field.
    * @param value The value of the field.
    */
  def SetHTTPFormField(name: String, value: String): Boolean = js.native
  
  /**
    * Add a custom header to the HTTP Post Form.
    * @param name The name of the field.
    * @param value The value of the field.
    */
  def SetHTTPHeader(name: String, value: String): Boolean = js.native
  
  /**
    * Clear the content of all custom tiff tags.
    * @param id The id of the custom tag.
    * @param content The content of the tag.
    * @param useBase64Encoding Whether the content is encoded.
    */
  def SetTiffCustomTag(id: Double, content: String, useBase64Encoding: Boolean): Boolean = js.native
  
  /**
    * Set the segmentation threshold and segment size.
    * @param threshold Specify the threshold (in MB).
    * @param size Specify the segment size (in KB).
    */
  def SetUploadSegment(threshold: Double, size: Double): Boolean = js.native
  
  /**
    * Show the system's save-file dialog or open-file dialog.
    * @param isSave Whether to show a save-file dialog or an open-file dialog
    * @param filter The filter pattern like "JPG | *.jpg".
    * @param filterIndex The order of the filter. Normally, just put 0.
    * @param defaultExtension Extension to be appended to the file name. Only valid in a save-file dialog
    * @param initialDirectory The initial directory that the dialog opens.
    * @param allowMultiSelect Whether or not multiple files can be selected at the same time. Only valid in an open-file dialog.
    * @param showOverwritePrompt Whether or not a prompt shows up when saving a file may overwrite an existing file.
    * @param flag If set to 0, bAllowMultiSelect and bShowOverwritePrompt will be effective. Otherwise, these two parameters are ignored.
    */
  def ShowFileDialog(
    isSave: Boolean,
    filter: String,
    filterIndex: Double,
    defaultExtension: String,
    initialDirectory: String,
    allowMultiSelect: Boolean,
    showOverwritePrompt: Boolean,
    flag: Double
  ): Boolean = js.native
  
  /**
    * Return or set the compression type for TIFF files.
    */
  var TIFFCompressionType: EnumDWTTIFFCompressionType | Double = js.native
}
