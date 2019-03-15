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
    contextFormatter: /* meta */ js.UndefOr[js.Object] => java.lang.String = null,
    encoding: java.lang.String = null,
    eol: java.lang.String = null,
    formatter: /* meta */ js.UndefOr[js.Object] => java.lang.String = null,
    json: js.UndefOr[scala.Boolean] = js.undefined,
    level: LoggerLevel = null,
    stderrLevel: java.lang.String = null
  ): ConsoleTransportOptions = {
    val __obj = js.Dynamic.literal()
    if (contextFormatter != null) __obj.updateDynamic("contextFormatter")(js.Any.fromFunction1(contextFormatter))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (eol != null) __obj.updateDynamic("eol")(eol)
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (level != null) __obj.updateDynamic("level")(level)
    if (stderrLevel != null) __obj.updateDynamic("stderrLevel")(stderrLevel)
    __obj.asInstanceOf[ConsoleTransportOptions]
  }
}

