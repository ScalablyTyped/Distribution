package typings.ejWebAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Tooltip control can be accessed through the keyboard shortcut keys.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
  /** Specifies the animation behavior in  Tooltip. It contains the following sub properties.
    */
  var animation: js.UndefOr[Animation] = js.undefined
  /** Sets the position related to target element, window, mouse or (x,y) co-ordinates.
    * @Default {ej.Tooltip.Associate.Target}
    */
  var associate: js.UndefOr[Associate | String] = js.undefined
  /** Specified the delay to hide Tooltip when closeMode is auto.
    * @Default {4000}
    */
  var autoCloseTimeout: js.UndefOr[Double] = js.undefined
  /** This event is triggered before the Tooltip widget get closed.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.undefined
  /** This event is triggered before the Tooltip widget gets open.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.undefined
  /** Fires on clicking to the target element.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
  /** This event is triggered after the Tooltip widget is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
  /** Specifies the closing behavior of Tooltip popup.
    * @Default {ej.Tooltip.CloseMode.None}
    */
  var closeMode: js.UndefOr[CloseMode | String] = js.undefined
  /** Sets the Tooltip in alternate position when collision occurs.
    * @Default {ej.Tooltip.Collision.FlipFit}
    */
  var collision: js.UndefOr[Collision | String] = js.undefined
  /** Specified the selector for the container element.
    * @Default {body}
    */
  var containment: js.UndefOr[String] = js.undefined
  /** Specifies the text for Tooltip.
    * @Default {null}
    */
  var content: js.UndefOr[String] = js.undefined
  /** This event is triggered after the Tooltip is created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Sets the root CSS class for Tooltip for the customization.
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** This event is triggered after the Tooltip widget is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Sets the Tooltip direction from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the Tooltip.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Defines the height of the Tooltip popup.
    * @Default {auto}
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /** This event is triggered while hovering the target element, when tooltip positioning relates to target element.
    */
  var hover: js.UndefOr[js.Function1[/* e */ HoverEventArgs, Unit]] = js.undefined
  /** Enables the arrow in Tooltip.
    * @Default {true}
    */
  var isBalloon: js.UndefOr[Boolean] = js.undefined
  /** This event is triggered after the Tooltip is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
  /** defines various attributes of the Tooltip position
    */
  var position: js.UndefOr[Position] = js.undefined
  /** Enables or disables rounded corner.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables shadow effect.
    * @Default {false}
    */
  var showShadow: js.UndefOr[Boolean] = js.undefined
  /** Specified a selector for elements, within the container.
    * @Default {null}
    */
  var target: js.UndefOr[String] = js.undefined
  /** defines Tooltip size and gap between tooltip against the target element.
    */
  var tip: js.UndefOr[Tip] = js.undefined
  /** The title text to be displayed in the Tooltip header.
    * @Default {null}
    */
  var title: js.UndefOr[String] = js.undefined
  /** This event is triggered while hover the target element, when the tooltip positioning is relates to the mouse.
    */
  var tracking: js.UndefOr[js.Function1[/* e */ TrackingEventArgs, Unit]] = js.undefined
  /** Specified the event action to show case the Tooltip.
    * @Default {ej.Tooltip.Trigger.Hover}
    */
  var trigger: js.UndefOr[Trigger | String] = js.undefined
  /** Defines the width of the Tooltip popup.
    * @Default {auto}
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    animation: Animation = null,
    associate: Associate | String = null,
    autoCloseTimeout: js.UndefOr[Double] = js.undefined,
    beforeClose: /* e */ BeforeCloseEventArgs => Unit = null,
    beforeOpen: /* e */ BeforeOpenEventArgs => Unit = null,
    click: /* e */ ClickEventArgs => Unit = null,
    close: /* e */ CloseEventArgs => Unit = null,
    closeMode: CloseMode | String = null,
    collision: Collision | String = null,
    containment: String = null,
    content: String = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: String | Double = null,
    hover: /* e */ HoverEventArgs => Unit = null,
    isBalloon: js.UndefOr[Boolean] = js.undefined,
    open: /* e */ OpenEventArgs => Unit = null,
    position: Position = null,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    showShadow: js.UndefOr[Boolean] = js.undefined,
    target: String = null,
    tip: Tip = null,
    title: String = null,
    tracking: /* e */ TrackingEventArgs => Unit = null,
    trigger: Trigger | String = null,
    width: String | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation.get.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (associate != null) __obj.updateDynamic("associate")(associate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCloseTimeout)) __obj.updateDynamic("autoCloseTimeout")(autoCloseTimeout.get.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1(beforeClose))
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(js.Any.fromFunction1(beforeOpen))
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (closeMode != null) __obj.updateDynamic("closeMode")(closeMode.asInstanceOf[js.Any])
    if (collision != null) __obj.updateDynamic("collision")(collision.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(js.Any.fromFunction1(hover))
    if (!js.isUndefined(isBalloon)) __obj.updateDynamic("isBalloon")(isBalloon.get.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showShadow)) __obj.updateDynamic("showShadow")(showShadow.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tip != null) __obj.updateDynamic("tip")(tip.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tracking != null) __obj.updateDynamic("tracking")(js.Any.fromFunction1(tracking))
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

