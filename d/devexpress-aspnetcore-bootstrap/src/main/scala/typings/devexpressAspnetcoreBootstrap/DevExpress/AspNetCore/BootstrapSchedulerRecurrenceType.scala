package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
