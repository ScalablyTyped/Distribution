package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserEmail extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var customType: js.UndefOr[java.lang.String] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object UserEmail {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    customType: java.lang.String = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): UserEmail = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (customType != null) __obj.updateDynamic("customType")(customType)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UserEmail]
  }
}

