package typings.expressDashWs

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.PathParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWsMod {
  type Application = typings.express.expressMod.Application with WithWebsocketMethod
  type Router = typings.express.expressMod.Router with WithWebsocketMethod
  type WebsocketMethod[T] = js.Function2[/* route */ PathParams, /* repeated */ WebsocketRequestHandler, T]
  type WebsocketRequestHandler = js.Function3[/* ws */ typings.ws.wsMod.^, /* req */ Request, /* next */ NextFunction, Unit]
}
