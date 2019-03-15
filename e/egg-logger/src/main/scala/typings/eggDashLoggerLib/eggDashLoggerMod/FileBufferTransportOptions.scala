package typings
package eggDashLoggerLib.eggDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileBufferTransportOptions extends FileTransportOptions {
  var flushInterval: js.UndefOr[scala.Double] = js.undefined
  var maxBufferLength: js.UndefOr[scala.Double] = js.undefined
}

object FileBufferTransportOptions {
  @scala.inline
  def apply(
    file: java.lang.String,
    contextFormatter: /* meta */ js.UndefOr[js.Object] => java.lang.String = null,
    encoding: java.lang.String = null,
    eol: java.lang.String = null,
    flushInterval: scala.Int | scala.Double = null,
    formatter: /* meta */ js.UndefOr[js.Object] => java.lang.String = null,
    json: js.UndefOr[scala.Boolean] = js.undefined,
    level: LoggerLevel = null,
    maxBufferLength: scala.Int | scala.Double = null
  ): FileBufferTransportOptions = {
    val __obj = js.Dynamic.literal(file = file)
    if (contextFormatter != null) __obj.updateDynamic("contextFormatter")(js.Any.fromFunction1(contextFormatter))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (eol != null) __obj.updateDynamic("eol")(eol)
    if (flushInterval != null) __obj.updateDynamic("flushInterval")(flushInterval.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (level != null) __obj.updateDynamic("level")(level)
    if (maxBufferLength != null) __obj.updateDynamic("maxBufferLength")(maxBufferLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBufferTransportOptions]
  }
}

