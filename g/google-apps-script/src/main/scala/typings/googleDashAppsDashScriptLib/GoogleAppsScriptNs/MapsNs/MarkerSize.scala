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
  
  val MID: MID with java.lang.String = js.native
  val SMALL: SMALL with java.lang.String = js.native
  val TINY: TINY with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.MarkerSize with java.lang.String
  ] = js.native
}

