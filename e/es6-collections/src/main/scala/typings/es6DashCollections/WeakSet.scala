package typings.es6DashCollections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeakSet[T] extends js.Object {
  def add(value: T): WeakSet[T]
  def clear(): Unit
  def delete(value: T): Boolean
  def has(value: T): Boolean
}

@JSGlobal("WeakSet")
@js.native
class WeakSetCls[T] () extends WeakSet[T] {
  def this(iterable: ForEachable[T]) = this()
  /* CompleteClass */
  override def add(value: T): WeakSet[T] = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def delete(value: T): Boolean = js.native
  /* CompleteClass */
  override def has(value: T): Boolean = js.native
}

object WeakSet {
  @scala.inline
  def apply[T](add: T => WeakSet[T], clear: () => Unit, delete: T => Boolean, has: T => Boolean): WeakSet[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), has = js.Any.fromFunction1(has))
  
    __obj.asInstanceOf[WeakSet[T]]
  }
}

