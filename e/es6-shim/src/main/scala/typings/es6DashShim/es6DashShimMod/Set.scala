package typings.es6DashShim.es6DashShimMod

import typings.es6DashShim.IterableShim
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-shim", "Set")
@js.native
class Set[T] ()
  extends typings.es6DashShim.Set[T] {
  def this(iterable: IterableShim[T]) = this()
}

