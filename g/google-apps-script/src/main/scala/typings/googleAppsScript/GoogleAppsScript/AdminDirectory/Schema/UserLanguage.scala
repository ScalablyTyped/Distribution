package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserLanguage extends js.Object {
  var customLanguage: js.UndefOr[String] = js.undefined
  var languageCode: js.UndefOr[String] = js.undefined
}

object UserLanguage {
  @scala.inline
  def apply(customLanguage: String = null, languageCode: String = null): UserLanguage = {
    val __obj = js.Dynamic.literal()
    if (customLanguage != null) __obj.updateDynamic("customLanguage")(customLanguage.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserLanguage]
  }
}

