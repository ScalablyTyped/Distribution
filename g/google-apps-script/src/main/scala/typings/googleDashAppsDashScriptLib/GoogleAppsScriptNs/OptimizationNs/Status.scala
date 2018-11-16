package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Status extends js.Object

@JSGlobal("GoogleAppsScript.Optimization.Status")
@js.native
object Status extends js.Object {
  @js.native
  sealed trait ABNORMAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs.Status
  
  @js.native
  sealed trait FEASIBLE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs.Status
  
  @js.native
  sealed trait INFEASIBLE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs.Status
  
  @js.native
  sealed trait MODEL_INVALID
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs.Status
  
  @js.native
  sealed trait NOT_SOLVED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs.Status
  
  @js.native
  sealed trait OPTIMAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs.Status
  
  @js.native
  sealed trait UNBOUNDED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs.Status
  
  val ABNORMAL: ABNORMAL with java.lang.String = js.native
  val FEASIBLE: FEASIBLE with java.lang.String = js.native
  val INFEASIBLE: INFEASIBLE with java.lang.String = js.native
  val MODEL_INVALID: MODEL_INVALID with java.lang.String = js.native
  val NOT_SOLVED: NOT_SOLVED with java.lang.String = js.native
  val OPTIMAL: OPTIMAL with java.lang.String = js.native
  val UNBOUNDED: UNBOUNDED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs.Status with java.lang.String
  ] = js.native
}

