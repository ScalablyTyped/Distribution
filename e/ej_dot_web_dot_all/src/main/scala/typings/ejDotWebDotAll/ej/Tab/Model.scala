package typings.ejDotWebDotAll.ej.Tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggered before AJAX content has been loaded.
    */
  var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.undefined
  /** Triggered if error occurs in AJAX request.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.undefined
  /** Triggered after AJAX content load action.
    */
  var ajaxLoad: js.UndefOr[js.Function1[/* e */ AjaxLoadEventArgs, Unit]] = js.undefined
  /** Specifies the ajaxSettings option to load the content to the Tab control.
    */
  var ajaxSettings: js.UndefOr[AjaxSettings] = js.undefined
  /** Triggered after a tab item activated.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.undefined
  /** Tab items interaction with keyboard keys, like headers active navigation.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
  /** Triggered before a tab item activated.
    */
  var beforeActive: js.UndefOr[js.Function1[/* e */ BeforeActiveEventArgs, Unit]] = js.undefined
  /** Triggered before a tab item remove.
    */
  var beforeItemRemove: js.UndefOr[js.Function1[/* e */ BeforeItemRemoveEventArgs, Unit]] = js.undefined
  /** Allow to collapsing the active item, while click on the active header.
    * @Default {false}
    */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  /** Triggered before a tab item Create.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Set the root class for Tab theme. This cssClass API helps to use custom skinning option for Tab control.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Triggered before a tab item destroy.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Disables the given tab headers and content panels.
    * @Default {[]}
    */
  var disabledItemIndex: js.UndefOr[js.Array[Double]] = js.undefined
  /** Specifies the animation behavior of the tab.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Save current model value to browser cookies for state maintains. While refresh the Tab control page the model value apply from browser cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** Display Right to Left direction for headers and panels text of tab.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Specify to enable scrolling for Tab header.
    * @Default {false}
    */
  var enableTabScroll: js.UndefOr[Boolean] = js.undefined
  /** When this property is set to false, it disables the tab control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Enables the given tab headers and content panels.
    * @Default {[]}
    */
  var enabledItemIndex: js.UndefOr[js.Array[Double]] = js.undefined
  /** The event API to bind the action for active the tab items.
    * @Default {click}
    */
  var events: js.UndefOr[String] = js.undefined
  /** Specifies the position of Tab header as top, bottom, left or right. See below to get available Position
    * @Default {top}
    */
  var headerPosition: js.UndefOr[String | Position] = js.undefined
  /** Set the height of the tab header element. Default this property value is null, so height take content height.
    * @Default {null}
    */
  var headerSize: js.UndefOr[String | Double] = js.undefined
  /** Height set the outer panel element. Default this property value is null, so height take content height.
    * @Default {null}
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /** Adjust the content panel height for given option (content, auto and fill), by default panels height adjust based on the content.See below to get available HeightAdjustMode
    * @Default {content}
    */
  var heightAdjustMode: js.UndefOr[String | HeightAdjustMode] = js.undefined
  /** Specifies to hide a pane of Tab control.
    * @Default {[]}
    */
  var hiddenItemIndex: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the HTML Attributes of the Tab.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** The idPrefix property appends the given string on the added tab item idâ€™s in runtime.
    * @Default {ej-tab-}
    */
  var idPrefix: js.UndefOr[String] = js.undefined
  /** Triggered after a tab item activated.
    */
  var itemActive: js.UndefOr[js.Function1[/* e */ ItemActiveEventArgs, Unit]] = js.undefined
  /** Triggered after new tab item add
    */
  var itemAdd: js.UndefOr[js.Function1[/* e */ ItemAddEventArgs, Unit]] = js.undefined
  /** Triggered after tab item removed.
    */
  var itemRemove: js.UndefOr[js.Function1[/* e */ ItemRemoveEventArgs, Unit]] = js.undefined
  /** Specifies the Tab header in active for given index value.
    * @Default {0}
    */
  var selectedItemIndex: js.UndefOr[Double] = js.undefined
  /** Display the close button for each tab items. While clicking on the close icon, particular tab item will be removed.
    * @Default {false}
    */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  /** Display the Reload button for each tab items.
    * @Default {false}
    */
  var showReloadIcon: js.UndefOr[Boolean] = js.undefined
  /** Tab panels and headers to be displayed in rounded corner style.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Set the width for outer panel element, if not itâ€™s take parent width.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    ajaxBeforeLoad: /* e */ AjaxBeforeLoadEventArgs => Unit = null,
    ajaxError: /* e */ AjaxErrorEventArgs => Unit = null,
    ajaxLoad: /* e */ AjaxLoadEventArgs => Unit = null,
    ajaxSettings: AjaxSettings = null,
    ajaxSuccess: /* e */ AjaxSuccessEventArgs => Unit = null,
    allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    beforeActive: /* e */ BeforeActiveEventArgs => Unit = null,
    beforeItemRemove: /* e */ BeforeItemRemoveEventArgs => Unit = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    disabledItemIndex: js.Array[Double] = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableTabScroll: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    enabledItemIndex: js.Array[Double] = null,
    events: String = null,
    headerPosition: String | Position = null,
    headerSize: String | Double = null,
    height: String | Double = null,
    heightAdjustMode: String | HeightAdjustMode = null,
    hiddenItemIndex: js.Array[_] = null,
    htmlAttributes: js.Any = null,
    idPrefix: String = null,
    itemActive: /* e */ ItemActiveEventArgs => Unit = null,
    itemAdd: /* e */ ItemAddEventArgs => Unit = null,
    itemRemove: /* e */ ItemRemoveEventArgs => Unit = null,
    selectedItemIndex: Int | Double = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    showReloadIcon: js.UndefOr[Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    width: String | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (ajaxBeforeLoad != null) __obj.updateDynamic("ajaxBeforeLoad")(js.Any.fromFunction1(ajaxBeforeLoad))
    if (ajaxError != null) __obj.updateDynamic("ajaxError")(js.Any.fromFunction1(ajaxError))
    if (ajaxLoad != null) __obj.updateDynamic("ajaxLoad")(js.Any.fromFunction1(ajaxLoad))
    if (ajaxSettings != null) __obj.updateDynamic("ajaxSettings")(ajaxSettings.asInstanceOf[js.Any])
    if (ajaxSuccess != null) __obj.updateDynamic("ajaxSuccess")(js.Any.fromFunction1(ajaxSuccess))
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation.asInstanceOf[js.Any])
    if (beforeActive != null) __obj.updateDynamic("beforeActive")(js.Any.fromFunction1(beforeActive))
    if (beforeItemRemove != null) __obj.updateDynamic("beforeItemRemove")(js.Any.fromFunction1(beforeItemRemove))
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (disabledItemIndex != null) __obj.updateDynamic("disabledItemIndex")(disabledItemIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTabScroll)) __obj.updateDynamic("enableTabScroll")(enableTabScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (enabledItemIndex != null) __obj.updateDynamic("enabledItemIndex")(enabledItemIndex.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (headerPosition != null) __obj.updateDynamic("headerPosition")(headerPosition.asInstanceOf[js.Any])
    if (headerSize != null) __obj.updateDynamic("headerSize")(headerSize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightAdjustMode != null) __obj.updateDynamic("heightAdjustMode")(heightAdjustMode.asInstanceOf[js.Any])
    if (hiddenItemIndex != null) __obj.updateDynamic("hiddenItemIndex")(hiddenItemIndex.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix.asInstanceOf[js.Any])
    if (itemActive != null) __obj.updateDynamic("itemActive")(js.Any.fromFunction1(itemActive))
    if (itemAdd != null) __obj.updateDynamic("itemAdd")(js.Any.fromFunction1(itemAdd))
    if (itemRemove != null) __obj.updateDynamic("itemRemove")(js.Any.fromFunction1(itemRemove))
    if (selectedItemIndex != null) __obj.updateDynamic("selectedItemIndex")(selectedItemIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showReloadIcon)) __obj.updateDynamic("showReloadIcon")(showReloadIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

