package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatObjectOptions extends js.Object {
  /** Pass the decimal places in cell
    */
  var decimalPlaces: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the format str in cell
    */
  var formatStr: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the style object in a cell
    */
  var style: js.UndefOr[js.Any] = js.undefined
  /** Pass the thousand separator in cell
    */
  var thousandSeparator: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the type of cell
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object FormatObjectOptions {
  @scala.inline
  def apply(
    decimalPlaces: java.lang.String = null,
    formatStr: java.lang.String = null,
    style: js.Any = null,
    thousandSeparator: java.lang.String = null,
    `type`: java.lang.String = null
  ): FormatObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (decimalPlaces != null) __obj.updateDynamic("decimalPlaces")(decimalPlaces)
    if (formatStr != null) __obj.updateDynamic("formatStr")(formatStr)
    if (style != null) __obj.updateDynamic("style")(style)
    if (thousandSeparator != null) __obj.updateDynamic("thousandSeparator")(thousandSeparator)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FormatObjectOptions]
  }
}

