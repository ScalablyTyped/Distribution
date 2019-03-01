package typings
package ejDotWebDotAllLib.ejNs.TooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Tooltip control can be accessed through the keyboard shortcut keys.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the animation behavior in  Tooltip. It contains the following sub properties.
    */
  var animation: js.UndefOr[Animation] = js.undefined
  /** Sets the position related to target element, window, mouse or (x,y) co-ordinates.
    * @Default {ej.Tooltip.Associate.Target}
    */
  var associate: js.UndefOr[Associate | java.lang.String] = js.undefined
  /** Specified the delay to hide Tooltip when closeMode is auto.
    * @Default {4000}
    */
  var autoCloseTimeout: js.UndefOr[scala.Double] = js.undefined
  /** This event is triggered before the Tooltip widget get closed.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, scala.Unit]] = js.undefined
  /** This event is triggered before the Tooltip widget gets open.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, scala.Unit]] = js.undefined
  /** Fires on clicking to the target element.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, scala.Unit]] = js.undefined
  /** This event is triggered after the Tooltip widget is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, scala.Unit]] = js.undefined
  /** Specifies the closing behavior of Tooltip popup.
    * @Default {ej.Tooltip.CloseMode.None}
    */
  var closeMode: js.UndefOr[CloseMode | java.lang.String] = js.undefined
  /** Sets the Tooltip in alternate position when collision occurs.
    * @Default {ej.Tooltip.Collision.FlipFit}
    */
  var collision: js.UndefOr[Collision | java.lang.String] = js.undefined
  /** Specified the selector for the container element.
    * @Default {body}
    */
  var containment: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the text for Tooltip.
    * @Default {null}
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** This event is triggered after the Tooltip is created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Sets the root CSS class for Tooltip for the customization.
    * @Default {null}
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** This event is triggered after the Tooltip widget is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Sets the Tooltip direction from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the Tooltip.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the height of the Tooltip popup.
    * @Default {auto}
    */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** This event is triggered while hovering the target element, when tooltip positioning relates to target element.
    */
  var hover: js.UndefOr[js.Function1[/* e */ HoverEventArgs, scala.Unit]] = js.undefined
  /** Enables the arrow in Tooltip.
    * @Default {true}
    */
  var isBalloon: js.UndefOr[scala.Boolean] = js.undefined
  /** This event is triggered after the Tooltip is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, scala.Unit]] = js.undefined
  /** defines various attributes of the Tooltip position
    */
  var position: js.UndefOr[Position] = js.undefined
  /** Enables or disables rounded corner.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables shadow effect.
    * @Default {false}
    */
  var showShadow: js.UndefOr[scala.Boolean] = js.undefined
  /** Specified a selector for elements, within the container.
    * @Default {null}
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /** defines Tooltip size and gap between tooltip against the target element.
    */
  var tip: js.UndefOr[Tip] = js.undefined
  /** The title text to be displayed in the Tooltip header.
    * @Default {null}
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** This event is triggered while hover the target element, when the tooltip positioning is relates to the mouse.
    */
  var tracking: js.UndefOr[js.Function1[/* e */ TrackingEventArgs, scala.Unit]] = js.undefined
  /** Specified the event action to show case the Tooltip.
    * @Default {ej.Tooltip.Trigger.Hover}
    */
  var trigger: js.UndefOr[Trigger | java.lang.String] = js.undefined
  /** Defines the width of the Tooltip popup.
    * @Default {auto}
    */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    animation: Animation = null,
    associate: Associate | java.lang.String = null,
    autoCloseTimeout: scala.Int | scala.Double = null,
    beforeClose: js.Function1[/* e */ BeforeCloseEventArgs, scala.Unit] = null,
    beforeOpen: js.Function1[/* e */ BeforeOpenEventArgs, scala.Unit] = null,
    click: js.Function1[/* e */ ClickEventArgs, scala.Unit] = null,
    close: js.Function1[/* e */ CloseEventArgs, scala.Unit] = null,
    closeMode: CloseMode | java.lang.String = null,
    collision: Collision | java.lang.String = null,
    containment: java.lang.String = null,
    content: java.lang.String = null,
    create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    height: java.lang.String | scala.Double = null,
    hover: js.Function1[/* e */ HoverEventArgs, scala.Unit] = null,
    isBalloon: js.UndefOr[scala.Boolean] = js.undefined,
    open: js.Function1[/* e */ OpenEventArgs, scala.Unit] = null,
    position: Position = null,
    showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined,
    showShadow: js.UndefOr[scala.Boolean] = js.undefined,
    target: java.lang.String = null,
    tip: Tip = null,
    title: java.lang.String = null,
    tracking: js.Function1[/* e */ TrackingEventArgs, scala.Unit] = null,
    trigger: Trigger | java.lang.String = null,
    width: java.lang.String | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (associate != null) __obj.updateDynamic("associate")(associate.asInstanceOf[js.Any])
    if (autoCloseTimeout != null) __obj.updateDynamic("autoCloseTimeout")(autoCloseTimeout.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose)
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(beforeOpen)
    if (click != null) __obj.updateDynamic("click")(click)
    if (close != null) __obj.updateDynamic("close")(close)
    if (closeMode != null) __obj.updateDynamic("closeMode")(closeMode.asInstanceOf[js.Any])
    if (collision != null) __obj.updateDynamic("collision")(collision.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment)
    if (content != null) __obj.updateDynamic("content")(content)
    if (create != null) __obj.updateDynamic("create")(create)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (!js.isUndefined(isBalloon)) __obj.updateDynamic("isBalloon")(isBalloon)
    if (open != null) __obj.updateDynamic("open")(open)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (!js.isUndefined(showShadow)) __obj.updateDynamic("showShadow")(showShadow)
    if (target != null) __obj.updateDynamic("target")(target)
    if (tip != null) __obj.updateDynamic("tip")(tip)
    if (title != null) __obj.updateDynamic("title")(title)
    if (tracking != null) __obj.updateDynamic("tracking")(tracking)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

