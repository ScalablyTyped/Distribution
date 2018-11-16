package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BootstrapSchedulerRecurrenceType extends js.Object

@JSGlobal("DevExpress.AspNetCore.BootstrapSchedulerRecurrenceType")
@js.native
object BootstrapSchedulerRecurrenceType extends js.Object {
  @js.native
  sealed trait Daily
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerRecurrenceType
  
  @js.native
  sealed trait Hourly
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerRecurrenceType
  
  @js.native
  sealed trait Monthly
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerRecurrenceType
  
  @js.native
  sealed trait Weekly
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerRecurrenceType
  
  @js.native
  sealed trait Yearly
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerRecurrenceType
  
  /* "Daily" */ val Daily: Daily with java.lang.String = js.native
  /* "Hourly" */ val Hourly: Hourly with java.lang.String = js.native
  /* "Monthly" */ val Monthly: Monthly with java.lang.String = js.native
  /* "Weekly" */ val Weekly: Weekly with java.lang.String = js.native
  /* "Yearly" */ val Yearly: Yearly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerRecurrenceType with java.lang.String
  ] = js.native
}

