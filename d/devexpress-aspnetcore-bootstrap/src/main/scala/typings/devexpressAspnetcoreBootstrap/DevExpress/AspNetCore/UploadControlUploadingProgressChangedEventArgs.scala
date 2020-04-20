package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadControlUploadingProgressChangedEventArgs extends EventArgs {
  val currentFileContentLength: Double
  val currentFileName: String
  val currentFileProgress: Double
  val currentFileUploadedContentLength: Double
  val fileCount: Double
  val progress: Double
  val totalContentLength: Double
  val uploadedContentLength: Double
}

object UploadControlUploadingProgressChangedEventArgs {
  @scala.inline
  def apply(
    currentFileContentLength: Double,
    currentFileName: String,
    currentFileProgress: Double,
    currentFileUploadedContentLength: Double,
    fileCount: Double,
    progress: Double,
    sender: Control,
    totalContentLength: Double,
    uploadedContentLength: Double
  ): UploadControlUploadingProgressChangedEventArgs = {
    val __obj = js.Dynamic.literal(currentFileContentLength = currentFileContentLength.asInstanceOf[js.Any], currentFileName = currentFileName.asInstanceOf[js.Any], currentFileProgress = currentFileProgress.asInstanceOf[js.Any], currentFileUploadedContentLength = currentFileUploadedContentLength.asInstanceOf[js.Any], fileCount = fileCount.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], totalContentLength = totalContentLength.asInstanceOf[js.Any], uploadedContentLength = uploadedContentLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadControlUploadingProgressChangedEventArgs]
  }
}

