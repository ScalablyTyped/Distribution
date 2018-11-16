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

