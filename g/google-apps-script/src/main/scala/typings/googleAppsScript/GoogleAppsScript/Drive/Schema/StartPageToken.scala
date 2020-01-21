package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartPageToken extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var startPageToken: js.UndefOr[String] = js.undefined
}

object StartPageToken {
  @scala.inline
  def apply(kind: String = null, startPageToken: String = null): StartPageToken = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (startPageToken != null) __obj.updateDynamic("startPageToken")(startPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPageToken]
  }
}

