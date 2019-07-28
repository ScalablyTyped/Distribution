package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserIm extends js.Object {
  var customProtocol: js.UndefOr[String] = js.undefined
  var customType: js.UndefOr[String] = js.undefined
  var im: js.UndefOr[String] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object UserIm {
  @scala.inline
  def apply(
    customProtocol: String = null,
    customType: String = null,
    im: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    protocol: String = null,
    `type`: String = null
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

