package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BootstrapSchedulerAppointmentType extends js.Object

@JSGlobal("DevExpress.AspNetCore.BootstrapSchedulerAppointmentType")
@js.native
object BootstrapSchedulerAppointmentType extends js.Object {
  @js.native
  sealed trait ChangedOccurrence extends BootstrapSchedulerAppointmentType
  
  @js.native
  sealed trait DeletedOccurrence extends BootstrapSchedulerAppointmentType
  
  @js.native
  sealed trait Normal extends BootstrapSchedulerAppointmentType
  
  @js.native
  sealed trait Occurrence extends BootstrapSchedulerAppointmentType
  
  @js.native
  sealed trait Pattern extends BootstrapSchedulerAppointmentType
  
  /* "ChangedOccurrence" */ val ChangedOccurrence: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerAppointmentType.ChangedOccurrence with String = js.native
  /* "DeletedOccurrence" */ val DeletedOccurrence: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerAppointmentType.DeletedOccurrence with String = js.native
  /* "Normal" */ val Normal: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerAppointmentType.Normal with String = js.native
  /* "Occurrence" */ val Occurrence: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerAppointmentType.Occurrence with String = js.native
  /* "Pattern" */ val Pattern: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerAppointmentType.Pattern with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BootstrapSchedulerAppointmentType with String] = js.native
}

