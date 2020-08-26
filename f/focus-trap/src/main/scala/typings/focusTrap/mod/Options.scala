package typings.focusTrap.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Default: `false`. If `true`, a click outside the focus trap will
    * deactivate the focus trap and allow the click event to do its thing.
    */
  var clickOutsideDeactivates: js.UndefOr[Boolean] = js.native
  /**
    * Default: `true`. If `false`, the `Escape` key will not trigger
    * deactivation of the focus trap. This can be useful if you want
    * to force the user to make a decision instead of allowing an easy
    * way out.
    */
  var escapeDeactivates: js.UndefOr[Boolean] = js.native
  /**
    * By default, an error will be thrown if the focus trap contains no
    * elements in its tab order. With this option you can specify a
    * fallback element to programmatically receive focus if no other
    * tabbable elements are found. For example, you may want a popover's
    * `<div>` to receive focus if the popover's content includes no
    * tabbable elements. *Make sure the fallback element has a negative
    * `tabindex` so it can be programmatically focused.*
    */
  var fallbackFocus: js.UndefOr[FocusTarget] = js.native
  /**
    * By default, when a focus trap is activated the first element in the
    * focus trap's tab order will receive focus. With this option you can
    * specify a different element to receive that initial focus.
    */
  var initialFocus: js.UndefOr[FocusTarget] = js.native
  /**
    * A function that will be called when the focus trap activates.
    */
  var onActivate: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A function that will be called when the focus trap deactivates.
    */
  var onDeactivate: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Default: `true`. If `false`, when the trap is deactivated,
    * focus will *not* return to the element that had focus before activation.
    */
  var returnFocusOnDeactivate: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClickOutsideDeactivates(value: Boolean): Self = this.set("clickOutsideDeactivates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickOutsideDeactivates: Self = this.set("clickOutsideDeactivates", js.undefined)
    @scala.inline
    def setEscapeDeactivates(value: Boolean): Self = this.set("escapeDeactivates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscapeDeactivates: Self = this.set("escapeDeactivates", js.undefined)
    @scala.inline
    def setFallbackFocusFunction0(value: () => HTMLElement): Self = this.set("fallbackFocus", js.Any.fromFunction0(value))
    @scala.inline
    def setFallbackFocus(value: FocusTarget): Self = this.set("fallbackFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallbackFocus: Self = this.set("fallbackFocus", js.undefined)
    @scala.inline
    def setInitialFocusFunction0(value: () => HTMLElement): Self = this.set("initialFocus", js.Any.fromFunction0(value))
    @scala.inline
    def setInitialFocus(value: FocusTarget): Self = this.set("initialFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialFocus: Self = this.set("initialFocus", js.undefined)
    @scala.inline
    def setOnActivate(value: () => Unit): Self = this.set("onActivate", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnActivate: Self = this.set("onActivate", js.undefined)
    @scala.inline
    def setOnDeactivate(value: () => Unit): Self = this.set("onDeactivate", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDeactivate: Self = this.set("onDeactivate", js.undefined)
    @scala.inline
    def setReturnFocusOnDeactivate(value: Boolean): Self = this.set("returnFocusOnDeactivate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnFocusOnDeactivate: Self = this.set("returnFocusOnDeactivate", js.undefined)
  }
  
}

