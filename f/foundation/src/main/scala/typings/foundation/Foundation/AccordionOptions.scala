package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/accordion.html#optional-javascript-configuration
trait AccordionOptions extends js.Object {
  var active_class: js.UndefOr[String] = js.undefined
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  var content_class: js.UndefOr[String] = js.undefined
  var multi_expand: js.UndefOr[Boolean] = js.undefined
  var toggleable: js.UndefOr[Boolean] = js.undefined
}

object AccordionOptions {
  @scala.inline
  def apply(
    active_class: String = null,
    callback: () => _ = null,
    content_class: String = null,
    multi_expand: js.UndefOr[Boolean] = js.undefined,
    toggleable: js.UndefOr[Boolean] = js.undefined
  ): AccordionOptions = {
    val __obj = js.Dynamic.literal()
    if (active_class != null) __obj.updateDynamic("active_class")(active_class.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (content_class != null) __obj.updateDynamic("content_class")(content_class.asInstanceOf[js.Any])
    if (!js.isUndefined(multi_expand)) __obj.updateDynamic("multi_expand")(multi_expand.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleable)) __obj.updateDynamic("toggleable")(toggleable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionOptions]
  }
}

