package typings.dojo.dijit.form

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.cols
import typings.dojo.dojoStrings.rows
import typings.dojo.dojoStrings.value
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/SimpleTextarea.html
  *
  * A simple textarea that degrades, and responds to
  * minimal LayoutContainer usage, and works with dijit/form/Form.
  * Doesn't automatically size according to input, like Textarea.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.form.SimpleTextarea")
@js.native
class SimpleTextarea () extends TextBox {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * 
    */
  var cols: String = js.native
  /**
    * The number of rows of text.
    * 
    */
  var rows: Double = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    * 
    */
  @JSName("value")
  var value_SimpleTextarea: String = js.native
  /**
    * 
    * @param value             
    */
  def filter(value: String): js.Any = js.native
  @JSName("get")
  def get_cols(property: cols): String = js.native
  @JSName("get")
  def get_rows(property: rows): Double = js.native
  @JSName("set")
  def set_cols(property: cols, value: String): Unit = js.native
  @JSName("set")
  def set_rows(property: rows, value: Double): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("watch")
  def watch_cols(
    property: cols,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_rows(
    property: rows,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

