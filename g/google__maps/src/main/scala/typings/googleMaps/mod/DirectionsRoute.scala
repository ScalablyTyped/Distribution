package typings.googleMaps.mod

import typings.googleMaps.anon.Points
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsRoute extends StObject {
  
  /** contains the viewport bounding box of the `overview_polyline`. */
  var bounds: LatLngBounds
  
  /** contains the copyrights text to be displayed for this route. You must handle and display this information yourself. */
  var copyrights: String
  
  /**
    * If present, contains the total fare (that is, the total ticket costs) on this route.
    * This property is only returned for transit requests and only for routes where fare information is available for all transit legs.
    *
    * **Note:** The Directions API only returns fare information for requests that contain either an API key or a client ID
    * and digital signature.
    */
  var fare: TransitFare
  
  /**
    * contains an array which contains information about a leg of the route, between two locations within the given route.
    * A separate leg will be present for each waypoint or destination specified.
    * (A route with no waypoints will contain exactly one leg within the `legs` array.)
    * Each leg consists of a series of `steps`.
    */
  var legs: js.Array[RouteLeg]
  
  /**
    * An array of LatLngs representing the entire course of this route. The path is simplified in order to make
    * it suitable in contexts where a small number of vertices is required (such as Static Maps API URLs).
    */
  var overview_path: js.Array[LatLngLiteral]
  
  /**
    * contains a single `points` object that holds an encoded polyline representation of the route.
    * This polyline is an approximate (smoothed) path of the resulting directions.
    */
  var overview_polyline: Points
  
  /** contains a short textual description for the route, suitable for naming and disambiguating the route from alternatives. */
  var summary: String
  
  /** contains an array of warnings to be displayed when showing these directions. You must handle and display these warnings yourself. */
  var warnings: js.Array[String]
  
  /**
    * contains an array indicating the order of any waypoints in the calculated route.
    * This waypoints may be reordered if the request was passed `optimize:true` within its `waypoints` parameter.
    */
  var waypoint_order: js.Array[Double]
}
object DirectionsRoute {
  
  @scala.inline
  def apply(
    bounds: LatLngBounds,
    copyrights: String,
    fare: TransitFare,
    legs: js.Array[RouteLeg],
    overview_path: js.Array[LatLngLiteral],
    overview_polyline: Points,
    summary: String,
    warnings: js.Array[String],
    waypoint_order: js.Array[Double]
  ): DirectionsRoute = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], copyrights = copyrights.asInstanceOf[js.Any], fare = fare.asInstanceOf[js.Any], legs = legs.asInstanceOf[js.Any], overview_path = overview_path.asInstanceOf[js.Any], overview_polyline = overview_polyline.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any], waypoint_order = waypoint_order.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsRoute]
  }
  
  @scala.inline
  implicit class DirectionsRouteMutableBuilder[Self <: DirectionsRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: LatLngBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrights(value: String): Self = StObject.set(x, "copyrights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFare(value: TransitFare): Self = StObject.set(x, "fare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegs(value: js.Array[RouteLeg]): Self = StObject.set(x, "legs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegsVarargs(value: RouteLeg*): Self = StObject.set(x, "legs", js.Array(value :_*))
    
    @scala.inline
    def setOverview_path(value: js.Array[LatLngLiteral]): Self = StObject.set(x, "overview_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverview_pathVarargs(value: LatLngLiteral*): Self = StObject.set(x, "overview_path", js.Array(value :_*))
    
    @scala.inline
    def setOverview_polyline(value: Points): Self = StObject.set(x, "overview_polyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    
    @scala.inline
    def setWaypoint_order(value: js.Array[Double]): Self = StObject.set(x, "waypoint_order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypoint_orderVarargs(value: Double*): Self = StObject.set(x, "waypoint_order", js.Array(value :_*))
  }
}
