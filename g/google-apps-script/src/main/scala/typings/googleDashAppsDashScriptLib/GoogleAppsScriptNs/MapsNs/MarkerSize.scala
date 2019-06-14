package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerSize extends js.Object

@JSGlobal("GoogleAppsScript.Maps.MarkerSize")
@js.native
object MarkerSize extends js.Object {
  @js.native
  sealed trait MID
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.MarkerSize
  
  @js.native
  sealed trait SMALL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.MarkerSize
  
  @js.native
  sealed trait TINY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.MarkerSize
  
  /* 1 */ val MID: MID with scala.Double = js.native
  /* 2 */ val SMALL: SMALL with scala.Double = js.native
  /* 0 */ val TINY: TINY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.MarkerSize with scala.Double
  ] = js.native
}

