package typings
package foundationLib.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  var additional_inheritable_classes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var append_to: js.UndefOr[java.lang.String] = js.undefined
  var disable_for_touch: js.UndefOr[scala.Boolean] = js.undefined
  var hover_delay: js.UndefOr[scala.Double] = js.undefined
  var show_on: js.UndefOr[java.lang.String] = js.undefined
  var tip_template: js.UndefOr[
    js.Function2[/* selector */ java.lang.String, /* content */ java.lang.String, java.lang.String]
  ] = js.undefined
  var tooltip_class: js.UndefOr[java.lang.String] = js.undefined
  var touch_close_text: js.UndefOr[java.lang.String] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    additional_inheritable_classes: js.Array[java.lang.String] = null,
    append_to: java.lang.String = null,
    disable_for_touch: js.UndefOr[scala.Boolean] = js.undefined,
    hover_delay: scala.Int | scala.Double = null,
    show_on: java.lang.String = null,
    tip_template: js.Function2[/* selector */ java.lang.String, /* content */ java.lang.String, java.lang.String] = null,
    tooltip_class: java.lang.String = null,
    touch_close_text: java.lang.String = null
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (additional_inheritable_classes != null) __obj.updateDynamic("additional_inheritable_classes")(additional_inheritable_classes)
    if (append_to != null) __obj.updateDynamic("append_to")(append_to)
    if (!js.isUndefined(disable_for_touch)) __obj.updateDynamic("disable_for_touch")(disable_for_touch)
    if (hover_delay != null) __obj.updateDynamic("hover_delay")(hover_delay.asInstanceOf[js.Any])
    if (show_on != null) __obj.updateDynamic("show_on")(show_on)
    if (tip_template != null) __obj.updateDynamic("tip_template")(tip_template)
    if (tooltip_class != null) __obj.updateDynamic("tooltip_class")(tooltip_class)
    if (touch_close_text != null) __obj.updateDynamic("touch_close_text")(touch_close_text)
    __obj.asInstanceOf[TooltipOptions]
  }
}

