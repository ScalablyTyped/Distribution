package typings.dojo.dojo._base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/array.html
  *
  * The Javascript v1.6 array extensions.
  *
  */
@js.native
trait array extends js.Object {
  /**
    *
    */
  def clearCache(): Unit = js.native
  /**
    * Determines whether or not every item in arr satisfies the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.every() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's every skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/every
    *
    * @param arr the array to iterate on. If a string, operates on individual characters.
    * @param callback a function is invoked with three arguments: item, index,and array and returns true if the condition is met.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def every(arr: String, callback: String): Boolean = js.native
  def every(arr: String, callback: String, thisObject: js.Object): Boolean = js.native
  /**
    * Determines whether or not every item in arr satisfies the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.every() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's every skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/every
    *
    * @param arr the array to iterate on. If a string, operates on individual characters.
    * @param callback a function is invoked with three arguments: item, index,and array and returns true if the condition is met.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def every(arr: String, callback: js.Function): Boolean = js.native
  def every(arr: String, callback: js.Function, thisObject: js.Object): Boolean = js.native
  /**
    * Determines whether or not every item in arr satisfies the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.every() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's every skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/every
    *
    * @param arr the array to iterate on. If a string, operates on individual characters.
    * @param callback a function is invoked with three arguments: item, index,and array and returns true if the condition is met.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def every(arr: js.Array[_], callback: String): Boolean = js.native
  def every(arr: js.Array[_], callback: String, thisObject: js.Object): Boolean = js.native
  /**
    * Determines whether or not every item in arr satisfies the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.every() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's every skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/every
    *
    * @param arr the array to iterate on. If a string, operates on individual characters.
    * @param callback a function is invoked with three arguments: item, index,and array and returns true if the condition is met.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def every(arr: js.Array[_], callback: js.Function): Boolean = js.native
  def every(arr: js.Array[_], callback: js.Function, thisObject: js.Object): Boolean = js.native
  /**
    * Returns a new Array with those items from arr that match the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.filter() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's filter skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/filter
    *
    * @param arr the array to iterate over.
    * @param callback a function that is invoked with three arguments (item,index, array). The return of this function is expected tobe a boolean which determines whether the passed-in itemwill be included in the returned array.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def filter(arr: js.Array[_], callback: String): js.Array[_] = js.native
  def filter(arr: js.Array[_], callback: String, thisObject: js.Object): js.Array[_] = js.native
  /**
    * Returns a new Array with those items from arr that match the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.filter() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's filter skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/filter
    *
    * @param arr the array to iterate over.
    * @param callback a function that is invoked with three arguments (item,index, array). The return of this function is expected tobe a boolean which determines whether the passed-in itemwill be included in the returned array.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def filter(arr: js.Array[_], callback: js.Function): js.Array[_] = js.native
  def filter(arr: js.Array[_], callback: js.Function, thisObject: js.Object): js.Array[_] = js.native
  /**
    * for every item in arr, callback is invoked. Return values are ignored.
    * If you want to break out of the loop, consider using array.every() or array.some().
    * forEach does not allow breaking out of the loop over the items in arr.
    * This function corresponds to the JavaScript 1.6 Array.forEach() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's forEach skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/forEach
    *
    * @param arr
    * @param callback
    * @param thisObject               Optional
    */
  def forEach(arr: String, callback: String): Unit = js.native
  def forEach(arr: String, callback: String, thisObject: js.Object): Unit = js.native
  /**
    * for every item in arr, callback is invoked. Return values are ignored.
    * If you want to break out of the loop, consider using array.every() or array.some().
    * forEach does not allow breaking out of the loop over the items in arr.
    * This function corresponds to the JavaScript 1.6 Array.forEach() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's forEach skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/forEach
    *
    * @param arr
    * @param callback
    * @param thisObject               Optional
    */
  def forEach(arr: String, callback: js.Function): Unit = js.native
  def forEach(arr: String, callback: js.Function, thisObject: js.Object): Unit = js.native
  /**
    * for every item in arr, callback is invoked. Return values are ignored.
    * If you want to break out of the loop, consider using array.every() or array.some().
    * forEach does not allow breaking out of the loop over the items in arr.
    * This function corresponds to the JavaScript 1.6 Array.forEach() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's forEach skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/forEach
    *
    * @param arr
    * @param callback
    * @param thisObject               Optional
    */
  def forEach(arr: js.Array[_], callback: String): Unit = js.native
  def forEach(arr: js.Array[_], callback: String, thisObject: js.Object): Unit = js.native
  /**
    * for every item in arr, callback is invoked. Return values are ignored.
    * If you want to break out of the loop, consider using array.every() or array.some().
    * forEach does not allow breaking out of the loop over the items in arr.
    * This function corresponds to the JavaScript 1.6 Array.forEach() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's forEach skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/forEach
    *
    * @param arr
    * @param callback
    * @param thisObject               Optional
    */
  def forEach(arr: js.Array[_], callback: js.Function): Unit = js.native
  def forEach(arr: js.Array[_], callback: js.Function, thisObject: js.Object): Unit = js.native
  /**
    * locates the first index of the provided value in the
    * passed array. If the value is not found, -1 is returned.
    * This method corresponds to the JavaScript 1.6 Array.indexOf method, with two differences:
    *
    * when run over sparse arrays, the Dojo function invokes the callback for every index
    * whereas JavaScript 1.6's indexOf skips the holes in the sparse array.
    * uses equality (==) rather than strict equality (===)
    * For details on this method, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/indexOf
    *
    * @param arr
    * @param value
    * @param fromIndex               Optional
    * @param findLast               OptionalMakes indexOf() work like lastIndexOf().  Used internally; not meant for external usage.
    */
  def indexOf(arr: js.Array[_], value: js.Object): Double = js.native
  def indexOf(arr: js.Array[_], value: js.Object, fromIndex: Double): Double = js.native
  def indexOf(arr: js.Array[_], value: js.Object, fromIndex: Double, findLast: Boolean): Double = js.native
  /**
    * locates the last index of the provided value in the passed
    * array. If the value is not found, -1 is returned.
    * This method corresponds to the JavaScript 1.6 Array.lastIndexOf method, with two differences:
    *
    * when run over sparse arrays, the Dojo function invokes the callback for every index
    * whereas JavaScript 1.6's lasIndexOf skips the holes in the sparse array.
    * uses equality (==) rather than strict equality (===)
    * For details on this method, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/lastIndexOf
    *
    * @param arr
    * @param value
    * @param fromIndex               Optional
    */
  def lastIndexOf(arr: js.Any, value: js.Any): Double = js.native
  def lastIndexOf(arr: js.Any, value: js.Any, fromIndex: Double): Double = js.native
  /**
    * applies callback to each element of arr and returns
    * an Array with the results
    * This function corresponds to the JavaScript 1.6 Array.map() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's map skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/map
    *
    * @param arr the array to iterate on. If a string, operates onindividual characters.
    * @param callback a function is invoked with three arguments, (item, index,array),  and returns a value
    * @param thisObject               Optionalmay be used to scope the call to callback
    * @param Ctr
    */
  def map(arr: String, callback: String): js.Array[_] = js.native
  def map(arr: String, callback: String, thisObject: js.Object): js.Array[_] = js.native
  def map(arr: String, callback: String, thisObject: js.Object, Ctr: js.Any): js.Array[_] = js.native
  /**
    * applies callback to each element of arr and returns
    * an Array with the results
    * This function corresponds to the JavaScript 1.6 Array.map() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's map skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/map
    *
    * @param arr the array to iterate on. If a string, operates onindividual characters.
    * @param callback a function is invoked with three arguments, (item, index,array),  and returns a value
    * @param thisObject               Optionalmay be used to scope the call to callback
    * @param Ctr
    */
  def map(arr: String, callback: js.Function): js.Array[_] = js.native
  def map(arr: String, callback: js.Function, thisObject: js.Object): js.Array[_] = js.native
  def map(arr: String, callback: js.Function, thisObject: js.Object, Ctr: js.Any): js.Array[_] = js.native
  /**
    * applies callback to each element of arr and returns
    * an Array with the results
    * This function corresponds to the JavaScript 1.6 Array.map() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's map skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/map
    *
    * @param arr the array to iterate on. If a string, operates onindividual characters.
    * @param callback a function is invoked with three arguments, (item, index,array),  and returns a value
    * @param thisObject               Optionalmay be used to scope the call to callback
    * @param Ctr
    */
  def map(arr: js.Array[_], callback: String): js.Array[_] = js.native
  def map(arr: js.Array[_], callback: String, thisObject: js.Object): js.Array[_] = js.native
  def map(arr: js.Array[_], callback: String, thisObject: js.Object, Ctr: js.Any): js.Array[_] = js.native
  /**
    * applies callback to each element of arr and returns
    * an Array with the results
    * This function corresponds to the JavaScript 1.6 Array.map() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's map skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/map
    *
    * @param arr the array to iterate on. If a string, operates onindividual characters.
    * @param callback a function is invoked with three arguments, (item, index,array),  and returns a value
    * @param thisObject               Optionalmay be used to scope the call to callback
    * @param Ctr
    */
  def map(arr: js.Array[_], callback: js.Function): js.Array[_] = js.native
  def map(arr: js.Array[_], callback: js.Function, thisObject: js.Object): js.Array[_] = js.native
  def map(arr: js.Array[_], callback: js.Function, thisObject: js.Object, Ctr: js.Any): js.Array[_] = js.native
  /**
    * Determines whether or not any item in arr satisfies the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.some() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's some skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/some
    *
    * @param arr the array to iterate over. If a string, operates on individual characters.
    * @param callback a function is invoked with three arguments: item, index,and array and returns true if the condition is met.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def some(arr: String, callback: String): Boolean = js.native
  def some(arr: String, callback: String, thisObject: js.Object): Boolean = js.native
  /**
    * Determines whether or not any item in arr satisfies the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.some() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's some skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/some
    *
    * @param arr the array to iterate over. If a string, operates on individual characters.
    * @param callback a function is invoked with three arguments: item, index,and array and returns true if the condition is met.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def some(arr: String, callback: js.Function): Boolean = js.native
  def some(arr: String, callback: js.Function, thisObject: js.Object): Boolean = js.native
  /**
    * Determines whether or not any item in arr satisfies the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.some() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's some skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/some
    *
    * @param arr the array to iterate over. If a string, operates on individual characters.
    * @param callback a function is invoked with three arguments: item, index,and array and returns true if the condition is met.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def some(arr: js.Array[_], callback: String): Boolean = js.native
  def some(arr: js.Array[_], callback: String, thisObject: js.Object): Boolean = js.native
  /**
    * Determines whether or not any item in arr satisfies the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.some() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's some skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/some
    *
    * @param arr the array to iterate over. If a string, operates on individual characters.
    * @param callback a function is invoked with three arguments: item, index,and array and returns true if the condition is met.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def some(arr: js.Array[_], callback: js.Function): Boolean = js.native
  def some(arr: js.Array[_], callback: js.Function, thisObject: js.Object): Boolean = js.native
}

