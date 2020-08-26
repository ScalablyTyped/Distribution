package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var abide: js.UndefOr[AbideOptions] = js.native
  var accordion: js.UndefOr[AccordionOptions] = js.native
  var alert: js.UndefOr[AlertOptions] = js.native
  var clearing: js.UndefOr[ClearingOptions] = js.native
  var dropdown: js.UndefOr[DropdownOptions] = js.native
  var equalizer: js.UndefOr[EqualizerOptions] = js.native
  var interchange: js.UndefOr[InterchangeOptions] = js.native
  var joyride: js.UndefOr[JoyrideOptions] = js.native
  var magellan: js.UndefOr[MagellanOptions] = js.native
  var offcanvas: js.UndefOr[OffCanvasOptions] = js.native
  var orbit: js.UndefOr[OrbitOptions] = js.native
  var reveal: js.UndefOr[RevealOptions] = js.native
  var slider: js.UndefOr[SliderOptions] = js.native
  var tab: js.UndefOr[TabOptions] = js.native
  var tooltip: js.UndefOr[TooltipOptions] = js.native
  var topbar: js.UndefOr[TopbarOptions] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAbide(value: AbideOptions): Self = this.set("abide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbide: Self = this.set("abide", js.undefined)
    @scala.inline
    def setAccordion(value: AccordionOptions): Self = this.set("accordion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccordion: Self = this.set("accordion", js.undefined)
    @scala.inline
    def setAlert(value: AlertOptions): Self = this.set("alert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlert: Self = this.set("alert", js.undefined)
    @scala.inline
    def setClearing(value: ClearingOptions): Self = this.set("clearing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearing: Self = this.set("clearing", js.undefined)
    @scala.inline
    def setDropdown(value: DropdownOptions): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdown: Self = this.set("dropdown", js.undefined)
    @scala.inline
    def setEqualizer(value: EqualizerOptions): Self = this.set("equalizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEqualizer: Self = this.set("equalizer", js.undefined)
    @scala.inline
    def setInterchange(value: InterchangeOptions): Self = this.set("interchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterchange: Self = this.set("interchange", js.undefined)
    @scala.inline
    def setJoyride(value: JoyrideOptions): Self = this.set("joyride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoyride: Self = this.set("joyride", js.undefined)
    @scala.inline
    def setMagellan(value: MagellanOptions): Self = this.set("magellan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMagellan: Self = this.set("magellan", js.undefined)
    @scala.inline
    def setOffcanvas(value: OffCanvasOptions): Self = this.set("offcanvas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffcanvas: Self = this.set("offcanvas", js.undefined)
    @scala.inline
    def setOrbit(value: OrbitOptions): Self = this.set("orbit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrbit: Self = this.set("orbit", js.undefined)
    @scala.inline
    def setReveal(value: RevealOptions): Self = this.set("reveal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReveal: Self = this.set("reveal", js.undefined)
    @scala.inline
    def setSlider(value: SliderOptions): Self = this.set("slider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlider: Self = this.set("slider", js.undefined)
    @scala.inline
    def setTab(value: TabOptions): Self = this.set("tab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTab: Self = this.set("tab", js.undefined)
    @scala.inline
    def setTooltip(value: TooltipOptions): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTopbar(value: TopbarOptions): Self = this.set("topbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopbar: Self = this.set("topbar", js.undefined)
  }
  
}

