package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartPageToken extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
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

