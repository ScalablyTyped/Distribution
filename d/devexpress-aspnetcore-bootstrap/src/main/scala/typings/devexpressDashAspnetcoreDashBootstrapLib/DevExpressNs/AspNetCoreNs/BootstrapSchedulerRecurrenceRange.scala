package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BootstrapSchedulerRecurrenceRange extends js.Object

@JSGlobal("DevExpress.AspNetCore.BootstrapSchedulerRecurrenceRange")
@js.native
object BootstrapSchedulerRecurrenceRange extends js.Object {
  @js.native
  sealed trait EndByDate
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerRecurrenceRange
  
  @js.native
  sealed trait NoEndDate
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerRecurrenceRange
  
  @js.native
  sealed trait OccurrenceCount
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerRecurrenceRange
  
  /* "EndByDate" */ val EndByDate: EndByDate with java.lang.String = js.native
  /* "NoEndDate" */ val NoEndDate: NoEndDate with java.lang.String = js.native
  /* "OccurrenceCount" */ val OccurrenceCount: OccurrenceCount with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerRecurrenceRange with java.lang.String
  ] = js.native
}

