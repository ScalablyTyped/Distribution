package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(currentFileContentLength = currentFileContentLength, currentFileName = currentFileName, currentFileProgress = currentFileProgress, currentFileUploadedContentLength = currentFileUploadedContentLength, fileCount = fileCount, progress = progress, sender = sender, totalContentLength = totalContentLength, uploadedContentLength = uploadedContentLength)
  
    __obj.asInstanceOf[UploadControlUploadingProgressChangedEventArgs]
  }
}

