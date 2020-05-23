package typings.eggLogger.mod

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
    flushInterval: js.UndefOr[Double] = js.undefined,
    formatter: /* meta */ js.UndefOr[js.Object] => String = null,
    json: js.UndefOr[Boolean] = js.undefined,
    level: LoggerLevel = null,
    maxBufferLength: js.UndefOr[Double] = js.undefined
  ): FileBufferTransportOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (contextFormatter != null) __obj.updateDynamic("contextFormatter")(js.Any.fromFunction1(contextFormatter))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (!js.isUndefined(flushInterval)) __obj.updateDynamic("flushInterval")(flushInterval.get.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.get.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBufferLength)) __obj.updateDynamic("maxBufferLength")(maxBufferLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBufferTransportOptions]
  }
}

