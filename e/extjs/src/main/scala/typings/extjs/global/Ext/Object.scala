package typings.extjs.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Object")
@js.native
class Object ()
  extends StObject
     with typings.extjs.Ext.Object
/* static members */
object Object {
  
  @JSGlobal("Ext.Object")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Returns a new object with the given object as the prototype chain
    * @param object Object The prototype chain for the new object.
    */
  @scala.inline
  def chain(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")().asInstanceOf[Unit]
  @scala.inline
  def chain(`object`: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Iterates through an object and invokes the given callback function for each iteration
    * @param object Object The object to iterate
    * @param fn Function The callback function.
    * @param scope Object The execution scope (this) of the callback function
    */
  @scala.inline
  def each(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")().asInstanceOf[Unit]
  @scala.inline
  def each(`object`: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def each(`object`: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def each(`object`: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def each(`object`: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def each(`object`: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def each(`object`: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def each(`object`: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Shallow compares the contents of 2 objects using strict equality
    * @param object1 Object
    * @param object2 Object
    * @returns Boolean true if the objects are equal.
    */
  @scala.inline
  def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  @scala.inline
  def equals(object1: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(object1.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def equals(object1: js.Any, object2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equals(object1: Unit, object2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Converts a query string back into an object
    * @param queryString String The query string to decode
    * @param recursive Boolean Whether or not to recursively decode the string. This format is supported by PHP / Ruby on Rails servers and similar.
    * @returns Object
    */
  @scala.inline
  def fromQueryString(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQueryString")().asInstanceOf[js.Any]
  @scala.inline
  def fromQueryString(queryString: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQueryString")(queryString.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def fromQueryString(queryString: java.lang.String, recursive: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fromQueryString")(queryString.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def fromQueryString(queryString: Unit, recursive: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fromQueryString")(queryString.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Returns the first matching key corresponding to the given value
    * @param object Object
    * @param value Object The value to find
    */
  @scala.inline
  def getKey(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")().asInstanceOf[Unit]
  @scala.inline
  def getKey(`object`: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def getKey(`object`: js.Any, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def getKey(`object`: Unit, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Gets all keys of the given object as an array
    * @param object Object
    * @returns String[] An array of keys from the object
    */
  @scala.inline
  def getKeys(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeys")().asInstanceOf[typings.extjs.Ext.Array]
  @scala.inline
  def getKeys(`object`: js.Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeys")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Gets the total number of this object s own properties var size  Ext Object getSize  name  Jacky  loves
    * @param object Object
    * @returns Number size
    */
  @scala.inline
  def getSize(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")().asInstanceOf[Double]
  @scala.inline
  def getSize(`object`: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Gets all values of the given object as an array
    * @param object Object
    * @returns Array An array of values from the object
    */
  @scala.inline
  def getValues(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getValues")().asInstanceOf[typings.extjs.Ext.Array]
  @scala.inline
  def getValues(`object`: js.Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getValues")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Checks if there are any properties on this object
    * @param object Object
    * @returns Boolean true if there no properties on the object.
    */
  @scala.inline
  def isEmpty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")().asInstanceOf[Boolean]
  @scala.inline
  def isEmpty(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Merges any number of objects recursively without referencing them or their children
    * @param destination Object The object into which all subsequent objects are merged.
    * @param object Object... Any number of objects to merge into the destination.
    * @returns Object merged The destination object with all passed objects merged in.
    */
  @scala.inline
  def merge(destination: js.Any, `object`: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(destination.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Converts a name  value pair to an array of objects with support for nested structures
    * @param name String
    * @param value Object/Array
    * @param recursive Boolean True to traverse object recursively
    * @returns Array
    */
  @scala.inline
  def toQueryObjects(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toQueryObjects")().asInstanceOf[typings.extjs.Ext.Array]
  @scala.inline
  def toQueryObjects(name: java.lang.String): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toQueryObjects")(name.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  @scala.inline
  def toQueryObjects(name: java.lang.String, value: js.Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toQueryObjects")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  @scala.inline
  def toQueryObjects(name: java.lang.String, value: js.Any, recursive: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toQueryObjects")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  @scala.inline
  def toQueryObjects(name: java.lang.String, value: Unit, recursive: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toQueryObjects")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  @scala.inline
  def toQueryObjects(name: Unit, value: js.Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toQueryObjects")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  @scala.inline
  def toQueryObjects(name: Unit, value: js.Any, recursive: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toQueryObjects")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  @scala.inline
  def toQueryObjects(name: Unit, value: Unit, recursive: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toQueryObjects")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Takes an object and converts it to an encoded query string
    * @param object Object The object to encode
    * @param recursive Boolean Whether or not to interpret the object in recursive format. (PHP / Ruby on Rails servers and similar).
    * @returns String queryString
    */
  @scala.inline
  def toQueryString(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toQueryString")().asInstanceOf[java.lang.String]
  @scala.inline
  def toQueryString(`object`: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toQueryString")(`object`.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def toQueryString(`object`: js.Any, recursive: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("toQueryString")(`object`.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def toQueryString(`object`: Unit, recursive: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("toQueryString")(`object`.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
