package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserName extends js.Object {
  var familyName: js.UndefOr[String] = js.undefined
  var fullName: js.UndefOr[String] = js.undefined
  var givenName: js.UndefOr[String] = js.undefined
}

object UserName {
  @scala.inline
  def apply(familyName: String = null, fullName: String = null, givenName: String = null): UserName = {
    val __obj = js.Dynamic.literal()
    if (familyName != null) __obj.updateDynamic("familyName")(familyName)
    if (fullName != null) __obj.updateDynamic("fullName")(fullName)
    if (givenName != null) __obj.updateDynamic("givenName")(givenName)
    __obj.asInstanceOf[UserName]
  }
}

