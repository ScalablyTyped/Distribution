package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowStyle extends js.Object {
  var minRowHeight: js.UndefOr[Dimension] = js.undefined
}

object TableRowStyle {
  @scala.inline
  def apply(minRowHeight: Dimension = null): TableRowStyle = {
    val __obj = js.Dynamic.literal()
    if (minRowHeight != null) __obj.updateDynamic("minRowHeight")(minRowHeight)
    __obj.asInstanceOf[TableRowStyle]
  }
}

