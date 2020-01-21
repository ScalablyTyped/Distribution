package typings.es6Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

