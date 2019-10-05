package typings.googleDashAppsDashScript.GoogleAppsScript.Maps

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

