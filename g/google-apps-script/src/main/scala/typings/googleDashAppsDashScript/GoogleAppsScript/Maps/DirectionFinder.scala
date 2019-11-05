package typings.googleDashAppsDashScript.GoogleAppsScript.Maps

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows for the retrieval of directions between locations.
  * The example below shows how you can use this class to get the directions from Times Square to
  * Central Park, stopping first at Lincoln Center, plot the locations and path on a map, and send
  * the map in an email.
  *
  *     // Get the directions.
  *     var directions = Maps.newDirectionFinder()
  *         .setOrigin('Times Square, New York, NY')
  *         .addWaypoint('Lincoln Center, New York, NY')
  *         .setDestination('Central Park, New York, NY')
  *         .setMode(Maps.DirectionFinder.Mode.DRIVING)
  *         .getDirections();
  *     var route = directions.routes[0];
  *
  *     // Set up marker styles.
  *     var markerSize = Maps.StaticMap.MarkerSize.MID;
  *     var markerColor = Maps.StaticMap.Color.GREEN
  *     var markerLetterCode = 'A'.charCodeAt();
  *
  *     // Add markers to the map.
  *     var map = Maps.newStaticMap();
  *     for (var i = 0; i < route.legs.length; i++) {
  *       var leg = route.legs[i];
  *       if (i == 0) {
  *         // Add a marker for the start location of the first leg only.
  *         map.setMarkerStyle(markerSize, markerColor, String.fromCharCode(markerLetterCode));
  *         map.addMarker(leg.start_location.lat, leg.start_location.lng);
  *         markerLetterCode++;
  *       }
  *       map.setMarkerStyle(markerSize, markerColor, String.fromCharCode(markerLetterCode));
  *       map.addMarker(leg.end_location.lat, leg.end_location.lng);
  *       markerLetterCode++;
  *     }
  *
  *     // Add a path for the entire route.
  *     map.addPath(route.overview_polyline.points);
  *
  *     // Send the map in an email.
  *     var toAddress = Session.getActiveUser().getEmail();
  *     MailApp.sendEmail(
  *       toAddress,
  *       'Directions',
  *       'Please open: ' + map.getMapUrl() + '&key=YOUR_API_KEY', {
  *         htmlBody: 'See below.<br/><img src="cid:mapImage">',
  *         inlineImages: {
  *           mapImage: Utilities.newBlob(map.getMapImage(), 'image/png')
  *         }
  *       }
  *     );
  *
  * See also
  *
  * Google Directions API
  */
@js.native
trait DirectionFinder extends js.Object {
  def addWaypoint(address: String): DirectionFinder = js.native
  def addWaypoint(latitude: Double, longitude: Double): DirectionFinder = js.native
  def clearWaypoints(): DirectionFinder = js.native
  def getDirections(): js.Any = js.native
  def setAlternatives(useAlternatives: Boolean): DirectionFinder = js.native
  def setArrive(time: Date): DirectionFinder = js.native
  def setAvoid(avoid: String): DirectionFinder = js.native
  def setDepart(time: Date): DirectionFinder = js.native
  def setDestination(address: String): DirectionFinder = js.native
  def setDestination(latitude: Double, longitude: Double): DirectionFinder = js.native
  def setLanguage(language: String): DirectionFinder = js.native
  def setMode(mode: Mode): DirectionFinder = js.native
  def setOptimizeWaypoints(optimizeOrder: Boolean): DirectionFinder = js.native
  def setOrigin(address: String): DirectionFinder = js.native
  def setOrigin(latitude: Double, longitude: Double): DirectionFinder = js.native
  def setRegion(region: String): DirectionFinder = js.native
}

