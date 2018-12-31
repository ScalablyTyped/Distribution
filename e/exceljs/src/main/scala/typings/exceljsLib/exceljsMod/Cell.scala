package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cell extends Style {
  /**
  	 * Cells can define what values are valid or not and provide
  	 * prompting to the user to help guide them.
  	 */
  var dataValidation: js.UndefOr[DataValidation] = js.undefined
  /**
  	 * convenience getter to access the formula
  	 */
  val formula: java.lang.String
  /**
  	 * The type of the cell's formula
  	 */
  val formulaType: FormulaType
  /**
  	 * The master cell when the current cell is a merge cell
  	 */
  var master: js.UndefOr[Cell] = js.undefined
  /**
  	 * Assign (or get) a name for a cell (will overwrite any other names that cell had)
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Assign (or get) an array of names for a cell (cells can have more than one name)
  	 */
  var names: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	 * convenience getter to access the formula result
  	 */
  val result: scala.Double | java.lang.String | stdLib.Date
  /**
  	 * The styles of the cell
  	 */
  var style: Style
  /**
  	 * The type of the cell's value
  	 */
  val `type`: ValueType
  /**
  	 * Value of the cell
  	 */
  var value: CellValue
  /**
  	 * Remove a name from a cell
  	 */
  def removeName(name: java.lang.String): scala.Unit
}

