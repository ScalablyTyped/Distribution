package typings
package es6DashShimLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeakMap[K /* <: js.Object */, V] extends js.Object {
  def delete(key: K): scala.Boolean
  def get(key: K): js.UndefOr[V]
  def has(key: K): scala.Boolean
  def set(key: K, value: V): WeakMap[K, V]
}

object WeakMap {
  @scala.inline
  def apply[K /* <: js.Object */, V](
    delete: K => scala.Boolean,
    get: K => js.UndefOr[V],
    has: K => scala.Boolean,
    set: (K, V) => WeakMap[K, V]
  ): WeakMap[K, V] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[WeakMap[K, V]]
  }
}

