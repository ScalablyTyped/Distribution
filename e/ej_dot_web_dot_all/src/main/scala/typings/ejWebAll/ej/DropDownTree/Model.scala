package typings.ejWebAll.ej.DropDownTree

import typings.ejWebAll.ej.Textmode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Fires the action once the DropDownTree is created.
    */
  var Create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** Uses the keyboard for any action, including opening and closing the drop-down tree; navigating, expanding, and collapsing nodes of the dropdown tree; and more.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  
  /** Fires the action when the DropDownTree is about to lose focus.
    */
  var blur: js.UndefOr[js.Function1[/* e */ BlurEventArgs, Unit]] = js.native
  
  /** Fires the action when the DropDownTree control's value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  
  /** Fires the action when the list item checkbox value is changed.
    */
  var checkChange: js.UndefOr[js.Function1[/* e */ CheckChangeEventArgs, Unit]] = js.native
  
  /** Fires the action once the popup is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  
  /** Sets the root CSS class for DropDownTree that allows customization of appearance.
    * @Default {``}
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Sets the separator when the multiSelectMode with delimiter option or checkbox is enabled. When you enter the delimiter value, the text after the delimiter is considered as a
    * separate word or query. The delimiter string is a single character and must be a symbol. Mostly, the delimiter symbol is used as comma (,), semi-colon (;), or any other special
    * character.
    * @Default {,}
    */
  var delimiter: js.UndefOr[String] = js.native
  
  /** Fires the action when DropDownTree is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** The enabled animation property uses the easeOutQuad animation to SlideDown and SlideUp the popup wrapper in 200 and 100 milliseconds, respectively.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to continue the DropDownTree model state in the page using applicable medium, i.e., HTML5 localStorage or cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  
  /** Sets the DropDownTree textbox direction from right to left alignment.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** Indicates whether the DropDownTree control responds to user interaction or not. By default, the control is in the enabled mode and can be disabled by setting this to false.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** When the enableFilterSearch is enabled, the filtering action is fired as soon as you start typing in the DropDownTree.
    */
  var filtering: js.UndefOr[js.Function1[/* e */ FilteringEventArgs, Unit]] = js.native
  
  /** Fires the action when the DropDownTree is focused.
    */
  var focus: js.UndefOr[js.Function1[/* e */ FocusEventArgs, Unit]] = js.native
  
  /** Creates footer with text or HTML elements for the dropdown items.
    * @Default {null}
    */
  var footerTemplate: js.UndefOr[String] = js.native
  
  /** Serves as a patch of the entries comprising the path (that is set in the entry area) of the selected node.
    * @Default {'/'}
    */
  var fullPathDelimiter: js.UndefOr[String] = js.native
  
  /** Creates header with text or HTML elements for the dropdown items.
    * @Default {null}
    */
  var headerTemplate: js.UndefOr[String] = js.native
  
  /** Defines the height of the DropDownTree textbox.
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /** Allows you to set a particular country or regional language for the DropDownTree.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Fires the action once the popup is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  
  /** Customizes the height and width of the popup wrapper.
    * @Default {{height: '152px',width: 'auto',showPopupOnLoad: false}}
    */
  var popupSettings: js.UndefOr[PopupSettings] = js.native
  
  /** Specifies that the DropDownTree textbox values should be read-only.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /** Fires the action when the list of nodes in the DropDownTree is selected.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  
  /** The DropDownTree's textbox is displayed with rounded corner style.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  
  /** Specifies the targetID for the DropDownTree's items.
    * @Default {null}
    */
  var targetID: js.UndefOr[String] = js.native
  
  /** Specifies the delimiter between nodes (indicating their hierarchy).
    * @Default {ej.DropDownTree.TextMode.none}
    */
  var textMode: js.UndefOr[Textmode | String] = js.native
  
  /** Defines the popup settings of the DropDownTree widget. You can use any property which are in treeview using this property.
    * @Default {{}}
    */
  var treeViewSettings: js.UndefOr[js.Any] = js.native
  
  /** Sets the jQuery validation error message in the DropDownTree.
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.native
  
  /** Sets the jQuery validation rules in the DropDownTree.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  
  /** Specifies the value (text content) for the DropDownTree control. For the single selection mode, the selected item's value will be returned in its data type, and for
    * MultiSelectMode, returns the selected items values separated by delimiter in string type.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.native
  
  /** Specifies a short hint that describes the expected value of the DropDownTree control.
    * @Default {null}
    */
  var watermarkText: js.UndefOr[String] = js.native
  
  /** Defines the width of the DropDownTree textbox.
    * @Default {100%}
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
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("Create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("Create", js.undefined)
    
    @scala.inline
    def setAllowKeyboardNavigation(value: Boolean): Self = this.set("allowKeyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowKeyboardNavigation: Self = this.set("allowKeyboardNavigation", js.undefined)
    
    @scala.inline
    def setBlur(value: /* e */ BlurEventArgs => Unit): Self = this.set("blur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ ChangeEventArgs => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setCheckChange(value: /* e */ CheckChangeEventArgs => Unit): Self = this.set("checkChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCheckChange: Self = this.set("checkChange", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ CloseEventArgs => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFiltering(value: /* e */ FilteringEventArgs => Unit): Self = this.set("filtering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFiltering: Self = this.set("filtering", js.undefined)
    
    @scala.inline
    def setFocus(value: /* e */ FocusEventArgs => Unit): Self = this.set("focus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setFooterTemplate(value: String): Self = this.set("footerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterTemplate: Self = this.set("footerTemplate", js.undefined)
    
    @scala.inline
    def setFullPathDelimiter(value: String): Self = this.set("fullPathDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullPathDelimiter: Self = this.set("fullPathDelimiter", js.undefined)
    
    @scala.inline
    def setHeaderTemplate(value: String): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ OpenEventArgs => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPopupSettings(value: PopupSettings): Self = this.set("popupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupSettings: Self = this.set("popupSettings", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ SelectEventArgs => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    
    @scala.inline
    def setTargetID(value: String): Self = this.set("targetID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetID: Self = this.set("targetID", js.undefined)
    
    @scala.inline
    def setTextMode(value: Textmode | String): Self = this.set("textMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextMode: Self = this.set("textMode", js.undefined)
    
    @scala.inline
    def setTreeViewSettings(value: js.Any): Self = this.set("treeViewSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreeViewSettings: Self = this.set("treeViewSettings", js.undefined)
    
    @scala.inline
    def setValidationMessage(value: js.Any): Self = this.set("validationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationMessage: Self = this.set("validationMessage", js.undefined)
    
    @scala.inline
    def setValidationRules(value: js.Any): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWatermarkText(value: String): Self = this.set("watermarkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatermarkText: Self = this.set("watermarkText", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
