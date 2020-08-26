package typings.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOfferDialogResponse extends DialogResponse {
  var id: String = js.native
  var success: Boolean = js.native
}

object CreateOfferDialogResponse {
  @scala.inline
  def apply(id: String, success: Boolean): CreateOfferDialogResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOfferDialogResponse]
  }
  @scala.inline
  implicit class CreateOfferDialogResponseOps[Self <: CreateOfferDialogResponse] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

