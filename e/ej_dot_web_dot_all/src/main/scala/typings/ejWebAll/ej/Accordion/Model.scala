package typings.ejWebAll.ej.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggered after a Accordion item is active . Argument values are activeIndex, activeHeader, isInteraction and current model values.
    */
  var activate: js.UndefOr[js.Function1[/* e */ ActivateEventArgs, Unit]] = js.native
  /** Triggered before the AJAX content is loaded in a content panel. Arguments have location of the content (URL) and current model value.
    */
  var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.native
  /** Triggered after AJAX load failed action. Arguments have URL, error message, and current model value.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.native
  /** Triggered after the AJAX content loads. Arguments have current model values.
    */
  var ajaxLoad: js.UndefOr[js.Function1[/* e */ AjaxLoadEventArgs, Unit]] = js.native
  /** Specifies the ajaxSettings option to load the content to the accordion control.
    * @Default {null}
    */
  var ajaxSettings: js.UndefOr[AjaxSettings] = js.native
  /** Triggered after AJAX success action. Arguments have URL, content, and current model values.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.native
  /** Accordion headers can be expanded and collapsed on keyboard action.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** Triggered before a tab item is active. Arguments have active index and model values.
    */
  var beforeActivate: js.UndefOr[js.Function1[/* e */ BeforeActivateEventArgs, Unit]] = js.native
  /** Triggered before a Accordion item is inactive. Argument values are  inActiveIndex and  model values.
    */
  var beforeInactivate: js.UndefOr[js.Function1[/* e */ BeforeInactivateEventArgs, Unit]] = js.native
  /** To set the Accordion headers Collapse Speed.
    * @Default {300}
    */
  var collapseSpeed: js.UndefOr[Double] = js.native
  /** Specifies the collapsible state of accordion control.
    * @Default {false}
    */
  var collapsible: js.UndefOr[Boolean] = js.native
  /** Triggered after Accordion control creation.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets the root CSS class for Accordion theme, which is used customize.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Allows you to set the custom header Icon. It accepts two key values â€œheaderâ€, â€selectedHeaderâ€.
    * @Default {{ header: e-collapse, selectedHeader: e-expand }}
    */
  var customIcon: js.UndefOr[CustomIcon] = js.native
  /** Triggered after Accordion control destroy.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Disables the specified indexed items in accordion.
    * @Default {[]}
    */
  var disabledItems: js.UndefOr[js.Array[Double]] = js.native
  /** Specifies the animation behavior in accordion.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Multiple content panels to activate at a time.
    * @Default {false}
    */
  var enableMultipleOpen: js.UndefOr[Boolean] = js.native
  /** Save current model value to browser cookies for maintaining states. When refreshing the accordion control page, the model value is applied from browser cookies or HTML 5local
    * storage.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Display headers and panel text from right-to-left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** With this enabled property, you can enable or disable the Accordion.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Used to enable the disabled items in accordion.
    * @Default {[]}
    */
  var enabledItems: js.UndefOr[js.Array[Double]] = js.native
  /** The events API binds the action for activating the accordion header. Users can activate the header by using mouse actions such as mouse-over, mouse-up, mouse-down, and soon.
    * @Default {click}
    */
  var events: js.UndefOr[String] = js.native
  /** To set the Accordion headers Expand Speed.
    * @Default {300}
    */
  var expandSpeed: js.UndefOr[Double] = js.native
  /** Sets the height for Accordion items header.
    */
  var headerSize: js.UndefOr[Double | String] = js.native
  /** Specifies height of the accordion.
    * @Default {null}
    */
  var height: js.UndefOr[Double | String] = js.native
  /** Adjusts the content panel height based on the given option (content, auto, or fill). By default, the panel heights are adjusted based on the content.
    * @Default {content}
    */
  var heightAdjustMode: js.UndefOr[HeightAdjustMode | String] = js.native
  /** It allows to define the characteristics of the Accordion control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Triggered after a Accordion item is inactive. Argument values are  inActiveHeader, inActiveIndex ,isInteraction and current model values.
    */
  var inActivate: js.UndefOr[js.Function1[/* e */ InActivateEventArgs, Unit]] = js.native
  /** The given index header will activate (open). If collapsible is set to true, and a negative value is given, then all headers are collapsed. Otherwise, the first panel isactivated.
    * @Default {0}
    */
  var selectedItemIndex: js.UndefOr[Double] = js.native
  /** Activate the specified indexed items of the accordion
    * @Default {[0]}
    */
  var selectedItems: js.UndefOr[js.Array[Double]] = js.native
  /** Used to determines the close button visibility an each accordion items. This close button helps to remove the accordion item from the control.
    * @Default {false}
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  /** Displays rounded corner borders on the Accordion control's panels and headers.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Specifies width of the accordion.
    * @Default {null}
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
    def setActivate(value: /* e */ ActivateEventArgs => Unit): Self = this.set("activate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
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
    def setBeforeActivate(value: /* e */ BeforeActivateEventArgs => Unit): Self = this.set("beforeActivate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeActivate: Self = this.set("beforeActivate", js.undefined)
    @scala.inline
    def setBeforeInactivate(value: /* e */ BeforeInactivateEventArgs => Unit): Self = this.set("beforeInactivate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeInactivate: Self = this.set("beforeInactivate", js.undefined)
    @scala.inline
    def setCollapseSpeed(value: Double): Self = this.set("collapseSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseSpeed: Self = this.set("collapseSpeed", js.undefined)
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
    def setCustomIcon(value: CustomIcon): Self = this.set("customIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomIcon: Self = this.set("customIcon", js.undefined)
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setDisabledItemsVarargs(value: Double*): Self = this.set("disabledItems", js.Array(value :_*))
    @scala.inline
    def setDisabledItems(value: js.Array[Double]): Self = this.set("disabledItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledItems: Self = this.set("disabledItems", js.undefined)
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    @scala.inline
    def setEnableMultipleOpen(value: Boolean): Self = this.set("enableMultipleOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableMultipleOpen: Self = this.set("enableMultipleOpen", js.undefined)
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setEnabledItemsVarargs(value: Double*): Self = this.set("enabledItems", js.Array(value :_*))
    @scala.inline
    def setEnabledItems(value: js.Array[Double]): Self = this.set("enabledItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledItems: Self = this.set("enabledItems", js.undefined)
    @scala.inline
    def setEvents(value: String): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setExpandSpeed(value: Double): Self = this.set("expandSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandSpeed: Self = this.set("expandSpeed", js.undefined)
    @scala.inline
    def setHeaderSize(value: Double | String): Self = this.set("headerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderSize: Self = this.set("headerSize", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHeightAdjustMode(value: HeightAdjustMode | String): Self = this.set("heightAdjustMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightAdjustMode: Self = this.set("heightAdjustMode", js.undefined)
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    @scala.inline
    def setInActivate(value: /* e */ InActivateEventArgs => Unit): Self = this.set("inActivate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInActivate: Self = this.set("inActivate", js.undefined)
    @scala.inline
    def setSelectedItemIndex(value: Double): Self = this.set("selectedItemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItemIndex: Self = this.set("selectedItemIndex", js.undefined)
    @scala.inline
    def setSelectedItemsVarargs(value: Double*): Self = this.set("selectedItems", js.Array(value :_*))
    @scala.inline
    def setSelectedItems(value: js.Array[Double]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
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

