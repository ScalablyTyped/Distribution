package typings
package expressDashOpenapiLib.expressDashOpenapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationFunction
  extends expressLib.expressMod.eNs.RequestHandler
     with Operation {
  var apiDoc: js.UndefOr[expressDashOpenapiLib.expressDashOpenapiMod.OpenApiNs.OperationObject] = js.native
  /* InferMemberOverrides */
  override def apply(
    T0: /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    T1: /* res */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response,
    T2: /* next */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.NextFunction
  ): js.Any = js.native
}

