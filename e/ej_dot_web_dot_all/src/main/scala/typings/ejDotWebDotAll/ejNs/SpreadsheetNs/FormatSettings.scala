package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable or disable cell border feature in the Spreadsheet.
    * @Default {true}
    */
  var allowCellBorder: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable decimal places in the Spreadsheet.
    * @Default {true}
    */
  var allowDecimalPlaces: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable font family feature in Spreadsheet.
    * @Default {true}
    */
  var allowFontFamily: js.UndefOr[Boolean] = js.undefined
}

object FormatSettings {
  @scala.inline
  def apply(
    allowCellBorder: js.UndefOr[Boolean] = js.undefined,
    allowDecimalPlaces: js.UndefOr[Boolean] = js.undefined,
    allowFontFamily: js.UndefOr[Boolean] = js.undefined
  ): FormatSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCellBorder)) __obj.updateDynamic("allowCellBorder")(allowCellBorder)
    if (!js.isUndefined(allowDecimalPlaces)) __obj.updateDynamic("allowDecimalPlaces")(allowDecimalPlaces)
    if (!js.isUndefined(allowFontFamily)) __obj.updateDynamic("allowFontFamily")(allowFontFamily)
    __obj.asInstanceOf[FormatSettings]
  }
}

