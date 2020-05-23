package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  var additional_inheritable_classes: js.UndefOr[js.Array[String]] = js.undefined
  var append_to: js.UndefOr[String] = js.undefined
  var disable_for_touch: js.UndefOr[Boolean] = js.undefined
  var hover_delay: js.UndefOr[Double] = js.undefined
  var show_on: js.UndefOr[String] = js.undefined
  var tip_template: js.UndefOr[js.Function2[/* selector */ String, /* content */ String, String]] = js.undefined
  var tooltip_class: js.UndefOr[String] = js.undefined
  var touch_close_text: js.UndefOr[String] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    additional_inheritable_classes: js.Array[String] = null,
    append_to: String = null,
    disable_for_touch: js.UndefOr[Boolean] = js.undefined,
    hover_delay: js.UndefOr[Double] = js.undefined,
    show_on: String = null,
    tip_template: (/* selector */ String, /* content */ String) => String = null,
    tooltip_class: String = null,
    touch_close_text: String = null
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (additional_inheritable_classes != null) __obj.updateDynamic("additional_inheritable_classes")(additional_inheritable_classes.asInstanceOf[js.Any])
    if (append_to != null) __obj.updateDynamic("append_to")(append_to.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_for_touch)) __obj.updateDynamic("disable_for_touch")(disable_for_touch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hover_delay)) __obj.updateDynamic("hover_delay")(hover_delay.get.asInstanceOf[js.Any])
    if (show_on != null) __obj.updateDynamic("show_on")(show_on.asInstanceOf[js.Any])
    if (tip_template != null) __obj.updateDynamic("tip_template")(js.Any.fromFunction2(tip_template))
    if (tooltip_class != null) __obj.updateDynamic("tooltip_class")(tooltip_class.asInstanceOf[js.Any])
    if (touch_close_text != null) __obj.updateDynamic("touch_close_text")(touch_close_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipOptions]
  }
}

