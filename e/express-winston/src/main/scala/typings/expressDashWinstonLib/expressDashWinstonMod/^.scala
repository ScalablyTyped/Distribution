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
  var defaultRequestFilter: expressDashWinstonLib.expressDashWinstonMod.RequestFilter = js.native
  var defaultResponseFilter: expressDashWinstonLib.expressDashWinstonMod.ResponseFilter = js.native
  var ignoredRoutes: js.Array[java.lang.String] = js.native
  var requestWhitelist: js.Array[java.lang.String] = js.native
  var responseWhitelist: js.Array[java.lang.String] = js.native
  def defaultSkip(): scala.Boolean = js.native
  def errorLogger(options: expressDashWinstonLib.expressDashWinstonMod.ErrorLoggerOptions): expressLib.expressMod.eNs.ErrorRequestHandler = js.native
  def logger(options: expressDashWinstonLib.expressDashWinstonMod.LoggerOptions): expressLib.expressMod.eNs.Handler = js.native
}

