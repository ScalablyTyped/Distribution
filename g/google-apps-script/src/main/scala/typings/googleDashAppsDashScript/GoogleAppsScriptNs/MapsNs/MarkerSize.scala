package typings.googleDashAppsDashScript.GoogleAppsScriptNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerSize extends js.Object

@JSGlobal("GoogleAppsScript.Maps.MarkerSize")
@js.native
object MarkerSize extends js.Object {
  @js.native
  sealed trait MID extends MarkerSize
  
  @js.native
  sealed trait SMALL extends MarkerSize
  
  @js.native
  sealed trait TINY extends MarkerSize
  
  /* 1 */ val MID: typings.googleDashAppsDashScript.GoogleAppsScriptNs.MapsNs.MarkerSize.MID with Double = js.native
  /* 2 */ val SMALL: typings.googleDashAppsDashScript.GoogleAppsScriptNs.MapsNs.MarkerSize.SMALL with Double = js.native
  /* 0 */ val TINY: typings.googleDashAppsDashScript.GoogleAppsScriptNs.MapsNs.MarkerSize.TINY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerSize with Double] = js.native
}

