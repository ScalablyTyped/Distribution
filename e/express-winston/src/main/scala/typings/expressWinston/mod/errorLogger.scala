package typings.expressWinston.mod

import typings.express.mod.ErrorRequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-winston", "errorLogger")
@js.native
object errorLogger extends js.Object {
  def apply(options: ErrorLoggerOptions): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
}

