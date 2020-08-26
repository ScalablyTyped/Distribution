package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitDetails extends js.Object {
  /** contains information about the stop for this part of the trip. */
  var arrival_stop: TransitStop = js.native
  /** contain the arrival time for this leg of the journey. */
  var arrival_time: Time = js.native
  /** contains information about the station for this part of the trip. */
  var departure_stop: TransitStop = js.native
  /** contain the departure time for this leg of the journey. */
  var departure_time: Time = js.native
  /**
    * specifies the direction in which to travel on this line, as it is marked on the vehicle or at the departure stop.
    * This will often be the terminus station.
    */
  var headsign: String = js.native
  /**
    * specifies the expected number of seconds between departures from the same stop at this time.
    * For example, with a `headway` value of 600, you would expect a ten minute wait if you should miss your bus.
    */
  var headway: Double = js.native
  /** contains information about the transit line used in this step. */
  var line: TransitLine = js.native
  /**
    * contains the number of stops in this step, counting the arrival stop, but not the departure stop.
    * For example, if your directions involve leaving from Stop A, passing through stops B and C, and arriving at stop D,
    * `num_stops` will return 3.
    */
  var num_stops: Double = js.native
}

object TransitDetails {
  @scala.inline
  def apply(
    arrival_stop: TransitStop,
    arrival_time: Time,
    departure_stop: TransitStop,
    departure_time: Time,
    headsign: String,
    headway: Double,
    line: TransitLine,
    num_stops: Double
  ): TransitDetails = {
    val __obj = js.Dynamic.literal(arrival_stop = arrival_stop.asInstanceOf[js.Any], arrival_time = arrival_time.asInstanceOf[js.Any], departure_stop = departure_stop.asInstanceOf[js.Any], departure_time = departure_time.asInstanceOf[js.Any], headsign = headsign.asInstanceOf[js.Any], headway = headway.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], num_stops = num_stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitDetails]
  }
  @scala.inline
  implicit class TransitDetailsOps[Self <: TransitDetails] (val x: Self) extends AnyVal {
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
    def setArrival_stop(value: TransitStop): Self = this.set("arrival_stop", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrival_time(value: Time): Self = this.set("arrival_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeparture_stop(value: TransitStop): Self = this.set("departure_stop", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeparture_time(value: Time): Self = this.set("departure_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadsign(value: String): Self = this.set("headsign", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadway(value: Double): Self = this.set("headway", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: TransitLine): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setNum_stops(value: Double): Self = this.set("num_stops", value.asInstanceOf[js.Any])
  }
  
}

