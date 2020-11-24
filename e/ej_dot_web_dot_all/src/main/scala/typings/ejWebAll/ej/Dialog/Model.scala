package typings.ejWebAll.ej.Dialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Triggered when the custom action button clicked.
    */
  var actionButtonClick: js.UndefOr[js.Function1[/* e */ ActionButtonClickEventArgs, Unit]] = js.native
  
  /** Adds action buttons like close, minimize, pin, maximize in the dialog header.
    */
  var actionButtons: js.UndefOr[js.Array[String]] = js.native
  
  /** This event is triggered whenever the AJAX request fails to retrieve the dialog content.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.native
  
  /** Specifies the ajaxSettings option to load the content to the Dialog control.
    * @Default {null}
    */
  var ajaxSettings: js.UndefOr[AjaxSettings] = js.native
  
  /** This event is triggered whenever the AJAX request to retrieve the dialog content, gets succeed.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.native
  
  /** Enables or disables draggable.
    */
  var allowDraggable: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables keyboard interaction.
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  
  /** Customizes the Dialog widget animations. The Dialog widget can be animated while opening and closing the dialog. In order to customize animation effects, you need to set
    * â€œenableAnimationâ€ as true. It contains the following sub properties.
    */
  var animation: js.UndefOr[js.Any] = js.native
  
  /** To Enable or disable the scrolling for background element of the modal dialog. This will work only with modal dialog.
    */
  var backgroundScroll: js.UndefOr[Boolean] = js.native
  
  /** This event is triggered before the dialog widgets get closed.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.native
  
  /** This event is triggered before the dialog widgets gets open.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.native
  
  /** This event is triggered after the dialog widget is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  
  /** Closes the dialog widget on pressing the ESC key when it is set to true.
    */
  var closeOnEscape: js.UndefOr[Boolean] = js.native
  
  /** Triggered when the dialog content is collapsed.
    */
  var collapse: js.UndefOr[js.Function1[/* e */ CollapseEventArgs, Unit]] = js.native
  
  /** The selector for the container element. If the property is set, then dialog will append to the selected element and it is restricted to move only within the specified container
    * element.
    */
  var containment: js.UndefOr[String] = js.native
  
  /** Triggered after the dialog content is loaded in DOM.
    */
  var contentLoad: js.UndefOr[js.Function1[/* e */ ContentLoadEventArgs, Unit]] = js.native
  
  /** The content type to load the dialog content at run time. The possible values are null, AJAX, iframe and image. When it is null (default value), the content inside dialog element
    * will be displayed as content and when it is not null, the content will be loaded from the URL specified in the contentUrl property.
    */
  var contentType: js.UndefOr[String] = js.native
  
  /** The URL to load the dialog content (such as AJAX, image, and iframe). In order to load content from URL, you need to set contentType as â€˜ajaxâ€™ or â€˜iframeâ€™ or â€˜imageâ€™.
    */
  var contentUrl: js.UndefOr[String] = js.native
  
  /** Triggered after the dialog is created successfully
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** The root class for the Dialog widget to customize the existing theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Triggered after the dialog widget is destroyed successfully
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** Triggered while the dialog is dragged.
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.native
  
  /** Triggered when the user starts dragging the dialog.
    */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, Unit]] = js.native
  
  /** Triggered when the user stops dragging the dialog.
    */
  var dragStop: js.UndefOr[js.Function1[/* e */ DragStopEventArgs, Unit]] = js.native
  
  /** Enable or disables animation when the dialog is opened or closed.
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  
  /** Enable or disables modal dialog. The modal dialog acts like a child window that is displayed on top of the main window/screen and disables the main window interaction until it is
    * closed.
    */
  var enableModal: js.UndefOr[Boolean] = js.native
  
  /** Allows the current model values to be saved in local storage or browser cookies for state maintenance when it is set to true.
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  
  /** Displays dialog content from right to left when set to true.
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** Allows the dialog to be resized. The dialog cannot be resized less than the minimum height, width values and greater than the maximum height and width.
    */
  var enableResize: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the Dialog widget.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Triggered when the dialog content is expanded.
    */
  var expand: js.UndefOr[js.Function1[/* e */ ExpandEventArgs, Unit]] = js.native
  
  /** The CSS class name to display the favicon in the dialog header. In order to display favicon, you need to set showHeader as true since the favicon will be displayed in the dialog
    * header.
    */
  var faviconCSS: js.UndefOr[String] = js.native
  
  /** Sets the FooterTemplate for the Dialog widget.
    */
  var footerTemplateId: js.UndefOr[String] = js.native
  
  /** Sets the height for the dialog widget. It accepts both string and integer values. For example, it can accepts values like â€œautoâ€, â€œ100%â€, â€œ100pxâ€ as string type and
    * â€œ100â€, â€œ500â€ as integer type.
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /** Specifies the HTML Attributes of the Dialog.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  
  /** Enable or disables responsive behavior.
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  
  /** Default Value:{:.param}â€œen-USâ€
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Sets the maximum height for the dialog widget.
    */
  var maxHeight: js.UndefOr[String | Double] = js.native
  
  /** Sets the maximum width for the dialog widget.
    */
  var maxWidth: js.UndefOr[String | Double] = js.native
  
  /** Sets the minimum height for the dialog widget.
    */
  var minHeight: js.UndefOr[String | Double] = js.native
  
  /** Sets the minimum width for the dialog widget.
    */
  var minWidth: js.UndefOr[String | Double] = js.native
  
  /** Triggered after the dialog is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  
  /** Displays the Dialog widget at the given X and Y position.
    */
  var position: js.UndefOr[js.Any] = js.native
  
  /** Triggered while the dialog is resized.
    */
  var resize: js.UndefOr[js.Function1[/* e */ ResizeEventArgs, Unit]] = js.native
  
  /** Triggered when the user starts resizing the dialog.
    */
  var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.native
  
  /** Triggered when the user stops resizing the dialog.
    */
  var resizeStop: js.UndefOr[js.Function1[/* e */ ResizeStopEventArgs, Unit]] = js.native
  
  /** Sets the Footer for the Dialog widget.
    */
  var showFooter: js.UndefOr[Boolean] = js.native
  
  /** Shows or hides the dialog header.
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  
  /** The Dialog widget can be opened by default i.e. on initialization, when it is set to true.
    */
  var showOnInit: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the rounder corner.
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  
  /** The selector for the container element. If this property is set, the dialog will be displayed (positioned) based on its container.
    */
  var target: js.UndefOr[String] = js.native
  
  /** The title text to be displayed in the dialog header. In order to set title, you need to set showHeader as true since the title will be displayed in the dialog header.
    */
  var title: js.UndefOr[String] = js.native
  
  /** Add or configure the tooltip text for actionButtons in the dialog header.
    */
  var tooltip: js.UndefOr[js.Any] = js.native
  
  /** Sets the height for the dialog widget. It accepts both string and integer values. For example, it can accepts values like â€œautoâ€, â€œ100%â€, â€œ100pxâ€ as string type and
    * â€œ100â€, â€œ500â€ as integer type.
    */
  var width: js.UndefOr[String | Double] = js.native
  
  /** Sets the z-index value for the Dialog widget.
    */
  var zIndex: js.UndefOr[Double] = js.native
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
    def setActionButtonClick(value: /* e */ ActionButtonClickEventArgs => Unit): Self = this.set("actionButtonClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActionButtonClick: Self = this.set("actionButtonClick", js.undefined)
    
    @scala.inline
    def setActionButtonsVarargs(value: String*): Self = this.set("actionButtons", js.Array(value :_*))
    
    @scala.inline
    def setActionButtons(value: js.Array[String]): Self = this.set("actionButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionButtons: Self = this.set("actionButtons", js.undefined)
    
    @scala.inline
    def setAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = this.set("ajaxError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAjaxError: Self = this.set("ajaxError", js.undefined)
    
    @scala.inline
    def setAjaxSettings(value: AjaxSettings): Self = this.set("ajaxSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxSettings: Self = this.set("ajaxSettings", js.undefined)
    
    @scala.inline
    def setAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = this.set("ajaxSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAjaxSuccess: Self = this.set("ajaxSuccess", js.undefined)
    
    @scala.inline
    def setAllowDraggable(value: Boolean): Self = this.set("allowDraggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDraggable: Self = this.set("allowDraggable", js.undefined)
    
    @scala.inline
    def setAllowKeyboardNavigation(value: Boolean): Self = this.set("allowKeyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowKeyboardNavigation: Self = this.set("allowKeyboardNavigation", js.undefined)
    
    @scala.inline
    def setAnimation(value: js.Any): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setBackgroundScroll(value: Boolean): Self = this.set("backgroundScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundScroll: Self = this.set("backgroundScroll", js.undefined)
    
    @scala.inline
    def setBeforeClose(value: /* e */ BeforeCloseEventArgs => Unit): Self = this.set("beforeClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeClose: Self = this.set("beforeClose", js.undefined)
    
    @scala.inline
    def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = this.set("beforeOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeOpen: Self = this.set("beforeOpen", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ CloseEventArgs => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setCloseOnEscape(value: Boolean): Self = this.set("closeOnEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnEscape: Self = this.set("closeOnEscape", js.undefined)
    
    @scala.inline
    def setCollapse(value: /* e */ CollapseEventArgs => Unit): Self = this.set("collapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    
    @scala.inline
    def setContainment(value: String): Self = this.set("containment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainment: Self = this.set("containment", js.undefined)
    
    @scala.inline
    def setContentLoad(value: /* e */ ContentLoadEventArgs => Unit): Self = this.set("contentLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContentLoad: Self = this.set("contentLoad", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setContentUrl(value: String): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
    
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
    def setDrag(value: /* e */ DragEventArgs => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setDragStart(value: /* e */ DragStartEventArgs => Unit): Self = this.set("dragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
    
    @scala.inline
    def setDragStop(value: /* e */ DragStopEventArgs => Unit): Self = this.set("dragStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragStop: Self = this.set("dragStop", js.undefined)
    
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    
    @scala.inline
    def setEnableModal(value: Boolean): Self = this.set("enableModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableModal: Self = this.set("enableModal", js.undefined)
    
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    
    @scala.inline
    def setEnableResize(value: Boolean): Self = this.set("enableResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableResize: Self = this.set("enableResize", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setExpand(value: /* e */ ExpandEventArgs => Unit): Self = this.set("expand", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setFaviconCSS(value: String): Self = this.set("faviconCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaviconCSS: Self = this.set("faviconCSS", js.undefined)
    
    @scala.inline
    def setFooterTemplateId(value: String): Self = this.set("footerTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterTemplateId: Self = this.set("footerTemplateId", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: String | Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: String | Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: String | Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: String | Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ OpenEventArgs => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setResize(value: /* e */ ResizeEventArgs => Unit): Self = this.set("resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setResizeStart(value: /* e */ ResizeStartEventArgs => Unit): Self = this.set("resizeStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResizeStart: Self = this.set("resizeStart", js.undefined)
    
    @scala.inline
    def setResizeStop(value: /* e */ ResizeStopEventArgs => Unit): Self = this.set("resizeStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResizeStop: Self = this.set("resizeStop", js.undefined)
    
    @scala.inline
    def setShowFooter(value: Boolean): Self = this.set("showFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFooter: Self = this.set("showFooter", js.undefined)
    
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHeader: Self = this.set("showHeader", js.undefined)
    
    @scala.inline
    def setShowOnInit(value: Boolean): Self = this.set("showOnInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOnInit: Self = this.set("showOnInit", js.undefined)
    
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
