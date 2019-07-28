package typings.findDashMyDashWay.findDashMyDashWayMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.http2Mod.Http2ServerRequest
import typings.node.http2Mod.Http2ServerResponse
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindResult[V /* <: HTTPVersion */] extends js.Object {
  @JSName("handler")
  var handler_Original: Handler[V] = js.native
  var params: StringDictionary[js.UndefOr[String]] = js.native
  var store: js.Any = js.native
  def handler(
    req: Http2ServerRequest | IncomingMessage,
    res: Http2ServerResponse | ServerResponse,
    params: StringDictionary[js.UndefOr[String]],
    store: js.Any
  ): Unit = js.native
}

