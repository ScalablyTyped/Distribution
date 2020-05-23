package typings.eggLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions extends js.Object {
  var allowDebugAtProd: js.UndefOr[Boolean] = js.undefined
  var consoleLevel: js.UndefOr[LoggerLevel] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[LoggerLevel] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(
    allowDebugAtProd: js.UndefOr[Boolean] = js.undefined,
    consoleLevel: LoggerLevel = null,
    encoding: String = null,
    level: LoggerLevel = null
  ): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDebugAtProd)) __obj.updateDynamic("allowDebugAtProd")(allowDebugAtProd.get.asInstanceOf[js.Any])
    if (consoleLevel != null) __obj.updateDynamic("consoleLevel")(consoleLevel.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptions]
  }
}

