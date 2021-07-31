package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BootstrapSchedulerRecurrenceType extends StObject
@JSGlobal("DevExpress.AspNetCore.BootstrapSchedulerRecurrenceType")
@js.native
object BootstrapSchedulerRecurrenceType extends StObject {
  
  @js.native
  sealed trait Daily
    extends StObject
       with BootstrapSchedulerRecurrenceType
  
  @js.native
  sealed trait Hourly
    extends StObject
       with BootstrapSchedulerRecurrenceType
  
  @js.native
  sealed trait Monthly
    extends StObject
       with BootstrapSchedulerRecurrenceType
  
  @js.native
  sealed trait Weekly
    extends StObject
       with BootstrapSchedulerRecurrenceType
  
  @js.native
  sealed trait Yearly
    extends StObject
       with BootstrapSchedulerRecurrenceType
}
