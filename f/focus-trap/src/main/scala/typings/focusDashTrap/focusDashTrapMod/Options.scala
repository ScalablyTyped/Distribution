package typings.focusDashTrap.focusDashTrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Default: `false`. If `true`, a click outside the focus trap will
    * deactivate the focus trap and allow the click event to do its thing.
    */
  var clickOutsideDeactivates: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: `true`. If `false`, the `Escape` key will not trigger
    * deactivation of the focus trap. This can be useful if you want
    * to force the user to make a decision instead of allowing an easy
    * way out.
    */
  var escapeDeactivates: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, an error will be thrown if the focus trap contains no
    * elements in its tab order. With this option you can specify a
    * fallback element to programmatically receive focus if no other
    * tabbable elements are found. For example, you may want a popover's
    * `<div>` to receive focus if the popover's content includes no
    * tabbable elements. *Make sure the fallback element has a negative
    * `tabindex` so it can be programmatically focused.*
    */
  var fallbackFocus: js.UndefOr[FocusTarget] = js.undefined
  /**
    * By default, when a focus trap is activated the first element in the
    * focus trap's tab order will receive focus. With this option you can
    * specify a different element to receive that initial focus.
    */
  var initialFocus: js.UndefOr[FocusTarget] = js.undefined
  /**
    * A function that will be called when the focus trap activates.
    */
  var onActivate: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function that will be called when the focus trap deactivates.
    */
  var onDeactivate: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Default: `true`. If `false`, when the trap is deactivated,
    * focus will *not* return to the element that had focus before activation.
    */
  var returnFocusOnDeactivate: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    clickOutsideDeactivates: js.UndefOr[Boolean] = js.undefined,
    escapeDeactivates: js.UndefOr[Boolean] = js.undefined,
    fallbackFocus: FocusTarget = null,
    initialFocus: FocusTarget = null,
    onActivate: () => Unit = null,
    onDeactivate: () => Unit = null,
    returnFocusOnDeactivate: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickOutsideDeactivates)) __obj.updateDynamic("clickOutsideDeactivates")(clickOutsideDeactivates.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeDeactivates)) __obj.updateDynamic("escapeDeactivates")(escapeDeactivates.asInstanceOf[js.Any])
    if (fallbackFocus != null) __obj.updateDynamic("fallbackFocus")(fallbackFocus.asInstanceOf[js.Any])
    if (initialFocus != null) __obj.updateDynamic("initialFocus")(initialFocus.asInstanceOf[js.Any])
    if (onActivate != null) __obj.updateDynamic("onActivate")(js.Any.fromFunction0(onActivate))
    if (onDeactivate != null) __obj.updateDynamic("onDeactivate")(js.Any.fromFunction0(onDeactivate))
    if (!js.isUndefined(returnFocusOnDeactivate)) __obj.updateDynamic("returnFocusOnDeactivate")(returnFocusOnDeactivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

