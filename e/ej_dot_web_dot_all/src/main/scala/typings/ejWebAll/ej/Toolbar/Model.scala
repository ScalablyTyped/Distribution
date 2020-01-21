package typings.ejWebAll.ej.Toolbar

import typings.ejWebAll.ej.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Specifies the items of  Toolbar
    * @Default {null}
    */
  var Items: js.UndefOr[typings.ejWebAll.ej.Toolbar.Items] = js.undefined
  /** Fires after Toolbar control is clicked.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
  /** Fires after Toolbar control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Sets the root CSS class for Toolbar control to achieve the custom theme.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Specifies dataSource value for the Toolbar control during initialization.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Fires when the Toolbar is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Disables an Item or set of Items that are enabled in the Toolbar
    * @Default {[]}
    */
  var disabledItemIndices: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies enableRTL property to align the Toolbar control from right to left direction.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Allows to separate the each UL items in the Toolbar control.
    * @Default {false}
    */
  var enableSeparator: js.UndefOr[Boolean] = js.undefined
  /** Specifies the Toolbar control state.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Enables an Item or set of Items that are disabled in the Toolbar
    * @Default {[]}
    */
  var enabledItemIndices: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the mapping fields for the data items of the Toolbar
    * @Default {null}
    */
  var fields: js.UndefOr[String] = js.undefined
  /** Fires after Toolbar control is focused.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.undefined
  /** Specifies the height of the Toolbar.
    * @Default {28}
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /** Specifies whether the Toolbar control is need to be show or hide.
    * @Default {false}
    */
  var hide: js.UndefOr[Boolean] = js.undefined
  /** Specifies the list of HTML attributes to be added to toolbar control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Enables/Disables the responsive support for Toolbar items during the window resizing time.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Fires after Toolbar control item is hovered.
    */
  var itemHover: js.UndefOr[js.Function1[/* e */ ItemHoverEventArgs, Unit]] = js.undefined
  /** Fires after mouse leave from Toolbar control item.
    */
  var itemLeave: js.UndefOr[js.Function1[/* e */ ItemLeaveEventArgs, Unit]] = js.undefined
  /** Specifies the Toolbar orientation. See orientation
    * @Default {Horizontal}
    */
  var orientation: js.UndefOr[Orientation | String] = js.undefined
  /** Fires when the overflow popup of toolbar is closed.
    */
  var overflowClose: js.UndefOr[js.Function1[/* e */ OverflowCloseEventArgs, Unit]] = js.undefined
  /** Fires when the overflow popup of toolbar is opened.
    */
  var overflowOpen: js.UndefOr[js.Function1[/* e */ OverflowOpenEventArgs, Unit]] = js.undefined
  /** Specifies the query to retrieve the data from the online server. The query is used only when the online dataSource is used.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Specifies the Toolbar responsive type.
    * @Default {Popup}
    */
  var responsiveType: js.UndefOr[ResponsiveType | String] = js.undefined
  /** Displays the Toolbar with rounded corners.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Specifies the width of the Toolbar.
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    Items: Items = null,
    click: /* e */ ClickEventArgs => Unit = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    dataSource: js.Any = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    disabledItemIndices: js.Array[_] = null,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableSeparator: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    enabledItemIndices: js.Array[_] = null,
    fields: String = null,
    focusOut: /* e */ FocusOutEventArgs => Unit = null,
    height: Double | String = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    htmlAttributes: js.Any = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    itemHover: /* e */ ItemHoverEventArgs => Unit = null,
    itemLeave: /* e */ ItemLeaveEventArgs => Unit = null,
    orientation: Orientation | String = null,
    overflowClose: /* e */ OverflowCloseEventArgs => Unit = null,
    overflowOpen: /* e */ OverflowOpenEventArgs => Unit = null,
    query: js.Any = null,
    responsiveType: ResponsiveType | String = null,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (disabledItemIndices != null) __obj.updateDynamic("disabledItemIndices")(disabledItemIndices.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSeparator)) __obj.updateDynamic("enableSeparator")(enableSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (enabledItemIndices != null) __obj.updateDynamic("enabledItemIndices")(enabledItemIndices.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (focusOut != null) __obj.updateDynamic("focusOut")(js.Any.fromFunction1(focusOut))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (itemHover != null) __obj.updateDynamic("itemHover")(js.Any.fromFunction1(itemHover))
    if (itemLeave != null) __obj.updateDynamic("itemLeave")(js.Any.fromFunction1(itemLeave))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (overflowClose != null) __obj.updateDynamic("overflowClose")(js.Any.fromFunction1(overflowClose))
    if (overflowOpen != null) __obj.updateDynamic("overflowOpen")(js.Any.fromFunction1(overflowOpen))
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (responsiveType != null) __obj.updateDynamic("responsiveType")(responsiveType.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

