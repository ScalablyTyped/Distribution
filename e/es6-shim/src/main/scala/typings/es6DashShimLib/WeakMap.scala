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
    delete: js.Function1[K, scala.Boolean],
    get: js.Function1[K, js.UndefOr[V]],
    has: js.Function1[K, scala.Boolean],
    set: js.Function2[K, V, WeakMap[K, V]]
  ): WeakMap[K, V] = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, has = has, set = set)
  
    __obj.asInstanceOf[WeakMap[K, V]]
  }
}

