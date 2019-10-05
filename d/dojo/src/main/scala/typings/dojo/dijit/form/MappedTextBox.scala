package typings.dojo.dijit.form

import typings.dojo.Fn_IsFocused
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/MappedTextBox.html
  *
  * A dijit/form/ValidationTextBox subclass which provides a base class for widgets that have
  * a visible formatted display value, and a serializable
  * value in a hidden input field which is actually sent to the server.
  * The visible display may
  * be locale-dependent and interactive.  The value sent to the server is stored in a hidden
  * input field which uses the name attribute declared by the original widget.  That value sent
  * to the server is defined by the dijit/form/MappedTextBox.serialize() method and is typically
  * locale-neutral.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree.     
  */
@JSGlobal("dijit.form.MappedTextBox")
@js.native
class MappedTextBox () extends ValidationTextBox {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Tests if value is valid.
    * Can override with your own routine in a subclass.
    * 
    * @param isFocused             
    */
  @JSName("isValid")
  var isValid_Original: Fn_IsFocused = js.native
  /**
    * Tests if value is valid.
    * Can override with your own routine in a subclass.
    * 
    * @param isFocused             
    */
  @JSName("isValid")
  def isValid_MMappedTextBox(isFocused: Boolean): js.Any = js.native
  /**
    * Replaceable function to convert a formatted string to a value
    * 
    * @param value             
    * @param constraints             
    */
  def parse(value: String): js.Any = js.native
  /**
    * Overridable function used to convert the get('value') result to a canonical
    * (non-localized) string.  For example, will print dates in ISO format, and
    * numbers the same way as they are represented in javascript.
    * 
    * @param val             
    * @param options               Optional            
    */
  def serialize(`val`: js.Any, options: js.Object): String = js.native
  /**
    * 
    */
  def validate(): js.Any = js.native
}

