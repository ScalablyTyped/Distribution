package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsStep extends StObject {
  
  /**
    * The distance covered by this step. This property may be
    * <code>undefined</code> as the distance may be unknown.
    */
  var distance: js.UndefOr[Distance] = js.undefined
  
  /**
    * The typical time required to perform this step in seconds and in text
    * form. This property may be <code>undefined</code> as the duration may be
    * unknown.
    */
  var duration: js.UndefOr[Duration] = js.undefined
  
  /**
    * An <a
    * href="https://developers.google.com/maps/documentation/utilities/polylinealgorithm">encoded
    * polyline representation</a> of the step. This is an approximate
    * (smoothed) path of the step.
    */
  var encoded_lat_lngs: String
  
  /**
    * The ending location of this step.
    */
  var end_location: LatLng
  
  /**
    * The ending location of this step.
    * @deprecated Please use {@link google.maps.DirectionsStep.end_location}.
    */
  var end_point: LatLng
  
  /**
    * Instructions for this step.
    */
  var instructions: String
  
  /**
    * A sequence of <code>LatLng</code>s describing the course of this step.
    * This is an approximate (smoothed) path of the step.
    * @deprecated Please use {@link google.maps.DirectionsStep.path}.
    */
  var lat_lngs: js.Array[LatLng]
  
  /**
    * Contains the action to take for the current step (<code>turn-left</code>,
    * <code>merge</code>, <code>straight</code>, etc.). Values are subject to
    * change, and new values may be introduced without prior notice.
    */
  var maneuver: String
  
  /**
    * A sequence of <code>LatLng</code>s describing the course of this step.
    * This is an approximate (smoothed) path of the step.
    */
  var path: js.Array[LatLng]
  
  /**
    * Contains an object with a single property, &#39;points&#39;, that holds
    * an <a
    * href="https://developers.google.com/maps/documentation/utilities/polylinealgorithm">encoded
    * polyline</a> representation of the step. This polyline is an approximate
    * (smoothed) path of the step.
    * @deprecated Please use {@link
    *     google.maps.DirectionsStep.encoded_lat_lngs}.
    */
  var polyline: js.UndefOr[DirectionsPolyline] = js.undefined
  
  /**
    * The starting location of this step.
    */
  var start_location: LatLng
  
  /**
    * The starting location of this step.
    * @deprecated Please use {@link google.maps.DirectionsStep.start_location}.
    */
  var start_point: LatLng
  
  /**
    * Sub-steps of this step. Specified for non-transit sections of transit
    * routes.
    */
  var steps: js.UndefOr[js.Array[DirectionsStep]] = js.undefined
  
  /**
    * Transit-specific details about this step. This property will be undefined
    * unless the travel mode of this step is <code>TRANSIT</code>.
    */
  var transit: js.UndefOr[TransitDetails] = js.undefined
  
  /**
    * Details pertaining to this step if the travel mode is
    * <code>TRANSIT</code>.
    */
  var transit_details: js.UndefOr[TransitDetails] = js.undefined
  
  /**
    * The mode of travel used in this step.
    */
  var travel_mode: TravelMode
}
object DirectionsStep {
  
  inline def apply(
    encoded_lat_lngs: String,
    end_location: LatLng,
    end_point: LatLng,
    instructions: String,
    lat_lngs: js.Array[LatLng],
    maneuver: String,
    path: js.Array[LatLng],
    start_location: LatLng,
    start_point: LatLng,
    travel_mode: TravelMode
  ): DirectionsStep = {
    val __obj = js.Dynamic.literal(encoded_lat_lngs = encoded_lat_lngs.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], end_point = end_point.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], lat_lngs = lat_lngs.asInstanceOf[js.Any], maneuver = maneuver.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], start_point = start_point.asInstanceOf[js.Any], travel_mode = travel_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsStep] (val x: Self) extends AnyVal {
    
    inline def setDistance(value: Distance): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEncoded_lat_lngs(value: String): Self = StObject.set(x, "encoded_lat_lngs", value.asInstanceOf[js.Any])
    
    inline def setEnd_location(value: LatLng): Self = StObject.set(x, "end_location", value.asInstanceOf[js.Any])
    
    inline def setEnd_point(value: LatLng): Self = StObject.set(x, "end_point", value.asInstanceOf[js.Any])
    
    inline def setInstructions(value: String): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    inline def setLat_lngs(value: js.Array[LatLng]): Self = StObject.set(x, "lat_lngs", value.asInstanceOf[js.Any])
    
    inline def setLat_lngsVarargs(value: LatLng*): Self = StObject.set(x, "lat_lngs", js.Array(value*))
    
    inline def setManeuver(value: String): Self = StObject.set(x, "maneuver", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[LatLng]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: LatLng*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setPolyline(value: DirectionsPolyline): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    inline def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
    
    inline def setStart_location(value: LatLng): Self = StObject.set(x, "start_location", value.asInstanceOf[js.Any])
    
    inline def setStart_point(value: LatLng): Self = StObject.set(x, "start_point", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[DirectionsStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: DirectionsStep*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setTransit(value: TransitDetails): Self = StObject.set(x, "transit", value.asInstanceOf[js.Any])
    
    inline def setTransitUndefined: Self = StObject.set(x, "transit", js.undefined)
    
    inline def setTransit_details(value: TransitDetails): Self = StObject.set(x, "transit_details", value.asInstanceOf[js.Any])
    
    inline def setTransit_detailsUndefined: Self = StObject.set(x, "transit_details", js.undefined)
    
    inline def setTravel_mode(value: TravelMode): Self = StObject.set(x, "travel_mode", value.asInstanceOf[js.Any])
  }
}
