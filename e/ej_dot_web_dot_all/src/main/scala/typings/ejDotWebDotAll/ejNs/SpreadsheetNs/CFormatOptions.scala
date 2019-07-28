package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CFormatOptions extends js.Object {
  /** Pass the condition to set the conditional formatting
    */
  var action: js.UndefOr[String] = js.undefined
  /** Pass the bgColor to set the conditional formatting
    */
  var bgColor: js.UndefOr[String] = js.undefined
  /** Pass the color to set the conditional formatting
    */
  var color: js.UndefOr[String] = js.undefined
  /** Pass the inputs to set the conditional formatting
    */
  var inputs: js.UndefOr[js.Array[_] | String] = js.undefined
  /** Pass the range to set the conditional formatting
    */
  var range: js.UndefOr[String] = js.undefined
}

object CFormatOptions {
  @scala.inline
  def apply(
    action: String = null,
    bgColor: String = null,
    color: String = null,
    inputs: js.Array[_] | String = null,
    range: String = null
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

