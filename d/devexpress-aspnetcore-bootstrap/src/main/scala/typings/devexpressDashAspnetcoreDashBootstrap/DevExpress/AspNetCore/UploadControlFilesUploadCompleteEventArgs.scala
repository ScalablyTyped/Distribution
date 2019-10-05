package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadControlFilesUploadCompleteEventArgs extends EventArgs {
  val callbackData: String
  val errorText: String
}

object UploadControlFilesUploadCompleteEventArgs {
  @scala.inline
  def apply(callbackData: String, errorText: String, sender: Control): UploadControlFilesUploadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(callbackData = callbackData, errorText = errorText, sender = sender)
  
    __obj.asInstanceOf[UploadControlFilesUploadCompleteEventArgs]
  }
}

