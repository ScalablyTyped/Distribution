package typings.geojson2osm

import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("geojson2osm", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def geojson2osm(features: Feature[_, GeoJsonProperties]): js.Any = js.native
  def geojson2osm(features: FeatureCollection[_, GeoJsonProperties]): js.Any = js.native
}
