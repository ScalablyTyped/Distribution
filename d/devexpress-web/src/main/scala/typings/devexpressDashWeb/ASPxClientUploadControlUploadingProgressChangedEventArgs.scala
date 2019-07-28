package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the UploadingProgressChanged event.
  */
trait ASPxClientUploadControlUploadingProgressChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the content length of the currently uploaded file.
    * Value: An integer value specifying the content length.
    */
  var currentFileContentLength: Double
  /**
    * Gets the name of the file being currently uploaded.
    * Value: A string value that represents the file name.
    */
  var currentFileName: String
  /**
    * Gets the position of the current file upload progress.
    * Value: An <see cref="Int32" /> value specifying the upload progress position.
    */
  var currentFileProgress: Double
  /**
    * Gets the content length of the current file already uploaded to the server.
    * Value: An integer value that is the content length.
    */
  var currentFileUploadedContentLength: Double
  /**
    * Gets the number of the files selected for upload.
    * Value: An integer value that represents the total number of selected files.
    */
  var fileCount: Double
  /**
    * Gets the current position of total upload progress.
    * Value: An <see cref="Int32" /> value specifying the total upload progress position.
    */
  var progress: Double
  /**
    * Gets the content length of the files selected for upload.
    * Value: An integer value specifying the total content length of the selected files.
    */
  var totalContentLength: Double
  /**
    * Gets the content length of the files already uploaded to the server.
    * Value: An integer value that represents the content length.
    */
  var uploadedContentLength: Double
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
    val __obj = js.Dynamic.literal(currentFileContentLength = currentFileContentLength, currentFileName = currentFileName, currentFileProgress = currentFileProgress, currentFileUploadedContentLength = currentFileUploadedContentLength, fileCount = fileCount, progress = progress, totalContentLength = totalContentLength, uploadedContentLength = uploadedContentLength)
  
    __obj.asInstanceOf[ASPxClientUploadControlUploadingProgressChangedEventArgs]
  }
}

