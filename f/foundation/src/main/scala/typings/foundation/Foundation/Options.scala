package typings.foundation.Foundation

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
    if (abide != null) __obj.updateDynamic("abide")(abide.asInstanceOf[js.Any])
    if (accordion != null) __obj.updateDynamic("accordion")(accordion.asInstanceOf[js.Any])
    if (alert != null) __obj.updateDynamic("alert")(alert.asInstanceOf[js.Any])
    if (clearing != null) __obj.updateDynamic("clearing")(clearing.asInstanceOf[js.Any])
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown.asInstanceOf[js.Any])
    if (equalizer != null) __obj.updateDynamic("equalizer")(equalizer.asInstanceOf[js.Any])
    if (interchange != null) __obj.updateDynamic("interchange")(interchange.asInstanceOf[js.Any])
    if (joyride != null) __obj.updateDynamic("joyride")(joyride.asInstanceOf[js.Any])
    if (magellan != null) __obj.updateDynamic("magellan")(magellan.asInstanceOf[js.Any])
    if (offcanvas != null) __obj.updateDynamic("offcanvas")(offcanvas.asInstanceOf[js.Any])
    if (orbit != null) __obj.updateDynamic("orbit")(orbit.asInstanceOf[js.Any])
    if (reveal != null) __obj.updateDynamic("reveal")(reveal.asInstanceOf[js.Any])
    if (slider != null) __obj.updateDynamic("slider")(slider.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (topbar != null) __obj.updateDynamic("topbar")(topbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

