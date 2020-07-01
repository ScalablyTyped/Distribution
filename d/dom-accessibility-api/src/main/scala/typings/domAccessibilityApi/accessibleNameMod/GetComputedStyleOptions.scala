package typings.domAccessibilityApi.accessibleNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetComputedStyleOptions extends js.Object {
  var getComputedStyle: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.getComputedStyle */ js.Any
  ] = js.undefined
}

object GetComputedStyleOptions {
  @scala.inline
  def apply(
    getComputedStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.getComputedStyle */ js.Any = null
  ): GetComputedStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (getComputedStyle != null) __obj.updateDynamic("getComputedStyle")(getComputedStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComputedStyleOptions]
  }
}

