package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartPageToken extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "drive#startPageToken". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The starting page token for listing changes. */
  var startPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object StartPageToken {
  @scala.inline
  def apply(kind: java.lang.String = null, startPageToken: java.lang.String = null): StartPageToken = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (startPageToken != null) __obj.updateDynamic("startPageToken")(startPageToken)
    __obj.asInstanceOf[StartPageToken]
  }
}

