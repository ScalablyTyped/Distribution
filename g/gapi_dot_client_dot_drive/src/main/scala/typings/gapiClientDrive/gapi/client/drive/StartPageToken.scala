package typings.gapiClientDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartPageToken extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "drive#startPageToken". */
  var kind: js.UndefOr[String] = js.undefined
  /** The starting page token for listing changes. */
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

