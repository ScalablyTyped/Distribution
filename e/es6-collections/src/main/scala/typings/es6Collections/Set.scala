package typings.es6Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Set[T] extends js.Object {
  
  def add(value: T): Set[T] = js.native
  
  def clear(): Unit = js.native
  
  def delete(value: T): Boolean = js.native
  
  def entries(): Iterator[js.Tuple2[T, T]] = js.native
  
  def forEach(callbackfn: js.Function3[/* value */ T, /* index */ T, /* set */ Set[T], Unit]): Unit = js.native
  def forEach(callbackfn: js.Function3[/* value */ T, /* index */ T, /* set */ Set[T], Unit], thisArg: js.Any): Unit = js.native
  
  def has(value: T): Boolean = js.native
  
  def keys(): Iterator[T] = js.native
  
  var size: Double = js.native
  
  def values(): Iterator[T] = js.native
}
