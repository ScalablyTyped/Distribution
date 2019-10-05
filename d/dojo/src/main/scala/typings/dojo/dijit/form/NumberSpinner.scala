package typings.dojo.dijit.form

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.dojoStrings.editOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/NumberSpinner.html
  *
  * Extends NumberTextBox to add up/down arrows and pageup/pagedown for incremental change to the value
  * A dijit/form/NumberTextBox extension to provide keyboard accessible value selection
  * as well as icons for spinning direction. When using the keyboard, the typematic rules
  * apply, meaning holding the key will gradually increase or decrease the value and
  * accelerate.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree.     
  */
@JSGlobal("dijit.form.NumberSpinner")
@js.native
class NumberSpinner () extends _Spinner {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Properties to mix into constraints when the value is being edited.
    * This is here because we edit the number in the format "12345", which is
    * different than the display value (ex: "12,345")
    * 
    */
  var editOptions: js.Object = js.native
  @JSName("get")
  def get_editOptions(property: editOptions): js.Object = js.native
  /**
    * 
    * @param isFocused             
    */
  @JSName("isValid")
  def isValid_MNumberSpinner(isFocused: Boolean): js.Any = js.native
  @JSName("set")
  def set_editOptions(property: editOptions, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_editOptions(property: editOptions, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
}

