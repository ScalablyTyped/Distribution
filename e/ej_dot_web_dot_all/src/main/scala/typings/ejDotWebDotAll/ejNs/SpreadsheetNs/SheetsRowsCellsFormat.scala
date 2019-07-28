package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsRowsCellsFormat extends js.Object {
  /** Specifies the number of decimal places for the given input.
    * @Default {2}
    */
  var decimalPlaces: js.UndefOr[Double] = js.undefined
  /** Specifies the string format for the given input.
    */
  var formatStr: js.UndefOr[String] = js.undefined
  /** Specifies the thousand separator for the given input.
    * @Default {false}
    */
  var thousandSeparator: js.UndefOr[Boolean] = js.undefined
  /** Specifies the type of the format in Spreadsheet.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SheetsRowsCellsFormat {
  @scala.inline
  def apply(
    decimalPlaces: Int | Double = null,
    formatStr: String = null,
    thousandSeparator: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): SheetsRowsCellsFormat = {
    val __obj = js.Dynamic.literal()
    if (decimalPlaces != null) __obj.updateDynamic("decimalPlaces")(decimalPlaces.asInstanceOf[js.Any])
    if (formatStr != null) __obj.updateDynamic("formatStr")(formatStr)
    if (!js.isUndefined(thousandSeparator)) __obj.updateDynamic("thousandSeparator")(thousandSeparator)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SheetsRowsCellsFormat]
  }
}

