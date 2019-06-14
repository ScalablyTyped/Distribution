package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("GoogleAppsScript.Maps.Type")
@js.native
object Type extends js.Object {
  @js.native
  sealed trait HYBRID
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Type
  
  @js.native
  sealed trait ROADMAP
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Type
  
  @js.native
  sealed trait SATELLITE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Type
  
  @js.native
  sealed trait TERRAIN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Type
  
  /* 3 */ val HYBRID: HYBRID with scala.Double = js.native
  /* 0 */ val ROADMAP: ROADMAP with scala.Double = js.native
  /* 1 */ val SATELLITE: SATELLITE with scala.Double = js.native
  /* 2 */ val TERRAIN: TERRAIN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Type with scala.Double] = js.native
}

