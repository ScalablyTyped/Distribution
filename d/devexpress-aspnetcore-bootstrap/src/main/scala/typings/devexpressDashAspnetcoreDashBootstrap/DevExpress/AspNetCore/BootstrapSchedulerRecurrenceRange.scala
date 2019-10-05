package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* "EndByDate" */ val EndByDate: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerRecurrenceRange.EndByDate with String = js.native
  /* "NoEndDate" */ val NoEndDate: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerRecurrenceRange.NoEndDate with String = js.native
  /* "OccurrenceCount" */ val OccurrenceCount: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerRecurrenceRange.OccurrenceCount with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BootstrapSchedulerRecurrenceRange with String] = js.native
}

