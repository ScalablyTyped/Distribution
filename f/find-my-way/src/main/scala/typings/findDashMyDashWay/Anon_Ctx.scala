package typings.findDashMyDashWay

import typings.findDashMyDashWay.findDashMyDashWayMod.HTTPVersion
import typings.node.http2Mod.Http2ServerRequest
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Ctx[V /* <: HTTPVersion */] extends js.Object {
  def deriveVersion[Context](req: Http2ServerRequest | IncomingMessage): String = js.native
  def deriveVersion[Context](req: Http2ServerRequest | IncomingMessage, ctx: Context): String = js.native
  def storage(): Anon_Del[V] = js.native
}

