package typings.fundamentalDashReact.libPopoverPopoverMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.std.FocusEvent
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps
  extends /* x */ StringDictionary[js.Any] {
  /* Node(s) to render in the overlay. */
  var body: ReactNode
  var className: js.UndefOr[String] = js.undefined
  /* Node to render as the reference element (that the `body` will be placed in relation to). */
  var control: ReactNode
  var disabled: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to render a popover without an arrow. */
  var noArrow: js.UndefOr[Boolean] = js.undefined
  /* Callback for consumer clicking outside of popover body. */
  var onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent | TouchEvent | FocusEvent, Unit]] = js.undefined
  /* Callback when escape key is pressed when popover body is visible. */
  var onEscapeKey: js.UndefOr[js.Function0[Unit]] = js.undefined
  /* Initial position of the `body` (overlay) related to the `control`. */
  var placement: js.UndefOr[PopperPlacement] = js.undefined
  /* Additional props to be spread to the overlay element. */
  var popperProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    body: ReactNode = null,
    className: String = null,
    control: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    noArrow: js.UndefOr[Boolean] = js.undefined,
    onClickOutside: /* event */ MouseEvent | TouchEvent | FocusEvent => Unit = null,
    onEscapeKey: () => Unit = null,
    placement: PopperPlacement = null,
    popperProps: StringDictionary[js.Any] = null
  ): PopoverProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(noArrow)) __obj.updateDynamic("noArrow")(noArrow.asInstanceOf[js.Any])
    if (onClickOutside != null) __obj.updateDynamic("onClickOutside")(js.Any.fromFunction1(onClickOutside))
    if (onEscapeKey != null) __obj.updateDynamic("onEscapeKey")(js.Any.fromFunction0(onEscapeKey))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popperProps != null) __obj.updateDynamic("popperProps")(popperProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
}

