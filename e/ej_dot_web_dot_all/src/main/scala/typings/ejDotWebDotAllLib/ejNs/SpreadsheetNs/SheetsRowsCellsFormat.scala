package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsRowsCellsFormat extends js.Object {
  /** Specifies the number of decimal places for the given input.
    * @Default {2}
    */
  var decimalPlaces: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the string format for the given input.
    */
  var formatStr: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the thousand separator for the given input.
    * @Default {false}
    */
  var thousandSeparator: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the type of the format in Spreadsheet.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SheetsRowsCellsFormat {
  @scala.inline
  def apply(
    decimalPlaces: scala.Int | scala.Double = null,
    formatStr: java.lang.String = null,
    thousandSeparator: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): SheetsRowsCellsFormat = {
    val __obj = js.Dynamic.literal()
    if (decimalPlaces != null) __obj.updateDynamic("decimalPlaces")(decimalPlaces.asInstanceOf[js.Any])
    if (formatStr != null) __obj.updateDynamic("formatStr")(formatStr)
    if (!js.isUndefined(thousandSeparator)) __obj.updateDynamic("thousandSeparator")(thousandSeparator)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SheetsRowsCellsFormat]
  }
}

