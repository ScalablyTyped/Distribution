package typings
package es6DashShimLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeakSet[T] extends js.Object {
  def add(value: T): WeakSet[T]
  def delete(value: T): scala.Boolean
  def has(value: T): scala.Boolean
}

@JSGlobal("WeakSet")
@js.native
class WeakSetCls[T] () extends WeakSet[T] {
  def this(iterable: IterableShim[T]) = this()
  /* CompleteClass */
  override def add(value: T): WeakSet[T] = js.native
  /* CompleteClass */
  override def delete(value: T): scala.Boolean = js.native
  /* CompleteClass */
  override def has(value: T): scala.Boolean = js.native
}

object WeakSet {
  @scala.inline
  def apply[T](add: T => WeakSet[T], delete: T => scala.Boolean, has: T => scala.Boolean): WeakSet[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), delete = js.Any.fromFunction1(delete), has = js.Any.fromFunction1(has))
  
    __obj.asInstanceOf[WeakSet[T]]
  }
}

