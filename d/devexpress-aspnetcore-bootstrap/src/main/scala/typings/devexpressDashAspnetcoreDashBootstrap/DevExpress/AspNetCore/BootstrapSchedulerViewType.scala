package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BootstrapSchedulerViewType extends js.Object

@JSGlobal("DevExpress.AspNetCore.BootstrapSchedulerViewType")
@js.native
object BootstrapSchedulerViewType extends js.Object {
  @js.native
  sealed trait Agenda extends BootstrapSchedulerViewType
  
  @js.native
  sealed trait Day extends BootstrapSchedulerViewType
  
  @js.native
  sealed trait FullWeek extends BootstrapSchedulerViewType
  
  @js.native
  sealed trait Month extends BootstrapSchedulerViewType
  
  @js.native
  sealed trait Timeline extends BootstrapSchedulerViewType
  
  @js.native
  sealed trait Week extends BootstrapSchedulerViewType
  
  @js.native
  sealed trait WorkWeek extends BootstrapSchedulerViewType
  
  /* "Agenda" */ val Agenda: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerViewType.Agenda with String = js.native
  /* "Day" */ val Day: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerViewType.Day with String = js.native
  /* "FullWeek" */ val FullWeek: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerViewType.FullWeek with String = js.native
  /* "Month" */ val Month: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerViewType.Month with String = js.native
  /* "Timeline" */ val Timeline: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerViewType.Timeline with String = js.native
  /* "Week" */ val Week: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerViewType.Week with String = js.native
  /* "WorkWeek" */ val WorkWeek: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerViewType.WorkWeek with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BootstrapSchedulerViewType with String] = js.native
}

