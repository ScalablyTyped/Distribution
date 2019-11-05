package typings.googleDashAppsDashScript.GoogleAppsScript.Optimization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Status extends js.Object

/**
  * Status of the solution. Before solving a problem the status will be NOT_SOLVED;
  * afterwards it will take any of the other values depending if it successfully found a solution and
  * if the solution is optimal.
  */
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
  
  /* 4 */ val ABNORMAL: typings.googleDashAppsDashScript.GoogleAppsScript.Optimization.Status.ABNORMAL with Double = js.native
  /* 1 */ val FEASIBLE: typings.googleDashAppsDashScript.GoogleAppsScript.Optimization.Status.FEASIBLE with Double = js.native
  /* 2 */ val INFEASIBLE: typings.googleDashAppsDashScript.GoogleAppsScript.Optimization.Status.INFEASIBLE with Double = js.native
  /* 5 */ val MODEL_INVALID: typings.googleDashAppsDashScript.GoogleAppsScript.Optimization.Status.MODEL_INVALID with Double = js.native
  /* 6 */ val NOT_SOLVED: typings.googleDashAppsDashScript.GoogleAppsScript.Optimization.Status.NOT_SOLVED with Double = js.native
  /* 0 */ val OPTIMAL: typings.googleDashAppsDashScript.GoogleAppsScript.Optimization.Status.OPTIMAL with Double = js.native
  /* 3 */ val UNBOUNDED: typings.googleDashAppsDashScript.GoogleAppsScript.Optimization.Status.UNBOUNDED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
}

