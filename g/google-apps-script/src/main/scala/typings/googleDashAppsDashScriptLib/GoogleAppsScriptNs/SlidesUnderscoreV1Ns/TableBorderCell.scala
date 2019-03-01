package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableBorderCell extends js.Object {
  // The location of the border within the border table.
  var location: TableCellLocation
  // The border properties.
  var table_border_properties: TableBorderProperties
}

object TableBorderCell {
  @scala.inline
  def apply(location: TableCellLocation, table_border_properties: TableBorderProperties): TableBorderCell = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("table_border_properties")(table_border_properties)
    __obj.asInstanceOf[TableBorderCell]
  }
}

