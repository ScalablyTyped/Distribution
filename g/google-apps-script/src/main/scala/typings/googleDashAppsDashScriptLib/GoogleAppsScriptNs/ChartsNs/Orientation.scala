package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSGlobal("GoogleAppsScript.Charts.Orientation")
@js.native
object Orientation extends js.Object {
  @js.native
  sealed trait HORIZONTAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Orientation
  
  @js.native
  sealed trait VERTICAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Orientation
  
  val HORIZONTAL: HORIZONTAL with java.lang.String = js.native
  val VERTICAL: VERTICAL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Orientation with java.lang.String
  ] = js.native
}

