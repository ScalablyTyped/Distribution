package typings.expressDashBunyanDashLogger.expressDashBunyanDashLoggerMod

import typings.express.expressMod.ErrorRequestHandler
import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-bunyan-logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RequestHandler = js.native
  def apply(options: Options): RequestHandler = js.native
  def errorLogger(): ErrorRequestHandler = js.native
  def errorLogger(options: Options): ErrorRequestHandler = js.native
}

