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
  
  val HYBRID: HYBRID with java.lang.String = js.native
  val ROADMAP: ROADMAP with java.lang.String = js.native
  val SATELLITE: SATELLITE with java.lang.String = js.native
  val TERRAIN: TERRAIN with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Type with java.lang.String] = js.native
}

