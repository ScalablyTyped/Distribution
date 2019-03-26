package typings
package es6DashShimLib.es6DashShimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-shim", "Map")
@js.native
class Map[K, V] ()
  extends es6DashShimLib.Map[K, V] {
  def this(iterable: es6DashShimLib.IterableShim[js.Tuple2[K, V]]) = this()
}

