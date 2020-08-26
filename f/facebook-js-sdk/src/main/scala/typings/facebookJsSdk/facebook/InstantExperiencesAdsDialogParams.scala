package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.canvas_editor
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstantExperiencesAdsDialogParams extends DialogParams {
  var business_id: String = js.native
  var canvas_id: js.UndefOr[String] = js.native
  @JSName("display")
  var display_InstantExperiencesAdsDialogParams: popup = js.native
  var method: canvas_editor = js.native
  var page_id: String = js.native
}

object InstantExperiencesAdsDialogParams {
  @scala.inline
  def apply(business_id: String, display: popup, method: canvas_editor, page_id: String): InstantExperiencesAdsDialogParams = {
    val __obj = js.Dynamic.literal(business_id = business_id.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], page_id = page_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantExperiencesAdsDialogParams]
  }
  @scala.inline
  implicit class InstantExperiencesAdsDialogParamsOps[Self <: InstantExperiencesAdsDialogParams] (val x: Self) extends AnyVal {
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
    def setBusiness_id(value: String): Self = this.set("business_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay(value: popup): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: canvas_editor): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage_id(value: String): Self = this.set("page_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanvas_id(value: String): Self = this.set("canvas_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanvas_id: Self = this.set("canvas_id", js.undefined)
  }
  
}

