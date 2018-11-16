package typings
package ejDotWebDotAllLib.ejNs.MenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Model extends js.Object {
  /** To enable or disable the Animation while hover or click an menu items.See AnimationType
               * @Default {ej.AnimationType.Default}
               */
  var animationType: js.UndefOr[ejDotWebDotAllLib.ejNs.AnimationType | java.lang.String] = js.undefined
  /** Fires before context menu gets open.
               */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, scala.Unit]] = js.undefined
  /** Fires when mouse click on menu items.
               */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, scala.Unit]] = js.undefined
  /** Fire when context menu on close.
               */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, scala.Unit]] = js.undefined
  /** Specifies the container element selectors for submenuâ€™s collision. The submenu gets displayed based on spacing available with respect to container element.
               * @Default {null}
               */
  var container: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the target id of context menu. On right clicking the specified contextTarget element, context menu gets shown.
               * @Default {null}
               */
  var contextMenuTarget: js.UndefOr[java.lang.String] = js.undefined
  /** Fires to create menu items.
               */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Specify the CSS class to achieve custom theme.
               */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Fires to destroy menu items.
               */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** To enable or disable the Animation effect while hover or click an menu items.
               * @Default {true}
               */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the root menu items to be aligned center in horizontal menu.
               * @Default {false}
               */
  var enableCenterAlign: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the menu items to be displayed in right to left direction.
               * @Default {false}
               */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** When this property sets to false, the menu items is displayed without any separators.
               * @Default {true}
               */
  var enableSeparator: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable / Disable the Menu control.
               * @Default {true}
               */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the target which needs to be excluded. i.e., The context menu will not be displayed in those specified targets.
               * @Default {null}
               */
  var excludeTarget: js.UndefOr[java.lang.String] = js.undefined
  /** Fields used to bind the data source and it includes following field members to make data bind easier.
               * @Default {null}
               */
  var fields: js.UndefOr[Fields] = js.undefined
  /** Specifies the height of the root menu.
               * @Default {auto}
               */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Specifies the list of HTML attributes to be added to menu control.
               * @Default {{}}
               */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Enables/disables responsive support for the Menu control during the window resizing time.
               * @Default {true}
               */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires when key down on menu items.
               */
  var keydown: js.UndefOr[js.Function1[/* e */ KeydownEventArgs, scala.Unit]] = js.undefined
  /** Specifies the type of the menu. Essential JavaScript Menu consists of two type of menu, they are Normal Menu and Context Menu mode.See MenuType
               * @Default {ej.MenuType.NormalMenu}
               */
  var menuType: js.UndefOr[java.lang.String | ejDotWebDotAllLib.ejNs.MenuType] = js.undefined
  /** Fires when mouse out from menu items.
               */
  var mouseout: js.UndefOr[js.Function1[/* e */ MouseoutEventArgs, scala.Unit]] = js.undefined
  /** Fires when mouse over the Menu items.
               */
  var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, scala.Unit]] = js.undefined
  /** Fires when context menu on open.
               */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, scala.Unit]] = js.undefined
  /** Specifies the sub menu items to be show or open only on click.
               * @Default {false}
               */
  var openOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the orientation of normal menu. Normal menu can rendered in horizontal or vertical direction by using this API. See Orientation
               * @Default {ej.Orientation.Horizontal}
               */
  var orientation: js.UndefOr[ejDotWebDotAllLib.ejNs.Orientation | java.lang.String] = js.undefined
  /** Fires when overflow popup menu closes.
               */
  var overflowClose: js.UndefOr[js.Function1[/* e */ OverflowCloseEventArgs, scala.Unit]] = js.undefined
  /** Specifies the popup menu height.
               * @Default {auto}
               */
  var overflowHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Fires when overflow popup menu opens.
               */
  var overflowOpen: js.UndefOr[js.Function1[/* e */ OverflowOpenEventArgs, scala.Unit]] = js.undefined
  /** Specifies the popup menu width.
               * @Default {auto}
               */
  var overflowWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Specifies the main menu items arrows only to be shown if it contains child items.
               * @Default {true}
               */
  var showRootLevelArrows: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the sub menu items arrows only to be shown if it contains child items.
               * @Default {true}
               */
  var showSubLevelArrows: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies position of pull down submenu that will appear on mouse over.See Direction
               * @Default {ej.Direction.Right}
               */
  var subMenuDirection: js.UndefOr[java.lang.String | ejDotWebDotAllLib.ejNs.Direction] = js.undefined
  /** Specifies the title to responsive menu.
               * @Default {Menu}
               */
  var titleText: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the width of the main menu.
               * @Default {auto}
               */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

