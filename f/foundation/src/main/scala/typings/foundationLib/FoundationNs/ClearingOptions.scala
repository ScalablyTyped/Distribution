package typings
package foundationLib.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/clearing.html#optional-javascript-configuration
trait ClearingOptions extends js.Object {
  var close_selectors: js.UndefOr[java.lang.String] = js.undefined
  var init: js.UndefOr[scala.Boolean] = js.undefined
  var locked: js.UndefOr[scala.Boolean] = js.undefined
  var open_selectors: js.UndefOr[java.lang.String] = js.undefined
  var skip_selector: js.UndefOr[java.lang.String] = js.undefined
  var templates: js.UndefOr[js.Object] = js.undefined
  var touch_label: js.UndefOr[java.lang.String] = js.undefined
}

object ClearingOptions {
  @scala.inline
  def apply(
    close_selectors: java.lang.String = null,
    init: js.UndefOr[scala.Boolean] = js.undefined,
    locked: js.UndefOr[scala.Boolean] = js.undefined,
    open_selectors: java.lang.String = null,
    skip_selector: java.lang.String = null,
    templates: js.Object = null,
    touch_label: java.lang.String = null
  ): ClearingOptions = {
    val __obj = js.Dynamic.literal()
    if (close_selectors != null) __obj.updateDynamic("close_selectors")(close_selectors)
    if (!js.isUndefined(init)) __obj.updateDynamic("init")(init)
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    if (open_selectors != null) __obj.updateDynamic("open_selectors")(open_selectors)
    if (skip_selector != null) __obj.updateDynamic("skip_selector")(skip_selector)
    if (templates != null) __obj.updateDynamic("templates")(templates)
    if (touch_label != null) __obj.updateDynamic("touch_label")(touch_label)
    __obj.asInstanceOf[ClearingOptions]
  }
}

