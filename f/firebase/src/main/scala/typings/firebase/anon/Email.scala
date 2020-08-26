package typings.firebase.anon

import typings.firebase.mod.auth.MultiFactorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Email extends js.Object {
  var email: js.UndefOr[String | Null] = js.native
  /**
    * @deprecated
    * This field is deprecated in favor of previousEmail.
    */
  var fromEmail: js.UndefOr[String | Null] = js.native
  var multiFactorInfo: js.UndefOr[MultiFactorInfo | Null] = js.native
  var previousEmail: js.UndefOr[String | Null] = js.native
}

object Email {
  @scala.inline
  def apply(): Email = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Email]
  }
  @scala.inline
  implicit class EmailOps[Self <: Email] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEmailNull: Self = this.set("email", null)
    @scala.inline
    def setFromEmail(value: String): Self = this.set("fromEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromEmail: Self = this.set("fromEmail", js.undefined)
    @scala.inline
    def setFromEmailNull: Self = this.set("fromEmail", null)
    @scala.inline
    def setMultiFactorInfo(value: MultiFactorInfo): Self = this.set("multiFactorInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiFactorInfo: Self = this.set("multiFactorInfo", js.undefined)
    @scala.inline
    def setMultiFactorInfoNull: Self = this.set("multiFactorInfo", null)
    @scala.inline
    def setPreviousEmail(value: String): Self = this.set("previousEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousEmail: Self = this.set("previousEmail", js.undefined)
    @scala.inline
    def setPreviousEmailNull: Self = this.set("previousEmail", null)
  }
  
}

