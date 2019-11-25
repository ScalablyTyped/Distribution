package typings.ejDotWebDotAll.ej.ColorPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonText extends js.Object {
  /** Sets the text for the apply button.
    */
  @JSName("apply")
  var apply: js.UndefOr[String] = js.undefined
  /** Sets the text for the cancel button.
    */
  var cancel: js.UndefOr[String] = js.undefined
  /** Sets the header text for the swatches area.
    */
  var swatches: js.UndefOr[String] = js.undefined
}

object ButtonText {
  @scala.inline
  def apply(apply: String = null, cancel: String = null, swatches: String = null): ButtonText = {
    val __obj = js.Dynamic.literal()
    if (apply != null) __obj.updateDynamic("apply")(apply.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (swatches != null) __obj.updateDynamic("swatches")(swatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonText]
  }
}

