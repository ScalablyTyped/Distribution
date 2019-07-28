package typings.expressDashWinston.expressDashWinstonMod

import typings.express.expressMod.ErrorRequestHandler
import typings.express.expressMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-winston", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var bodyBlacklist: js.Array[String] = js.native
  var bodyWhitelist: js.Array[String] = js.native
  var defaultRequestFilter: RequestFilter = js.native
  var defaultResponseFilter: ResponseFilter = js.native
  var ignoredRoutes: js.Array[String] = js.native
  var requestWhitelist: js.Array[String] = js.native
  var responseWhitelist: js.Array[String] = js.native
  def defaultSkip(): Boolean = js.native
  def errorLogger(options: ErrorLoggerOptions): ErrorRequestHandler = js.native
  def logger(options: LoggerOptions): Handler = js.native
}

