package typings
package es6DashCollectionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeakSet[T] extends js.Object {
  def add(value: T): WeakSet[T]
  def clear(): scala.Unit
  def delete(value: T): scala.Boolean
  def has(value: T): scala.Boolean
}

object WeakSet {
  @scala.inline
  def apply[T](
    add: js.Function1[T, WeakSet[T]],
    clear: js.Function0[scala.Unit],
    delete: js.Function1[T, scala.Boolean],
    has: js.Function1[T, scala.Boolean]
  ): WeakSet[T] = {
    val __obj = js.Dynamic.literal(add = add, clear = clear, delete = delete, has = has)
  
    __obj.asInstanceOf[WeakSet[T]]
  }
}

