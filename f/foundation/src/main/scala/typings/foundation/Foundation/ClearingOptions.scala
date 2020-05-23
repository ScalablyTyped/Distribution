package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/clearing.html#optional-javascript-configuration
trait ClearingOptions extends js.Object {
  var close_selectors: js.UndefOr[String] = js.undefined
  var init: js.UndefOr[Boolean] = js.undefined
  var locked: js.UndefOr[Boolean] = js.undefined
  var open_selectors: js.UndefOr[String] = js.undefined
  var skip_selector: js.UndefOr[String] = js.undefined
  var templates: js.UndefOr[js.Object] = js.undefined
  var touch_label: js.UndefOr[String] = js.undefined
}

object ClearingOptions {
  @scala.inline
  def apply(
    close_selectors: String = null,
    init: js.UndefOr[Boolean] = js.undefined,
    locked: js.UndefOr[Boolean] = js.undefined,
    open_selectors: String = null,
    skip_selector: String = null,
    templates: js.Object = null,
    touch_label: String = null
  ): ClearingOptions = {
    val __obj = js.Dynamic.literal()
    if (close_selectors != null) __obj.updateDynamic("close_selectors")(close_selectors.asInstanceOf[js.Any])
    if (!js.isUndefined(init)) __obj.updateDynamic("init")(init.get.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.get.asInstanceOf[js.Any])
    if (open_selectors != null) __obj.updateDynamic("open_selectors")(open_selectors.asInstanceOf[js.Any])
    if (skip_selector != null) __obj.updateDynamic("skip_selector")(skip_selector.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    if (touch_label != null) __obj.updateDynamic("touch_label")(touch_label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearingOptions]
  }
}

