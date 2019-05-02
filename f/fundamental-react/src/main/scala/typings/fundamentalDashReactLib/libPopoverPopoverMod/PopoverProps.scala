package typings
package fundamentalDashReactLib.libPopoverPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /* Node(s) to render in the overlay. */
  var body: reactLib.reactMod.ReactNode
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* Node to render as the reference element (that the `body` will be placed in relation to). */
  var control: reactLib.reactMod.ReactNode
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /* Set to **true** to render a popover without an arrow. */
  var noArrow: js.UndefOr[scala.Boolean] = js.undefined
  /* Callback for consumer clicking outside of popover body. */
  var onClickOutside: js.UndefOr[
    js.Function1[/* event */ stdLib.MouseEvent | stdLib.TouchEvent | stdLib.FocusEvent, scala.Unit]
  ] = js.undefined
  /* Callback when escape key is pressed when popover body is visible. */
  var onEscapeKey: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /* Initial position of the `body` (overlay) related to the `control`. */
  var placement: js.UndefOr[PopperPlacement] = js.undefined
  /* Additional props to be spread to the overlay element. */
  var popperProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    body: reactLib.reactMod.ReactNode,
    control: reactLib.reactMod.ReactNode,
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    noArrow: js.UndefOr[scala.Boolean] = js.undefined,
    onClickOutside: /* event */ stdLib.MouseEvent | stdLib.TouchEvent | stdLib.FocusEvent => scala.Unit = null,
    onEscapeKey: () => scala.Unit = null,
    placement: PopperPlacement = null,
    popperProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): PopoverProps = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(noArrow)) __obj.updateDynamic("noArrow")(noArrow)
    if (onClickOutside != null) __obj.updateDynamic("onClickOutside")(js.Any.fromFunction1(onClickOutside))
    if (onEscapeKey != null) __obj.updateDynamic("onEscapeKey")(js.Any.fromFunction0(onEscapeKey))
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (popperProps != null) __obj.updateDynamic("popperProps")(popperProps)
    __obj.asInstanceOf[PopoverProps]
  }
}

