package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsRowsCellsStyle extends js.Object {
  /** Specifies the background color of a cell in the Spreadsheet.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Specifies the font color of a cell in the Spreadsheet.
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the font weight of a cell in the Spreadsheet.
    */
  var fontWeight: js.UndefOr[String] = js.undefined
}

object SheetsRowsCellsStyle {
  @scala.inline
  def apply(backgroundColor: String = null, color: String = null, fontWeight: String = null): SheetsRowsCellsStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsRowsCellsStyle]
  }
}

