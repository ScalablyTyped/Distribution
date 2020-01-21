package typings.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollingLocation extends js.Object {
  /** The address of the location. */
  var address: js.UndefOr[SimpleAddressType] = js.undefined
  /** The last date that this early vote site or drop off location may be used. This field is not populated for polling locations. */
  var endDate: js.UndefOr[String] = js.undefined
  /**
    * An ID for this object. IDs may change in future requests and should not be cached. Access to this field requires special access that can be requested
    * from the Request more link on the Quotas page.
    */
  var id: js.UndefOr[String] = js.undefined
  /** The name of the early vote site or drop off location. This field is not populated for polling locations. */
  var name: js.UndefOr[String] = js.undefined
  /** Notes about this location (e.g. accessibility ramp or entrance to use). */
  var notes: js.UndefOr[String] = js.undefined
  /** A description of when this location is open. */
  var pollingHours: js.UndefOr[String] = js.undefined
  /** A list of sources for this location. If multiple sources are listed the data has been aggregated from those sources. */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
  /** The first date that this early vote site or drop off location may be used. This field is not populated for polling locations. */
  var startDate: js.UndefOr[String] = js.undefined
  /** The services provided by this early vote site or drop off location. This field is not populated for polling locations. */
  var voterServices: js.UndefOr[String] = js.undefined
}

object PollingLocation {
  @scala.inline
  def apply(
    address: SimpleAddressType = null,
    endDate: String = null,
    id: String = null,
    name: String = null,
    notes: String = null,
    pollingHours: String = null,
    sources: js.Array[Source] = null,
    startDate: String = null,
    voterServices: String = null
  ): PollingLocation = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (pollingHours != null) __obj.updateDynamic("pollingHours")(pollingHours.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (voterServices != null) __obj.updateDynamic("voterServices")(voterServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollingLocation]
  }
}

