package typings.expressDashAsyncDashWrap

import typings.connect.connectMod.NextFunction
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ErrorRequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-async-wrap", JSImport.Namespace)
@js.native
object expressDashAsyncDashWrapMod extends js.Object {
  def default(
    handler: js.Function3[
      /* req */ Request[ParamsDictionary], 
      /* res */ Response, 
      /* next */ NextFunction, 
      js.Promise[Unit]
    ]
  ): RequestHandler[ParamsDictionary] = js.native
  def default(
    handler: js.Function4[
      /* err */ js.Any, 
      /* req */ Request[ParamsDictionary], 
      /* res */ Response, 
      /* next */ NextFunction, 
      js.Promise[Unit]
    ]
  ): ErrorRequestHandler[ParamsDictionary] = js.native
}

