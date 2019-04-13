package typings
package focusDashWithinLib.focusDashWithinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusWithinOpts extends js.Object {
  var attr: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
}

object FocusWithinOpts {
  @scala.inline
  def apply(attr: js.UndefOr[scala.Boolean] = js.undefined, className: java.lang.String = null): FocusWithinOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attr)) __obj.updateDynamic("attr")(attr)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[FocusWithinOpts]
  }
}

