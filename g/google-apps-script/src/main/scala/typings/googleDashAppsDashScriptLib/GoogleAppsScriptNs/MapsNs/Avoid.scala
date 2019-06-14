package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Avoid extends js.Object

@JSGlobal("GoogleAppsScript.Maps.Avoid")
@js.native
object Avoid extends js.Object {
  @js.native
  sealed trait HIGHWAYS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Avoid
  
  @js.native
  sealed trait TOLLS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Avoid
  
  /* 1 */ val HIGHWAYS: HIGHWAYS with scala.Double = js.native
  /* 0 */ val TOLLS: TOLLS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Avoid with scala.Double] = js.native
}

