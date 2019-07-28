package typings.ejDotWebDotAll.ejNs.DropDownTreeNs

import typings.ejDotWebDotAll.ejNs.Textmode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires the action once the DropDownTree is created.
    */
  var Create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Uses the keyboard for any action, including opening and closing the drop-down tree; navigating, expanding, and collapsing nodes of the dropdown tree; and more.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
  /** Fires the action when the DropDownTree is about to lose focus.
    */
  var blur: js.UndefOr[js.Function1[/* e */ BlurEventArgs, Unit]] = js.undefined
  /** Fires the action when the DropDownTree control's value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Fires the action when the list item checkbox value is changed.
    */
  var checkChange: js.UndefOr[js.Function1[/* e */ CheckChangeEventArgs, Unit]] = js.undefined
  /** Fires the action once the popup is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
  /** Sets the root CSS class for DropDownTree that allows customization of appearance.
    * @Default {``}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Sets the separator when the multiSelectMode with delimiter option or checkbox is enabled. When you enter the delimiter value, the text after the delimiter is considered as a
    * separate word or query. The delimiter string is a single character and must be a symbol. Mostly, the delimiter symbol is used as comma (,), semi-colon (;), or any other special
    * character.
    * @Default {,}
    */
  var delimiter: js.UndefOr[String] = js.undefined
  /** Fires the action when DropDownTree is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** The enabled animation property uses the easeOutQuad animation to SlideDown and SlideUp the popup wrapper in 200 and 100 milliseconds, respectively.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to continue the DropDownTree model state in the page using applicable medium, i.e., HTML5 localStorage or cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** Sets the DropDownTree textbox direction from right to left alignment.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether the DropDownTree control responds to user interaction or not. By default, the control is in the enabled mode and can be disabled by setting this to false.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** When the enableFilterSearch is enabled, the filtering action is fired as soon as you start typing in the DropDownTree.
    */
  var filtering: js.UndefOr[js.Function1[/* e */ FilteringEventArgs, Unit]] = js.undefined
  /** Fires the action when the DropDownTree is focused.
    */
  var focus: js.UndefOr[js.Function1[/* e */ FocusEventArgs, Unit]] = js.undefined
  /** Creates footer with text or HTML elements for the dropdown items.
    * @Default {null}
    */
  var footerTemplate: js.UndefOr[String] = js.undefined
  /** Serves as a patch of the entries comprising the path (that is set in the entry area) of the selected node.
    * @Default {'/'}
    */
  var fullPathDelimiter: js.UndefOr[String] = js.undefined
  /** Creates header with text or HTML elements for the dropdown items.
    * @Default {null}
    */
  var headerTemplate: js.UndefOr[String] = js.undefined
  /** Defines the height of the DropDownTree textbox.
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /** Allows you to set a particular country or regional language for the DropDownTree.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Fires the action once the popup is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
  /** Customizes the height and width of the popup wrapper.
    * @Default {{height: '152px',width: 'auto',showPopupOnLoad: false}}
    */
  var popupSettings: js.UndefOr[PopupSettings] = js.undefined
  /** Specifies that the DropDownTree textbox values should be read-only.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** Fires the action when the list of nodes in the DropDownTree is selected.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.undefined
  /** The DropDownTree's textbox is displayed with rounded corner style.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Specifies the targetID for the DropDownTree's items.
    * @Default {null}
    */
  var targetID: js.UndefOr[String] = js.undefined
  /** Specifies the delimiter between nodes (indicating their hierarchy).
    * @Default {ej.DropDownTree.TextMode.none}
    */
  var textMode: js.UndefOr[Textmode | String] = js.undefined
  /** Defines the popup settings of the DropDownTree widget. You can use any property which are in treeview using this property.
    * @Default {{}}
    */
  var treeViewSettings: js.UndefOr[js.Any] = js.undefined
  /** Sets the jQuery validation error message in the DropDownTree.
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.undefined
  /** Sets the jQuery validation rules in the DropDownTree.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.undefined
  /** Specifies the value (text content) for the DropDownTree control. For the single selection mode, the selected item's value will be returned in its data type, and for
    * MultiSelectMode, returns the selected items values separated by delimiter in string type.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.undefined
  /** Specifies a short hint that describes the expected value of the DropDownTree control.
    * @Default {null}
    */
  var watermarkText: js.UndefOr[String] = js.undefined
  /** Defines the width of the DropDownTree textbox.
    * @Default {100%}
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    Create: /* e */ CreateEventArgs => Unit = null,
    allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    blur: /* e */ BlurEventArgs => Unit = null,
    change: /* e */ ChangeEventArgs => Unit = null,
    checkChange: /* e */ CheckChangeEventArgs => Unit = null,
    close: /* e */ CloseEventArgs => Unit = null,
    cssClass: String = null,
    delimiter: String = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    filtering: /* e */ FilteringEventArgs => Unit = null,
    focus: /* e */ FocusEventArgs => Unit = null,
    footerTemplate: String = null,
    fullPathDelimiter: String = null,
    headerTemplate: String = null,
    height: String | Double = null,
    locale: String = null,
    open: /* e */ OpenEventArgs => Unit = null,
    popupSettings: PopupSettings = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    select: /* e */ SelectEventArgs => Unit = null,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    targetID: String = null,
    textMode: Textmode | String = null,
    treeViewSettings: js.Any = null,
    validationMessage: js.Any = null,
    validationRules: js.Any = null,
    value: String = null,
    watermarkText: String = null,
    width: String | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (Create != null) __obj.updateDynamic("Create")(js.Any.fromFunction1(Create))
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation)
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction1(blur))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (checkChange != null) __obj.updateDynamic("checkChange")(js.Any.fromFunction1(checkChange))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (filtering != null) __obj.updateDynamic("filtering")(js.Any.fromFunction1(filtering))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction1(focus))
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate)
    if (fullPathDelimiter != null) __obj.updateDynamic("fullPathDelimiter")(fullPathDelimiter)
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (popupSettings != null) __obj.updateDynamic("popupSettings")(popupSettings)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (targetID != null) __obj.updateDynamic("targetID")(targetID)
    if (textMode != null) __obj.updateDynamic("textMode")(textMode.asInstanceOf[js.Any])
    if (treeViewSettings != null) __obj.updateDynamic("treeViewSettings")(treeViewSettings)
    if (validationMessage != null) __obj.updateDynamic("validationMessage")(validationMessage)
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules)
    if (value != null) __obj.updateDynamic("value")(value)
    if (watermarkText != null) __obj.updateDynamic("watermarkText")(watermarkText)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

