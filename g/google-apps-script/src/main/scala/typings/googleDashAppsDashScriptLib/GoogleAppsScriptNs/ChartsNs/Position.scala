package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

@JSGlobal("GoogleAppsScript.Charts.Position")
@js.native
object Position extends js.Object {
  @js.native
  sealed trait BOTTOM
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Position
  
  @js.native
  sealed trait NONE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Position
  
  @js.native
  sealed trait RIGHT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Position
  
  @js.native
  sealed trait TOP
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Position
  
  val BOTTOM: BOTTOM with java.lang.String = js.native
  val NONE: NONE with java.lang.String = js.native
  val RIGHT: RIGHT with java.lang.String = js.native
  val TOP: TOP with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Position with java.lang.String
  ] = js.native
}

