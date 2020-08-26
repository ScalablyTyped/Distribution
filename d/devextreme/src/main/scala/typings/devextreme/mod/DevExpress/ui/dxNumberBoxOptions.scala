package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.clear
import typings.devextreme.devextremeStrings.number
import typings.devextreme.devextremeStrings.spins
import typings.devextreme.devextremeStrings.tel
import typings.devextreme.devextremeStrings.text
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxNumberBoxOptions extends dxTextEditorOptions[dxNumberBox] {
  /** @name dxNumberBox.Options.buttons */
  @JSName("buttons")
  var buttons_dxNumberBoxOptions: js.UndefOr[js.Array[clear | spins | dxTextEditorButton]] = js.native
  /** @name dxNumberBox.Options.format */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.native
  /** @name dxNumberBox.Options.invalidValueMessage */
  var invalidValueMessage: js.UndefOr[String] = js.native
  /** @name dxNumberBox.Options.max */
  var max: js.UndefOr[Double] = js.native
  /** @name dxNumberBox.Options.min */
  var min: js.UndefOr[Double] = js.native
  /** @name dxNumberBox.Options.mode */
  var mode: js.UndefOr[number | text | tel] = js.native
  /** @name dxNumberBox.Options.showSpinButtons */
  var showSpinButtons: js.UndefOr[Boolean] = js.native
  /** @name dxNumberBox.Options.step */
  var step: js.UndefOr[Double] = js.native
  /** @name dxNumberBox.Options.useLargeSpinButtons */
  var useLargeSpinButtons: js.UndefOr[Boolean] = js.native
  /** @name dxNumberBox.Options.value */
  @JSName("value")
  var value_dxNumberBoxOptions: js.UndefOr[Double] = js.native
}

object dxNumberBoxOptions {
  @scala.inline
  def apply(): dxNumberBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxNumberBoxOptions]
  }
  @scala.inline
  implicit class dxNumberBoxOptionsOps[Self <: dxNumberBoxOptions] (val x: Self) extends AnyVal {
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
    def setButtonsVarargs(value: (clear | spins | dxTextEditorButton)*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[clear | spins | dxTextEditorButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | Date => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setFormat(value: format): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setInvalidValueMessage(value: String): Self = this.set("invalidValueMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidValueMessage: Self = this.set("invalidValueMessage", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMode(value: number | text | tel): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setShowSpinButtons(value: Boolean): Self = this.set("showSpinButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSpinButtons: Self = this.set("showSpinButtons", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setUseLargeSpinButtons(value: Boolean): Self = this.set("useLargeSpinButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLargeSpinButtons: Self = this.set("useLargeSpinButtons", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

