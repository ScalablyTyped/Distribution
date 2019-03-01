package typings
package ejDotWebDotAllLib.ejNs.DropDownTreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires the action once the DropDownTree is created.
    */
  var Create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Uses the keyboard for any action, including opening and closing the drop-down tree; navigating, expanding, and collapsing nodes of the dropdown tree; and more.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires the action when the DropDownTree is about to lose focus.
    */
  var blur: js.UndefOr[js.Function1[/* e */ BlurEventArgs, scala.Unit]] = js.undefined
  /** Fires the action when the DropDownTree control's value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Fires the action when the list item checkbox value is changed.
    */
  var checkChange: js.UndefOr[js.Function1[/* e */ CheckChangeEventArgs, scala.Unit]] = js.undefined
  /** Fires the action once the popup is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, scala.Unit]] = js.undefined
  /** Sets the root CSS class for DropDownTree that allows customization of appearance.
    * @Default {``}
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the separator when the multiSelectMode with delimiter option or checkbox is enabled. When you enter the delimiter value, the text after the delimiter is considered as a
    * separate word or query. The delimiter string is a single character and must be a symbol. Mostly, the delimiter symbol is used as comma (,), semi-colon (;), or any other special
    * character.
    * @Default {,}
    */
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  /** Fires the action when DropDownTree is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** The enabled animation property uses the easeOutQuad animation to SlideDown and SlideUp the popup wrapper in 200 and 100 milliseconds, respectively.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to continue the DropDownTree model state in the page using applicable medium, i.e., HTML5 localStorage or cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the DropDownTree textbox direction from right to left alignment.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether the DropDownTree control responds to user interaction or not. By default, the control is in the enabled mode and can be disabled by setting this to false.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** When the enableFilterSearch is enabled, the filtering action is fired as soon as you start typing in the DropDownTree.
    */
  var filtering: js.UndefOr[js.Function1[/* e */ FilteringEventArgs, scala.Unit]] = js.undefined
  /** Fires the action when the DropDownTree is focused.
    */
  var focus: js.UndefOr[js.Function1[/* e */ FocusEventArgs, scala.Unit]] = js.undefined
  /** Creates footer with text or HTML elements for the dropdown items.
    * @Default {null}
    */
  var footerTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Serves as a patch of the entries comprising the path (that is set in the entry area) of the selected node.
    * @Default {'/'}
    */
  var fullPathDelimiter: js.UndefOr[java.lang.String] = js.undefined
  /** Creates header with text or HTML elements for the dropdown items.
    * @Default {null}
    */
  var headerTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the height of the DropDownTree textbox.
    */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Allows you to set a particular country or regional language for the DropDownTree.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Fires the action once the popup is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, scala.Unit]] = js.undefined
  /** Customizes the height and width of the popup wrapper.
    * @Default {{height: '152px',width: 'auto',showPopupOnLoad: false}}
    */
  var popupSettings: js.UndefOr[PopupSettings] = js.undefined
  /** Specifies that the DropDownTree textbox values should be read-only.
    * @Default {false}
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires the action when the list of nodes in the DropDownTree is selected.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, scala.Unit]] = js.undefined
  /** The DropDownTree's textbox is displayed with rounded corner style.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the targetID for the DropDownTree's items.
    * @Default {null}
    */
  var targetID: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the delimiter between nodes (indicating their hierarchy).
    * @Default {ej.DropDownTree.TextMode.none}
    */
  var textMode: js.UndefOr[ejDotWebDotAllLib.ejNs.Textmode | java.lang.String] = js.undefined
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
  var value: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies a short hint that describes the expected value of the DropDownTree control.
    * @Default {null}
    */
  var watermarkText: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the width of the DropDownTree textbox.
    * @Default {100%}
    */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    Create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    blur: js.Function1[/* e */ BlurEventArgs, scala.Unit] = null,
    change: js.Function1[/* e */ ChangeEventArgs, scala.Unit] = null,
    checkChange: js.Function1[/* e */ CheckChangeEventArgs, scala.Unit] = null,
    close: js.Function1[/* e */ CloseEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    delimiter: java.lang.String = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    enablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    filtering: js.Function1[/* e */ FilteringEventArgs, scala.Unit] = null,
    focus: js.Function1[/* e */ FocusEventArgs, scala.Unit] = null,
    footerTemplate: java.lang.String = null,
    fullPathDelimiter: java.lang.String = null,
    headerTemplate: java.lang.String = null,
    height: java.lang.String | scala.Double = null,
    locale: java.lang.String = null,
    open: js.Function1[/* e */ OpenEventArgs, scala.Unit] = null,
    popupSettings: PopupSettings = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    select: js.Function1[/* e */ SelectEventArgs, scala.Unit] = null,
    showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined,
    targetID: java.lang.String = null,
    textMode: ejDotWebDotAllLib.ejNs.Textmode | java.lang.String = null,
    treeViewSettings: js.Any = null,
    validationMessage: js.Any = null,
    validationRules: js.Any = null,
    value: java.lang.String = null,
    watermarkText: java.lang.String = null,
    width: java.lang.String | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (Create != null) __obj.updateDynamic("Create")(Create)
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation)
    if (blur != null) __obj.updateDynamic("blur")(blur)
    if (change != null) __obj.updateDynamic("change")(change)
    if (checkChange != null) __obj.updateDynamic("checkChange")(checkChange)
    if (close != null) __obj.updateDynamic("close")(close)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (filtering != null) __obj.updateDynamic("filtering")(filtering)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate)
    if (fullPathDelimiter != null) __obj.updateDynamic("fullPathDelimiter")(fullPathDelimiter)
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (open != null) __obj.updateDynamic("open")(open)
    if (popupSettings != null) __obj.updateDynamic("popupSettings")(popupSettings)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (select != null) __obj.updateDynamic("select")(select)
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

