package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticMap extends js.Object {
  def addAddress(address: java.lang.String): StaticMap = js.native
  def addMarker(address: java.lang.String): StaticMap = js.native
  def addMarker(latitude: scala.Double, longitude: scala.Double): StaticMap = js.native
  def addPath(points: js.Array[scala.Double]): StaticMap = js.native
  def addPath(polyline: java.lang.String): StaticMap = js.native
  def addPoint(latitude: scala.Double, longitude: scala.Double): StaticMap = js.native
  def addVisible(address: java.lang.String): StaticMap = js.native
  def addVisible(latitude: scala.Double, longitude: scala.Double): StaticMap = js.native
  def beginPath(): StaticMap = js.native
  def clearMarkers(): StaticMap = js.native
  def clearPaths(): StaticMap = js.native
  def clearVisibles(): StaticMap = js.native
  def endPath(): StaticMap = js.native
  def getAs(contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getBlob(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getMapImage(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def getMapUrl(): java.lang.String = js.native
  def setCenter(address: java.lang.String): StaticMap = js.native
  def setCenter(latitude: scala.Double, longitude: scala.Double): StaticMap = js.native
  def setCustomMarkerStyle(imageUrl: java.lang.String, useShadow: scala.Boolean): StaticMap = js.native
  def setFormat(format: java.lang.String): StaticMap = js.native
  def setLanguage(language: java.lang.String): StaticMap = js.native
  def setMapType(mapType: java.lang.String): StaticMap = js.native
  def setMarkerStyle(size: java.lang.String, color: java.lang.String, label: java.lang.String): StaticMap = js.native
  def setMobile(useMobileTiles: scala.Boolean): StaticMap = js.native
  def setPathStyle(
    weight: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    color: java.lang.String,
    fillColor: java.lang.String
  ): StaticMap = js.native
  def setSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): StaticMap = js.native
  def setZoom(zoom: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): StaticMap = js.native
}

