package typings
package ejDotWebDotAllLib.ejNs.DialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggered when the custom action button clicked.
    */
  var actionButtonClick: js.UndefOr[js.Function1[/* e */ ActionButtonClickEventArgs, scala.Unit]] = js.undefined
  /** Adds action buttons like close, minimize, pin, maximize in the dialog header.
    */
  var actionButtons: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** This event is triggered whenever the AJAX request fails to retrieve the dialog content.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, scala.Unit]] = js.undefined
  /** Specifies the ajaxSettings option to load the content to the Dialog control.
    * @Default {null}
    */
  var ajaxSettings: js.UndefOr[AjaxSettings] = js.undefined
  /** This event is triggered whenever the AJAX request to retrieve the dialog content, gets succeed.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, scala.Unit]] = js.undefined
  /** Enables or disables draggable.
    */
  var allowDraggable: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables keyboard interaction.
    */
  var allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** Customizes the Dialog widget animations. The Dialog widget can be animated while opening and closing the dialog. In order to customize animation effects, you need to set
    * â€œenableAnimationâ€ as true. It contains the following sub properties.
    */
  var animation: js.UndefOr[js.Any] = js.undefined
  /** To Enable or disable the scrolling for background element of the modal dialog. This will work only with modal dialog.
    */
  var backgroundScroll: js.UndefOr[scala.Boolean] = js.undefined
  /** This event is triggered before the dialog widgets get closed.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, scala.Unit]] = js.undefined
  /** This event is triggered before the dialog widgets gets open.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, scala.Unit]] = js.undefined
  /** This event is triggered after the dialog widget is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, scala.Unit]] = js.undefined
  /** Closes the dialog widget on pressing the ESC key when it is set to true.
    */
  var closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggered when the dialog content is collapsed.
    */
  var collapse: js.UndefOr[js.Function1[/* e */ CollapseEventArgs, scala.Unit]] = js.undefined
  /** The selector for the container element. If the property is set, then dialog will append to the selected element and it is restricted to move only within the specified container
    * element.
    */
  var containment: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered after the dialog content is loaded in DOM.
    */
  var contentLoad: js.UndefOr[js.Function1[/* e */ ContentLoadEventArgs, scala.Unit]] = js.undefined
  /** The content type to load the dialog content at run time. The possible values are null, AJAX, iframe and image. When it is null (default value), the content inside dialog element
    * will be displayed as content and when it is not null, the content will be loaded from the URL specified in the contentUrl property.
    */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /** The URL to load the dialog content (such as AJAX, image, and iframe). In order to load content from URL, you need to set contentType as â€˜ajaxâ€™ or â€˜iframeâ€™ or â€˜imageâ€™.
    */
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered after the dialog is created successfully
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** The root class for the Dialog widget to customize the existing theme.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered after the dialog widget is destroyed successfully
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Triggered while the dialog is dragged.
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the user starts dragging the dialog.
    */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the user stops dragging the dialog.
    */
  var dragStop: js.UndefOr[js.Function1[/* e */ DragStopEventArgs, scala.Unit]] = js.undefined
  /** Enable or disables animation when the dialog is opened or closed.
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable or disables modal dialog. The modal dialog acts like a child window that is displayed on top of the main window/screen and disables the main window interaction until it is
    * closed.
    */
  var enableModal: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows the current model values to be saved in local storage or browser cookies for state maintenance when it is set to true.
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Displays dialog content from right to left when set to true.
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows the dialog to be resized. The dialog cannot be resized less than the minimum height, width values and greater than the maximum height and width.
    */
  var enableResize: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the Dialog widget.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggered when the dialog content is expanded.
    */
  var expand: js.UndefOr[js.Function1[/* e */ ExpandEventArgs, scala.Unit]] = js.undefined
  /** The CSS class name to display the favicon in the dialog header. In order to display favicon, you need to set showHeader as true since the favicon will be displayed in the dialog
    * header.
    */
  var faviconCSS: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the FooterTemplate for the Dialog widget.
    */
  var footerTemplateId: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the height for the dialog widget. It accepts both string and integer values. For example, it can accepts values like â€œautoâ€, â€œ100%â€, â€œ100pxâ€ as string type and
    * â€œ100â€, â€œ500â€ as integer type.
    */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Specifies the HTML Attributes of the Dialog.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Enable or disables responsive behavior.
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Default Value:{:.param}â€œen-USâ€
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the maximum height for the dialog widget.
    */
  var maxHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Sets the maximum width for the dialog widget.
    */
  var maxWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Sets the minimum height for the dialog widget.
    */
  var minHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Sets the minimum width for the dialog widget.
    */
  var minWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Triggered after the dialog is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, scala.Unit]] = js.undefined
  /** Displays the Dialog widget at the given X and Y position.
    */
  var position: js.UndefOr[js.Any] = js.undefined
  /** Triggered while the dialog is resized.
    */
  var resize: js.UndefOr[js.Function1[/* e */ ResizeEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the user starts resizing the dialog.
    */
  var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the user stops resizing the dialog.
    */
  var resizeStop: js.UndefOr[js.Function1[/* e */ ResizeStopEventArgs, scala.Unit]] = js.undefined
  /** Sets the Footer for the Dialog widget.
    */
  var showFooter: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows or hides the dialog header.
    */
  var showHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** The Dialog widget can be opened by default i.e. on initialization, when it is set to true.
    */
  var showOnInit: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the rounder corner.
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** The selector for the container element. If this property is set, the dialog will be displayed (positioned) based on its container.
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /** The title text to be displayed in the dialog header. In order to set title, you need to set showHeader as true since the title will be displayed in the dialog header.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Add or configure the tooltip text for actionButtons in the dialog header.
    */
  var tooltip: js.UndefOr[js.Any] = js.undefined
  /** Sets the height for the dialog widget. It accepts both string and integer values. For example, it can accepts values like â€œautoâ€, â€œ100%â€, â€œ100pxâ€ as string type and
    * â€œ100â€, â€œ500â€ as integer type.
    */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Sets the z-index value for the Dialog widget.
    */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    actionButtonClick: /* e */ ActionButtonClickEventArgs => scala.Unit = null,
    actionButtons: js.Array[java.lang.String] = null,
    ajaxError: /* e */ AjaxErrorEventArgs => scala.Unit = null,
    ajaxSettings: AjaxSettings = null,
    ajaxSuccess: /* e */ AjaxSuccessEventArgs => scala.Unit = null,
    allowDraggable: js.UndefOr[scala.Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    animation: js.Any = null,
    backgroundScroll: js.UndefOr[scala.Boolean] = js.undefined,
    beforeClose: /* e */ BeforeCloseEventArgs => scala.Unit = null,
    beforeOpen: /* e */ BeforeOpenEventArgs => scala.Unit = null,
    close: /* e */ CloseEventArgs => scala.Unit = null,
    closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined,
    collapse: /* e */ CollapseEventArgs => scala.Unit = null,
    containment: java.lang.String = null,
    contentLoad: /* e */ ContentLoadEventArgs => scala.Unit = null,
    contentType: java.lang.String = null,
    contentUrl: java.lang.String = null,
    create: /* e */ CreateEventArgs => scala.Unit = null,
    cssClass: java.lang.String = null,
    destroy: /* e */ DestroyEventArgs => scala.Unit = null,
    drag: /* e */ DragEventArgs => scala.Unit = null,
    dragStart: /* e */ DragStartEventArgs => scala.Unit = null,
    dragStop: /* e */ DragStopEventArgs => scala.Unit = null,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    enableModal: js.UndefOr[scala.Boolean] = js.undefined,
    enablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enableResize: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    expand: /* e */ ExpandEventArgs => scala.Unit = null,
    faviconCSS: java.lang.String = null,
    footerTemplateId: java.lang.String = null,
    height: java.lang.String | scala.Double = null,
    htmlAttributes: js.Any = null,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    locale: java.lang.String = null,
    maxHeight: java.lang.String | scala.Double = null,
    maxWidth: java.lang.String | scala.Double = null,
    minHeight: java.lang.String | scala.Double = null,
    minWidth: java.lang.String | scala.Double = null,
    open: /* e */ OpenEventArgs => scala.Unit = null,
    position: js.Any = null,
    resize: /* e */ ResizeEventArgs => scala.Unit = null,
    resizeStart: /* e */ ResizeStartEventArgs => scala.Unit = null,
    resizeStop: /* e */ ResizeStopEventArgs => scala.Unit = null,
    showFooter: js.UndefOr[scala.Boolean] = js.undefined,
    showHeader: js.UndefOr[scala.Boolean] = js.undefined,
    showOnInit: js.UndefOr[scala.Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined,
    target: java.lang.String = null,
    title: java.lang.String = null,
    tooltip: js.Any = null,
    width: java.lang.String | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionButtonClick != null) __obj.updateDynamic("actionButtonClick")(js.Any.fromFunction1(actionButtonClick))
    if (actionButtons != null) __obj.updateDynamic("actionButtons")(actionButtons)
    if (ajaxError != null) __obj.updateDynamic("ajaxError")(js.Any.fromFunction1(ajaxError))
    if (ajaxSettings != null) __obj.updateDynamic("ajaxSettings")(ajaxSettings)
    if (ajaxSuccess != null) __obj.updateDynamic("ajaxSuccess")(js.Any.fromFunction1(ajaxSuccess))
    if (!js.isUndefined(allowDraggable)) __obj.updateDynamic("allowDraggable")(allowDraggable)
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(backgroundScroll)) __obj.updateDynamic("backgroundScroll")(backgroundScroll)
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1(beforeClose))
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(js.Any.fromFunction1(beforeOpen))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape)
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction1(collapse))
    if (containment != null) __obj.updateDynamic("containment")(containment)
    if (contentLoad != null) __obj.updateDynamic("contentLoad")(js.Any.fromFunction1(contentLoad))
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction1(dragStart))
    if (dragStop != null) __obj.updateDynamic("dragStop")(js.Any.fromFunction1(dragStop))
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (!js.isUndefined(enableModal)) __obj.updateDynamic("enableModal")(enableModal)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enableResize)) __obj.updateDynamic("enableResize")(enableResize)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction1(expand))
    if (faviconCSS != null) __obj.updateDynamic("faviconCSS")(faviconCSS)
    if (footerTemplateId != null) __obj.updateDynamic("footerTemplateId")(footerTemplateId)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (position != null) __obj.updateDynamic("position")(position)
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(js.Any.fromFunction1(resizeStart))
    if (resizeStop != null) __obj.updateDynamic("resizeStop")(js.Any.fromFunction1(resizeStop))
    if (!js.isUndefined(showFooter)) __obj.updateDynamic("showFooter")(showFooter)
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader)
    if (!js.isUndefined(showOnInit)) __obj.updateDynamic("showOnInit")(showOnInit)
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (target != null) __obj.updateDynamic("target")(target)
    if (title != null) __obj.updateDynamic("title")(title)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

