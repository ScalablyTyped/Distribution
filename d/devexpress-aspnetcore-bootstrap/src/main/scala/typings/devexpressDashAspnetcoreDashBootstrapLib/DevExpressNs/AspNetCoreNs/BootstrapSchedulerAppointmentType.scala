package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BootstrapSchedulerAppointmentType extends js.Object

@JSGlobal("DevExpress.AspNetCore.BootstrapSchedulerAppointmentType")
@js.native
object BootstrapSchedulerAppointmentType extends js.Object {
  @js.native
  sealed trait ChangedOccurrence
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerAppointmentType
  
  @js.native
  sealed trait DeletedOccurrence
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerAppointmentType
  
  @js.native
  sealed trait Normal
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerAppointmentType
  
  @js.native
  sealed trait Occurrence
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerAppointmentType
  
  @js.native
  sealed trait Pattern
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerAppointmentType
  
  /* "ChangedOccurrence" */ val ChangedOccurrence: ChangedOccurrence with java.lang.String = js.native
  /* "DeletedOccurrence" */ val DeletedOccurrence: DeletedOccurrence with java.lang.String = js.native
  /* "Normal" */ val Normal: Normal with java.lang.String = js.native
  /* "Occurrence" */ val Occurrence: Occurrence with java.lang.String = js.native
  /* "Pattern" */ val Pattern: Pattern with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerAppointmentType with java.lang.String
  ] = js.native
}

