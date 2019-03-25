package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserLanguage extends js.Object {
  var customLanguage: js.UndefOr[java.lang.String] = js.undefined
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
}

object UserLanguage {
  @scala.inline
  def apply(customLanguage: java.lang.String = null, languageCode: java.lang.String = null): UserLanguage = {
    val __obj = js.Dynamic.literal()
    if (customLanguage != null) __obj.updateDynamic("customLanguage")(customLanguage)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    __obj.asInstanceOf[UserLanguage]
  }
}

