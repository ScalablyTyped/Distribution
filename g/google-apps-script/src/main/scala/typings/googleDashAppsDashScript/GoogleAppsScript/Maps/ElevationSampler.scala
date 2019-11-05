package typings.googleDashAppsDashScript.GoogleAppsScript.Maps

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows for the sampling of elevations at particular locations.
  * The example below shows how you can use this class to determine the highest point along the route
  * from Denver to Grand Junction in Colorado, plot it on a map, and save the map to Google Drive.
  *
  *     // Get directions from Denver to Grand Junction.
  *     var directions = Maps.newDirectionFinder()
  *         .setOrigin('Denver, CO')
  *         .setDestination('Grand Junction, CO')
  *         .setMode(Maps.DirectionFinder.Mode.DRIVING)
  *         .getDirections();
  *     var route = directions.routes[0];
  *
  *     // Get elevation samples along the route.
  *     var numberOfSamples = 30;
  *     var response = Maps.newElevationSampler()
  *         .samplePath(route.overview_polyline.points, numberOfSamples)
  *
  *     // Determine highest point.
  *     var maxElevation = Number.MIN_VALUE;
  *     var highestPoint = null;
  *     for (var i = 0; i < response.results.length; i++) {
  *       var sample = response.results[i];
  *       if (sample.elevation > maxElevation) {
  *         maxElevation = sample.elevation;
  *         highestPoint = sample.location;
  *       }
  *     }
  *
  *     // Add the path and marker to a map.
  *     var map = Maps.newStaticMap()
  *         .addPath(route.overview_polyline.points)
  *         .addMarker(highestPoint.lat, highestPoint.lng);
  *
  *     // Save the map to your drive
  *     DocsList.createFile(Utilities.newBlob(map.getMapImage(), 'image/png', 'map.png'));
  *
  * See also
  *
  * Google Elevation API
  */
@js.native
trait ElevationSampler extends js.Object {
  def sampleLocation(latitude: Double, longitude: Double): js.Any = js.native
  def sampleLocations(encodedPolyline: String): js.Any = js.native
  def sampleLocations(points: js.Array[Double]): js.Any = js.native
  def samplePath(encodedPolyline: String, numSamples: Integer): js.Any = js.native
  def samplePath(points: js.Array[Double], numSamples: Integer): js.Any = js.native
}

