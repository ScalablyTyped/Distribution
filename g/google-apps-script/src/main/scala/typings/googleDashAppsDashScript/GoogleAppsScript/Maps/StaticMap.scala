package typings.googleDashAppsDashScript.GoogleAppsScript.Maps

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Blob
import typings.googleDashAppsDashScript.GoogleAppsScript.Byte
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows for the creation and decoration of static map images.
  *
  * The example below shows how you can use this class to create a map of New York City's Theatre
  * District, including nearby train stations, and display it in a simple web app.
  *
  *     // Create a map centered on Times Square.
  *     var map = Maps.newStaticMap()
  *         .setSize(600, 600)
  *         .setCenter('Times Square, New York, NY');
  *
  *     // Add markers for the nearbye train stations.
  *     map.setMarkerStyle(Maps.StaticMap.MarkerSize.MID, Maps.StaticMap.Color.RED, 'T');
  *     map.addMarker('Grand Central Station, New York, NY');
  *     map.addMarker('Penn Station, New York, NY');
  *
  *     // Show the boundaries of the Theatre District.
  *     var corners = [
  *       '8th Ave & 53rd St, New York, NY',
  *       '6th Ave & 53rd St, New York, NY',
  *       '6th Ave & 40th St, New York, NY',
  *       '8th Ave & 40th St, New York, NY'
  *     ];
  *     map.setPathStyle(4, Maps.StaticMap.Color.BLACK, Maps.StaticMap.Color.BLUE);
  *     map.beginPath();
  *     for (var i = 0; i < corners.length; i++) {
  *       map.addAddress(corners[i]);
  *     }
  *     // All static map URLs require an API key.
  *     var url = map.getMapUrl() + "&key=YOUR_API_KEY";
  *
  * See also
  *
  * Google Static Maps API
  */
@js.native
trait StaticMap extends js.Object {
  def addAddress(address: String): StaticMap = js.native
  def addMarker(address: String): StaticMap = js.native
  def addMarker(latitude: Double, longitude: Double): StaticMap = js.native
  def addPath(points: js.Array[Double]): StaticMap = js.native
  def addPath(polyline: String): StaticMap = js.native
  def addPoint(latitude: Double, longitude: Double): StaticMap = js.native
  def addVisible(address: String): StaticMap = js.native
  def addVisible(latitude: Double, longitude: Double): StaticMap = js.native
  def beginPath(): StaticMap = js.native
  def clearMarkers(): StaticMap = js.native
  def clearPaths(): StaticMap = js.native
  def clearVisibles(): StaticMap = js.native
  def endPath(): StaticMap = js.native
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob = js.native
  def getMapImage(): js.Array[Byte] = js.native
  def getMapUrl(): String = js.native
  def setCenter(address: String): StaticMap = js.native
  def setCenter(latitude: Double, longitude: Double): StaticMap = js.native
  def setCustomMarkerStyle(imageUrl: String, useShadow: Boolean): StaticMap = js.native
  def setFormat(format: String): StaticMap = js.native
  def setLanguage(language: String): StaticMap = js.native
  def setMapType(mapType: String): StaticMap = js.native
  def setMarkerStyle(size: String, color: String, label: String): StaticMap = js.native
  def setMobile(useMobileTiles: Boolean): StaticMap = js.native
  def setPathStyle(weight: Integer, color: String, fillColor: String): StaticMap = js.native
  def setSize(width: Integer, height: Integer): StaticMap = js.native
  def setZoom(zoom: Integer): StaticMap = js.native
}

