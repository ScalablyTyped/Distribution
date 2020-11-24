package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BootstrapSchedulerRecurrenceRange extends js.Object
@JSGlobal("DevExpress.AspNetCore.BootstrapSchedulerRecurrenceRange")
@js.native
object BootstrapSchedulerRecurrenceRange extends js.Object {
  
  @js.native
  sealed trait EndByDate extends BootstrapSchedulerRecurrenceRange
  
  @js.native
  sealed trait NoEndDate extends BootstrapSchedulerRecurrenceRange
  
  @js.native
  sealed trait OccurrenceCount extends BootstrapSchedulerRecurrenceRange
}
