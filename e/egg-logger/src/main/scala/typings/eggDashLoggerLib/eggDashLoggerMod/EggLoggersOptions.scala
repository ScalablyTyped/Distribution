package typings
package eggDashLoggerLib.eggDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggLoggersOptions extends js.Object {
  var agentLogName: java.lang.String
  var appLogName: java.lang.String
  var buffer: js.UndefOr[scala.Boolean] = js.undefined
  // whether write error logger to common-error.log, `duplicate` / `redirect` / `ignore`, default to `duplicate`
  var concentrateError: js.UndefOr[
    eggDashLoggerLib.eggDashLoggerLibStrings.duplicate | eggDashLoggerLib.eggDashLoggerLibStrings.redirect | eggDashLoggerLib.eggDashLoggerLibStrings.ignore
  ] = js.undefined
  var consoleLevel: js.UndefOr[LoggerLevel] = js.undefined
  var coreLogName: java.lang.String
  var dir: java.lang.String
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var env: js.UndefOr[java.lang.String] = js.undefined
  var eol: js.UndefOr[java.lang.String] = js.undefined
  var errorLogName: java.lang.String
  var level: js.UndefOr[LoggerLevel] = js.undefined
  var outputJSON: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: java.lang.String
}

object EggLoggersOptions {
  @scala.inline
  def apply(
    agentLogName: java.lang.String,
    appLogName: java.lang.String,
    coreLogName: java.lang.String,
    dir: java.lang.String,
    errorLogName: java.lang.String,
    `type`: java.lang.String,
    buffer: js.UndefOr[scala.Boolean] = js.undefined,
    concentrateError: eggDashLoggerLib.eggDashLoggerLibStrings.duplicate | eggDashLoggerLib.eggDashLoggerLibStrings.redirect | eggDashLoggerLib.eggDashLoggerLibStrings.ignore = null,
    consoleLevel: LoggerLevel = null,
    encoding: java.lang.String = null,
    env: java.lang.String = null,
    eol: java.lang.String = null,
    level: LoggerLevel = null,
    outputJSON: js.UndefOr[scala.Boolean] = js.undefined
  ): EggLoggersOptions = {
    val __obj = js.Dynamic.literal(agentLogName = agentLogName, appLogName = appLogName, coreLogName = coreLogName, dir = dir, errorLogName = errorLogName)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (concentrateError != null) __obj.updateDynamic("concentrateError")(concentrateError.asInstanceOf[js.Any])
    if (consoleLevel != null) __obj.updateDynamic("consoleLevel")(consoleLevel)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (env != null) __obj.updateDynamic("env")(env)
    if (eol != null) __obj.updateDynamic("eol")(eol)
    if (level != null) __obj.updateDynamic("level")(level)
    if (!js.isUndefined(outputJSON)) __obj.updateDynamic("outputJSON")(outputJSON)
    __obj.asInstanceOf[EggLoggersOptions]
  }
}

