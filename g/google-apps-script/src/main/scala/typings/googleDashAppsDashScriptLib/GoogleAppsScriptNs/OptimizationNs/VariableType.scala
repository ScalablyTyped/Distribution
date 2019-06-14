package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VariableType extends js.Object

@JSGlobal("GoogleAppsScript.Optimization.VariableType")
@js.native
object VariableType extends js.Object {
  @js.native
  sealed trait CONTINUOUS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs.VariableType
  
  @js.native
  sealed trait INTEGER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs.VariableType
  
  /* 1 */ val CONTINUOUS: CONTINUOUS with scala.Double = js.native
  /* 0 */ val INTEGER: INTEGER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs.VariableType with scala.Double
  ] = js.native
}

