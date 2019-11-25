package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPicture extends js.Object {
  var url: js.UndefOr[String] = js.undefined
}

object UserPicture {
  @scala.inline
  def apply(url: String = null): UserPicture = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPicture]
  }
}

