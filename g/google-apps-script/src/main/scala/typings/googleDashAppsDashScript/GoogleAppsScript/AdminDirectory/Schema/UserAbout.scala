package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAbout extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object UserAbout {
  @scala.inline
  def apply(contentType: String = null, value: String = null): UserAbout = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAbout]
  }
}

