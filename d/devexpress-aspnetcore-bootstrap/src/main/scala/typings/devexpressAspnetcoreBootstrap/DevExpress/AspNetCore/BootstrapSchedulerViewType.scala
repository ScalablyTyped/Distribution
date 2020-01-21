package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BootstrapSchedulerViewType with String] = js.native
  /* "Agenda" */ @js.native
  object Agenda extends TopLevel[Agenda with String]
  
  /* "Day" */ @js.native
  object Day extends TopLevel[Day with String]
  
  /* "FullWeek" */ @js.native
  object FullWeek extends TopLevel[FullWeek with String]
  
  /* "Month" */ @js.native
  object Month extends TopLevel[Month with String]
  
  /* "Timeline" */ @js.native
  object Timeline extends TopLevel[Timeline with String]
  
  /* "Week" */ @js.native
  object Week extends TopLevel[Week with String]
  
  /* "WorkWeek" */ @js.native
  object WorkWeek extends TopLevel[WorkWeek with String]
  
}

