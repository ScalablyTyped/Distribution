package typings
package geokdbushLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geokdbush", JSImport.Namespace)
@js.native
object geokdbushMod extends js.Object {
  def around[T](index: kdbushLib.kdbushMod.KDBush[T], longitude: scala.Double, latitude: scala.Double): js.Array[T] = js.native
  def around[T](
    index: kdbushLib.kdbushMod.KDBush[T],
    longitude: scala.Double,
    latitude: scala.Double,
    maxResults: scala.Double
  ): js.Array[T] = js.native
  def around[T](
    index: kdbushLib.kdbushMod.KDBush[T],
    longitude: scala.Double,
    latitude: scala.Double,
    maxResults: scala.Double,
    maxDistance: scala.Double
  ): js.Array[T] = js.native
  def around[T](
    index: kdbushLib.kdbushMod.KDBush[T],
    longitude: scala.Double,
    latitude: scala.Double,
    maxResults: scala.Double,
    maxDistance: scala.Double,
    filterFn: js.Any
  ): js.Array[T] = js.native
  def distance(
    longitude1: scala.Double,
    latitude1: scala.Double,
    longitude2: scala.Double,
    latitude2: scala.Double
  ): scala.Double = js.native
}

