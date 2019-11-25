package typings.exceljs.exceljsMod

import typings.exceljs.Anon_Address
import typings.std.Date
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cell
  extends Style
     with Address {
  /**
  	 * comment of the cell
  	 */
  var comment: Comment
  /**
  	 * Cells can define what values are valid or not and provide
  	 * prompting to the user to help guide them.
  	 */
  var dataValidation: DataValidation
  val effectiveType: ValueType
  /**
  	 * convenience getter to access the formula
  	 */
  val formula: String
  /**
  	 * The type of the cell's formula
  	 */
  val formulaType: FormulaType
  val fullAddress: Anon_Address
  val hyperlink: String
  val isHyperlink: Boolean
  val isMerged: Boolean
  val master: Cell
  var model: CellModel
  /**
  	 * Assign (or get) a name for a cell (will overwrite any other names that cell had)
  	 */
  var name: String
  /**
  	 * Assign (or get) an array of names for a cell (cells can have more than one name)
  	 */
  var names: js.Array[String]
  /**
  	 * convenience getter to access the formula result
  	 */
  val result: Double | String | Date
  /**
  	 * The styles of the cell
  	 */
  var style: Partial[Style]
  	// todo
  val text: String
  /**
  	 * The type of the cell's value
  	 */
  val `type`: ValueType
  /**
  	 * Value of the cell
  	 */
  var value: CellValue
  val workbook: Workbook
  val worksheet: Worksheet
  def addMergeRef(): Unit
  def addName(name: String): Unit
  def destroy(): Unit
  def isMergedTo(master: Cell): Boolean
  def merge(master: Cell): Unit
  def release(): Unit
  def releaseMergeRef(): Unit
  def removeAllNames(): Unit
  /**
  	 * Remove a name from a cell
  	 */
  def removeName(name: String): Unit
  def toCsvString(): String
  def unmerge(): Unit
}

object Cell {
  @scala.inline
  def apply(
    $col$row: String,
    addMergeRef: () => Unit,
    addName: String => Unit,
    address: String,
    alignment: Partial[Alignment],
    border: Partial[Borders],
    col: String,
    comment: Comment,
    dataValidation: DataValidation,
    destroy: () => Unit,
    effectiveType: ValueType,
    fill: Fill,
    font: Partial[Font],
    formula: String,
    formulaType: FormulaType,
    fullAddress: Anon_Address,
    hyperlink: String,
    isHyperlink: Boolean,
    isMerged: Boolean,
    isMergedTo: Cell => Boolean,
    master: Cell,
    merge: Cell => Unit,
    model: CellModel,
    name: String,
    names: js.Array[String],
    numFmt: String,
    protection: Partial[Protection],
    release: () => Unit,
    releaseMergeRef: () => Unit,
    removeAllNames: () => Unit,
    removeName: String => Unit,
    result: Double | String | Date,
    row: String,
    style: Partial[Style],
    text: String,
    toCsvString: () => String,
    `type`: ValueType,
    unmerge: () => Unit,
    workbook: Workbook,
    worksheet: Worksheet,
    sheetName: String = null,
    value: CellValue = null
  ): Cell = {
    val __obj = js.Dynamic.literal($col$row = $col$row.asInstanceOf[js.Any], addMergeRef = js.Any.fromFunction0(addMergeRef), addName = js.Any.fromFunction1(addName), address = address.asInstanceOf[js.Any], alignment = alignment.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], dataValidation = dataValidation.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), effectiveType = effectiveType.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], formula = formula.asInstanceOf[js.Any], formulaType = formulaType.asInstanceOf[js.Any], fullAddress = fullAddress.asInstanceOf[js.Any], hyperlink = hyperlink.asInstanceOf[js.Any], isHyperlink = isHyperlink.asInstanceOf[js.Any], isMerged = isMerged.asInstanceOf[js.Any], isMergedTo = js.Any.fromFunction1(isMergedTo), master = master.asInstanceOf[js.Any], merge = js.Any.fromFunction1(merge), model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], numFmt = numFmt.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], release = js.Any.fromFunction0(release), releaseMergeRef = js.Any.fromFunction0(releaseMergeRef), removeAllNames = js.Any.fromFunction0(removeAllNames), removeName = js.Any.fromFunction1(removeName), result = result.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], toCsvString = js.Any.fromFunction0(toCsvString), unmerge = js.Any.fromFunction0(unmerge), workbook = workbook.asInstanceOf[js.Any], worksheet = worksheet.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (sheetName != null) __obj.updateDynamic("sheetName")(sheetName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
}

