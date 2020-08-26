package typings.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Point
  extends GeoJsonObject
     with Geometry {
  var coordinates: Position = js.native
  @JSName("type")
  var type_Point: typings.geojson.geojsonStrings.Point = js.native
}

object Point {
  @scala.inline
  def apply(coordinates: Position, `type`: typings.geojson.geojsonStrings.Point): Point = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
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
    def setCoordinatesVarargs(value: Double*): Self = this.set("coordinates", js.Array(value :_*))
    @scala.inline
    def setCoordinates(value: Position): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.geojson.geojsonStrings.Point): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

