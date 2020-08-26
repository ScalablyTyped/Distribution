package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.UploadingProgressChanged event.
  */
@js.native
trait ASPxClientUploadControlUploadingProgressChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the content length of the currently uploaded file.
    */
  var currentFileContentLength: Double = js.native
  /**
    * Gets the name of the file being currently uploaded.
    */
  var currentFileName: String = js.native
  /**
    * Gets the position of the current file upload progress.
    */
  var currentFileProgress: Double = js.native
  /**
    * Gets the content length of the current file already uploaded to the server.
    */
  var currentFileUploadedContentLength: Double = js.native
  /**
    * Gets the number of the files selected for upload.
    */
  var fileCount: Double = js.native
  /**
    * Gets the current position of total upload progress.
    */
  var progress: Double = js.native
  /**
    * Gets the content length of the files selected for upload.
    */
  var totalContentLength: Double = js.native
  /**
    * Gets the content length of the files already uploaded to the server.
    */
  var uploadedContentLength: Double = js.native
}

object ASPxClientUploadControlUploadingProgressChangedEventArgs {
  @scala.inline
  def apply(
    currentFileContentLength: Double,
    currentFileName: String,
    currentFileProgress: Double,
    currentFileUploadedContentLength: Double,
    fileCount: Double,
    progress: Double,
    totalContentLength: Double,
    uploadedContentLength: Double
  ): ASPxClientUploadControlUploadingProgressChangedEventArgs = {
    val __obj = js.Dynamic.literal(currentFileContentLength = currentFileContentLength.asInstanceOf[js.Any], currentFileName = currentFileName.asInstanceOf[js.Any], currentFileProgress = currentFileProgress.asInstanceOf[js.Any], currentFileUploadedContentLength = currentFileUploadedContentLength.asInstanceOf[js.Any], fileCount = fileCount.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], totalContentLength = totalContentLength.asInstanceOf[js.Any], uploadedContentLength = uploadedContentLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlUploadingProgressChangedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientUploadControlUploadingProgressChangedEventArgsOps[Self <: ASPxClientUploadControlUploadingProgressChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentFileContentLength(value: Double): Self = this.set("currentFileContentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentFileName(value: String): Self = this.set("currentFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentFileProgress(value: Double): Self = this.set("currentFileProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentFileUploadedContentLength(value: Double): Self = this.set("currentFileUploadedContentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileCount(value: Double): Self = this.set("fileCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalContentLength(value: Double): Self = this.set("totalContentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadedContentLength(value: Double): Self = this.set("uploadedContentLength", value.asInstanceOf[js.Any])
  }
  
}

