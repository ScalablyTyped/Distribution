package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountPermissions extends js.Object {
  var effective: js.UndefOr[js.Array[String]] = js.native
}

object AccountPermissions {
  @scala.inline
  def apply(): AccountPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPermissions]
  }
  @scala.inline
  implicit class AccountPermissionsOps[Self <: AccountPermissions] (val x: Self) extends AnyVal {
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
    def setEffectiveVarargs(value: String*): Self = this.set("effective", js.Array(value :_*))
    @scala.inline
    def setEffective(value: js.Array[String]): Self = this.set("effective", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffective: Self = this.set("effective", js.undefined)
  }
  
}

