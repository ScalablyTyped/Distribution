package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The absolute geographic location
  */
@js.native
trait LocationPosition extends BackboneElement {
  /**
    * Contains extended information for property 'altitude'.
    */
  var _altitude: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'latitude'.
    */
  var _latitude: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'longitude'.
    */
  var _longitude: js.UndefOr[Element] = js.native
  /**
    * Altitude with WGS84 datum
    */
  var altitude: js.UndefOr[decimal] = js.native
  /**
    * Latitude with WGS84 datum
    */
  var latitude: decimal = js.native
  /**
    * Longitude with WGS84 datum
    */
  var longitude: decimal = js.native
}

object LocationPosition {
  @scala.inline
  def apply(latitude: decimal, longitude: decimal): LocationPosition = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationPosition]
  }
  @scala.inline
  implicit class LocationPositionOps[Self <: LocationPosition] (val x: Self) extends AnyVal {
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
    def setLatitude(value: decimal): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongitude(value: decimal): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def set_altitude(value: Element): Self = this.set("_altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_altitude: Self = this.set("_altitude", js.undefined)
    @scala.inline
    def set_latitude(value: Element): Self = this.set("_latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_latitude: Self = this.set("_latitude", js.undefined)
    @scala.inline
    def set_longitude(value: Element): Self = this.set("_longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_longitude: Self = this.set("_longitude", js.undefined)
    @scala.inline
    def setAltitude(value: decimal): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
  }
  
}

