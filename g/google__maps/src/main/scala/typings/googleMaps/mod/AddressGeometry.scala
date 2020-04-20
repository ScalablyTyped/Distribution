package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressGeometry extends js.Object {
  /**
    * (optionally returned) stores the bounding box which can fully contain the returned result.
    * Note that these bounds may not match the recommended viewport.
    * (For example, San Francisco includes the [Farallon islands](https://en.wikipedia.org/wiki/Farallon_Islands),
    * which are technically part of the city, but probably should not be returned in the viewport.)
    */
  var bounds: LatLngBounds
  /** contains the geocoded latitude, longitude value. For normal address lookups, this field is typically the most important. */
  var location: LatLngLiteral
  /** stores additional data about the specified location. */
  var location_type: LocationType
  /**
    * contains the recommended viewport for displaying the returned result, specified as two latitude, longitude values
    * defining the `southwest` and `northeast` corner of the viewport bounding box.
    * Generally the viewport is used to frame a result when displaying it to a user.
    */
  var viewport: LatLngBounds
}

object AddressGeometry {
  @scala.inline
  def apply(bounds: LatLngBounds, location: LatLngLiteral, location_type: LocationType, viewport: LatLngBounds): AddressGeometry = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], location_type = location_type.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressGeometry]
  }
}

