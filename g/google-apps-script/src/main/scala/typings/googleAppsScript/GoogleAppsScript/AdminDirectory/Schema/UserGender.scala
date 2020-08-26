package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserGender extends js.Object {
  var addressMeAs: js.UndefOr[String] = js.native
  var customGender: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object UserGender {
  @scala.inline
  def apply(): UserGender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserGender]
  }
  @scala.inline
  implicit class UserGenderOps[Self <: UserGender] (val x: Self) extends AnyVal {
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
    def setAddressMeAs(value: String): Self = this.set("addressMeAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressMeAs: Self = this.set("addressMeAs", js.undefined)
    @scala.inline
    def setCustomGender(value: String): Self = this.set("customGender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomGender: Self = this.set("customGender", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

