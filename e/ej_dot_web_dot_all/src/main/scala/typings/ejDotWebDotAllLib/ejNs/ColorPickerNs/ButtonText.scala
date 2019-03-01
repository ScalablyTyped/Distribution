package typings
package ejDotWebDotAllLib.ejNs.ColorPickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonText extends js.Object {
  /** Sets the text for the apply button.
    */
  @JSName("apply")
  var apply: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the text for the cancel button.
    */
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the header text for the swatches area.
    */
  var swatches: js.UndefOr[java.lang.String] = js.undefined
}

object ButtonText {
  @scala.inline
  def apply(apply: java.lang.String = null, cancel: java.lang.String = null, swatches: java.lang.String = null): ButtonText = {
    val __obj = js.Dynamic.literal()
    if (apply != null) __obj.updateDynamic("apply")(apply)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (swatches != null) __obj.updateDynamic("swatches")(swatches)
    __obj.asInstanceOf[ButtonText]
  }
}

