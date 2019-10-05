package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

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
  
  /* "Daily" */ val Daily: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerRecurrenceType.Daily with String = js.native
  /* "Hourly" */ val Hourly: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerRecurrenceType.Hourly with String = js.native
  /* "Monthly" */ val Monthly: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerRecurrenceType.Monthly with String = js.native
  /* "Weekly" */ val Weekly: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerRecurrenceType.Weekly with String = js.native
  /* "Yearly" */ val Yearly: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerRecurrenceType.Yearly with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BootstrapSchedulerRecurrenceType with String] = js.native
}

