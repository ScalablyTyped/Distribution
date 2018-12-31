package typings
package expressDashWsLib.expressDashWsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressWsNs {
  type Application = expressLib.expressMod.eNs.Application with WithWebsocketMethod
  type Router = expressLib.expressMod.eNs.Router with WithWebsocketMethod
  type WebsocketMethod[T] = js.Function2[
    /* route */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.PathParams, 
    /* repeated */ WebsocketRequestHandler, 
    T
  ]
  type WebsocketRequestHandler = js.Function3[
    /* ws */ wsLib.wsMod.namespaced, 
    /* req */ expressLib.expressMod.eNs.Request, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    scala.Unit
  ]
}
