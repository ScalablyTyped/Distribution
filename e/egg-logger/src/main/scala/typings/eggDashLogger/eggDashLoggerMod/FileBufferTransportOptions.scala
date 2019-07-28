package typings.eggDashLogger.eggDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileBufferTransportOptions extends FileTransportOptions {
  var flushInterval: js.UndefOr[Double] = js.undefined
  var maxBufferLength: js.UndefOr[Double] = js.undefined
}

object FileBufferTransportOptions {
  @scala.inline
  def apply(
    file: String,
    contextFormatter: /* meta */ js.UndefOr[js.Object] => String = null,
    encoding: String = null,
    eol: String = null,
    flushInterval: Int | Double = null,
    formatter: /* meta */ js.UndefOr[js.Object] => String = null,
    json: js.UndefOr[Boolean] = js.undefined,
    level: LoggerLevel = null,
    maxBufferLength: Int | Double = null
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

