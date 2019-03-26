package typings
package es6DashShimLib.es6DashShimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-shim", "WeakMap")
@js.native
class WeakMap[K /* <: js.Object */, V] ()
  extends es6DashShimLib.WeakMap[K, V] {
  def this(iterable: es6DashShimLib.IterableShim[js.Tuple2[K, V]]) = this()
  /* CompleteClass */
  override def delete(key: K): scala.Boolean = js.native
  /* CompleteClass */
  override def get(key: K): js.UndefOr[V] = js.native
  /* CompleteClass */
  override def has(key: K): scala.Boolean = js.native
  /* CompleteClass */
  override def set(key: K, value: V): es6DashShimLib.WeakMap[K, V] = js.native
}

