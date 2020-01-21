package typings.dojo.dijit.form

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.multiple
import typings.dojo.dojoStrings.size
import typings.dojo.dojoStrings.value
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/MultiSelect.html
  *
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.form.MultiSelect")
@js.native
class MultiSelect () extends FormValueWidget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * 
    */
  var multiple: Boolean = js.native
  /**
    * Number of elements to display on a page
    * NOTE: may be removed in version 2.0, since elements may have variable height;
    * set the size via style="..." or CSS class names instead.
    * 
    */
  var size: Double = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    * 
    */
  @JSName("value")
  var value_MultiSelect: String = js.native
  /**
    * 
    * @param select             
    */
  def addSelected(select: MultiSelect): Unit = js.native
  /**
    * Access the NodeList of the selected options directly
    * 
    */
  def getSelected(): js.Any = js.native
  @JSName("get")
  def get_multiple(property: multiple): Boolean = js.native
  @JSName("get")
  def get_size(property: size): Double = js.native
  /**
    * Invert the selection
    * 
    * @param onChange               OptionalIf false, onChange is not fired.             
    */
  def invertSelection(onChange: Boolean): Unit = js.native
  /**
    * 
    * @param size             
    */
  def resize(size: js.Object): Unit = js.native
  @JSName("set")
  def set_multiple(property: multiple, value: Boolean): Unit = js.native
  @JSName("set")
  def set_size(property: size, value: Double): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("watch")
  def watch_multiple(
    property: multiple,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_size(
    property: size,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

