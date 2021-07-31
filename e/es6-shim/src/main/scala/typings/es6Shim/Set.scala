package typings.es6Shim

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Set[T] extends StObject {
  
  def `_es6-shim iterator_`(): IterableIteratorShim[T] = js.native
  
  def add(value: T): Set[T] = js.native
  
  def clear(): Unit = js.native
  
  def delete(value: T): Boolean = js.native
  
  def entries(): IterableIteratorShim[js.Tuple2[T, T]] = js.native
  
  def forEach(callbackfn: js.Function3[/* value */ T, /* index */ T, /* set */ Set[T], Unit]): Unit = js.native
  def forEach(callbackfn: js.Function3[/* value */ T, /* index */ T, /* set */ Set[T], Unit], thisArg: js.Any): Unit = js.native
  
  def has(value: T): Boolean = js.native
  
  def keys(): IterableIteratorShim[T] = js.native
  
  var size: Double = js.native
  
  def values(): IterableIteratorShim[T] = js.native
}
