package typings.findDashMyDashWay

import org.scalablytyped.runtime.StringDictionary
import typings.node.http2Mod.Http2ServerRequest
import typings.node.http2Mod.Http2ServerResponse
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object findDashMyDashWayMod {
  type Handler[V /* <: HTTPVersion */] = js.Function4[
    /* req */ Http2ServerRequest | IncomingMessage, 
    /* res */ Http2ServerResponse | ServerResponse, 
    /* params */ StringDictionary[js.UndefOr[String]], 
    /* store */ js.Any, 
    Unit
  ]
}
