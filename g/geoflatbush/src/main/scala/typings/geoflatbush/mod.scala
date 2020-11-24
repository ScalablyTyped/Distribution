package typings.geoflatbush

import typings.flatbush.mod.Flatbush
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("geoflatbush", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def around(index: Flatbush, longitude: Double, latitude: Double): js.Array[Double] = js.native
  def around(
    index: Flatbush,
    longitude: Double,
    latitude: Double,
    maxResults: js.UndefOr[scala.Nothing],
    maxDistance: js.UndefOr[scala.Nothing],
    filter: js.Function1[/* index */ Double, Boolean]
  ): js.Array[Double] = js.native
  def around(
    index: Flatbush,
    longitude: Double,
    latitude: Double,
    maxResults: js.UndefOr[scala.Nothing],
    maxDistance: Double
  ): js.Array[Double] = js.native
  def around(
    index: Flatbush,
    longitude: Double,
    latitude: Double,
    maxResults: js.UndefOr[scala.Nothing],
    maxDistance: Double,
    filter: js.Function1[/* index */ Double, Boolean]
  ): js.Array[Double] = js.native
  def around(index: Flatbush, longitude: Double, latitude: Double, maxResults: Double): js.Array[Double] = js.native
  def around(
    index: Flatbush,
    longitude: Double,
    latitude: Double,
    maxResults: Double,
    maxDistance: js.UndefOr[scala.Nothing],
    filter: js.Function1[/* index */ Double, Boolean]
  ): js.Array[Double] = js.native
  def around(index: Flatbush, longitude: Double, latitude: Double, maxResults: Double, maxDistance: Double): js.Array[Double] = js.native
  def around(
    index: Flatbush,
    longitude: Double,
    latitude: Double,
    maxResults: Double,
    maxDistance: Double,
    filter: js.Function1[/* index */ Double, Boolean]
  ): js.Array[Double] = js.native
}
