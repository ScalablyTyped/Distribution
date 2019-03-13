package typings
package eggDashLoggerLib.eggDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleTransportOptions extends TransportOptions {
  var stderrLevel: js.UndefOr[java.lang.String] = js.undefined
}

object ConsoleTransportOptions {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    eol: java.lang.String = null,
    formatter: js.Any = null,
    json: js.UndefOr[scala.Boolean] = js.undefined,
    level: LoggerLevel = null,
    stderrLevel: java.lang.String = null
  ): ConsoleTransportOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (eol != null) __obj.updateDynamic("eol")(eol)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (level != null) __obj.updateDynamic("level")(level)
    if (stderrLevel != null) __obj.updateDynamic("stderrLevel")(stderrLevel)
    __obj.asInstanceOf[ConsoleTransportOptions]
  }
}

