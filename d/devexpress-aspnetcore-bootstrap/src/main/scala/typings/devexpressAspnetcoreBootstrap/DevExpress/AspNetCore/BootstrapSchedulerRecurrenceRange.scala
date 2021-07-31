package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BootstrapSchedulerRecurrenceRange extends StObject
@JSGlobal("DevExpress.AspNetCore.BootstrapSchedulerRecurrenceRange")
@js.native
object BootstrapSchedulerRecurrenceRange extends StObject {
  
  @js.native
  sealed trait EndByDate
    extends StObject
       with BootstrapSchedulerRecurrenceRange
  
  @js.native
  sealed trait NoEndDate
    extends StObject
       with BootstrapSchedulerRecurrenceRange
  
  @js.native
  sealed trait OccurrenceCount
    extends StObject
       with BootstrapSchedulerRecurrenceRange
}
