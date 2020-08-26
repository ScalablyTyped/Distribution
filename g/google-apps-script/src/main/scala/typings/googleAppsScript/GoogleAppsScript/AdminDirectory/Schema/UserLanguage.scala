package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserLanguage extends js.Object {
  var customLanguage: js.UndefOr[String] = js.native
  var languageCode: js.UndefOr[String] = js.native
}

object UserLanguage {
  @scala.inline
  def apply(): UserLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserLanguage]
  }
  @scala.inline
  implicit class UserLanguageOps[Self <: UserLanguage] (val x: Self) extends AnyVal {
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
    def setCustomLanguage(value: String): Self = this.set("customLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomLanguage: Self = this.set("customLanguage", js.undefined)
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
  }
  
}

