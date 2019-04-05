package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableColumnProperties extends js.Object {
  var columnWidth: js.UndefOr[Dimension] = js.undefined
}

object TableColumnProperties {
  @scala.inline
  def apply(columnWidth: Dimension = null): TableColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth)
    __obj.asInstanceOf[TableColumnProperties]
  }
}

