package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellTypeSettings extends js.Object {
  /** Specifies the button background color of Custom Cell type.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Specifies the dropdown list data source range of Custom Cell type.
    */
  var dataSourceRange: js.UndefOr[String] = js.undefined
  /** Specifies the dropdown list data source sheet index of Custom Cell type.
    */
  var dataSourceSheetIndex: js.UndefOr[Double] = js.undefined
  /** Specifies the text and value of field in dropdown list.
    */
  var field: js.UndefOr[js.Any] = js.undefined
  /** Specifies the checkbox is set true or false of Custom Cell type.
    */
  var isChecked: js.UndefOr[Boolean] = js.undefined
  /** Specifies the button text of Custom Cell type.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the button type of Custom Cell type.
    */
  var `type`: js.UndefOr[CustomCellType] = js.undefined
  /** Specifies the value for datepicker of Custom Cell type.
    */
  var value: js.UndefOr[String] = js.undefined
}

object CellTypeSettings {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    dataSourceRange: String = null,
    dataSourceSheetIndex: Int | Double = null,
    field: js.Any = null,
    isChecked: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    `type`: CustomCellType = null,
    value: String = null
  ): CellTypeSettings = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (dataSourceRange != null) __obj.updateDynamic("dataSourceRange")(dataSourceRange.asInstanceOf[js.Any])
    if (dataSourceSheetIndex != null) __obj.updateDynamic("dataSourceSheetIndex")(dataSourceSheetIndex.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellTypeSettings]
  }
}

