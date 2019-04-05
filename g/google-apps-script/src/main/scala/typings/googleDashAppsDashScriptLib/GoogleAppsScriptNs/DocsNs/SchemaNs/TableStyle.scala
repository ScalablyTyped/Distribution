package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableStyle extends js.Object {
  var tableColumnProperties: js.UndefOr[js.Array[TableColumnProperties]] = js.undefined
}

object TableStyle {
  @scala.inline
  def apply(tableColumnProperties: js.Array[TableColumnProperties] = null): TableStyle = {
    val __obj = js.Dynamic.literal()
    if (tableColumnProperties != null) __obj.updateDynamic("tableColumnProperties")(tableColumnProperties)
    __obj.asInstanceOf[TableStyle]
  }
}

