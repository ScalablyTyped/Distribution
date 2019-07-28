package typings.geokdbush

import typings.kdbush.kdbushMod.KDBush
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geokdbush", JSImport.Namespace)
@js.native
object geokdbushMod extends js.Object {
  def around[T](index: KDBush[T], longitude: Double, latitude: Double): js.Array[T] = js.native
  def around[T](index: KDBush[T], longitude: Double, latitude: Double, maxResults: Double): js.Array[T] = js.native
  def around[T](index: KDBush[T], longitude: Double, latitude: Double, maxResults: Double, maxDistance: Double): js.Array[T] = js.native
  def around[T](
    index: KDBush[T],
    longitude: Double,
    latitude: Double,
    maxResults: Double,
    maxDistance: Double,
    filterFn: js.Any
  ): js.Array[T] = js.native
  def distance(longitude1: Double, latitude1: Double, longitude2: Double, latitude2: Double): Double = js.native
}

