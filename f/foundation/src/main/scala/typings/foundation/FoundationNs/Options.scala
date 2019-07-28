package typings.foundation.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var abide: js.UndefOr[AbideOptions] = js.undefined
  var accordion: js.UndefOr[AccordionOptions] = js.undefined
  var alert: js.UndefOr[AlertOptions] = js.undefined
  var clearing: js.UndefOr[ClearingOptions] = js.undefined
  var dropdown: js.UndefOr[DropdownOptions] = js.undefined
  var equalizer: js.UndefOr[EqualizerOptions] = js.undefined
  var interchange: js.UndefOr[InterchangeOptions] = js.undefined
  var joyride: js.UndefOr[JoyrideOptions] = js.undefined
  var magellan: js.UndefOr[MagellanOptions] = js.undefined
  var offcanvas: js.UndefOr[OffCanvasOptions] = js.undefined
  var orbit: js.UndefOr[OrbitOptions] = js.undefined
  var reveal: js.UndefOr[RevealOptions] = js.undefined
  var slider: js.UndefOr[SliderOptions] = js.undefined
  var tab: js.UndefOr[TabOptions] = js.undefined
  var tooltip: js.UndefOr[TooltipOptions] = js.undefined
  var topbar: js.UndefOr[TopbarOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    abide: AbideOptions = null,
    accordion: AccordionOptions = null,
    alert: AlertOptions = null,
    clearing: ClearingOptions = null,
    dropdown: DropdownOptions = null,
    equalizer: EqualizerOptions = null,
    interchange: InterchangeOptions = null,
    joyride: JoyrideOptions = null,
    magellan: MagellanOptions = null,
    offcanvas: OffCanvasOptions = null,
    orbit: OrbitOptions = null,
    reveal: RevealOptions = null,
    slider: SliderOptions = null,
    tab: TabOptions = null,
    tooltip: TooltipOptions = null,
    topbar: TopbarOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (abide != null) __obj.updateDynamic("abide")(abide)
    if (accordion != null) __obj.updateDynamic("accordion")(accordion)
    if (alert != null) __obj.updateDynamic("alert")(alert)
    if (clearing != null) __obj.updateDynamic("clearing")(clearing)
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown)
    if (equalizer != null) __obj.updateDynamic("equalizer")(equalizer)
    if (interchange != null) __obj.updateDynamic("interchange")(interchange)
    if (joyride != null) __obj.updateDynamic("joyride")(joyride)
    if (magellan != null) __obj.updateDynamic("magellan")(magellan)
    if (offcanvas != null) __obj.updateDynamic("offcanvas")(offcanvas)
    if (orbit != null) __obj.updateDynamic("orbit")(orbit)
    if (reveal != null) __obj.updateDynamic("reveal")(reveal)
    if (slider != null) __obj.updateDynamic("slider")(slider)
    if (tab != null) __obj.updateDynamic("tab")(tab)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (topbar != null) __obj.updateDynamic("topbar")(topbar)
    __obj.asInstanceOf[Options]
  }
}

