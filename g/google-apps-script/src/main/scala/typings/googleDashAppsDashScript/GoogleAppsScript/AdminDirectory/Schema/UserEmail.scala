package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserEmail extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var customType: js.UndefOr[String] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object UserEmail {
  @scala.inline
  def apply(
    address: String = null,
    customType: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): UserEmail = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (customType != null) __obj.updateDynamic("customType")(customType)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UserEmail]
  }
}

