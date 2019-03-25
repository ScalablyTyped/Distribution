package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPhone extends js.Object {
  var customType: js.UndefOr[java.lang.String] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object UserPhone {
  @scala.inline
  def apply(
    customType: java.lang.String = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): UserPhone = {
    val __obj = js.Dynamic.literal()
    if (customType != null) __obj.updateDynamic("customType")(customType)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[UserPhone]
  }
}

