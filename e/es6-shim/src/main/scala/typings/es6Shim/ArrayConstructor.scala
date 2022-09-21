package typings.es6Shim

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayConstructor extends StObject {
  
  /**
    * Creates an array from an array-like object.
    * @param arrayLike An array-like object to convert to an array.
    */
  def from[T](arrayLike: ArrayLike[T]): Array[T] = js.native
  /**
    * Creates an array from an iterable object.
    * @param iterable An iterable object to convert to an array.
    */
  def from[T](iterable: IterableShim[T]): Array[T] = js.native
  /**
    * Creates an array from an array-like object.
    * @param arrayLike An array-like object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = js.native
  def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: Any): Array[U] = js.native
  /**
    * Creates an array from an iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  def from[T, U](iterable: IterableShim[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = js.native
  def from[T, U](iterable: IterableShim[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: Any): Array[U] = js.native
  
  /**
    * Returns a new array from a set of elements.
    * @param items A set of elements to include in the new array object.
    */
  def of[T](items: T*): Array[T] = js.native
}
