package typings
package expressDashWinstonLib.expressDashWinstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-winston", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var bodyBlacklist: js.Array[java.lang.String] = js.native
  var bodyWhitelist: js.Array[java.lang.String] = js.native
  var defaultRequestFilter: RequestFilter = js.native
  var defaultResponseFilter: ResponseFilter = js.native
  var ignoredRoutes: js.Array[java.lang.String] = js.native
  var requestWhitelist: js.Array[java.lang.String] = js.native
  var responseWhitelist: js.Array[java.lang.String] = js.native
  def defaultSkip(): scala.Boolean = js.native
  def errorLogger(options: ErrorLoggerOptions): expressLib.expressMod.ErrorRequestHandler = js.native
  def logger(options: LoggerOptions): expressLib.expressMod.Handler = js.native
}

