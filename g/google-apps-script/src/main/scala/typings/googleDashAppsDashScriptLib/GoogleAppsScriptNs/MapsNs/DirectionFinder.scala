package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionFinder extends js.Object {
  def addWaypoint(address: java.lang.String): DirectionFinder = js.native
  def addWaypoint(latitude: stdLib.Number, longitude: stdLib.Number): DirectionFinder = js.native
  def clearWaypoints(): DirectionFinder = js.native
  def getDirections(): js.Object = js.native
  def setAlternatives(useAlternatives: scala.Boolean): DirectionFinder = js.native
  def setArrive(time: stdLib.Date): DirectionFinder = js.native
  def setAvoid(avoid: java.lang.String): DirectionFinder = js.native
  def setDepart(time: stdLib.Date): DirectionFinder = js.native
  def setDestination(address: java.lang.String): DirectionFinder = js.native
  def setDestination(latitude: stdLib.Number, longitude: stdLib.Number): DirectionFinder = js.native
  def setLanguage(language: java.lang.String): DirectionFinder = js.native
  def setMode(mode: Mode): DirectionFinder = js.native
  def setOptimizeWaypoints(optimizeOrder: scala.Boolean): DirectionFinder = js.native
  def setOrigin(address: java.lang.String): DirectionFinder = js.native
  def setOrigin(latitude: stdLib.Number, longitude: stdLib.Number): DirectionFinder = js.native
  def setRegion(region: java.lang.String): DirectionFinder = js.native
}

