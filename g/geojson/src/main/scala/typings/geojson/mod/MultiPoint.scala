package typings.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiPoint
  extends GeoJsonObject
     with Geometry {
  var coordinates: js.Array[Position] = js.native
  @JSName("type")
  var type_MultiPoint: typings.geojson.geojsonStrings.MultiPoint = js.native
}

object MultiPoint {
  @scala.inline
  def apply(coordinates: js.Array[Position], `type`: typings.geojson.geojsonStrings.MultiPoint): MultiPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPoint]
  }
  @scala.inline
  implicit class MultiPointOps[Self <: MultiPoint] (val x: Self) extends AnyVal {
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
    def setCoordinatesVarargs(value: Position*): Self = this.set("coordinates", js.Array(value :_*))
    @scala.inline
    def setCoordinates(value: js.Array[Position]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.geojson.geojsonStrings.MultiPoint): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

