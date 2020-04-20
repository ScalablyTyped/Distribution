package typings.expressAsyncWrap

import typings.connect.mod.NextFunction
import typings.expressServeStaticCore.mod.ErrorRequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.RequestHandler
import typings.expressServeStaticCore.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-async-wrap", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default(
    handler: js.Function3[
      /* req */ Request[ParamsDictionary, _, _, Query], 
      /* res */ Response[_], 
      /* next */ NextFunction, 
      js.Promise[Unit]
    ]
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def default(
    handler: js.Function4[
      /* err */ js.Any, 
      /* req */ Request[ParamsDictionary, _, _, Query], 
      /* res */ Response[_], 
      /* next */ NextFunction, 
      js.Promise[Unit]
    ]
  ): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
}

