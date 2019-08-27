package typings.expressDashPinoDashLogger

import typings.pino.pinoMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Logger extends js.Object {
  var logger: js.UndefOr[Logger] = js.undefined
}

object Anon_Logger {
  @scala.inline
  def apply(logger: Logger = null): Anon_Logger = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(logger)
    __obj.asInstanceOf[Anon_Logger]
  }
}

