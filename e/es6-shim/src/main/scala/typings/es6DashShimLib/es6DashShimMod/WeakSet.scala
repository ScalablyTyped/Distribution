package typings
package es6DashShimLib.es6DashShimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-shim", "WeakSet")
@js.native
class WeakSet[T] ()
  extends es6DashShimLib.WeakSet[T] {
  def this(iterable: es6DashShimLib.IterableShim[T]) = this()
  /* CompleteClass */
  override def add(value: T): es6DashShimLib.WeakSet[T] = js.native
  /* CompleteClass */
  override def delete(value: T): scala.Boolean = js.native
  /* CompleteClass */
  override def has(value: T): scala.Boolean = js.native
}

