package typings.extjs.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Array")
@js.native
open class Array ()
  extends StObject
     with typings.extjs.Ext.Array
/* static members */
object Array {
  
  @JSGlobal("Ext.Array")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Filter through an array and remove empty item as defined in Ext isEmpty See filter
    * @param array Array
    * @returns Array results
    */
  inline def clean(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("clean")().asInstanceOf[typings.extjs.Ext.Array]
  inline def clean(array: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("clean")(array.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  
  inline def clone(array: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(array.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Checks whether or not the given array contains the specified item
    * @param array Array The array to check
    * @param item Object The item to look for
    * @returns Boolean True if the array contains the item, false otherwise
    */
  inline def contains(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")().asInstanceOf[Boolean]
  inline def contains(array: Unit, item: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def contains(array: typings.extjs.Ext.Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def contains(array: typings.extjs.Ext.Array, item: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Perform a set difference A B by subtracting all items in array B from array A
    * @param arrayA Array
    * @param arrayB Array
    * @returns Array difference
    */
  inline def difference(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")().asInstanceOf[typings.extjs.Ext.Array]
  inline def difference(arrayA: Unit, arrayB: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(arrayA.asInstanceOf[js.Any], arrayB.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def difference(arrayA: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")(arrayA.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def difference(arrayA: typings.extjs.Ext.Array, arrayB: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(arrayA.asInstanceOf[js.Any], arrayB.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Iterates an array or an iterable value and invoke the given callback function for each item
    * @param iterable Array/NodeList/Object The value to be iterated. If this argument is not iterable, the callback function is called once.
    * @param fn Function The callback function. If it returns false, the iteration stops and this method returns the current index.
    * @param scope Object The scope (this reference) in which the specified function is executed.
    * @param reverse Boolean Reverse the iteration order (loop from the end to the beginning) Defaults false
    * @returns Boolean See description for the fn parameter.
    */
  inline def each(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("each")().asInstanceOf[Boolean]
  inline def each(iterable: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def each(iterable: Any, fn: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Any, fn: Any, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Any, fn: Any, scope: Any, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Any, fn: Any, scope: Unit, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Any, fn: Unit, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Any, fn: Unit, scope: Any, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Any, fn: Unit, scope: Unit, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Unit, fn: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Unit, fn: Any, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Unit, fn: Any, scope: Any, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Unit, fn: Any, scope: Unit, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Unit, fn: Unit, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Unit, fn: Unit, scope: Any, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def each(iterable: Unit, fn: Unit, scope: Unit, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Shallow compares the contents of 2 arrays using strict equality
    * @param array1 Array
    * @param array2 Array
    * @returns Boolean true if the arrays are equal.
    */
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(array1: Unit, array2: typings.extjs.Ext.Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(array1: typings.extjs.Ext.Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(array1.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(array1: typings.extjs.Ext.Array, array2: typings.extjs.Ext.Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Removes items from an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param removeCount Number The number of items to remove at index.
    * @returns Array The array passed.
    */
  inline def erase(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("erase")().asInstanceOf[typings.extjs.Ext.Array]
  inline def erase(array: Unit, index: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def erase(array: Unit, index: Double, removeCount: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def erase(array: Unit, index: Unit, removeCount: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def erase(array: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def erase(array: typings.extjs.Ext.Array, index: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def erase(array: typings.extjs.Ext.Array, index: Double, removeCount: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def erase(array: typings.extjs.Ext.Array, index: Unit, removeCount: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Executes the specified function for each array element until the function returns a falsy value
    * @param array Array
    * @param fn Function Callback function for each item
    * @param scope Object Callback function scope
    * @returns Boolean True if no false value is returned by the callback function.
    */
  inline def every(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")().asInstanceOf[Boolean]
  inline def every(array: Unit, fn: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def every(array: Unit, fn: Any, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def every(array: Unit, fn: Unit, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def every(array: typings.extjs.Ext.Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def every(array: typings.extjs.Ext.Array, fn: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def every(array: typings.extjs.Ext.Array, fn: Any, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def every(array: typings.extjs.Ext.Array, fn: Unit, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Creates a new array with all of the elements of this array for which the provided filtering function returns true
    * @param array Array
    * @param fn Function Callback function for each item
    * @param scope Object Callback function scope
    * @returns Array results
    */
  inline def filter(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")().asInstanceOf[typings.extjs.Ext.Array]
  inline def filter(array: Unit, fn: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def filter(array: Unit, fn: Any, scope: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def filter(array: Unit, fn: Unit, scope: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def filter(array: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def filter(array: typings.extjs.Ext.Array, fn: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def filter(array: typings.extjs.Ext.Array, fn: Any, scope: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def filter(array: typings.extjs.Ext.Array, fn: Unit, scope: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Returns the first item in the array which elicits a true return value from the passed selection function
    * @param array Array The array to search
    * @param fn Function The selection function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the array
    * @returns Object The first item in the array which returned true from the selection function, or null if none was found.
    */
  inline def findBy(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findBy")().asInstanceOf[Any]
  inline def findBy(array: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def findBy(array: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def findBy(array: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def findBy(array: typings.extjs.Ext.Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(array.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def findBy(array: typings.extjs.Ext.Array, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def findBy(array: typings.extjs.Ext.Array, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def findBy(array: typings.extjs.Ext.Array, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Recursively flattens into 1 d Array
    * @param array Array The array to flatten
    * @returns Array The 1-d array.
    */
  inline def flatten(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[typings.extjs.Ext.Array]
  inline def flatten(array: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Iterates an array and invoke the given callback function for each item
    * @param array Array The array to iterate
    * @param fn Function The callback function.
    * @param scope Object The execution scope (this) in which the specified function is executed.
    */
  inline def forEach(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")().asInstanceOf[Unit]
  inline def forEach(array: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach(array: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach(array: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach(array: typings.extjs.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def forEach(array: typings.extjs.Ext.Array, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach(array: typings.extjs.Ext.Array, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach(array: typings.extjs.Ext.Array, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Converts a value to an array if it s not already an array returns An empty array if given value is undefined or n
    * @param value Object The value to convert to an array if it's not already is an array
    * @param newReference Boolean True to clone the given array and return a new reference if necessary, defaults to false
    * @returns Array array
    */
  inline def from(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[typings.extjs.Ext.Array]
  inline def from(value: Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def from(value: Any, newReference: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], newReference.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def from(value: Unit, newReference: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], newReference.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Push an item into the array only if the array doesn t contain it yet
    * @param array Array The array
    * @param item Object The item to include
    */
  inline def include(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("include")().asInstanceOf[Unit]
  inline def include(array: Unit, item: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("include")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def include(array: typings.extjs.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("include")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def include(array: typings.extjs.Ext.Array, item: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("include")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Get the index of the provided item in the given array a supplement for the missing arrayPrototype indexOf in Interne
    * @param array Array The array to check
    * @param item Object The item to look for
    * @param from Number The index at which to begin the search
    * @returns Number The index of item in the array (or -1 if it is not found)
    */
  inline def indexOf(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")().asInstanceOf[Double]
  inline def indexOf(array: Unit, item: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(array: Unit, item: Any, from: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(array: Unit, item: Unit, from: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(array: typings.extjs.Ext.Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def indexOf(array: typings.extjs.Ext.Array, item: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(array: typings.extjs.Ext.Array, item: Any, from: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(array: typings.extjs.Ext.Array, item: Unit, from: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] Inserts items in to an array
    * @param array Array The Array in which to insert.
    * @param index Number The index in the array at which to operate.
    * @param items Array The array of items to insert at index.
    * @returns Array The array passed.
    */
  inline def insert(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")().asInstanceOf[typings.extjs.Ext.Array]
  inline def insert(array: Unit, index: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def insert(array: Unit, index: Double, items: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def insert(array: Unit, index: Unit, items: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def insert(array: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def insert(array: typings.extjs.Ext.Array, index: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def insert(array: typings.extjs.Ext.Array, index: Double, items: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def insert(array: typings.extjs.Ext.Array, index: Unit, items: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Merge multiple arrays into one with unique items that exist in all of the arrays
    * @param array1 Array
    * @param array2 Array
    * @param etc Array
    * @returns Array intersect
    */
  inline def intersect(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")().asInstanceOf[typings.extjs.Ext.Array]
  inline def intersect(array1: Unit, array2: Unit, etc: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def intersect(array1: Unit, array2: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def intersect(array1: Unit, array2: typings.extjs.Ext.Array, etc: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def intersect(array1: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def intersect(array1: typings.extjs.Ext.Array, array2: Unit, etc: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def intersect(array1: typings.extjs.Ext.Array, array2: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def intersect(array1: typings.extjs.Ext.Array, array2: typings.extjs.Ext.Array, etc: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Creates a new array with the results of calling a provided function on every element in this array
    * @param array Array
    * @param fn Function Callback function for each item
    * @param scope Object Callback function scope
    * @returns Array results
    */
  inline def map(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("map")().asInstanceOf[typings.extjs.Ext.Array]
  inline def map(array: Unit, fn: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def map(array: Unit, fn: Any, scope: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def map(array: Unit, fn: Unit, scope: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def map(array: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def map(array: typings.extjs.Ext.Array, fn: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def map(array: typings.extjs.Ext.Array, fn: Any, scope: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def map(array: typings.extjs.Ext.Array, fn: Unit, scope: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Returns the maximum value in the Array
    * @param array Array/NodeList The Array from which to select the maximum value.
    * @param comparisonFn Function a function to perform the comparision which determines maximization. If omitted the ">" operator will be used. Note: gt = 1; eq = 0; lt = -1
    * @returns Object maxValue The maximum value
    */
  inline def max(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[Any]
  inline def max(array: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(array.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def max(array: Any, comparisonFn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(array.asInstanceOf[js.Any], comparisonFn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def max(array: Unit, comparisonFn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(array.asInstanceOf[js.Any], comparisonFn.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Calculates the mean of all items in the array
    * @param array Array The Array to calculate the mean value of.
    * @returns Number The mean.
    */
  inline def mean(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")().asInstanceOf[Double]
  inline def mean(array: typings.extjs.Ext.Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Merge multiple arrays into one with unique items
    * @param array1 Array
    * @param array2 Array
    * @param etc Array
    * @returns Array merged
    */
  inline def merge(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")().asInstanceOf[typings.extjs.Ext.Array]
  inline def merge(array1: Unit, array2: Unit, etc: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def merge(array1: Unit, array2: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def merge(array1: Unit, array2: typings.extjs.Ext.Array, etc: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def merge(array1: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def merge(array1: typings.extjs.Ext.Array, array2: Unit, etc: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def merge(array1: typings.extjs.Ext.Array, array2: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def merge(array1: typings.extjs.Ext.Array, array2: typings.extjs.Ext.Array, etc: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Returns the minimum value in the Array
    * @param array Array/NodeList The Array from which to select the minimum value.
    * @param comparisonFn Function a function to perform the comparision which determines minimization. If omitted the "&lt;" operator will be used. Note: gt = 1; eq = 0; lt = -1
    * @returns Object minValue The minimum value
    */
  inline def min(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[Any]
  inline def min(array: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(array.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def min(array: Any, comparisonFn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(array.asInstanceOf[js.Any], comparisonFn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def min(array: Unit, comparisonFn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(array.asInstanceOf[js.Any], comparisonFn.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Plucks the value of a property from each item in the Array
    * @param array Array/NodeList The Array of items to pluck the value from.
    * @param propertyName String The property name to pluck from each element.
    * @returns Array The value from each item in the Array.
    */
  inline def pluck(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("pluck")().asInstanceOf[typings.extjs.Ext.Array]
  inline def pluck(array: Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(array.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def pluck(array: Any, propertyName: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(array.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def pluck(array: Unit, propertyName: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(array.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Pushes new items onto the end of an Array
    * @param target Array The Array onto which to push new items
    * @param elements Object... The elements to add to the array. Each parameter may be an Array, in which case all the elements of that Array will be pushed into the end of the destination Array.
    * @returns Array An array containing all the new items push onto the end.
    */
  inline def push(target: typings.extjs.Ext.Array, elements: Any*): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(List(target.asInstanceOf[js.Any]).`++`(elements.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Removes the specified item from the array if it exists
    * @param array Array The array
    * @param item Object The item to remove
    * @returns Array The passed array itself
    */
  inline def remove(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[typings.extjs.Ext.Array]
  inline def remove(array: Unit, item: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def remove(array: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(array.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def remove(array: typings.extjs.Ext.Array, item: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Replaces items in an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param removeCount Number The number of items to remove at index (can be 0).
    * @param insert Array An array of items to insert at index.
    * @returns Array The array passed.
    */
  inline def replace(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")().asInstanceOf[typings.extjs.Ext.Array]
  inline def replace(array: Unit, index: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def replace(array: Unit, index: Double, removeCount: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def replace(array: Unit, index: Double, removeCount: Double, insert: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def replace(array: Unit, index: Double, removeCount: Unit, insert: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def replace(array: Unit, index: Unit, removeCount: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def replace(array: Unit, index: Unit, removeCount: Double, insert: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def replace(array: Unit, index: Unit, removeCount: Unit, insert: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def replace(array: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def replace(array: typings.extjs.Ext.Array, index: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def replace(array: typings.extjs.Ext.Array, index: Double, removeCount: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def replace(
    array: typings.extjs.Ext.Array,
    index: Double,
    removeCount: Double,
    insert: typings.extjs.Ext.Array
  ): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def replace(array: typings.extjs.Ext.Array, index: Double, removeCount: Unit, insert: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def replace(array: typings.extjs.Ext.Array, index: Unit, removeCount: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def replace(array: typings.extjs.Ext.Array, index: Unit, removeCount: Double, insert: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def replace(array: typings.extjs.Ext.Array, index: Unit, removeCount: Unit, insert: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Returns a shallow copy of a part of an array
    * @param array Array The array (or arguments object).
    * @param begin Number The index at which to begin. Negative values are offsets from the end of the array.
    * @param end Number The index at which to end. The copied items do not include end. Negative values are offsets from the end of the array. If end is omitted, all items up to the end of the array are copied.
    * @returns Array The copied piece of the array.
    */
  inline def slice(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[typings.extjs.Ext.Array]
  inline def slice(array: Unit, begin: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def slice(array: Unit, begin: Double, end: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def slice(array: Unit, begin: Unit, end: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def slice(array: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def slice(array: typings.extjs.Ext.Array, begin: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def slice(array: typings.extjs.Ext.Array, begin: Double, end: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def slice(array: typings.extjs.Ext.Array, begin: Unit, end: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Executes the specified function for each array element until the function returns a truthy value
    * @param array Array
    * @param fn Function Callback function for each item
    * @param scope Object Callback function scope
    * @returns Boolean True if the callback function returns a truthy value.
    */
  inline def some(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")().asInstanceOf[Boolean]
  inline def some(array: Unit, fn: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def some(array: Unit, fn: Any, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def some(array: Unit, fn: Unit, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def some(array: typings.extjs.Ext.Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def some(array: typings.extjs.Ext.Array, fn: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def some(array: typings.extjs.Ext.Array, fn: Any, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def some(array: typings.extjs.Ext.Array, fn: Unit, scope: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Sorts the elements of an Array
    * @param array Array The array to sort.
    * @param sortFn Function The comparison function.
    * @returns Array The sorted array.
    */
  inline def sort(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[typings.extjs.Ext.Array]
  inline def sort(array: Unit, sortFn: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], sortFn.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def sort(array: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def sort(array: typings.extjs.Ext.Array, sortFn: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], sortFn.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Replaces items in an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param removeCount Number The number of items to remove at index (can be 0).
    * @param elements Object... The elements to add to the array. If you don't specify any elements, splice simply removes elements from the array.
    * @returns Array An array containing the removed items.
    */
  inline def splice(array: typings.extjs.Ext.Array, index: Double, removeCount: Double, elements: Any*): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")((List(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).`++`(elements.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Calculates the sum of all items in the given array
    * @param array Array The Array to calculate the sum value of.
    * @returns Number The sum.
    */
  inline def sum(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")().asInstanceOf[Double]
  inline def sum(array: typings.extjs.Ext.Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Converts any iterable numeric indices and a length property into a true array
    * @param iterable Object the iterable object to be turned into a true Array.
    * @param start Number a zero-based index that specifies the start of extraction. Defaults to 0
    * @param end Number a 1-based index that specifies the end of extraction. Defaults to the last index of the iterable value
    * @returns Array array
    */
  inline def toArray(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[typings.extjs.Ext.Array]
  inline def toArray(iterable: Any): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def toArray(iterable: Any, start: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def toArray(iterable: Any, start: Double, end: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def toArray(iterable: Any, start: Unit, end: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def toArray(iterable: Unit, start: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def toArray(iterable: Unit, start: Double, end: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def toArray(iterable: Unit, start: Unit, end: Double): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Creates a map object keyed by the elements of the given array
    * @param array Array The Array to create the map from.
    * @param getKey String/Function Name of the object property to use as a key or a function to extract the key.
    * @param scope Object Value of this inside callback.
    * @returns Object The resulting map.
    */
  inline def toMap(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toMap")().asInstanceOf[Any]
  inline def toMap(array: Unit, getKey: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toMap")(array.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toMap(array: Unit, getKey: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toMap")(array.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toMap(array: Unit, getKey: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toMap")(array.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toMap(array: typings.extjs.Ext.Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toMap")(array.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def toMap(array: typings.extjs.Ext.Array, getKey: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toMap")(array.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toMap(array: typings.extjs.Ext.Array, getKey: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toMap")(array.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toMap(array: typings.extjs.Ext.Array, getKey: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toMap")(array.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Creates a map object keyed by a property of elements of the given array
    * @param array Array The Array to create the map from.
    * @param getKey String/Function Name of the object property to use as a key or a function to extract the key.
    * @param scope Object Value of this inside callback.
    * @returns Object The resulting map.
    */
  inline def toValueMap(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toValueMap")().asInstanceOf[Any]
  inline def toValueMap(array: Unit, getKey: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toValueMap")(array.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toValueMap(array: Unit, getKey: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toValueMap")(array.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toValueMap(array: Unit, getKey: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toValueMap")(array.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toValueMap(array: typings.extjs.Ext.Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toValueMap")(array.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def toValueMap(array: typings.extjs.Ext.Array, getKey: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toValueMap")(array.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toValueMap(array: typings.extjs.Ext.Array, getKey: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toValueMap")(array.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toValueMap(array: typings.extjs.Ext.Array, getKey: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toValueMap")(array.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Merge multiple arrays into one with unique items
    * @param array1 Array
    * @param array2 Array
    * @param etc Array
    * @returns Array merged
    */
  inline def union(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("union")().asInstanceOf[typings.extjs.Ext.Array]
  inline def union(array1: Unit, array2: Unit, etc: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def union(array1: Unit, array2: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def union(array1: Unit, array2: typings.extjs.Ext.Array, etc: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def union(array1: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def union(array1: typings.extjs.Ext.Array, array2: Unit, etc: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def union(array1: typings.extjs.Ext.Array, array2: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def union(array1: typings.extjs.Ext.Array, array2: typings.extjs.Ext.Array, etc: typings.extjs.Ext.Array): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Returns a new array with unique items
    * @param array Array
    * @returns Array results
    */
  inline def unique(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")().asInstanceOf[typings.extjs.Ext.Array]
  inline def unique(array: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(array.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
}
