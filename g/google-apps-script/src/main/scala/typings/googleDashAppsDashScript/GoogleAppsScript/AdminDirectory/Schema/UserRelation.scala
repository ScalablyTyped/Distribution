package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRelation extends js.Object {
  var customType: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object UserRelation {
  @scala.inline
  def apply(customType: String = null, `type`: String = null, value: String = null): UserRelation = {
    val __obj = js.Dynamic.literal()
    if (customType != null) __obj.updateDynamic("customType")(customType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRelation]
  }
}

