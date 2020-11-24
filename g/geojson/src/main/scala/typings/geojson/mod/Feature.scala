package typings.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Feature[G /* <: Geometry | Null */, P] extends GeoJsonObject {
  
  /**
    * The feature's geometry
    */
  var geometry: G = js.native
  
  /**
    * A value that uniquely identifies this feature in a
    * https://tools.ietf.org/html/rfc7946#section-3.2.
    */
  var id: js.UndefOr[String | Double] = js.native
  
  /**
    * Properties associated with this feature.
    */
  var properties: P = js.native
  
  @JSName("type")
  var type_Feature: typings.geojson.geojsonStrings.Feature = js.native
}
object Feature {
  
  @scala.inline
  def apply[G /* <: Geometry | Null */, P](geometry: G, properties: P, `type`: typings.geojson.geojsonStrings.Feature): Feature[G, P] = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature[G, P]]
  }
  
  @scala.inline
  implicit class FeatureOps[Self <: Feature[_, _], G /* <: Geometry | Null */, P] (val x: Self with (Feature[G, P])) extends AnyVal {
    
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
    def setGeometry(value: G): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: P): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.geojson.geojsonStrings.Feature): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
