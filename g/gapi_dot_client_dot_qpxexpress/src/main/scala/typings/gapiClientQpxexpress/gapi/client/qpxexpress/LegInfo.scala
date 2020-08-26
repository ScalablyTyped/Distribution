package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegInfo extends js.Object {
  /** The aircraft (or bus, ferry, railcar, etc) travelling between the two points of this leg. */
  var aircraft: js.UndefOr[String] = js.native
  /** The scheduled time of arrival at the destination of the leg, local to the point of arrival. */
  var arrivalTime: js.UndefOr[String] = js.native
  /** Whether you have to change planes following this leg. Only applies to the next leg. */
  var changePlane: js.UndefOr[Boolean] = js.native
  /** Duration of a connection following this leg, in minutes. */
  var connectionDuration: js.UndefOr[Double] = js.native
  /** The scheduled departure time of the leg, local to the point of departure. */
  var departureTime: js.UndefOr[String] = js.native
  /** The leg destination as a city and airport. */
  var destination: js.UndefOr[String] = js.native
  /** The terminal the flight is scheduled to arrive at. */
  var destinationTerminal: js.UndefOr[String] = js.native
  /** The scheduled travelling time from the origin to the destination. */
  var duration: js.UndefOr[Double] = js.native
  /** An identifier that uniquely identifies this leg in the solution. */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies this as a leg object. A leg is the smallest unit of travel, in the case of a flight a takeoff immediately followed by a landing at two set
    * points on a particular carrier with a particular flight number. Value: the fixed string qpxexpress#legInfo.
    */
  var kind: js.UndefOr[String] = js.native
  /** A simple, general description of the meal(s) served on the flight, for example: "Hot meal". */
  var meal: js.UndefOr[String] = js.native
  /** The number of miles in this leg. */
  var mileage: js.UndefOr[Double] = js.native
  /** In percent, the published on time performance on this leg. */
  var onTimePerformance: js.UndefOr[Double] = js.native
  /**
    * Department of Transportation disclosure information on the actual operator of a flight in a code share. (A code share refers to a marketing agreement
    * between two carriers, where one carrier will list in its schedules (and take bookings for) flights that are actually operated by another carrier.)
    */
  var operatingDisclosure: js.UndefOr[String] = js.native
  /** The leg origin as a city and airport. */
  var origin: js.UndefOr[String] = js.native
  /** The terminal the flight is scheduled to depart from. */
  var originTerminal: js.UndefOr[String] = js.native
  /** Whether passenger information must be furnished to the United States Transportation Security Administration (TSA) prior to departure. */
  var secure: js.UndefOr[Boolean] = js.native
}

object LegInfo {
  @scala.inline
  def apply(): LegInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegInfo]
  }
  @scala.inline
  implicit class LegInfoOps[Self <: LegInfo] (val x: Self) extends AnyVal {
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
    def setAircraft(value: String): Self = this.set("aircraft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAircraft: Self = this.set("aircraft", js.undefined)
    @scala.inline
    def setArrivalTime(value: String): Self = this.set("arrivalTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrivalTime: Self = this.set("arrivalTime", js.undefined)
    @scala.inline
    def setChangePlane(value: Boolean): Self = this.set("changePlane", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangePlane: Self = this.set("changePlane", js.undefined)
    @scala.inline
    def setConnectionDuration(value: Double): Self = this.set("connectionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionDuration: Self = this.set("connectionDuration", js.undefined)
    @scala.inline
    def setDepartureTime(value: String): Self = this.set("departureTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepartureTime: Self = this.set("departureTime", js.undefined)
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setDestinationTerminal(value: String): Self = this.set("destinationTerminal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationTerminal: Self = this.set("destinationTerminal", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMeal(value: String): Self = this.set("meal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeal: Self = this.set("meal", js.undefined)
    @scala.inline
    def setMileage(value: Double): Self = this.set("mileage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMileage: Self = this.set("mileage", js.undefined)
    @scala.inline
    def setOnTimePerformance(value: Double): Self = this.set("onTimePerformance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTimePerformance: Self = this.set("onTimePerformance", js.undefined)
    @scala.inline
    def setOperatingDisclosure(value: String): Self = this.set("operatingDisclosure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingDisclosure: Self = this.set("operatingDisclosure", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setOriginTerminal(value: String): Self = this.set("originTerminal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginTerminal: Self = this.set("originTerminal", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
  }
  
}

