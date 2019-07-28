package typings.gapiDotClientDotSlides.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellProperties extends js.Object {
  /**
    * The background fill of the table cell. The default fill matches the fill
    * for newly created table cells in the Slides editor.
    */
  var tableCellBackgroundFill: js.UndefOr[TableCellBackgroundFill] = js.undefined
}

object TableCellProperties {
  @scala.inline
  def apply(tableCellBackgroundFill: TableCellBackgroundFill = null): TableCellProperties = {
    val __obj = js.Dynamic.literal()
    if (tableCellBackgroundFill != null) __obj.updateDynamic("tableCellBackgroundFill")(tableCellBackgroundFill)
    __obj.asInstanceOf[TableCellProperties]
  }
}

