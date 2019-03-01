package typings
package devexpressDashWebLib

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
  var currentFileContentLength: scala.Double
  /**
    * Gets the name of the file being currently uploaded.
    * Value: A string value that represents the file name.
    */
  var currentFileName: java.lang.String
  /**
    * Gets the position of the current file upload progress.
    * Value: An <see cref="Int32" /> value specifying the upload progress position.
    */
  var currentFileProgress: scala.Double
  /**
    * Gets the content length of the current file already uploaded to the server.
    * Value: An integer value that is the content length.
    */
  var currentFileUploadedContentLength: scala.Double
  /**
    * Gets the number of the files selected for upload.
    * Value: An integer value that represents the total number of selected files.
    */
  var fileCount: scala.Double
  /**
    * Gets the current position of total upload progress.
    * Value: An <see cref="Int32" /> value specifying the total upload progress position.
    */
  var progress: scala.Double
  /**
    * Gets the content length of the files selected for upload.
    * Value: An integer value specifying the total content length of the selected files.
    */
  var totalContentLength: scala.Double
  /**
    * Gets the content length of the files already uploaded to the server.
    * Value: An integer value that represents the content length.
    */
  var uploadedContentLength: scala.Double
}

object ASPxClientUploadControlUploadingProgressChangedEventArgs {
  @scala.inline
  def apply(
    currentFileContentLength: scala.Double,
    currentFileName: java.lang.String,
    currentFileProgress: scala.Double,
    currentFileUploadedContentLength: scala.Double,
    fileCount: scala.Double,
    progress: scala.Double,
    totalContentLength: scala.Double,
    uploadedContentLength: scala.Double
  ): ASPxClientUploadControlUploadingProgressChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentFileContentLength")(currentFileContentLength)
    __obj.updateDynamic("currentFileName")(currentFileName)
    __obj.updateDynamic("currentFileProgress")(currentFileProgress)
    __obj.updateDynamic("currentFileUploadedContentLength")(currentFileUploadedContentLength)
    __obj.updateDynamic("fileCount")(fileCount)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("totalContentLength")(totalContentLength)
    __obj.updateDynamic("uploadedContentLength")(uploadedContentLength)
    __obj.asInstanceOf[ASPxClientUploadControlUploadingProgressChangedEventArgs]
  }
}

