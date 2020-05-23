package typings.googleAppsScript.GoogleAppsScript.Optimization

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
  
}

