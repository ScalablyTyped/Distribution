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
  
  val GIF: GIF with java.lang.String = js.native
  val JPG: JPG with java.lang.String = js.native
  val JPG_BASELINE: JPG_BASELINE with java.lang.String = js.native
  val PNG: PNG with java.lang.String = js.native
  val PNG32: PNG32 with java.lang.String = js.native
  val PNG8: PNG8 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.MapsNs.Format with java.lang.String
  ] = js.native
}

