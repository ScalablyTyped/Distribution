package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BootstrapSchedulerGroupType extends js.Object

@JSGlobal("DevExpress.AspNetCore.BootstrapSchedulerGroupType")
@js.native
object BootstrapSchedulerGroupType extends js.Object {
  @js.native
  sealed trait Date
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerGroupType
  
  @js.native
  sealed trait None
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerGroupType
  
  @js.native
  sealed trait Resource
    extends devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerGroupType
  
  /* "Date" */ val Date: Date with java.lang.String = js.native
  /* "None" */ val None: None with java.lang.String = js.native
  /* "Resource" */ val Resource: Resource with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs.BootstrapSchedulerGroupType with java.lang.String
  ] = js.native
}

