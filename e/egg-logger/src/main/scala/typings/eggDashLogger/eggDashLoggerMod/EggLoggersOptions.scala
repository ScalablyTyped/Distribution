package typings.eggDashLogger.eggDashLoggerMod

import typings.eggDashLogger.eggDashLoggerStrings.duplicate
import typings.eggDashLogger.eggDashLoggerStrings.ignore
import typings.eggDashLogger.eggDashLoggerStrings.redirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggLoggersOptions extends js.Object {
  var agentLogName: String
  var appLogName: String
  var buffer: js.UndefOr[Boolean] = js.undefined
  // whether write error logger to common-error.log, `duplicate` / `redirect` / `ignore`, default to `duplicate`
  var concentrateError: js.UndefOr[duplicate | redirect | ignore] = js.undefined
  var consoleLevel: js.UndefOr[LoggerLevel] = js.undefined
  var coreLogName: String
  var dir: String
  var encoding: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[String] = js.undefined
  var eol: js.UndefOr[String] = js.undefined
  var errorLogName: String
  var level: js.UndefOr[LoggerLevel] = js.undefined
  var outputJSON: js.UndefOr[Boolean] = js.undefined
  var `type`: String
}

object EggLoggersOptions {
  @scala.inline
  def apply(
    agentLogName: String,
    appLogName: String,
    coreLogName: String,
    dir: String,
    errorLogName: String,
    `type`: String,
    buffer: js.UndefOr[Boolean] = js.undefined,
    concentrateError: duplicate | redirect | ignore = null,
    consoleLevel: LoggerLevel = null,
    encoding: String = null,
    env: String = null,
    eol: String = null,
    level: LoggerLevel = null,
    outputJSON: js.UndefOr[Boolean] = js.undefined
  ): EggLoggersOptions = {
    val __obj = js.Dynamic.literal(agentLogName = agentLogName.asInstanceOf[js.Any], appLogName = appLogName.asInstanceOf[js.Any], coreLogName = coreLogName.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], errorLogName = errorLogName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (concentrateError != null) __obj.updateDynamic("concentrateError")(concentrateError.asInstanceOf[js.Any])
    if (consoleLevel != null) __obj.updateDynamic("consoleLevel")(consoleLevel.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(outputJSON)) __obj.updateDynamic("outputJSON")(outputJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggLoggersOptions]
  }
}

