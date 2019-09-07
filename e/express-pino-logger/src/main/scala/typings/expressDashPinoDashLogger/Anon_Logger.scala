package typings.expressDashPinoDashLogger

import typings.pino.pinoMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Logger extends js.Object {
  var logger: Logger
}

object Anon_Logger {
  @scala.inline
  def apply(logger: Logger): Anon_Logger = {
    val __obj = js.Dynamic.literal(logger = logger)
  
    __obj.asInstanceOf[Anon_Logger]
  }
}

