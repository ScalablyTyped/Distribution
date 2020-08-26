package typings.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiLineString
  extends GeoJsonObject
     with Geometry {
  var coordinates: js.Array[js.Array[Position]] = js.native
  @JSName("type")
  var type_MultiLineString: typings.geojson.geojsonStrings.MultiLineString = js.native
}

object MultiLineString {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[Position]], `type`: typings.geojson.geojsonStrings.MultiLineString): MultiLineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiLineString]
  }
  @scala.inline
  implicit class MultiLineStringOps[Self <: MultiLineString] (val x: Self) extends AnyVal {
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
    def setCoordinatesVarargs(value: js.Array[Position]*): Self = this.set("coordinates", js.Array(value :_*))
    @scala.inline
    def setCoordinates(value: js.Array[js.Array[Position]]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.geojson.geojsonStrings.MultiLineString): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

