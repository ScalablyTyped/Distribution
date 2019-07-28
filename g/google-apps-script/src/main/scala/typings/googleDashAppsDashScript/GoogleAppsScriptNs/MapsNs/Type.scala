package typings.googleDashAppsDashScript.GoogleAppsScriptNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("GoogleAppsScript.Maps.Type")
@js.native
object Type extends js.Object {
  @js.native
  sealed trait HYBRID extends Type
  
  @js.native
  sealed trait ROADMAP extends Type
  
  @js.native
  sealed trait SATELLITE extends Type
  
  @js.native
  sealed trait TERRAIN extends Type
  
  /* 3 */ val HYBRID: typings.googleDashAppsDashScript.GoogleAppsScriptNs.MapsNs.Type.HYBRID with Double = js.native
  /* 0 */ val ROADMAP: typings.googleDashAppsDashScript.GoogleAppsScriptNs.MapsNs.Type.ROADMAP with Double = js.native
  /* 1 */ val SATELLITE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.MapsNs.Type.SATELLITE with Double = js.native
  /* 2 */ val TERRAIN: typings.googleDashAppsDashScript.GoogleAppsScriptNs.MapsNs.Type.TERRAIN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
}

