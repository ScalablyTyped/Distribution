package typings.expressOpenapi.mod

import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.RequestHandler
import typings.expressServeStaticCore.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationFunction
  extends RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
     with Operation {
  var apiDoc: js.UndefOr[typings.openapiTypes.mod.OpenAPI.Operation] = js.native
  /* InferMemberOverrides */
  override def apply(
    T0: /* req */ Request[ParamsDictionary, js.Any, js.Any, Query],
    T1: /* res */ Response[js.Any],
    T2: /* next */ NextFunction
  ): js.Any = js.native
}

