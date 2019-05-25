package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellTypeSettings extends js.Object {
  /** Specifies the button background color of Custom Cell type.
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the dropdown list data source range of Custom Cell type.
    */
  var dataSourceRange: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the dropdown list data source sheet index of Custom Cell type.
    */
  var dataSourceSheetIndex: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the text and value of field in dropdown list.
    */
  var field: js.UndefOr[js.Any] = js.undefined
  /** Specifies the checkbox is set true or false of Custom Cell type.
    */
  var isChecked: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the button text of Custom Cell type.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the button type of Custom Cell type.
    */
  var `type`: js.UndefOr[CustomCellType] = js.undefined
  /** Specifies the datepicker of Custom Cell type.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object CellTypeSettings {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    dataSourceRange: java.lang.String = null,
    dataSourceSheetIndex: scala.Int | scala.Double = null,
    field: js.Any = null,
    isChecked: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null,
    `type`: CustomCellType = null,
    value: java.lang.String = null
  ): CellTypeSettings = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (dataSourceRange != null) __obj.updateDynamic("dataSourceRange")(dataSourceRange)
    if (dataSourceSheetIndex != null) __obj.updateDynamic("dataSourceSheetIndex")(dataSourceSheetIndex.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field)
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CellTypeSettings]
  }
}

