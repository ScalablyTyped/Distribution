package typings.expressDashWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWsMod {
  import typings.express.expressMod.NextFunction
  import typings.express.expressMod.Request
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.PathParams

  type Application = typings.express.expressMod.Application with WithWebsocketMethod
  type Router = typings.express.expressMod.Router with WithWebsocketMethod
  type WebsocketMethod[T] = js.Function2[/* route */ PathParams, /* repeated */ WebsocketRequestHandler, T]
  type WebsocketRequestHandler = js.Function3[
    /* ws */ typings.ws.wsMod.^, 
    /* req */ Request[ParamsDictionary], 
    /* next */ NextFunction, 
    Unit
  ]
}
