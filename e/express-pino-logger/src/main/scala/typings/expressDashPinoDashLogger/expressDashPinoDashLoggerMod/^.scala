package typings.expressDashPinoDashLogger.expressDashPinoDashLoggerMod

import typings.pino.pinoMod.DestinationStream
import typings.pinoDashHttp.pinoDashHttpMod.HttpLogger
import typings.pinoDashHttp.pinoDashHttpMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-pino-logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): HttpLogger = js.native
  def apply(opts: Options): HttpLogger = js.native
  def apply(opts: Options, stream: DestinationStream): HttpLogger = js.native
  def apply(stream: DestinationStream): HttpLogger = js.native
}

