package typings.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeometryCollection
  extends GeoJsonObject
     with Geometry {
  
  var geometries: js.Array[Geometry] = js.native
  
  @JSName("type")
  var type_GeometryCollection: typings.geojson.geojsonStrings.GeometryCollection = js.native
}
object GeometryCollection {
  
  @scala.inline
  def apply(geometries: js.Array[Geometry], `type`: typings.geojson.geojsonStrings.GeometryCollection): GeometryCollection = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryCollection]
  }
  
  @scala.inline
  implicit class GeometryCollectionOps[Self <: GeometryCollection] (val x: Self) extends AnyVal {
    
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
    def setGeometriesVarargs(value: Geometry*): Self = this.set("geometries", js.Array(value :_*))
    
    @scala.inline
    def setGeometries(value: js.Array[Geometry]): Self = this.set("geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.geojson.geojsonStrings.GeometryCollection): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
