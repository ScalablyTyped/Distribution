package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserIm extends js.Object {
  var customProtocol: js.UndefOr[java.lang.String] = js.undefined
  var customType: js.UndefOr[java.lang.String] = js.undefined
  var im: js.UndefOr[java.lang.String] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object UserIm {
  @scala.inline
  def apply(
    customProtocol: java.lang.String = null,
    customType: java.lang.String = null,
    im: java.lang.String = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    protocol: java.lang.String = null,
    `type`: java.lang.String = null
  ): UserIm = {
    val __obj = js.Dynamic.literal()
    if (customProtocol != null) __obj.updateDynamic("customProtocol")(customProtocol)
    if (customType != null) __obj.updateDynamic("customType")(customType)
    if (im != null) __obj.updateDynamic("im")(im)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UserIm]
  }
}

