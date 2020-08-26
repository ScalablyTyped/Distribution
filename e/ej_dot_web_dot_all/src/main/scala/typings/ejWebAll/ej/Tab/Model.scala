package typings.ejWebAll.ej.Tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggered before AJAX content has been loaded.
    */
  var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.native
  /** Triggered if error occurs in AJAX request.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.native
  /** Triggered after AJAX content load action.
    */
  var ajaxLoad: js.UndefOr[js.Function1[/* e */ AjaxLoadEventArgs, Unit]] = js.native
  /** Specifies the ajaxSettings option to load the content to the Tab control.
    */
  var ajaxSettings: js.UndefOr[AjaxSettings] = js.native
  /** Triggered after a tab item activated.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.native
  /** Tab items interaction with keyboard keys, like headers active navigation.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** Triggered before a tab item activated.
    */
  var beforeActive: js.UndefOr[js.Function1[/* e */ BeforeActiveEventArgs, Unit]] = js.native
  /** Triggered before a tab item remove.
    */
  var beforeItemRemove: js.UndefOr[js.Function1[/* e */ BeforeItemRemoveEventArgs, Unit]] = js.native
  /** Allow to collapsing the active item, while click on the active header.
    * @Default {false}
    */
  var collapsible: js.UndefOr[Boolean] = js.native
  /** Triggered before a tab item Create.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Set the root class for Tab theme. This cssClass API helps to use custom skinning option for Tab control.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Triggered before a tab item destroy.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Disables the given tab headers and content panels.
    * @Default {[]}
    */
  var disabledItemIndex: js.UndefOr[js.Array[Double]] = js.native
  /** Specifies the animation behavior of the tab.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Save current model value to browser cookies for state maintains. While refresh the Tab control page the model value apply from browser cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Display Right to Left direction for headers and panels text of tab.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Specify to enable scrolling for Tab header.
    * @Default {false}
    */
  var enableTabScroll: js.UndefOr[Boolean] = js.native
  /** When this property is set to false, it disables the tab control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Enables the given tab headers and content panels.
    * @Default {[]}
    */
  var enabledItemIndex: js.UndefOr[js.Array[Double]] = js.native
  /** The event API to bind the action for active the tab items.
    * @Default {click}
    */
  var events: js.UndefOr[String] = js.native
  /** Specifies the position of Tab header as top, bottom, left or right. See below to get available Position
    * @Default {top}
    */
  var headerPosition: js.UndefOr[String | Position] = js.native
  /** Set the height of the tab header element. Default this property value is null, so height take content height.
    * @Default {null}
    */
  var headerSize: js.UndefOr[String | Double] = js.native
  /** Height set the outer panel element. Default this property value is null, so height take content height.
    * @Default {null}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** Adjust the content panel height for given option (content, auto and fill), by default panels height adjust based on the content.See below to get available HeightAdjustMode
    * @Default {content}
    */
  var heightAdjustMode: js.UndefOr[String | HeightAdjustMode] = js.native
  /** Specifies to hide a pane of Tab control.
    * @Default {[]}
    */
  var hiddenItemIndex: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the HTML Attributes of the Tab.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** The idPrefix property appends the given string on the added tab item idâ€™s in runtime.
    * @Default {ej-tab-}
    */
  var idPrefix: js.UndefOr[String] = js.native
  /** Triggered after a tab item activated.
    */
  var itemActive: js.UndefOr[js.Function1[/* e */ ItemActiveEventArgs, Unit]] = js.native
  /** Triggered after new tab item add
    */
  var itemAdd: js.UndefOr[js.Function1[/* e */ ItemAddEventArgs, Unit]] = js.native
  /** Triggered after tab item removed.
    */
  var itemRemove: js.UndefOr[js.Function1[/* e */ ItemRemoveEventArgs, Unit]] = js.native
  /** Specifies the Tab header in active for given index value.
    * @Default {0}
    */
  var selectedItemIndex: js.UndefOr[Double] = js.native
  /** Display the close button for each tab items. While clicking on the close icon, particular tab item will be removed.
    * @Default {false}
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  /** Display the Reload button for each tab items.
    * @Default {false}
    */
  var showReloadIcon: js.UndefOr[Boolean] = js.native
  /** Tab panels and headers to be displayed in rounded corner style.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Set the width for outer panel element, if not itâ€™s take parent width.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.native
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
    def setAjaxBeforeLoad(value: /* e */ AjaxBeforeLoadEventArgs => Unit): Self = this.set("ajaxBeforeLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAjaxBeforeLoad: Self = this.set("ajaxBeforeLoad", js.undefined)
    @scala.inline
    def setAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = this.set("ajaxError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAjaxError: Self = this.set("ajaxError", js.undefined)
    @scala.inline
    def setAjaxLoad(value: /* e */ AjaxLoadEventArgs => Unit): Self = this.set("ajaxLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAjaxLoad: Self = this.set("ajaxLoad", js.undefined)
    @scala.inline
    def setAjaxSettings(value: AjaxSettings): Self = this.set("ajaxSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAjaxSettings: Self = this.set("ajaxSettings", js.undefined)
    @scala.inline
    def setAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = this.set("ajaxSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAjaxSuccess: Self = this.set("ajaxSuccess", js.undefined)
    @scala.inline
    def setAllowKeyboardNavigation(value: Boolean): Self = this.set("allowKeyboardNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowKeyboardNavigation: Self = this.set("allowKeyboardNavigation", js.undefined)
    @scala.inline
    def setBeforeActive(value: /* e */ BeforeActiveEventArgs => Unit): Self = this.set("beforeActive", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeActive: Self = this.set("beforeActive", js.undefined)
    @scala.inline
    def setBeforeItemRemove(value: /* e */ BeforeItemRemoveEventArgs => Unit): Self = this.set("beforeItemRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeItemRemove: Self = this.set("beforeItemRemove", js.undefined)
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setDisabledItemIndexVarargs(value: Double*): Self = this.set("disabledItemIndex", js.Array(value :_*))
    @scala.inline
    def setDisabledItemIndex(value: js.Array[Double]): Self = this.set("disabledItemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledItemIndex: Self = this.set("disabledItemIndex", js.undefined)
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setEnableTabScroll(value: Boolean): Self = this.set("enableTabScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTabScroll: Self = this.set("enableTabScroll", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setEnabledItemIndexVarargs(value: Double*): Self = this.set("enabledItemIndex", js.Array(value :_*))
    @scala.inline
    def setEnabledItemIndex(value: js.Array[Double]): Self = this.set("enabledItemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledItemIndex: Self = this.set("enabledItemIndex", js.undefined)
    @scala.inline
    def setEvents(value: String): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setHeaderPosition(value: String | Position): Self = this.set("headerPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderPosition: Self = this.set("headerPosition", js.undefined)
    @scala.inline
    def setHeaderSize(value: String | Double): Self = this.set("headerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderSize: Self = this.set("headerSize", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHeightAdjustMode(value: String | HeightAdjustMode): Self = this.set("heightAdjustMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightAdjustMode: Self = this.set("heightAdjustMode", js.undefined)
    @scala.inline
    def setHiddenItemIndexVarargs(value: js.Any*): Self = this.set("hiddenItemIndex", js.Array(value :_*))
    @scala.inline
    def setHiddenItemIndex(value: js.Array[_]): Self = this.set("hiddenItemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenItemIndex: Self = this.set("hiddenItemIndex", js.undefined)
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    @scala.inline
    def setIdPrefix(value: String): Self = this.set("idPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdPrefix: Self = this.set("idPrefix", js.undefined)
    @scala.inline
    def setItemActive(value: /* e */ ItemActiveEventArgs => Unit): Self = this.set("itemActive", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemActive: Self = this.set("itemActive", js.undefined)
    @scala.inline
    def setItemAdd(value: /* e */ ItemAddEventArgs => Unit): Self = this.set("itemAdd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemAdd: Self = this.set("itemAdd", js.undefined)
    @scala.inline
    def setItemRemove(value: /* e */ ItemRemoveEventArgs => Unit): Self = this.set("itemRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemRemove: Self = this.set("itemRemove", js.undefined)
    @scala.inline
    def setSelectedItemIndex(value: Double): Self = this.set("selectedItemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItemIndex: Self = this.set("selectedItemIndex", js.undefined)
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    @scala.inline
    def setShowReloadIcon(value: Boolean): Self = this.set("showReloadIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowReloadIcon: Self = this.set("showReloadIcon", js.undefined)
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

