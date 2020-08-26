package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.canvas_preview
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstantExperiencesPreviewDialogParams extends DialogParams {
  var canvas_id: String = js.native
  @JSName("display")
  var display_InstantExperiencesPreviewDialogParams: popup = js.native
  var method: canvas_preview = js.native
}

object InstantExperiencesPreviewDialogParams {
  @scala.inline
  def apply(canvas_id: String, display: popup, method: canvas_preview): InstantExperiencesPreviewDialogParams = {
    val __obj = js.Dynamic.literal(canvas_id = canvas_id.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantExperiencesPreviewDialogParams]
  }
  @scala.inline
  implicit class InstantExperiencesPreviewDialogParamsOps[Self <: InstantExperiencesPreviewDialogParams] (val x: Self) extends AnyVal {
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
    def setCanvas_id(value: String): Self = this.set("canvas_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay(value: popup): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: canvas_preview): Self = this.set("method", value.asInstanceOf[js.Any])
  }
  
}

