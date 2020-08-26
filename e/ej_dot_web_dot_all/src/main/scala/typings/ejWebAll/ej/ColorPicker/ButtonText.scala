package typings.ejWebAll.ej.ColorPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonText extends js.Object {
  /** Sets the text for the apply button.
    */
  @JSName("apply")
  var apply: js.UndefOr[String] = js.native
  /** Sets the text for the cancel button.
    */
  var cancel: js.UndefOr[String] = js.native
  /** Sets the header text for the swatches area.
    */
  var swatches: js.UndefOr[String] = js.native
}

object ButtonText {
  @scala.inline
  def apply(): ButtonText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonText]
  }
  @scala.inline
  implicit class ButtonTextOps[Self <: ButtonText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApply(value: String): Self = this.set("apply", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApply: Self = this.set("apply", js.undefined)
    @scala.inline
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setSwatches(value: String): Self = this.set("swatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwatches: Self = this.set("swatches", js.undefined)
  }
  
}

