package typings.extjs.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Object")
@js.native
class Object ()
  extends typings.extjs.Ext.Object
/* static members */
object Object {
  
  /** [Method] Returns a new object with the given object as the prototype chain
    * @param object Object The prototype chain for the new object.
    */
  @JSGlobal("Ext.Object.chain")
  @js.native
  def chain(): Unit = js.native
  @JSGlobal("Ext.Object.chain")
  @js.native
  def chain(`object`: js.Any): Unit = js.native
  
  /** [Method] Iterates through an object and invokes the given callback function for each iteration
    * @param object Object The object to iterate
    * @param fn Function The callback function.
    * @param scope Object The execution scope (this) of the callback function
    */
  @JSGlobal("Ext.Object.each")
  @js.native
  def each(): Unit = js.native
  @JSGlobal("Ext.Object.each")
  @js.native
  def each(`object`: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Object.each")
  @js.native
  def each(`object`: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Object.each")
  @js.native
  def each(`object`: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Object.each")
  @js.native
  def each(`object`: js.Any): Unit = js.native
  @JSGlobal("Ext.Object.each")
  @js.native
  def each(`object`: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Object.each")
  @js.native
  def each(`object`: js.Any, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Object.each")
  @js.native
  def each(`object`: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Shallow compares the contents of 2 objects using strict equality
    * @param object1 Object
    * @param object2 Object
    * @returns Boolean true if the objects are equal.
    */
  @JSGlobal("Ext.Object.equals")
  @js.native
  def equals(): Boolean = js.native
  @JSGlobal("Ext.Object.equals")
  @js.native
  def equals(object1: js.UndefOr[scala.Nothing], object2: js.Any): Boolean = js.native
  @JSGlobal("Ext.Object.equals")
  @js.native
  def equals(object1: js.Any): Boolean = js.native
  @JSGlobal("Ext.Object.equals")
  @js.native
  def equals(object1: js.Any, object2: js.Any): Boolean = js.native
  
  /** [Method] Converts a query string back into an object
    * @param queryString String The query string to decode
    * @param recursive Boolean Whether or not to recursively decode the string. This format is supported by PHP / Ruby on Rails servers and similar.
    * @returns Object
    */
  @JSGlobal("Ext.Object.fromQueryString")
  @js.native
  def fromQueryString(): js.Any = js.native
  @JSGlobal("Ext.Object.fromQueryString")
  @js.native
  def fromQueryString(queryString: js.UndefOr[scala.Nothing], recursive: Boolean): js.Any = js.native
  @JSGlobal("Ext.Object.fromQueryString")
  @js.native
  def fromQueryString(queryString: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.Object.fromQueryString")
  @js.native
  def fromQueryString(queryString: java.lang.String, recursive: Boolean): js.Any = js.native
  
  /** [Method] Returns the first matching key corresponding to the given value
    * @param object Object
    * @param value Object The value to find
    */
  @JSGlobal("Ext.Object.getKey")
  @js.native
  def getKey(): Unit = js.native
  @JSGlobal("Ext.Object.getKey")
  @js.native
  def getKey(`object`: js.UndefOr[scala.Nothing], value: js.Any): Unit = js.native
  @JSGlobal("Ext.Object.getKey")
  @js.native
  def getKey(`object`: js.Any): Unit = js.native
  @JSGlobal("Ext.Object.getKey")
  @js.native
  def getKey(`object`: js.Any, value: js.Any): Unit = js.native
  
  /** [Method] Gets all keys of the given object as an array
    * @param object Object
    * @returns String[] An array of keys from the object
    */
  @JSGlobal("Ext.Object.getKeys")
  @js.native
  def getKeys(): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Object.getKeys")
  @js.native
  def getKeys(`object`: js.Any): typings.extjs.Ext.Array = js.native
  
  /** [Method] Gets the total number of this object s own properties var size  Ext Object getSize  name  Jacky  loves
    * @param object Object
    * @returns Number size
    */
  @JSGlobal("Ext.Object.getSize")
  @js.native
  def getSize(): Double = js.native
  @JSGlobal("Ext.Object.getSize")
  @js.native
  def getSize(`object`: js.Any): Double = js.native
  
  /** [Method] Gets all values of the given object as an array
    * @param object Object
    * @returns Array An array of values from the object
    */
  @JSGlobal("Ext.Object.getValues")
  @js.native
  def getValues(): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Object.getValues")
  @js.native
  def getValues(`object`: js.Any): typings.extjs.Ext.Array = js.native
  
  /** [Method] Checks if there are any properties on this object
    * @param object Object
    * @returns Boolean true if there no properties on the object.
    */
  @JSGlobal("Ext.Object.isEmpty")
  @js.native
  def isEmpty(): Boolean = js.native
  @JSGlobal("Ext.Object.isEmpty")
  @js.native
  def isEmpty(`object`: js.Any): Boolean = js.native
  
  /** [Method] Merges any number of objects recursively without referencing them or their children
    * @param destination Object The object into which all subsequent objects are merged.
    * @param object Object... Any number of objects to merge into the destination.
    * @returns Object merged The destination object with all passed objects merged in.
    */
  @JSGlobal("Ext.Object.merge")
  @js.native
  def merge(destination: js.Any, `object`: js.Any*): js.Any = js.native
  
  /** [Method] Converts a name  value pair to an array of objects with support for nested structures
    * @param name String
    * @param value Object/Array
    * @param recursive Boolean True to traverse object recursively
    * @returns Array
    */
  @JSGlobal("Ext.Object.toQueryObjects")
  @js.native
  def toQueryObjects(): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Object.toQueryObjects")
  @js.native
  def toQueryObjects(name: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], recursive: Boolean): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Object.toQueryObjects")
  @js.native
  def toQueryObjects(name: js.UndefOr[scala.Nothing], value: js.Any): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Object.toQueryObjects")
  @js.native
  def toQueryObjects(name: js.UndefOr[scala.Nothing], value: js.Any, recursive: Boolean): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Object.toQueryObjects")
  @js.native
  def toQueryObjects(name: java.lang.String): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Object.toQueryObjects")
  @js.native
  def toQueryObjects(name: java.lang.String, value: js.UndefOr[scala.Nothing], recursive: Boolean): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Object.toQueryObjects")
  @js.native
  def toQueryObjects(name: java.lang.String, value: js.Any): typings.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Object.toQueryObjects")
  @js.native
  def toQueryObjects(name: java.lang.String, value: js.Any, recursive: Boolean): typings.extjs.Ext.Array = js.native
  
  /** [Method] Takes an object and converts it to an encoded query string
    * @param object Object The object to encode
    * @param recursive Boolean Whether or not to interpret the object in recursive format. (PHP / Ruby on Rails servers and similar).
    * @returns String queryString
    */
  @JSGlobal("Ext.Object.toQueryString")
  @js.native
  def toQueryString(): java.lang.String = js.native
  @JSGlobal("Ext.Object.toQueryString")
  @js.native
  def toQueryString(`object`: js.UndefOr[scala.Nothing], recursive: Boolean): java.lang.String = js.native
  @JSGlobal("Ext.Object.toQueryString")
  @js.native
  def toQueryString(`object`: js.Any): java.lang.String = js.native
  @JSGlobal("Ext.Object.toQueryString")
  @js.native
  def toQueryString(`object`: js.Any, recursive: Boolean): java.lang.String = js.native
}
