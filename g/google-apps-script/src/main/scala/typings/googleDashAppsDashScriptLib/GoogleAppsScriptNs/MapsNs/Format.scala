package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Format extends js.Object

@JSGlobal("GoogleAppsScript.Maps.Format")
@js.native
object Format extends js.Object {
  @js.native
  sealed trait GIF
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Format
  
  @js.native
  sealed trait JPG
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Format
  
  @js.native
  sealed trait JPG_BASELINE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Format
  
  @js.native
  sealed trait PNG
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Format
  
  @js.native
  sealed trait PNG32
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Format
  
  @js.native
  sealed trait PNG8
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Format
  
  /* 3 */ val GIF: GIF with scala.Double = js.native
  /* 4 */ val JPG: JPG with scala.Double = js.native
  /* 5 */ val JPG_BASELINE: JPG_BASELINE with scala.Double = js.native
  /* 0 */ val PNG: PNG with scala.Double = js.native
  /* 2 */ val PNG32: PNG32 with scala.Double = js.native
  /* 1 */ val PNG8: PNG8 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Format with scala.Double] = js.native
}

