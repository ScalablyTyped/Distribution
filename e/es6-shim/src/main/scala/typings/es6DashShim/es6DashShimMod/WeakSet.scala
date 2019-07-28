package typings.es6DashShim.es6DashShimMod

import typings.es6DashShim.IterableShim
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-shim", "WeakSet")
@js.native
class WeakSet[T] ()
  extends typings.es6DashShim.WeakSet[T] {
  def this(iterable: IterableShim[T]) = this()
  /* CompleteClass */
  override def add(value: T): typings.es6DashShim.WeakSet[T] = js.native
  /* CompleteClass */
  override def delete(value: T): Boolean = js.native
  /* CompleteClass */
  override def has(value: T): Boolean = js.native
}

