package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.TopLevel
import typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerAppointmentType.ChangedOccurrence
import typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerAppointmentType.DeletedOccurrence
import typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerAppointmentType.Normal
import typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerAppointmentType.Occurrence
import typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerAppointmentType.Pattern
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BootstrapSchedulerAppointmentType with String] = js.native
  /* "ChangedOccurrence" */ @js.native
  object ChangedOccurrence extends TopLevel[ChangedOccurrence with String]
  
  /* "DeletedOccurrence" */ @js.native
  object DeletedOccurrence extends TopLevel[DeletedOccurrence with String]
  
  /* "Normal" */ @js.native
  object Normal extends TopLevel[Normal with String]
  
  /* "Occurrence" */ @js.native
  object Occurrence extends TopLevel[Occurrence with String]
  
  /* "Pattern" */ @js.native
  object Pattern extends TopLevel[Pattern with String]
  
}

