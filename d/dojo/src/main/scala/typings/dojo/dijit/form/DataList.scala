package typings.dojo.dijit.form

import typings.dojo.dojo.store.Memory
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/DataList.html
  *
  * Inefficient but small data store specialized for inlined data via OPTION tags
  * Provides a store for inlined data like:
  * 
  * <datalist>
  *     <option value="AL">Alabama</option>
  *     ...
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef Attach widget to this DOM node.     
  */
@JSGlobal("dijit.form.DataList")
@js.native
class DataList protected () extends Memory {
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * 
    */
  def destroy(): Unit = js.native
  /**
    * Get the option marked as selected, like <option selected>.
    * Not part of dojo.data API.
    * 
    */
  def fetchSelectedItem(): js.Any = js.native
}

