package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CFormatOptions extends js.Object {
  /** Pass the condition to set the conditional formatting
    */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the bgColor to set the conditional formatting
    */
  var bgColor: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the color to set the conditional formatting
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the inputs to set the conditional formatting
    */
  var inputs: js.UndefOr[js.Array[_] | java.lang.String] = js.undefined
  /** Pass the range to set the conditional formatting
    */
  var range: js.UndefOr[java.lang.String] = js.undefined
}

object CFormatOptions {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    bgColor: java.lang.String = null,
    color: java.lang.String = null,
    inputs: js.Array[_] | java.lang.String = null,
    range: java.lang.String = null
  ): CFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (color != null) __obj.updateDynamic("color")(color)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[CFormatOptions]
  }
}

