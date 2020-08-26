package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessDetail extends js.Object {
  /** If a native process other than the app crashed. */
  var otherNativeCrash: js.UndefOr[Boolean] = js.native
}

object SuccessDetail {
  @scala.inline
  def apply(): SuccessDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessDetail]
  }
  @scala.inline
  implicit class SuccessDetailOps[Self <: SuccessDetail] (val x: Self) extends AnyVal {
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
    def setOtherNativeCrash(value: Boolean): Self = this.set("otherNativeCrash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherNativeCrash: Self = this.set("otherNativeCrash", js.undefined)
  }
  
}

