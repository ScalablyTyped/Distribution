package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FamilyRole extends js.Object {
  var familyRole: js.UndefOr[String] = js.native
  var isSharingAllowed: js.UndefOr[Boolean] = js.native
  var isSharingDisabledByFop: js.UndefOr[Boolean] = js.native
}

object FamilyRole {
  @scala.inline
  def apply(): FamilyRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FamilyRole]
  }
  @scala.inline
  implicit class FamilyRoleOps[Self <: FamilyRole] (val x: Self) extends AnyVal {
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
    def setFamilyRole(value: String): Self = this.set("familyRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamilyRole: Self = this.set("familyRole", js.undefined)
    @scala.inline
    def setIsSharingAllowed(value: Boolean): Self = this.set("isSharingAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSharingAllowed: Self = this.set("isSharingAllowed", js.undefined)
    @scala.inline
    def setIsSharingDisabledByFop(value: Boolean): Self = this.set("isSharingDisabledByFop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSharingDisabledByFop: Self = this.set("isSharingDisabledByFop", js.undefined)
  }
  
}

