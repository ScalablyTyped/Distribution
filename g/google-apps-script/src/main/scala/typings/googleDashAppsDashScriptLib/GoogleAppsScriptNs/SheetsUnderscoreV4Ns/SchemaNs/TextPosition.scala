package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextPosition extends js.Object {
  var horizontalAlignment: js.UndefOr[java.lang.String] = js.undefined
}

object TextPosition {
  @scala.inline
  def apply(horizontalAlignment: java.lang.String = null): TextPosition = {
    val __obj = js.Dynamic.literal()
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment)
    __obj.asInstanceOf[TextPosition]
  }
}

