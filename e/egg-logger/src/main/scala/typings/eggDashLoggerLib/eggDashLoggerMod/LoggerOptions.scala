package typings
package eggDashLoggerLib.eggDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions extends js.Object {
  var allowDebugAtProd: js.UndefOr[scala.Boolean] = js.undefined
  var consoleLevel: js.UndefOr[LoggerLevel] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var level: js.UndefOr[LoggerLevel] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(
    allowDebugAtProd: js.UndefOr[scala.Boolean] = js.undefined,
    consoleLevel: LoggerLevel = null,
    encoding: java.lang.String = null,
    level: LoggerLevel = null
  ): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDebugAtProd)) __obj.updateDynamic("allowDebugAtProd")(allowDebugAtProd)
    if (consoleLevel != null) __obj.updateDynamic("consoleLevel")(consoleLevel)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (level != null) __obj.updateDynamic("level")(level)
    __obj.asInstanceOf[LoggerOptions]
  }
}

