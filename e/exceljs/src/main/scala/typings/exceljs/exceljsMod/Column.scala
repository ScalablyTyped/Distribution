package typings.exceljs.exceljsMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  /**
  	 * Can be a string to set one row high header or an array to set multi-row high header
  	 */
  var header: String | js.Array[String]
  /**
  	 * Hides the column
  	 */
  var hidden: Boolean
  /**
  	 * The name of the properties associated with this column in each row
  	 */
  var key: String
  /**
  	 * Column letter key
  	 */
  val letter: String
  /**
  	 * Set an outline level for columns
  	 */
  var outlineLevel: Double
  /**
  	 * Styles applied to the column
  	 */
  var style: Partial[Style]
  /**
  	 * The cell values in the column
  	 */
  var values: js.Array[CellValue]
  /**
  	 * The width of the column
  	 */
  var width: Double
}

object Column {
  @scala.inline
  def apply(
    header: String | js.Array[String],
    hidden: Boolean,
    key: String,
    letter: String,
    outlineLevel: Double,
    style: Partial[Style],
    values: js.Array[CellValue],
    width: Double
  ): Column = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], letter = letter.asInstanceOf[js.Any], outlineLevel = outlineLevel.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Column]
  }
}

