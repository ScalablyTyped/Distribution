package typings.eggDashLogger.eggDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggLoggerOptions extends LoggerOptions {
  var buffer: js.UndefOr[Boolean] = js.undefined
  var contextFormatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.undefined
  var eol: js.UndefOr[String] = js.undefined
  var file: String
  var formatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.undefined
  var jsonFile: js.UndefOr[String] = js.undefined
  var outputJSON: js.UndefOr[Boolean] = js.undefined
}

object EggLoggerOptions {
  @scala.inline
  def apply(
    file: String,
    allowDebugAtProd: js.UndefOr[Boolean] = js.undefined,
    buffer: js.UndefOr[Boolean] = js.undefined,
    consoleLevel: LoggerLevel = null,
    contextFormatter: /* meta */ js.UndefOr[js.Object] => String = null,
    encoding: String = null,
    eol: String = null,
    formatter: /* meta */ js.UndefOr[js.Object] => String = null,
    jsonFile: String = null,
    level: LoggerLevel = null,
    outputJSON: js.UndefOr[Boolean] = js.undefined
  ): EggLoggerOptions = {
    val __obj = js.Dynamic.literal(file = file)
    if (!js.isUndefined(allowDebugAtProd)) __obj.updateDynamic("allowDebugAtProd")(allowDebugAtProd)
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (consoleLevel != null) __obj.updateDynamic("consoleLevel")(consoleLevel)
    if (contextFormatter != null) __obj.updateDynamic("contextFormatter")(js.Any.fromFunction1(contextFormatter))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (eol != null) __obj.updateDynamic("eol")(eol)
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (jsonFile != null) __obj.updateDynamic("jsonFile")(jsonFile)
    if (level != null) __obj.updateDynamic("level")(level)
    if (!js.isUndefined(outputJSON)) __obj.updateDynamic("outputJSON")(outputJSON)
    __obj.asInstanceOf[EggLoggerOptions]
  }
}

