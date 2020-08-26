package typings.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureCollection[G /* <: Geometry | Null */, P] extends GeoJsonObject {
  var features: js.Array[Feature[G, P]] = js.native
  @JSName("type")
  var type_FeatureCollection: typings.geojson.geojsonStrings.FeatureCollection = js.native
}

object FeatureCollection {
  @scala.inline
  def apply[/* <: typings.geojson.mod.Geometry | scala.Null */ G, P](features: js.Array[Feature[G, P]], `type`: typings.geojson.geojsonStrings.FeatureCollection): FeatureCollection[G, P] = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureCollection[G, P]]
  }
  @scala.inline
  implicit class FeatureCollectionOps[Self <: FeatureCollection[_, _], /* <: typings.geojson.mod.Geometry | scala.Null */ G, P] (val x: Self with (FeatureCollection[G, P])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFeaturesVarargs(value: (Feature[G, P])*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[Feature[G, P]]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.geojson.geojsonStrings.FeatureCollection): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

