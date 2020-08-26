package typings.evernote.anon

import typings.evernote.mod.Types.BusinessUserRole
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusinessName extends js.Object {
  var businessId: js.UndefOr[Double] = js.native
  var businessName: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var role: js.UndefOr[BusinessUserRole] = js.native
  var updated: js.UndefOr[Timestamp] = js.native
}

object BusinessName {
  @scala.inline
  def apply(): BusinessName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessName]
  }
  @scala.inline
  implicit class BusinessNameOps[Self <: BusinessName] (val x: Self) extends AnyVal {
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
    def setBusinessId(value: Double): Self = this.set("businessId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusinessId: Self = this.set("businessId", js.undefined)
    @scala.inline
    def setBusinessName(value: String): Self = this.set("businessName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusinessName: Self = this.set("businessName", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setRole(value: BusinessUserRole): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setUpdated(value: Timestamp): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
  
}

