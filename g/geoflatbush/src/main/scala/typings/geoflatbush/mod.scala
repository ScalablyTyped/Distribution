package typings.geoflatbush

import typings.flatbush.mod.Flatbush
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geoflatbush", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def around(index: Flatbush, longitude: Double, latitude: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("around")(index.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def around(index: Flatbush, longitude: Double, latitude: Double, maxResults: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("around")(index.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def around(index: Flatbush, longitude: Double, latitude: Double, maxResults: Double, maxDistance: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("around")(index.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any], maxDistance.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def around(
    index: Flatbush,
    longitude: Double,
    latitude: Double,
    maxResults: Double,
    maxDistance: Double,
    filter: js.Function1[/* index */ Double, Boolean]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("around")(index.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any], maxDistance.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def around(
    index: Flatbush,
    longitude: Double,
    latitude: Double,
    maxResults: Double,
    maxDistance: Unit,
    filter: js.Function1[/* index */ Double, Boolean]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("around")(index.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any], maxDistance.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def around(index: Flatbush, longitude: Double, latitude: Double, maxResults: Unit, maxDistance: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("around")(index.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any], maxDistance.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def around(
    index: Flatbush,
    longitude: Double,
    latitude: Double,
    maxResults: Unit,
    maxDistance: Double,
    filter: js.Function1[/* index */ Double, Boolean]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("around")(index.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any], maxDistance.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def around(
    index: Flatbush,
    longitude: Double,
    latitude: Double,
    maxResults: Unit,
    maxDistance: Unit,
    filter: js.Function1[/* index */ Double, Boolean]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("around")(index.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any], maxDistance.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
