package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InappproductsInsertRequest extends js.Object {
  var inappproduct: js.UndefOr[InAppProduct] = js.native
}

object InappproductsInsertRequest {
  @scala.inline
  def apply(): InappproductsInsertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InappproductsInsertRequest]
  }
  @scala.inline
  implicit class InappproductsInsertRequestOps[Self <: InappproductsInsertRequest] (val x: Self) extends AnyVal {
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
    def setInappproduct(value: InAppProduct): Self = this.set("inappproduct", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInappproduct: Self = this.set("inappproduct", js.undefined)
  }
  
}

