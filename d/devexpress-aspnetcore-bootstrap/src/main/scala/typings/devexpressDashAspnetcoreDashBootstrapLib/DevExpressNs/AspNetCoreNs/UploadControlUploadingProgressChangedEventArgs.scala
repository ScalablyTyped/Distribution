package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadControlUploadingProgressChangedEventArgs extends EventArgs {
  val currentFileContentLength: scala.Double
  val currentFileName: java.lang.String
  val currentFileProgress: scala.Double
  val currentFileUploadedContentLength: scala.Double
  val fileCount: scala.Double
  val progress: scala.Double
  val totalContentLength: scala.Double
  val uploadedContentLength: scala.Double
}

object UploadControlUploadingProgressChangedEventArgs {
  @scala.inline
  def apply(
    currentFileContentLength: scala.Double,
    currentFileName: java.lang.String,
    currentFileProgress: scala.Double,
    currentFileUploadedContentLength: scala.Double,
    fileCount: scala.Double,
    progress: scala.Double,
    sender: Control,
    totalContentLength: scala.Double,
    uploadedContentLength: scala.Double
  ): UploadControlUploadingProgressChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentFileContentLength")(currentFileContentLength)
    __obj.updateDynamic("currentFileName")(currentFileName)
    __obj.updateDynamic("currentFileProgress")(currentFileProgress)
    __obj.updateDynamic("currentFileUploadedContentLength")(currentFileUploadedContentLength)
    __obj.updateDynamic("fileCount")(fileCount)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("totalContentLength")(totalContentLength)
    __obj.updateDynamic("uploadedContentLength")(uploadedContentLength)
    __obj.asInstanceOf[UploadControlUploadingProgressChangedEventArgs]
  }
}

