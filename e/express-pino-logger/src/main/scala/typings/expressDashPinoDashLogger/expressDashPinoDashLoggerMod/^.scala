package typings.expressDashPinoDashLogger.expressDashPinoDashLoggerMod

import typings.express.expressMod.Handler
import typings.expressDashPinoDashLogger.Anon_Logger
import typings.pino.pinoMod.LoggerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-pino-logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Handler = js.native
  def apply(options: LoggerOptions | Anon_Logger): Handler = js.native
}

