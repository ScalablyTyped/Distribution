package typings
package foundationLib.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/tabs.html
trait TabOptions extends js.Object {
  var active_class: js.UndefOr[java.lang.String] = js.undefined
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  var deep_linking: js.UndefOr[scala.Boolean] = js.undefined
  var is_hover: js.UndefOr[scala.Boolean] = js.undefined
  var scroll_to_content: js.UndefOr[scala.Boolean] = js.undefined
}

object TabOptions {
  @scala.inline
  def apply(
    active_class: java.lang.String = null,
    callback: js.Function0[_] = null,
    deep_linking: js.UndefOr[scala.Boolean] = js.undefined,
    is_hover: js.UndefOr[scala.Boolean] = js.undefined,
    scroll_to_content: js.UndefOr[scala.Boolean] = js.undefined
  ): TabOptions = {
    val __obj = js.Dynamic.literal()
    if (active_class != null) __obj.updateDynamic("active_class")(active_class)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (!js.isUndefined(deep_linking)) __obj.updateDynamic("deep_linking")(deep_linking)
    if (!js.isUndefined(is_hover)) __obj.updateDynamic("is_hover")(is_hover)
    if (!js.isUndefined(scroll_to_content)) __obj.updateDynamic("scroll_to_content")(scroll_to_content)
    __obj.asInstanceOf[TabOptions]
  }
}

