package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadControlFilesUploadCompleteEventArgs extends EventArgs {
  val callbackData: String = js.native
  val errorText: String = js.native
}

object UploadControlFilesUploadCompleteEventArgs {
  @scala.inline
  def apply(callbackData: String, errorText: String, sender: Control): UploadControlFilesUploadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(callbackData = callbackData.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadControlFilesUploadCompleteEventArgs]
  }
  @scala.inline
  implicit class UploadControlFilesUploadCompleteEventArgsOps[Self <: UploadControlFilesUploadCompleteEventArgs] (val x: Self) extends AnyVal {
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
    def setCallbackData(value: String): Self = this.set("callbackData", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorText(value: String): Self = this.set("errorText", value.asInstanceOf[js.Any])
  }
  
}

