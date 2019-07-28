package typings.geojson2osm

import typings.geojson.geojsonMod.Feature
import typings.geojson.geojsonMod.FeatureCollection
import typings.geojson.geojsonMod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geojson2osm", JSImport.Namespace)
@js.native
object geojson2osmMod extends js.Object {
  def geojson2osm(features: Feature[_, GeoJsonProperties]): js.Any = js.native
  def geojson2osm(features: FeatureCollection[_, GeoJsonProperties]): js.Any = js.native
}

