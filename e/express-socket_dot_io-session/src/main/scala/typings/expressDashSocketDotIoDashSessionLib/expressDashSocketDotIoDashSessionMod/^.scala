package typings
package expressDashSocketDotIoDashSessionLib.expressDashSocketDotIoDashSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-socket.io-session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(expressSessionMiddleware: expressLib.expressMod.RequestHandler): SocketIoSharedSessionMiddleware = js.native
  def apply(
    expressSessionMiddleware: expressLib.expressMod.RequestHandler,
    cookieParserMiddleware: expressLib.expressMod.RequestHandler
  ): SocketIoSharedSessionMiddleware = js.native
  def apply(
    expressSessionMiddleware: expressLib.expressMod.RequestHandler,
    cookieParserMiddleware: expressLib.expressMod.RequestHandler,
    options: SharedSessionOptions
  ): SocketIoSharedSessionMiddleware = js.native
  def apply(expressSessionMiddleware: expressLib.expressMod.RequestHandler, options: SharedSessionOptions): SocketIoSharedSessionMiddleware = js.native
}

