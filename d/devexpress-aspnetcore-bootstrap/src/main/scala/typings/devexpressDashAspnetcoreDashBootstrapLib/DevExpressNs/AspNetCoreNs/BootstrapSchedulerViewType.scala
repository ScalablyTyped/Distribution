package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BootstrapSchedulerViewType extends js.Object

@JSGlobal("DevExpress.AspNetCore.BootstrapSchedulerViewType")
@js.native
object BootstrapSchedulerViewType extends js.Object {
  @js.native
  sealed trait Agenda
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerViewType
  
  @js.native
  sealed trait Day
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerViewType
  
  @js.native
  sealed trait FullWeek
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerViewType
  
  @js.native
  sealed trait Month
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerViewType
  
  @js.native
  sealed trait Timeline
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerViewType
  
  @js.native
  sealed trait Week
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerViewType
  
  @js.native
  sealed trait WorkWeek
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerViewType
  
  /* "Agenda" */ val Agenda: Agenda with java.lang.String = js.native
  /* "Day" */ val Day: Day with java.lang.String = js.native
  /* "FullWeek" */ val FullWeek: FullWeek with java.lang.String = js.native
  /* "Month" */ val Month: Month with java.lang.String = js.native
  /* "Timeline" */ val Timeline: Timeline with java.lang.String = js.native
  /* "Week" */ val Week: Week with java.lang.String = js.native
  /* "WorkWeek" */ val WorkWeek: WorkWeek with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerViewType with java.lang.String
  ] = js.native
}

