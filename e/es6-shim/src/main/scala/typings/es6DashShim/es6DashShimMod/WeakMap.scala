package typings.es6DashShim.es6DashShimMod

import typings.es6DashShim.IterableShim
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-shim", "WeakMap")
@js.native
class WeakMap[K /* <: js.Object */, V] ()
  extends typings.es6DashShim.WeakMap[K, V] {
  def this(iterable: IterableShim[js.Tuple2[K, V]]) = this()
  /* CompleteClass */
  override def delete(key: K): Boolean = js.native
  /* CompleteClass */
  override def get(key: K): js.UndefOr[V] = js.native
  /* CompleteClass */
  override def has(key: K): Boolean = js.native
  /* CompleteClass */
  override def set(key: K, value: V): typings.es6DashShim.WeakMap[K, V] = js.native
}

