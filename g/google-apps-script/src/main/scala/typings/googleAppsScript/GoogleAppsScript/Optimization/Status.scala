package typings.googleAppsScript.GoogleAppsScript.Optimization

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
  /* 4 */ @js.native
  object ABNORMAL extends TopLevel[ABNORMAL with Double]
  
  /* 1 */ @js.native
  object FEASIBLE extends TopLevel[FEASIBLE with Double]
  
  /* 2 */ @js.native
  object INFEASIBLE extends TopLevel[INFEASIBLE with Double]
  
  /* 5 */ @js.native
  object MODEL_INVALID extends TopLevel[MODEL_INVALID with Double]
  
  /* 6 */ @js.native
  object NOT_SOLVED extends TopLevel[NOT_SOLVED with Double]
  
  /* 0 */ @js.native
  object OPTIMAL extends TopLevel[OPTIMAL with Double]
  
  /* 3 */ @js.native
  object UNBOUNDED extends TopLevel[UNBOUNDED with Double]
  
}

