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
  
  /* 4 */ val ABNORMAL: ABNORMAL with scala.Double = js.native
  /* 1 */ val FEASIBLE: FEASIBLE with scala.Double = js.native
  /* 2 */ val INFEASIBLE: INFEASIBLE with scala.Double = js.native
  /* 5 */ val MODEL_INVALID: MODEL_INVALID with scala.Double = js.native
  /* 6 */ val NOT_SOLVED: NOT_SOLVED with scala.Double = js.native
  /* 0 */ val OPTIMAL: OPTIMAL with scala.Double = js.native
  /* 3 */ val UNBOUNDED: UNBOUNDED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.OptimizationNs.Status with scala.Double
  ] = js.native
}

