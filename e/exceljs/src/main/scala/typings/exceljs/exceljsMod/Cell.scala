package typings.exceljs.exceljsMod

import typings.std.Date
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
  val formula: String
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
  var name: js.UndefOr[String] = js.undefined
  /**
  	 * Assign (or get) an array of names for a cell (cells can have more than one name)
  	 */
  var names: js.UndefOr[js.Array[String]] = js.undefined
  /**
  	 * convenience getter to access the formula result
  	 */
  val result: Double | String | Date
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
  def removeName(name: String): Unit
}

object Cell {
  @scala.inline
  def apply(
    formula: String,
    formulaType: FormulaType,
    removeName: String => Unit,
    result: Double | String | Date,
    style: Style,
    `type`: ValueType,
    alignment: Alignment = null,
    border: Borders = null,
    dataValidation: DataValidation = null,
    fill: Fill = null,
    font: Font = null,
    master: Cell = null,
    name: String = null,
    names: js.Array[String] = null,
    numFmt: String = null,
    value: CellValue = null
  ): Cell = {
    val __obj = js.Dynamic.literal(formula = formula, formulaType = formulaType, removeName = js.Any.fromFunction1(removeName), result = result.asInstanceOf[js.Any], style = style)
    __obj.updateDynamic("type")(`type`)
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (border != null) __obj.updateDynamic("border")(border)
    if (dataValidation != null) __obj.updateDynamic("dataValidation")(dataValidation)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (master != null) __obj.updateDynamic("master")(master)
    if (name != null) __obj.updateDynamic("name")(name)
    if (names != null) __obj.updateDynamic("names")(names)
    if (numFmt != null) __obj.updateDynamic("numFmt")(numFmt)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
}

