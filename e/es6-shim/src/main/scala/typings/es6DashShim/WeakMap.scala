package typings.es6DashShim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeakMap[K /* <: js.Object */, V] extends js.Object {
  def delete(key: K): Boolean
  def get(key: K): js.UndefOr[V]
  def has(key: K): Boolean
  def set(key: K, value: V): WeakMap[K, V]
}

@JSGlobal("WeakMap")
@js.native
class WeakMapCls[K /* <: js.Object */, V] () extends WeakMap[K, V] {
  def this(iterable: IterableShim[js.Tuple2[K, V]]) = this()
  /* CompleteClass */
  override def delete(key: K): Boolean = js.native
  /* CompleteClass */
  override def get(key: K): js.UndefOr[V] = js.native
  /* CompleteClass */
  override def has(key: K): Boolean = js.native
  /* CompleteClass */
  override def set(key: K, value: V): WeakMap[K, V] = js.native
}

object WeakMap {
  @scala.inline
  def apply[K /* <: js.Object */, V](delete: K => Boolean, get: K => js.UndefOr[V], has: K => Boolean, set: (K, V) => WeakMap[K, V]): WeakMap[K, V] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[WeakMap[K, V]]
  }
}

