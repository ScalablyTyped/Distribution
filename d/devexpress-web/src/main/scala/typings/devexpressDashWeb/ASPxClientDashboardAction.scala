package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ASPxClientDashboardAction extends js.Object

@JSGlobal("ASPxClientDashboardAction")
@js.native
object ASPxClientDashboardAction extends js.Object {
  @js.native
  sealed trait ClearMasterFilter extends ASPxClientDashboardAction
  
  @js.native
  sealed trait DrillDown extends ASPxClientDashboardAction
  
  @js.native
  sealed trait DrillUp extends ASPxClientDashboardAction
  
  @js.native
  sealed trait SetMasterFilter extends ASPxClientDashboardAction
  
  /* 1 */ val ClearMasterFilter: typings.devexpressDashWeb.ASPxClientDashboardAction.ClearMasterFilter with Double = js.native
  /* 2 */ val DrillDown: typings.devexpressDashWeb.ASPxClientDashboardAction.DrillDown with Double = js.native
  /* 3 */ val DrillUp: typings.devexpressDashWeb.ASPxClientDashboardAction.DrillUp with Double = js.native
  /* 0 */ val SetMasterFilter: typings.devexpressDashWeb.ASPxClientDashboardAction.SetMasterFilter with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ASPxClientDashboardAction with Double] = js.native
}

