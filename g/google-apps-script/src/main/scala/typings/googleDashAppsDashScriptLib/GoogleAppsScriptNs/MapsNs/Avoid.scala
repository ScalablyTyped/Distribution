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
  
  val HIGHWAYS: HIGHWAYS with java.lang.String = js.native
  val TOLLS: TOLLS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Avoid with java.lang.String
  ] = js.native
}

