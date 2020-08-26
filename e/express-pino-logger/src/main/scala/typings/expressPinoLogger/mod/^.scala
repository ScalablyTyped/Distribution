package typings.expressPinoLogger.mod

import typings.pino.mod.DestinationStream
import typings.pinoHttp.mod.HttpLogger
import typings.pinoHttp.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-pino-logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): HttpLogger = js.native
  def apply(opts: js.UndefOr[scala.Nothing], stream: DestinationStream): HttpLogger = js.native
  def apply(opts: Options): HttpLogger = js.native
  def apply(opts: Options, stream: DestinationStream): HttpLogger = js.native
  def apply(stream: DestinationStream): HttpLogger = js.native
}

