package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellModel extends js.Object {
  var address: Address
  var comment: Comment
  var formula: js.UndefOr[String] = js.undefined
  var hyperlink: js.UndefOr[String] = js.undefined
  var master: Cell
  var result: js.UndefOr[String | Double | js.Any] = js.undefined
  var sharedFormula: js.UndefOr[String] = js.undefined
  var style: Style
  var text: js.UndefOr[String] = js.undefined
  var `type`: ValueType
  var value: js.UndefOr[CellValue] = js.undefined
}

object CellModel {
  @scala.inline
  def apply(
    address: Address,
    comment: Comment,
    master: Cell,
    style: Style,
    `type`: ValueType,
    formula: String = null,
    hyperlink: String = null,
    result: String | Double | js.Any = null,
    sharedFormula: String = null,
    text: String = null,
    value: CellValue = null
  ): CellModel = {
    val __obj = js.Dynamic.literal(address = address, comment = comment, master = master, style = style)
    __obj.updateDynamic("type")(`type`)
    if (formula != null) __obj.updateDynamic("formula")(formula)
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (sharedFormula != null) __obj.updateDynamic("sharedFormula")(sharedFormula)
    if (text != null) __obj.updateDynamic("text")(text)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellModel]
  }
}

