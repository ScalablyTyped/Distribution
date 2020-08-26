package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdHocVerified extends js.Object {
  var adHocVerified: js.UndefOr[String] = js.native
}

object AdHocVerified {
  @scala.inline
  def apply(): AdHocVerified = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdHocVerified]
  }
  @scala.inline
  implicit class AdHocVerifiedOps[Self <: AdHocVerified] (val x: Self) extends AnyVal {
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
    def setAdHocVerified(value: String): Self = this.set("adHocVerified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdHocVerified: Self = this.set("adHocVerified", js.undefined)
  }
  
}

