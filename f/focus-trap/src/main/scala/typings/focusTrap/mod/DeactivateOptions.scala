package typings.focusTrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<focus-trap.focus-trap.Options, 'onDeactivate'> */
trait DeactivateOptions extends js.Object {
  var onDeactivate: js.UndefOr[js.Function0[Unit]] = js.undefined
  var returnFocus: js.UndefOr[Boolean] = js.undefined
}

object DeactivateOptions {
  @scala.inline
  def apply(onDeactivate: () => Unit = null, returnFocus: js.UndefOr[Boolean] = js.undefined): DeactivateOptions = {
    val __obj = js.Dynamic.literal()
    if (onDeactivate != null) __obj.updateDynamic("onDeactivate")(js.Any.fromFunction0(onDeactivate))
    if (!js.isUndefined(returnFocus)) __obj.updateDynamic("returnFocus")(returnFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivateOptions]
  }
}

