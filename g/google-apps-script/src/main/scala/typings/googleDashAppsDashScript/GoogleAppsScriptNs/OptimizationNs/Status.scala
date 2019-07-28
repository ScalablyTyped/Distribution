package typings.googleDashAppsDashScript.GoogleAppsScriptNs.OptimizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Status extends js.Object

@JSGlobal("GoogleAppsScript.Optimization.Status")
@js.native
object Status extends js.Object {
  @js.native
  sealed trait ABNORMAL extends Status
  
  @js.native
  sealed trait FEASIBLE extends Status
  
  @js.native
  sealed trait INFEASIBLE extends Status
  
  @js.native
  sealed trait MODEL_INVALID extends Status
  
  @js.native
  sealed trait NOT_SOLVED extends Status
  
  @js.native
  sealed trait OPTIMAL extends Status
  
  @js.native
  sealed trait UNBOUNDED extends Status
  
  /* 4 */ val ABNORMAL: typings.googleDashAppsDashScript.GoogleAppsScriptNs.OptimizationNs.Status.ABNORMAL with Double = js.native
  /* 1 */ val FEASIBLE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.OptimizationNs.Status.FEASIBLE with Double = js.native
  /* 2 */ val INFEASIBLE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.OptimizationNs.Status.INFEASIBLE with Double = js.native
  /* 5 */ val MODEL_INVALID: typings.googleDashAppsDashScript.GoogleAppsScriptNs.OptimizationNs.Status.MODEL_INVALID with Double = js.native
  /* 6 */ val NOT_SOLVED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.OptimizationNs.Status.NOT_SOLVED with Double = js.native
  /* 0 */ val OPTIMAL: typings.googleDashAppsDashScript.GoogleAppsScriptNs.OptimizationNs.Status.OPTIMAL with Double = js.native
  /* 3 */ val UNBOUNDED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.OptimizationNs.Status.UNBOUNDED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
}

