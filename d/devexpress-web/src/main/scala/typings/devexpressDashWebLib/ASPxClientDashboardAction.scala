package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ASPxClientDashboardAction extends js.Object

@JSGlobal("ASPxClientDashboardAction")
@js.native
object ASPxClientDashboardAction extends js.Object {
  @js.native
  sealed trait ClearMasterFilter
    extends devexpressDashWebLib.ASPxClientDashboardAction
  
  @js.native
  sealed trait DrillDown
    extends devexpressDashWebLib.ASPxClientDashboardAction
  
  @js.native
  sealed trait DrillUp
    extends devexpressDashWebLib.ASPxClientDashboardAction
  
  @js.native
  sealed trait SetMasterFilter
    extends devexpressDashWebLib.ASPxClientDashboardAction
  
  /* 1 */ val ClearMasterFilter: ClearMasterFilter with scala.Double = js.native
  /* 2 */ val DrillDown: DrillDown with scala.Double = js.native
  /* 3 */ val DrillUp: DrillUp with scala.Double = js.native
  /* 0 */ val SetMasterFilter: SetMasterFilter with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.ASPxClientDashboardAction with scala.Double] = js.native
}

