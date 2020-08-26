package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocodedWaypoint extends js.Object {
  /** indicates the status code resulting from the geocoding operation. */
  var geocoder_status: GeocodedWaypointStatus = js.native
  /**
    * indicates that the geocoder did not return an exact match for the original request, though it was able to match part of the
    * requested address. You may wish to examine the original request for misspellings and/or an incomplete address.
    *
    * Partial matches most often occur for street addresses that do not exist within the locality you pass in the request.
    * Partial matches may also be returned when a request matches two or more locations in the same locality.
    * For example, "21 Henr St, Bristol, UK" will return a partial match for both Henry Street and Henrietta Street.
    * Note that if a request includes a misspelled address component, the geocoding service may suggest an alternative address.
    * Suggestions triggered in this way will also be marked as a partial match.
    */
  var partial_match: Boolean = js.native
  /** unique identifier that can be used with other Google APIs. */
  var place_id: String = js.native
  /**
    * indicates the *address type* of the geocoding result used for calculating directions.
    *
    * An empty list of types indicates there are no known types for the particular address component, for example, Lieu-dit in France.
    */
  var types: js.Array[AddressType] = js.native
}

object GeocodedWaypoint {
  @scala.inline
  def apply(
    geocoder_status: GeocodedWaypointStatus,
    partial_match: Boolean,
    place_id: String,
    types: js.Array[AddressType]
  ): GeocodedWaypoint = {
    val __obj = js.Dynamic.literal(geocoder_status = geocoder_status.asInstanceOf[js.Any], partial_match = partial_match.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodedWaypoint]
  }
  @scala.inline
  implicit class GeocodedWaypointOps[Self <: GeocodedWaypoint] (val x: Self) extends AnyVal {
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
    def setGeocoder_status(value: GeocodedWaypointStatus): Self = this.set("geocoder_status", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartial_match(value: Boolean): Self = this.set("partial_match", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlace_id(value: String): Self = this.set("place_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: AddressType*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[AddressType]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

