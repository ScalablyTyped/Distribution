package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsStep extends js.Object {
  /**
    * contains the distance covered by this step until the next step. (See the discussion of this field in Directions Legs)
    *
    * This field may be undefined if the distance is unknown.
    */
  var distance: Distance
  /**
    * contains the typical time required to perform the step, until the next step. (See the description in Directions Legs)
    *
    * This field may be undefined if the duration is unknown
    */
  var duration: Duration
  /** contains the location of the last point of this step, as a single set of `lat` and `lng` fields. */
  var end_location: LatLngLiteral
  /** contains formatted instructions for this step, presented as an HTML text string. */
  var html_instructions: java.lang.String
  /**
    * contains the action to take for the current step (turn left, merge, straight, etc.).
    * This field is used to determine which icon to display.
    */
  var maneuver: Maneuver
  /**
    * contains a single points object that holds an encoded polyline representation of the step.
    * This polyline is an approximate (smoothed) path of the step.
    */
  var polyline: java.lang.String
  /** contains the location of the starting point of this step, as a single set of `lat` and `lng` fields. */
  var start_location: LatLngLiteral
  /**
    * contains detailed directions for walking or driving steps in transit directions.
    * Substeps are only available when `travel_mode` is set to "transit".
    * The inner `steps` array is of the same type as `steps`.
    */
  var steps: DirectionsStep
  /** contains transit specific information. This field is only returned with travel_mode is set to "transit". */
  var transit_details: TransitDetails
}

object DirectionsStep {
  @scala.inline
  def apply(
    distance: Distance,
    duration: Duration,
    end_location: LatLngLiteral,
    html_instructions: java.lang.String,
    maneuver: Maneuver,
    polyline: java.lang.String,
    start_location: LatLngLiteral,
    steps: DirectionsStep,
    transit_details: TransitDetails
  ): DirectionsStep = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("end_location")(end_location)
    __obj.updateDynamic("html_instructions")(html_instructions)
    __obj.updateDynamic("maneuver")(maneuver)
    __obj.updateDynamic("polyline")(polyline)
    __obj.updateDynamic("start_location")(start_location)
    __obj.updateDynamic("steps")(steps)
    __obj.updateDynamic("transit_details")(transit_details)
    __obj.asInstanceOf[DirectionsStep]
  }
}

