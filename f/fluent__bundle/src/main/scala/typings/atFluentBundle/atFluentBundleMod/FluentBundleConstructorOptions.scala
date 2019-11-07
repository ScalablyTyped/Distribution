package typings.atFluentBundle.atFluentBundleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluentBundleConstructorOptions extends js.Object {
  var functions: js.UndefOr[js.Object] = js.undefined
  var transform: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var useIsolating: js.UndefOr[Boolean] = js.undefined
}

object FluentBundleConstructorOptions {
  @scala.inline
  def apply(
    functions: js.Object = null,
    transform: /* repeated */ js.Any => _ = null,
    useIsolating: js.UndefOr[Boolean] = js.undefined
  ): FluentBundleConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (functions != null) __obj.updateDynamic("functions")(functions)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (!js.isUndefined(useIsolating)) __obj.updateDynamic("useIsolating")(useIsolating)
    __obj.asInstanceOf[FluentBundleConstructorOptions]
  }
}

