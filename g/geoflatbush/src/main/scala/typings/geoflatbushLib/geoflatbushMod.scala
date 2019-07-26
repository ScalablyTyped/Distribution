package typings
package geoflatbushLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geoflatbush", JSImport.Namespace)
@js.native
object geoflatbushMod extends js.Object {
  def around(index: flatbushLib.flatbushMod.Flatbush, longitude: scala.Double, latitude: scala.Double): js.Array[scala.Double] = js.native
  def around(
    index: flatbushLib.flatbushMod.Flatbush,
    longitude: scala.Double,
    latitude: scala.Double,
    maxResults: scala.Double
  ): js.Array[scala.Double] = js.native
  def around(
    index: flatbushLib.flatbushMod.Flatbush,
    longitude: scala.Double,
    latitude: scala.Double,
    maxResults: scala.Double,
    maxDistance: scala.Double
  ): js.Array[scala.Double] = js.native
  def around(
    index: flatbushLib.flatbushMod.Flatbush,
    longitude: scala.Double,
    latitude: scala.Double,
    maxResults: scala.Double,
    maxDistance: scala.Double,
    filter: js.Function1[/* index */ scala.Double, scala.Boolean]
  ): js.Array[scala.Double] = js.native
}

