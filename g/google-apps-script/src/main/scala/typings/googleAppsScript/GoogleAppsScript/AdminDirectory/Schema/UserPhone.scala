package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPhone extends js.Object {
  var customType: js.UndefOr[String] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object UserPhone {
  @scala.inline
  def apply(
    customType: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    value: String = null
  ): UserPhone = {
    val __obj = js.Dynamic.literal()
    if (customType != null) __obj.updateDynamic("customType")(customType.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPhone]
  }
}

