package typings.es6DashShim.es6DashShimMod

import typings.es6DashShim.IterableShim
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-shim", "Map")
@js.native
class Map[K, V] ()
  extends typings.es6DashShim.Map[K, V] {
  def this(iterable: IterableShim[js.Tuple2[K, V]]) = this()
}

