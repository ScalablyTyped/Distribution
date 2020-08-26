package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressGeometry extends js.Object {
  /**
    * (optionally returned) stores the bounding box which can fully contain the returned result.
    * Note that these bounds may not match the recommended viewport.
    * (For example, San Francisco includes the [Farallon islands](https://en.wikipedia.org/wiki/Farallon_Islands),
    * which are technically part of the city, but probably should not be returned in the viewport.)
    */
  var bounds: LatLngBounds = js.native
  /** contains the geocoded latitude, longitude value. For normal address lookups, this field is typically the most important. */
  var location: LatLngLiteral = js.native
  /** stores additional data about the specified location. */
  var location_type: LocationType = js.native
  /**
    * contains the recommended viewport for displaying the returned result, specified as two latitude, longitude values
    * defining the `southwest` and `northeast` corner of the viewport bounding box.
    * Generally the viewport is used to frame a result when displaying it to a user.
    */
  var viewport: LatLngBounds = js.native
}

object AddressGeometry {
  @scala.inline
  def apply(bounds: LatLngBounds, location: LatLngLiteral, location_type: LocationType, viewport: LatLngBounds): AddressGeometry = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], location_type = location_type.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressGeometry]
  }
  @scala.inline
  implicit class AddressGeometryOps[Self <: AddressGeometry] (val x: Self) extends AnyVal {
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
    def setBounds(value: LatLngBounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: LatLngLiteral): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation_type(value: LocationType): Self = this.set("location_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewport(value: LatLngBounds): Self = this.set("viewport", value.asInstanceOf[js.Any])
  }
  
}

