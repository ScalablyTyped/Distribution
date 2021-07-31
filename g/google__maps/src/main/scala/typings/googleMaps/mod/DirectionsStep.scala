package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsStep extends StObject {
  
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
  var html_instructions: String
  
  /**
    * contains the action to take for the current step (turn left, merge, straight, etc.).
    * This field is used to determine which icon to display.
    */
  var maneuver: Maneuver
  
  /**
    * contains a single points object that holds an encoded polyline representation of the step.
    * This polyline is an approximate (smoothed) path of the step.
    */
  var polyline: String
  
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
    html_instructions: String,
    maneuver: Maneuver,
    polyline: String,
    start_location: LatLngLiteral,
    steps: DirectionsStep,
    transit_details: TransitDetails
  ): DirectionsStep = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], html_instructions = html_instructions.asInstanceOf[js.Any], maneuver = maneuver.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], transit_details = transit_details.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsStep]
  }
  
  @scala.inline
  implicit class DirectionsStepMutableBuilder[Self <: DirectionsStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Distance): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_location(value: LatLngLiteral): Self = StObject.set(x, "end_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_instructions(value: String): Self = StObject.set(x, "html_instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManeuver(value: Maneuver): Self = StObject.set(x, "maneuver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolyline(value: String): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_location(value: LatLngLiteral): Self = StObject.set(x, "start_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteps(value: DirectionsStep): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransit_details(value: TransitDetails): Self = StObject.set(x, "transit_details", value.asInstanceOf[js.Any])
  }
}
