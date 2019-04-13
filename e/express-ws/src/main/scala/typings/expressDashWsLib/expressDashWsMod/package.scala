package typings
package expressDashWsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWsMod {
  type Application = expressLib.expressMod.Application with WithWebsocketMethod
  type Router = expressLib.expressMod.Router with WithWebsocketMethod
  type WebsocketMethod[T] = js.Function2[
    /* route */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.PathParams, 
    /* repeated */ WebsocketRequestHandler, 
    T
  ]
  type WebsocketRequestHandler = js.Function3[
    /* ws */ wsLib.wsMod.^, 
    /* req */ expressLib.expressMod.Request, 
    /* next */ expressLib.expressMod.NextFunction, 
    scala.Unit
  ]
}
