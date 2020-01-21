package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.popoverMod.PopoverTypes
import typings.fundamentalReact.popoverMod.PopperPlacement
import typings.fundamentalReact.popoverMod.PopperSizingTypes
import typings.react.mod.ReactNode
import typings.std.FocusEvent
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  /* Node(s) to render in the overlay. */
  var body: ReactNode
  var className: js.UndefOr[String] = js.undefined
  /* Node to render as the reference element (that the `body` will be placed in relation to). */
  var control: ReactNode
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Set to **true** to render popover without edge detection so popover will not flip from top to bottom with scroll. */
  var disableEdgeDetection: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to remove onKeyPress handler and aria-* roles. Only do so if the control is a complex component such as a FormInput with Button. */
  var disableKeyPressHandler: js.UndefOr[Boolean] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
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
  /* Indicates the type of popup - "dialog", "grid", "listbox", "menu", or "tree". This value is attached to aria-haspopup and is useful to assistive tech. Defaulted to boolean true. */
  var `type`: js.UndefOr[PopoverTypes] = js.undefined
  var useArrowKeyNavigation: js.UndefOr[Boolean] = js.undefined
  var widthSizingType: js.UndefOr[PopperSizingTypes] = js.undefined
}

object AnonBody {
  @scala.inline
  def apply(
    body: ReactNode = null,
    className: String = null,
    control: ReactNode = null,
    customStyles: StringDictionary[js.Any] = null,
    disableEdgeDetection: js.UndefOr[Boolean] = js.undefined,
    disableKeyPressHandler: js.UndefOr[Boolean] = js.undefined,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    noArrow: js.UndefOr[Boolean] = js.undefined,
    onClickOutside: /* event */ MouseEvent | TouchEvent | FocusEvent => Unit = null,
    onEscapeKey: () => Unit = null,
    placement: PopperPlacement = null,
    popperProps: StringDictionary[js.Any] = null,
    `type`: PopoverTypes = null,
    useArrowKeyNavigation: js.UndefOr[Boolean] = js.undefined,
    widthSizingType: PopperSizingTypes = null
  ): AnonBody = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEdgeDetection)) __obj.updateDynamic("disableEdgeDetection")(disableEdgeDetection.asInstanceOf[js.Any])
    if (!js.isUndefined(disableKeyPressHandler)) __obj.updateDynamic("disableKeyPressHandler")(disableKeyPressHandler.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(noArrow)) __obj.updateDynamic("noArrow")(noArrow.asInstanceOf[js.Any])
    if (onClickOutside != null) __obj.updateDynamic("onClickOutside")(js.Any.fromFunction1(onClickOutside))
    if (onEscapeKey != null) __obj.updateDynamic("onEscapeKey")(js.Any.fromFunction0(onEscapeKey))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popperProps != null) __obj.updateDynamic("popperProps")(popperProps.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useArrowKeyNavigation)) __obj.updateDynamic("useArrowKeyNavigation")(useArrowKeyNavigation.asInstanceOf[js.Any])
    if (widthSizingType != null) __obj.updateDynamic("widthSizingType")(widthSizingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

