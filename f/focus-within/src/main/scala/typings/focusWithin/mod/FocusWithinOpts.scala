package typings.focusWithin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusWithinOpts extends js.Object {
  var attr: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
}

object FocusWithinOpts {
  @scala.inline
  def apply(attr: js.UndefOr[Boolean] = js.undefined, className: String = null): FocusWithinOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attr)) __obj.updateDynamic("attr")(attr.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusWithinOpts]
  }
}

