package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
