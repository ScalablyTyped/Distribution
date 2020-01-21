package typings.dojo.dijit.form

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.editOptions
import typings.dojo.dojoStrings.value
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/NumberTextBox.html
  *
  * A TextBox for entering numbers, with formatting and range checking
  * NumberTextBox is a textbox for entering and displaying numbers, supporting
  * the following main features:
  * 
  * Enforce minimum/maximum allowed values (as well as enforcing that the user types
  *  a number rather than a random string)
  * NLS support (altering roles of comma and dot as "thousands-separator" and "decimal-point"
  *  depending on locale).
  * Separate modes for editing the value and displaying it, specifically that
  *  the thousands separator character (typically comma) disappears when editing
  *  but reappears after the field is blurred.
  * Formatting and constraints regarding the number of places (digits after the decimal point)
  *  allowed on input, and number of places displayed when blurred (see constraints parameter).
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree.     
  */
@JSGlobal("dijit.form.NumberTextBox")
@js.native
class NumberTextBox_ () extends RangeBoundTextBox {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Properties to mix into constraints when the value is being edited.
    * This is here because we edit the number in the format "12345", which is
    * different than the display value (ex: "12,345")
    * 
    */
  var editOptions: js.Object = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    * 
    */
  @JSName("value")
  var value_NumberTextBox_ : String = js.native
  /**
    * 
    */
  def Mixin(): Unit = js.native
  @JSName("get")
  def get_editOptions(property: editOptions): js.Object = js.native
  @JSName("set")
  def set_editOptions(property: editOptions, value: js.Object): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("watch")
  def watch_editOptions(
    property: editOptions,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

