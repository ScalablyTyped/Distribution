package typings.es6DashShim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

