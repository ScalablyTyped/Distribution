package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineStyle extends js.Object {
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object LineStyle {
  @scala.inline
  def apply(`type`: java.lang.String = null, width: scala.Int | scala.Double = null): LineStyle = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyle]
  }
}

