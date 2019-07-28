package typings.expressDashSocketDotIoDashSession.expressDashSocketDotIoDashSessionMod

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-socket.io-session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(expressSessionMiddleware: RequestHandler): SocketIoSharedSessionMiddleware = js.native
  def apply(expressSessionMiddleware: RequestHandler, cookieParserMiddleware: RequestHandler): SocketIoSharedSessionMiddleware = js.native
  def apply(
    expressSessionMiddleware: RequestHandler,
    cookieParserMiddleware: RequestHandler,
    options: SharedSessionOptions
  ): SocketIoSharedSessionMiddleware = js.native
  def apply(expressSessionMiddleware: RequestHandler, options: SharedSessionOptions): SocketIoSharedSessionMiddleware = js.native
}

