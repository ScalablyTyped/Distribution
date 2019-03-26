package typings
package es6DashShimLib.es6DashShimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-shim", "Set")
@js.native
class Set[T] ()
  extends es6DashShimLib.Set[T] {
  def this(iterable: es6DashShimLib.IterableShim[T]) = this()
}

