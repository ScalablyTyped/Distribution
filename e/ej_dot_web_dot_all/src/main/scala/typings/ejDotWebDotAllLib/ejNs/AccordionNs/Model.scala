package typings
package ejDotWebDotAllLib.ejNs.AccordionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggered after a Accordion item is active . Argument values are activeIndex, activeHeader, isInteraction and current model values.
    */
  var activate: js.UndefOr[js.Function1[/* e */ ActivateEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the AJAX content is loaded in a content panel. Arguments have location of the content (URL) and current model value.
    */
  var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, scala.Unit]] = js.undefined
  /** Triggered after AJAX load failed action. Arguments have URL, error message, and current model value.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, scala.Unit]] = js.undefined
  /** Triggered after the AJAX content loads. Arguments have current model values.
    */
  var ajaxLoad: js.UndefOr[js.Function1[/* e */ AjaxLoadEventArgs, scala.Unit]] = js.undefined
  /** Specifies the ajaxSettings option to load the content to the accordion control.
    * @Default {null}
    */
  var ajaxSettings: js.UndefOr[AjaxSettings] = js.undefined
  /** Triggered after AJAX success action. Arguments have URL, content, and current model values.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, scala.Unit]] = js.undefined
  /** Accordion headers can be expanded and collapsed on keyboard action.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggered before a tab item is active. Arguments have active index and model values.
    */
  var beforeActivate: js.UndefOr[js.Function1[/* e */ BeforeActivateEventArgs, scala.Unit]] = js.undefined
  /** Triggered before a Accordion item is inactive. Argument values are  inActiveIndex and  model values.
    */
  var beforeInactivate: js.UndefOr[js.Function1[/* e */ BeforeInactivateEventArgs, scala.Unit]] = js.undefined
  /** To set the Accordion headers Collapse Speed.
    * @Default {300}
    */
  var collapseSpeed: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the collapsible state of accordion control.
    * @Default {false}
    */
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggered after Accordion control creation.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Sets the root CSS class for Accordion theme, which is used customize.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom header Icon. It accepts two key values â€œheaderâ€, â€selectedHeaderâ€.
    * @Default {{ header: e-collapse, selectedHeader: e-expand }}
    */
  var customIcon: js.UndefOr[CustomIcon] = js.undefined
  /** Triggered after Accordion control destroy.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Disables the specified indexed items in accordion.
    * @Default {[]}
    */
  var disabledItems: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** Specifies the animation behavior in accordion.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Multiple content panels to activate at a time.
    * @Default {false}
    */
  var enableMultipleOpen: js.UndefOr[scala.Boolean] = js.undefined
  /** Save current model value to browser cookies for maintaining states. When refreshing the accordion control page, the model value is applied from browser cookies or HTML 5local
    * storage.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Display headers and panel text from right-to-left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** With this enabled property, you can enable or disable the Accordion.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Used to enable the disabled items in accordion.
    * @Default {[]}
    */
  var enabledItems: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** The events API binds the action for activating the accordion header. Users can activate the header by using mouse actions such as mouse-over, mouse-up, mouse-down, and soon.
    * @Default {click}
    */
  var events: js.UndefOr[java.lang.String] = js.undefined
  /** To set the Accordion headers Expand Speed.
    * @Default {300}
    */
  var expandSpeed: js.UndefOr[scala.Double] = js.undefined
  /** Sets the height for Accordion items header.
    */
  var headerSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Specifies height of the accordion.
    * @Default {null}
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Adjusts the content panel height based on the given option (content, auto, or fill). By default, the panel heights are adjusted based on the content.
    * @Default {content}
    */
  var heightAdjustMode: js.UndefOr[HeightAdjustMode | java.lang.String] = js.undefined
  /** It allows to define the characteristics of the Accordion control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Triggered after a Accordion item is inactive. Argument values are  inActiveHeader, inActiveIndex ,isInteraction and current model values.
    */
  var inActivate: js.UndefOr[js.Function1[/* e */ InActivateEventArgs, scala.Unit]] = js.undefined
  /** The given index header will activate (open). If collapsible is set to true, and a negative value is given, then all headers are collapsed. Otherwise, the first panel isactivated.
    * @Default {0}
    */
  var selectedItemIndex: js.UndefOr[scala.Double] = js.undefined
  /** Activate the specified indexed items of the accordion
    * @Default {[0]}
    */
  var selectedItems: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** Used to determines the close button visibility an each accordion items. This close button helps to remove the accordion item from the control.
    * @Default {false}
    */
  var showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  /** Displays rounded corner borders on the Accordion control's panels and headers.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies width of the accordion.
    * @Default {null}
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    activate: /* e */ ActivateEventArgs => scala.Unit = null,
    ajaxBeforeLoad: /* e */ AjaxBeforeLoadEventArgs => scala.Unit = null,
    ajaxError: /* e */ AjaxErrorEventArgs => scala.Unit = null,
    ajaxLoad: /* e */ AjaxLoadEventArgs => scala.Unit = null,
    ajaxSettings: AjaxSettings = null,
    ajaxSuccess: /* e */ AjaxSuccessEventArgs => scala.Unit = null,
    allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    beforeActivate: /* e */ BeforeActivateEventArgs => scala.Unit = null,
    beforeInactivate: /* e */ BeforeInactivateEventArgs => scala.Unit = null,
    collapseSpeed: scala.Int | scala.Double = null,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    create: /* e */ CreateEventArgs => scala.Unit = null,
    cssClass: java.lang.String = null,
    customIcon: CustomIcon = null,
    destroy: /* e */ DestroyEventArgs => scala.Unit = null,
    disabledItems: js.Array[scala.Double] = null,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    enableMultipleOpen: js.UndefOr[scala.Boolean] = js.undefined,
    enablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    enabledItems: js.Array[scala.Double] = null,
    events: java.lang.String = null,
    expandSpeed: scala.Int | scala.Double = null,
    headerSize: scala.Double | java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    heightAdjustMode: HeightAdjustMode | java.lang.String = null,
    htmlAttributes: js.Any = null,
    inActivate: /* e */ InActivateEventArgs => scala.Unit = null,
    selectedItemIndex: scala.Int | scala.Double = null,
    selectedItems: js.Array[scala.Double] = null,
    showCloseButton: js.UndefOr[scala.Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Double | java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction1(activate))
    if (ajaxBeforeLoad != null) __obj.updateDynamic("ajaxBeforeLoad")(js.Any.fromFunction1(ajaxBeforeLoad))
    if (ajaxError != null) __obj.updateDynamic("ajaxError")(js.Any.fromFunction1(ajaxError))
    if (ajaxLoad != null) __obj.updateDynamic("ajaxLoad")(js.Any.fromFunction1(ajaxLoad))
    if (ajaxSettings != null) __obj.updateDynamic("ajaxSettings")(ajaxSettings)
    if (ajaxSuccess != null) __obj.updateDynamic("ajaxSuccess")(js.Any.fromFunction1(ajaxSuccess))
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation)
    if (beforeActivate != null) __obj.updateDynamic("beforeActivate")(js.Any.fromFunction1(beforeActivate))
    if (beforeInactivate != null) __obj.updateDynamic("beforeInactivate")(js.Any.fromFunction1(beforeInactivate))
    if (collapseSpeed != null) __obj.updateDynamic("collapseSpeed")(collapseSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (customIcon != null) __obj.updateDynamic("customIcon")(customIcon)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (disabledItems != null) __obj.updateDynamic("disabledItems")(disabledItems)
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (!js.isUndefined(enableMultipleOpen)) __obj.updateDynamic("enableMultipleOpen")(enableMultipleOpen)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (enabledItems != null) __obj.updateDynamic("enabledItems")(enabledItems)
    if (events != null) __obj.updateDynamic("events")(events)
    if (expandSpeed != null) __obj.updateDynamic("expandSpeed")(expandSpeed.asInstanceOf[js.Any])
    if (headerSize != null) __obj.updateDynamic("headerSize")(headerSize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightAdjustMode != null) __obj.updateDynamic("heightAdjustMode")(heightAdjustMode.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (inActivate != null) __obj.updateDynamic("inActivate")(js.Any.fromFunction1(inActivate))
    if (selectedItemIndex != null) __obj.updateDynamic("selectedItemIndex")(selectedItemIndex.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems)
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

