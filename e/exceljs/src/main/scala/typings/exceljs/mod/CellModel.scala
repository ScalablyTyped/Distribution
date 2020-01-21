package typings.exceljs.mod

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
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (sharedFormula != null) __obj.updateDynamic("sharedFormula")(sharedFormula.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellModel]
  }
}

