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
  
  val BICYCLING: BICYCLING with java.lang.String = js.native
  val DRIVING: DRIVING with java.lang.String = js.native
  val TRANSIT: TRANSIT with java.lang.String = js.native
  val WALKING: WALKING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Mode with java.lang.String] = js.native
}

