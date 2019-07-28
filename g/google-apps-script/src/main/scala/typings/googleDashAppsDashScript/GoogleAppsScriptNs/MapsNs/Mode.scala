package typings.googleDashAppsDashScript.GoogleAppsScriptNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mode extends js.Object

@JSGlobal("GoogleAppsScript.Maps.Mode")
@js.native
object Mode extends js.Object {
  @js.native
  sealed trait BICYCLING extends Mode
  
  @js.native
  sealed trait DRIVING extends Mode
  
  @js.native
  sealed trait TRANSIT extends Mode
  
  @js.native
  sealed trait WALKING extends Mode
  
  /* 2 */ val BICYCLING: typings.googleDashAppsDashScript.GoogleAppsScriptNs.MapsNs.Mode.BICYCLING with Double = js.native
  /* 0 */ val DRIVING: typings.googleDashAppsDashScript.GoogleAppsScriptNs.MapsNs.Mode.DRIVING with Double = js.native
  /* 3 */ val TRANSIT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.MapsNs.Mode.TRANSIT with Double = js.native
  /* 1 */ val WALKING: typings.googleDashAppsDashScript.GoogleAppsScriptNs.MapsNs.Mode.WALKING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Mode with Double] = js.native
}

