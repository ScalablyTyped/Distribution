package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BootstrapSchedulerRecurrenceType extends js.Object

@JSGlobal("DevExpress.AspNetCore.BootstrapSchedulerRecurrenceType")
@js.native
object BootstrapSchedulerRecurrenceType extends js.Object {
  @js.native
  sealed trait Daily extends BootstrapSchedulerRecurrenceType
  
  @js.native
  sealed trait Hourly extends BootstrapSchedulerRecurrenceType
  
  @js.native
  sealed trait Monthly extends BootstrapSchedulerRecurrenceType
  
  @js.native
  sealed trait Weekly extends BootstrapSchedulerRecurrenceType
  
  @js.native
  sealed trait Yearly extends BootstrapSchedulerRecurrenceType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BootstrapSchedulerRecurrenceType with String] = js.native
  /* "Daily" */ @js.native
  object Daily extends TopLevel[Daily with String]
  
  /* "Hourly" */ @js.native
  object Hourly extends TopLevel[Hourly with String]
  
  /* "Monthly" */ @js.native
  object Monthly extends TopLevel[Monthly with String]
  
  /* "Weekly" */ @js.native
  object Weekly extends TopLevel[Weekly with String]
  
  /* "Yearly" */ @js.native
  object Yearly extends TopLevel[Yearly with String]
  
}

