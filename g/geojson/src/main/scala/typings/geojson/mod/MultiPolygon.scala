package typings.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiPolygon
  extends GeoJsonObject
     with Geometry {
  var coordinates: js.Array[js.Array[js.Array[Position]]] = js.native
  @JSName("type")
  var type_MultiPolygon: typings.geojson.geojsonStrings.MultiPolygon = js.native
}

object MultiPolygon {
  @scala.inline
  def apply(
    coordinates: js.Array[js.Array[js.Array[Position]]],
    `type`: typings.geojson.geojsonStrings.MultiPolygon
  ): MultiPolygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPolygon]
  }
  @scala.inline
  implicit class MultiPolygonOps[Self <: MultiPolygon] (val x: Self) extends AnyVal {
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
    def setCoordinatesVarargs(value: js.Array[js.Array[Position]]*): Self = this.set("coordinates", js.Array(value :_*))
    @scala.inline
    def setCoordinates(value: js.Array[js.Array[js.Array[Position]]]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.geojson.geojsonStrings.MultiPolygon): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

