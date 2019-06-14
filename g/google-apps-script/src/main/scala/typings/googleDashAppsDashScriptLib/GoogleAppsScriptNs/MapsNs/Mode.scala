package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mode extends js.Object

@JSGlobal("GoogleAppsScript.Maps.Mode")
@js.native
object Mode extends js.Object {
  @js.native
  sealed trait BICYCLING
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Mode
  
  @js.native
  sealed trait DRIVING
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Mode
  
  @js.native
  sealed trait TRANSIT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Mode
  
  @js.native
  sealed trait WALKING
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Mode
  
  /* 2 */ val BICYCLING: BICYCLING with scala.Double = js.native
  /* 0 */ val DRIVING: DRIVING with scala.Double = js.native
  /* 3 */ val TRANSIT: TRANSIT with scala.Double = js.native
  /* 1 */ val WALKING: WALKING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Mode with scala.Double] = js.native
}

