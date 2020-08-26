package typings.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollingLocation extends js.Object {
  /** The address of the location. */
  var address: js.UndefOr[SimpleAddressType] = js.native
  /** The last date that this early vote site or drop off location may be used. This field is not populated for polling locations. */
  var endDate: js.UndefOr[String] = js.native
  /**
    * An ID for this object. IDs may change in future requests and should not be cached. Access to this field requires special access that can be requested
    * from the Request more link on the Quotas page.
    */
  var id: js.UndefOr[String] = js.native
  /** The name of the early vote site or drop off location. This field is not populated for polling locations. */
  var name: js.UndefOr[String] = js.native
  /** Notes about this location (e.g. accessibility ramp or entrance to use). */
  var notes: js.UndefOr[String] = js.native
  /** A description of when this location is open. */
  var pollingHours: js.UndefOr[String] = js.native
  /** A list of sources for this location. If multiple sources are listed the data has been aggregated from those sources. */
  var sources: js.UndefOr[js.Array[Source]] = js.native
  /** The first date that this early vote site or drop off location may be used. This field is not populated for polling locations. */
  var startDate: js.UndefOr[String] = js.native
  /** The services provided by this early vote site or drop off location. This field is not populated for polling locations. */
  var voterServices: js.UndefOr[String] = js.native
}

object PollingLocation {
  @scala.inline
  def apply(): PollingLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollingLocation]
  }
  @scala.inline
  implicit class PollingLocationOps[Self <: PollingLocation] (val x: Self) extends AnyVal {
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
    def setAddress(value: SimpleAddressType): Self = this.set("address", value.asInstanceOf[js.Any])
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
    def setSourcesVarargs(value: Source*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[Source]): Self = this.set("sources", value.asInstanceOf[js.Any])
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

