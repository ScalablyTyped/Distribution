package typings
package atGoogleMapsLib.mapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TransitDetails extends js.Object {
  /** contains information about the stop for this part of the trip. */
  var arrival_stop: TransitStop
  /** contain the arrival time for this leg of the journey. */
  var arrival_time: Time
  /** contains information about the station for this part of the trip. */
  var departure_stop: TransitStop
  /** contain the departure time for this leg of the journey. */
  var departure_time: Time
  /**
       * specifies the direction in which to travel on this line, as it is marked on the vehicle or at the departure stop.
       * This will often be the terminus station.
       */
  var headsign: java.lang.String
  /**
       * specifies the expected number of seconds between departures from the same stop at this time.
       * For example, with a `headway` value of 600, you would expect a ten minute wait if you should miss your bus.
       */
  var headway: scala.Double
  /** contains information about the transit line used in this step. */
  var line: TransitLine
  /**
       * contains the number of stops in this step, counting the arrival stop, but not the departure stop.
       * For example, if your directions involve leaving from Stop A, passing through stops B and C, and arriving at stop D,
       * `num_stops` will return 3.
       */
  var num_stops: scala.Double
}

