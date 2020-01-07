package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A location where a voter can vote. This may be an early vote site, an
  * election day voting location, or a drop off location for a completed
  * ballot.
  */
@js.native
trait Schema$PollingLocation extends js.Object {
  /**
    * The address of the location.
    */
  var address: js.UndefOr[Schema$SimpleAddressType] = js.native
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
  var sources: js.UndefOr[js.Array[Schema$Source]] = js.native
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

object Schema$PollingLocation {
  @scala.inline
  def apply(
    address: Schema$SimpleAddressType = null,
    endDate: String = null,
    id: String = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    name: String = null,
    notes: String = null,
    pollingHours: String = null,
    sources: js.Array[Schema$Source] = null,
    startDate: String = null,
    voterServices: String = null
  ): Schema$PollingLocation = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (pollingHours != null) __obj.updateDynamic("pollingHours")(pollingHours.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (voterServices != null) __obj.updateDynamic("voterServices")(voterServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PollingLocation]
  }
}

