package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BootstrapSchedulerGroupType extends js.Object

@JSGlobal("DevExpress.AspNetCore.BootstrapSchedulerGroupType")
@js.native
object BootstrapSchedulerGroupType extends js.Object {
  @js.native
  sealed trait Date extends BootstrapSchedulerGroupType
  
  @js.native
  sealed trait None extends BootstrapSchedulerGroupType
  
  @js.native
  sealed trait Resource extends BootstrapSchedulerGroupType
  
  /* "Date" */ val Date: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerGroupType.Date with String = js.native
  /* "None" */ val None: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerGroupType.None with String = js.native
  /* "Resource" */ val Resource: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.BootstrapSchedulerGroupType.Resource with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BootstrapSchedulerGroupType with String] = js.native
}

