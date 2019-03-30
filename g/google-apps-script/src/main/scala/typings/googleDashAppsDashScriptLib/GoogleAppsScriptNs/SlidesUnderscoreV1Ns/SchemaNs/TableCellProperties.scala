package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellProperties extends js.Object {
  var contentAlignment: js.UndefOr[java.lang.String] = js.undefined
  var tableCellBackgroundFill: js.UndefOr[TableCellBackgroundFill] = js.undefined
}

object TableCellProperties {
  @scala.inline
  def apply(contentAlignment: java.lang.String = null, tableCellBackgroundFill: TableCellBackgroundFill = null): TableCellProperties = {
    val __obj = js.Dynamic.literal()
    if (contentAlignment != null) __obj.updateDynamic("contentAlignment")(contentAlignment)
    if (tableCellBackgroundFill != null) __obj.updateDynamic("tableCellBackgroundFill")(tableCellBackgroundFill)
    __obj.asInstanceOf[TableCellProperties]
  }
}

