package typings.dojo.dijit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/WidgetSet.html
  *
  * A set of widgets indexed by id.
  * Deprecated, will be removed in 2.0.
  * 
  */
@JSGlobal("dijit.WidgetSet")
@js.native
class WidgetSet () extends js.Object {
  /**
    * Add a widget to this list. If a duplicate ID is detected, a error is thrown.
    * 
    * @param widget Any dijit/_WidgetBase subclass.             
    */
  def add(widget: WidgetBase): Unit = js.native
  /**
    * Reduce this widgetset to a new WidgetSet of a particular declaredClass
    * 
    * @param cls The Class to scan for. Full dot-notated string.             
    */
  def byClass(cls: String): js.Any = js.native
  /**
    * Find a widget in this list by it's id.
    * 
    * @param id             
    */
  def byId(id: String): WidgetBase = js.native
  /**
    * A synthetic clone of array.every acting explicitly on this WidgetSet
    * 
    * @param func A callback function run for every widget in this list. Exits loopwhen the first false return is encountered.             
    * @param thisObj               OptionalOptional scope parameter to use for the callback             
    */
  def every(func: js.Function, thisObj: js.Object): Boolean = js.native
  /**
    * Filter down this WidgetSet to a smaller new WidgetSet
    * Works the same as array.filter and NodeList.filter
    * 
    * @param filter Callback function to test truthiness. Is passed the widgetreference and the pseudo-index in the object.             
    * @param thisObj               OptionalOption scope to use for the filter function.             
    */
  def filter(filter: js.Function, thisObj: js.Object): js.Any = js.native
  /**
    * Call specified function for each widget in this set.
    * 
    * @param func A callback function to run for each item. Is passed the widget, the indexin the iteration, and the full hash, similar to array.forEach.             
    * @param thisObj               OptionalAn optional scope parameter             
    */
  def forEach(func: js.Function, thisObj: js.Object): js.Any = js.native
  /**
    * Create a new Array from this WidgetSet, following the same rules as array.map
    * 
    * @param func             
    * @param thisObj               Optional            
    */
  def map(func: js.Function, thisObj: js.Object): js.Any = js.native
  /**
    * Remove a widget from this WidgetSet. Does not destroy the widget; simply
    * removes the reference.
    * 
    * @param id             
    */
  def remove(id: String): Unit = js.native
  /**
    * A synthetic clone of array.some acting explicitly on this WidgetSet
    * 
    * @param func A callback function run for every widget in this list. Exits loopwhen the first true return is encountered.             
    * @param thisObj               OptionalOptional scope parameter to use for the callback             
    */
  def some(func: js.Function, thisObj: js.Object): Boolean = js.native
  /**
    * Convert this WidgetSet into a true Array
    * 
    */
  def toArray(): js.Array[_] = js.native
}

