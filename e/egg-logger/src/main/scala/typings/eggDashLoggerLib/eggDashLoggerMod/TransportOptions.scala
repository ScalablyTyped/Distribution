package typings
package eggDashLoggerLib.eggDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportOptions extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var eol: js.UndefOr[java.lang.String] = js.undefined
  var formatter: js.UndefOr[js.Any] = js.undefined
  var json: js.UndefOr[scala.Boolean] = js.undefined
  var level: js.UndefOr[LoggerLevel] = js.undefined
}

object TransportOptions {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    eol: java.lang.String = null,
    formatter: js.Any = null,
    json: js.UndefOr[scala.Boolean] = js.undefined,
    level: LoggerLevel = null
  ): TransportOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (eol != null) __obj.updateDynamic("eol")(eol)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (level != null) __obj.updateDynamic("level")(level)
    __obj.asInstanceOf[TransportOptions]
  }
}

