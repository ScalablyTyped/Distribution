package typings
package ejDotWebDotAllLib.ejNs.ToolbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Model extends js.Object {
  /** Specifies the items of  Toolbar
               * @Default {null}
               */
  var Items: js.UndefOr[Items] = js.undefined
  /** Fires after Toolbar control is clicked.
               */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, scala.Unit]] = js.undefined
  /** Fires after Toolbar control is created.
               */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Sets the root CSS class for Toolbar control to achieve the custom theme.
               */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies dataSource value for the Toolbar control during initialization.
               * @Default {null}
               */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Fires when the Toolbar is destroyed successfully.
               */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Disables an Item or set of Items that are enabled in the Toolbar
               * @Default {[]}
               */
  var disabledItemIndices: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies enableRTL property to align the Toolbar control from right to left direction.
               * @Default {false}
               */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows to separate the each UL items in the Toolbar control.
               * @Default {false}
               */
  var enableSeparator: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the Toolbar control state.
               * @Default {true}
               */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables an Item or set of Items that are disabled in the Toolbar
               * @Default {[]}
               */
  var enabledItemIndices: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the mapping fields for the data items of the Toolbar
               * @Default {null}
               */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Fires after Toolbar control is focused.
               */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, scala.Unit]] = js.undefined
  /** Specifies the height of the Toolbar.
               * @Default {28}
               */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Specifies whether the Toolbar control is need to be show or hide.
               * @Default {false}
               */
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the list of HTML attributes to be added to toolbar control.
               * @Default {{}}
               */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Enables/Disables the responsive support for Toolbar items during the window resizing time.
               * @Default {false}
               */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires after Toolbar control item is hovered.
               */
  var itemHover: js.UndefOr[js.Function1[/* e */ ItemHoverEventArgs, scala.Unit]] = js.undefined
  /** Fires after mouse leave from Toolbar control item.
               */
  var itemLeave: js.UndefOr[js.Function1[/* e */ ItemLeaveEventArgs, scala.Unit]] = js.undefined
  /** Specifies the Toolbar orientation. See orientation
               * @Default {Horizontal}
               */
  var orientation: js.UndefOr[ejDotWebDotAllLib.ejNs.Orientation | java.lang.String] = js.undefined
  /** Fires when the overflow popup of toolbar is closed.
               */
  var overflowClose: js.UndefOr[js.Function1[/* e */ OverflowCloseEventArgs, scala.Unit]] = js.undefined
  /** Fires when the overflow popup of toolbar is opened.
               */
  var overflowOpen: js.UndefOr[js.Function1[/* e */ OverflowOpenEventArgs, scala.Unit]] = js.undefined
  /** Specifies the query to retrieve the data from the online server. The query is used only when the online dataSource is used.
               * @Default {null}
               */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Specifies the Toolbar responsive type.
               * @Default {Popup}
               */
  var responsiveType: js.UndefOr[ResponsiveType | java.lang.String] = js.undefined
  /** Displays the Toolbar with rounded corners.
               * @Default {false}
               */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the width of the Toolbar.
               */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

