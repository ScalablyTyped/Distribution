package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

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
    if (customProtocol != null) __obj.updateDynamic("customProtocol")(customProtocol.asInstanceOf[js.Any])
    if (customType != null) __obj.updateDynamic("customType")(customType.asInstanceOf[js.Any])
    if (im != null) __obj.updateDynamic("im")(im.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIm]
  }
}

