package typings.expressDashOpenapi.expressDashOpenapiMod

import typings.expressDashOpenapi.expressDashOpenapiMod.OpenApiNs.OperationObject
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.NextFunction
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationFunction
  extends RequestHandler
     with Operation {
  var apiDoc: js.UndefOr[OperationObject] = js.native
  /* InferMemberOverrides */
  override def apply(T0: /* req */ Request, T1: /* res */ Response, T2: /* next */ NextFunction): js.Any = js.native
}

