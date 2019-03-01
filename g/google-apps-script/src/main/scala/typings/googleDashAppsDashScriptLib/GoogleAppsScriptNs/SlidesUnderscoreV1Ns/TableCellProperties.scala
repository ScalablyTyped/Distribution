package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellProperties extends js.Object {
  // The alignment of the content in the table cell. The default alignment
  // matches the alignment for newly created table cells in the Slides editor.
  var content_alignment: ContentAlignment
  // The background fill of the table cell. The default fill matches the fill
  // for newly created table cells in the Slides editor.
  var table_cell_background_fill: TableCellPropertiesTableCellBackgroundFill
}

object TableCellProperties {
  @scala.inline
  def apply(
    content_alignment: ContentAlignment,
    table_cell_background_fill: TableCellPropertiesTableCellBackgroundFill
  ): TableCellProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content_alignment")(content_alignment)
    __obj.updateDynamic("table_cell_background_fill")(table_cell_background_fill)
    __obj.asInstanceOf[TableCellProperties]
  }
}

