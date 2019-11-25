package typings.eggDashLogger.eggDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportOptions extends js.Object {
  var contextFormatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var eol: js.UndefOr[String] = js.undefined
  var formatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
  var level: js.UndefOr[LoggerLevel] = js.undefined
}

object TransportOptions {
  @scala.inline
  def apply(
    contextFormatter: /* meta */ js.UndefOr[js.Object] => String = null,
    encoding: String = null,
    eol: String = null,
    formatter: /* meta */ js.UndefOr[js.Object] => String = null,
    json: js.UndefOr[Boolean] = js.undefined,
    level: LoggerLevel = null
  ): TransportOptions = {
    val __obj = js.Dynamic.literal()
    if (contextFormatter != null) __obj.updateDynamic("contextFormatter")(js.Any.fromFunction1(contextFormatter))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportOptions]
  }
}

