package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A location where a voter can vote. This may be an early vote site, an
  * election day voting location, or a drop off location for a completed
  * ballot.
  */
@js.native
trait SchemaPollingLocation extends js.Object {
  /**
    * The address of the location.
    */
  var address: js.UndefOr[SchemaSimpleAddressType] = js.native
  /**
    * The last date that this early vote site or drop off location may be used.
    * This field is not populated for polling locations.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * An ID for this object. IDs may change in future requests and should not
    * be cached. Access to this field requires special access that can be
    * requested from the Request more link on the Quotas page.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Latitude of the location, in degrees north of the equator. Only some
    * locations -- generally, ballot drop boxes for vote-by-mail elections --
    * will have this set; for others, use a geocoding service like the Google
    * Maps API to resolve the address to a geographic point.
    */
  var latitude: js.UndefOr[Double] = js.native
  /**
    * Longitude of the location, in degrees east of the Prime Meridian. Only
    * some locations -- generally, ballot drop boxes for vote-by-mail elections
    * -- will have this set; for others, use a geocoding service like the
    * Google Maps API to resolve the address to a geographic point.
    */
  var longitude: js.UndefOr[Double] = js.native
  /**
    * The name of the early vote site or drop off location. This field is not
    * populated for polling locations.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Notes about this location (e.g. accessibility ramp or entrance to use).
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * A description of when this location is open.
    */
  var pollingHours: js.UndefOr[String] = js.native
  /**
    * A list of sources for this location. If multiple sources are listed the
    * data has been aggregated from those sources.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.native
  /**
    * The first date that this early vote site or drop off location may be
    * used. This field is not populated for polling locations.
    */
  var startDate: js.UndefOr[String] = js.native
  /**
    * The services provided by this early vote site or drop off location. This
    * field is not populated for polling locations.
    */
  var voterServices: js.UndefOr[String] = js.native
}

object SchemaPollingLocation {
  @scala.inline
  def apply(): SchemaPollingLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPollingLocation]
  }
  @scala.inline
  implicit class SchemaPollingLocationOps[Self <: SchemaPollingLocation] (val x: Self) extends AnyVal {
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
    def setAddress(value: SchemaSimpleAddressType): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    @scala.inline
    def setPollingHours(value: String): Self = this.set("pollingHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollingHours: Self = this.set("pollingHours", js.undefined)
    @scala.inline
    def setSourcesVarargs(value: SchemaSource*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[SchemaSource]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    @scala.inline
    def setVoterServices(value: String): Self = this.set("voterServices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoterServices: Self = this.set("voterServices", js.undefined)
  }
  
}

