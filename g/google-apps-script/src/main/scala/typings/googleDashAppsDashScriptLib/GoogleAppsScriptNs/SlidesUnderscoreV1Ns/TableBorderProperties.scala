package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableBorderProperties extends js.Object {
  // The dash style of the border.
  var dash_style: DashStyle
  // The fill of the table border.
  var table_border_fill: TableBorderPropertiesTableBorderFill
  // The thickness of the border.
  var weight: Dimension
}

object TableBorderProperties {
  @scala.inline
  def apply(dash_style: DashStyle, table_border_fill: TableBorderPropertiesTableBorderFill, weight: Dimension): TableBorderProperties = {
    val __obj = js.Dynamic.literal(dash_style = dash_style, table_border_fill = table_border_fill, weight = weight)
  
    __obj.asInstanceOf[TableBorderProperties]
  }
}

