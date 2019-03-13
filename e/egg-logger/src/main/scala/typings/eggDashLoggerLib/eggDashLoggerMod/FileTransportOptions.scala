package typings
package eggDashLoggerLib.eggDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTransportOptions extends TransportOptions {
  var file: java.lang.String
}

object FileTransportOptions {
  @scala.inline
  def apply(
    file: java.lang.String,
    encoding: java.lang.String = null,
    eol: java.lang.String = null,
    formatter: js.Any = null,
    json: js.UndefOr[scala.Boolean] = js.undefined,
    level: LoggerLevel = null
  ): FileTransportOptions = {
    val __obj = js.Dynamic.literal(file = file)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (eol != null) __obj.updateDynamic("eol")(eol)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (level != null) __obj.updateDynamic("level")(level)
    __obj.asInstanceOf[FileTransportOptions]
  }
}

