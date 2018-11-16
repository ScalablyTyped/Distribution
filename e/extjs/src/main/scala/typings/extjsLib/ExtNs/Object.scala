package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.Object")
@js.native
class Object () extends js.Object

@JSGlobal("Ext.Object")
@js.native
object Object extends js.Object {
  /** [Method] Returns a new object with the given object as the prototype chain
  		* @param object Object The prototype chain for the new object.
  		*/
  def chain(): scala.Unit = js.native
  /** [Method] Returns a new object with the given object as the prototype chain
  		* @param object Object The prototype chain for the new object.
  		*/
  def chain(`object`: js.Any): scala.Unit = js.native
  /** [Method] Iterates through an object and invokes the given callback function for each iteration
  		* @param object Object The object to iterate
  		* @param fn Function The callback function.
  		* @param scope Object The execution scope (this) of the callback function
  		*/
  def each(): scala.Unit = js.native
  /** [Method] Iterates through an object and invokes the given callback function for each iteration
  		* @param object Object The object to iterate
  		* @param fn Function The callback function.
  		* @param scope Object The execution scope (this) of the callback function
  		*/
  def each(`object`: js.Any): scala.Unit = js.native
  /** [Method] Iterates through an object and invokes the given callback function for each iteration
  		* @param object Object The object to iterate
  		* @param fn Function The callback function.
  		* @param scope Object The execution scope (this) of the callback function
  		*/
  def each(`object`: js.Any, fn: js.Any): scala.Unit = js.native
  /** [Method] Iterates through an object and invokes the given callback function for each iteration
  		* @param object Object The object to iterate
  		* @param fn Function The callback function.
  		* @param scope Object The execution scope (this) of the callback function
  		*/
  def each(`object`: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Shallow compares the contents of 2 objects using strict equality
  		* @param object1 Object
  		* @param object2 Object
  		* @returns Boolean true if the objects are equal.
  		*/
  def equals(): scala.Boolean = js.native
  /** [Method] Shallow compares the contents of 2 objects using strict equality
  		* @param object1 Object
  		* @param object2 Object
  		* @returns Boolean true if the objects are equal.
  		*/
  def equals(object1: js.Any): scala.Boolean = js.native
  /** [Method] Shallow compares the contents of 2 objects using strict equality
  		* @param object1 Object
  		* @param object2 Object
  		* @returns Boolean true if the objects are equal.
  		*/
  def equals(object1: js.Any, object2: js.Any): scala.Boolean = js.native
  /** [Method] Converts a query string back into an object
  		* @param queryString String The query string to decode
  		* @param recursive Boolean Whether or not to recursively decode the string. This format is supported by PHP / Ruby on Rails servers and similar.
  		* @returns Object
  		*/
  def fromQueryString(): js.Any = js.native
  /** [Method] Converts a query string back into an object
  		* @param queryString String The query string to decode
  		* @param recursive Boolean Whether or not to recursively decode the string. This format is supported by PHP / Ruby on Rails servers and similar.
  		* @returns Object
  		*/
  def fromQueryString(queryString: java.lang.String): js.Any = js.native
  /** [Method] Converts a query string back into an object
  		* @param queryString String The query string to decode
  		* @param recursive Boolean Whether or not to recursively decode the string. This format is supported by PHP / Ruby on Rails servers and similar.
  		* @returns Object
  		*/
  def fromQueryString(queryString: java.lang.String, recursive: scala.Boolean): js.Any = js.native
  /** [Method] Returns the first matching key corresponding to the given value
  		* @param object Object
  		* @param value Object The value to find
  		*/
  def getKey(): scala.Unit = js.native
  /** [Method] Returns the first matching key corresponding to the given value
  		* @param object Object
  		* @param value Object The value to find
  		*/
  def getKey(`object`: js.Any): scala.Unit = js.native
  /** [Method] Returns the first matching key corresponding to the given value
  		* @param object Object
  		* @param value Object The value to find
  		*/
  def getKey(`object`: js.Any, value: js.Any): scala.Unit = js.native
  /** [Method] Gets all keys of the given object as an array
  		* @param object Object
  		* @returns String[] An array of keys from the object
  		*/
  def getKeys(): extjsLib.ExtNs.Array = js.native
  /** [Method] Gets all keys of the given object as an array
  		* @param object Object
  		* @returns String[] An array of keys from the object
  		*/
  def getKeys(`object`: js.Any): extjsLib.ExtNs.Array = js.native
  /** [Method] Gets the total number of this object s own properties var size  Ext Object getSize  name  Jacky  loves
  		* @param object Object
  		* @returns Number size
  		*/
  def getSize(): scala.Double = js.native
  /** [Method] Gets the total number of this object s own properties var size  Ext Object getSize  name  Jacky  loves
  		* @param object Object
  		* @returns Number size
  		*/
  def getSize(`object`: js.Any): scala.Double = js.native
  /** [Method] Gets all values of the given object as an array
  		* @param object Object
  		* @returns Array An array of values from the object
  		*/
  def getValues(): extjsLib.ExtNs.Array = js.native
  /** [Method] Gets all values of the given object as an array
  		* @param object Object
  		* @returns Array An array of values from the object
  		*/
  def getValues(`object`: js.Any): extjsLib.ExtNs.Array = js.native
  /** [Method] Checks if there are any properties on this object
  		* @param object Object
  		* @returns Boolean true if there no properties on the object.
  		*/
  def isEmpty(): scala.Boolean = js.native
  /** [Method] Checks if there are any properties on this object
  		* @param object Object
  		* @returns Boolean true if there no properties on the object.
  		*/
  def isEmpty(`object`: js.Any): scala.Boolean = js.native
  /** [Method] Merges any number of objects recursively without referencing them or their children
  		* @param destination Object The object into which all subsequent objects are merged.
  		* @param object Object... Any number of objects to merge into the destination.
  		* @returns Object merged The destination object with all passed objects merged in.
  		*/
  def merge(destination: js.Any, `object`: js.Any*): js.Any = js.native
  /** [Method] Converts a name  value pair to an array of objects with support for nested structures
  		* @param name String
  		* @param value Object/Array
  		* @param recursive Boolean True to traverse object recursively
  		* @returns Array
  		*/
  def toQueryObjects(): extjsLib.ExtNs.Array = js.native
  /** [Method] Converts a name  value pair to an array of objects with support for nested structures
  		* @param name String
  		* @param value Object/Array
  		* @param recursive Boolean True to traverse object recursively
  		* @returns Array
  		*/
  def toQueryObjects(name: java.lang.String): extjsLib.ExtNs.Array = js.native
  /** [Method] Converts a name  value pair to an array of objects with support for nested structures
  		* @param name String
  		* @param value Object/Array
  		* @param recursive Boolean True to traverse object recursively
  		* @returns Array
  		*/
  def toQueryObjects(name: java.lang.String, value: js.Any): extjsLib.ExtNs.Array = js.native
  /** [Method] Converts a name  value pair to an array of objects with support for nested structures
  		* @param name String
  		* @param value Object/Array
  		* @param recursive Boolean True to traverse object recursively
  		* @returns Array
  		*/
  def toQueryObjects(name: java.lang.String, value: js.Any, recursive: scala.Boolean): extjsLib.ExtNs.Array = js.native
  /** [Method] Takes an object and converts it to an encoded query string
  		* @param object Object The object to encode
  		* @param recursive Boolean Whether or not to interpret the object in recursive format. (PHP / Ruby on Rails servers and similar).
  		* @returns String queryString
  		*/
  def toQueryString(): java.lang.String = js.native
  /** [Method] Takes an object and converts it to an encoded query string
  		* @param object Object The object to encode
  		* @param recursive Boolean Whether or not to interpret the object in recursive format. (PHP / Ruby on Rails servers and similar).
  		* @returns String queryString
  		*/
  def toQueryString(`object`: js.Any): java.lang.String = js.native
  /** [Method] Takes an object and converts it to an encoded query string
  		* @param object Object The object to encode
  		* @param recursive Boolean Whether or not to interpret the object in recursive format. (PHP / Ruby on Rails servers and similar).
  		* @returns String queryString
  		*/
  def toQueryString(`object`: js.Any, recursive: scala.Boolean): java.lang.String = js.native
}

