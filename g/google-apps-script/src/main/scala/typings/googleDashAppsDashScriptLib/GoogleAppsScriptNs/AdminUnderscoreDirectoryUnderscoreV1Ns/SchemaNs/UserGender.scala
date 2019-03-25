package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserGender extends js.Object {
  var addressMeAs: js.UndefOr[java.lang.String] = js.undefined
  var customGender: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object UserGender {
  @scala.inline
  def apply(
    addressMeAs: java.lang.String = null,
    customGender: java.lang.String = null,
    `type`: java.lang.String = null
  ): UserGender = {
    val __obj = js.Dynamic.literal()
    if (addressMeAs != null) __obj.updateDynamic("addressMeAs")(addressMeAs)
    if (customGender != null) __obj.updateDynamic("customGender")(customGender)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UserGender]
  }
}

