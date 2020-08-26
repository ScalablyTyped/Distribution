package typings.ejWebAll.ej.Toolbar

import typings.ejWebAll.ej.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Specifies the items of  Toolbar
    * @Default {null}
    */
  var Items: js.UndefOr[typings.ejWebAll.ej.Toolbar.Items] = js.native
  /** Fires after Toolbar control is clicked.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  /** Fires after Toolbar control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets the root CSS class for Toolbar control to achieve the custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Specifies dataSource value for the Toolbar control during initialization.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Fires when the Toolbar is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Disables an Item or set of Items that are enabled in the Toolbar
    * @Default {[]}
    */
  var disabledItemIndices: js.UndefOr[js.Array[_]] = js.native
  /** Specifies enableRTL property to align the Toolbar control from right to left direction.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Allows to separate the each UL items in the Toolbar control.
    * @Default {false}
    */
  var enableSeparator: js.UndefOr[Boolean] = js.native
  /** Specifies the Toolbar control state.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Enables an Item or set of Items that are disabled in the Toolbar
    * @Default {[]}
    */
  var enabledItemIndices: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the mapping fields for the data items of the Toolbar
    * @Default {null}
    */
  var fields: js.UndefOr[String] = js.native
  /** Fires after Toolbar control is focused.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.native
  /** Specifies the height of the Toolbar.
    * @Default {28}
    */
  var height: js.UndefOr[Double | String] = js.native
  /** Specifies whether the Toolbar control is need to be show or hide.
    * @Default {false}
    */
  var hide: js.UndefOr[Boolean] = js.native
  /** Specifies the list of HTML attributes to be added to toolbar control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Enables/Disables the responsive support for Toolbar items during the window resizing time.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Fires after Toolbar control item is hovered.
    */
  var itemHover: js.UndefOr[js.Function1[/* e */ ItemHoverEventArgs, Unit]] = js.native
  /** Fires after mouse leave from Toolbar control item.
    */
  var itemLeave: js.UndefOr[js.Function1[/* e */ ItemLeaveEventArgs, Unit]] = js.native
  /** Specifies the Toolbar orientation. See orientation
    * @Default {Horizontal}
    */
  var orientation: js.UndefOr[Orientation | String] = js.native
  /** Fires when the overflow popup of toolbar is closed.
    */
  var overflowClose: js.UndefOr[js.Function1[/* e */ OverflowCloseEventArgs, Unit]] = js.native
  /** Fires when the overflow popup of toolbar is opened.
    */
  var overflowOpen: js.UndefOr[js.Function1[/* e */ OverflowOpenEventArgs, Unit]] = js.native
  /** Specifies the query to retrieve the data from the online server. The query is used only when the online dataSource is used.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  /** Specifies the Toolbar responsive type.
    * @Default {Popup}
    */
  var responsiveType: js.UndefOr[ResponsiveType | String] = js.native
  /** Displays the Toolbar with rounded corners.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Specifies the width of the Toolbar.
    */
  var width: js.UndefOr[Double | String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setItems(value: Items): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
    @scala.inline
    def setClick(value: /* e */ ClickEventArgs => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setDisabledItemIndicesVarargs(value: js.Any*): Self = this.set("disabledItemIndices", js.Array(value :_*))
    @scala.inline
    def setDisabledItemIndices(value: js.Array[_]): Self = this.set("disabledItemIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledItemIndices: Self = this.set("disabledItemIndices", js.undefined)
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setEnableSeparator(value: Boolean): Self = this.set("enableSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSeparator: Self = this.set("enableSeparator", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setEnabledItemIndicesVarargs(value: js.Any*): Self = this.set("enabledItemIndices", js.Array(value :_*))
    @scala.inline
    def setEnabledItemIndices(value: js.Array[_]): Self = this.set("enabledItemIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledItemIndices: Self = this.set("enabledItemIndices", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = this.set("focusOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFocusOut: Self = this.set("focusOut", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHide(value: Boolean): Self = this.set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    @scala.inline
    def setItemHover(value: /* e */ ItemHoverEventArgs => Unit): Self = this.set("itemHover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemHover: Self = this.set("itemHover", js.undefined)
    @scala.inline
    def setItemLeave(value: /* e */ ItemLeaveEventArgs => Unit): Self = this.set("itemLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemLeave: Self = this.set("itemLeave", js.undefined)
    @scala.inline
    def setOrientation(value: Orientation | String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setOverflowClose(value: /* e */ OverflowCloseEventArgs => Unit): Self = this.set("overflowClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOverflowClose: Self = this.set("overflowClose", js.undefined)
    @scala.inline
    def setOverflowOpen(value: /* e */ OverflowOpenEventArgs => Unit): Self = this.set("overflowOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOverflowOpen: Self = this.set("overflowOpen", js.undefined)
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setResponsiveType(value: ResponsiveType | String): Self = this.set("responsiveType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsiveType: Self = this.set("responsiveType", js.undefined)
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

