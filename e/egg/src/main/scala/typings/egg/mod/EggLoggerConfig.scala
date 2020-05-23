package typings.egg.mod

import typings.egg.anon.PartialEggLoggerOptions
import typings.egg.eggStrings.duplicate
import typings.egg.eggStrings.ignore
import typings.egg.eggStrings.redirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent egg.egg.RemoveSpecProp<egg-logger.egg-logger.EggLoggersOptions, 'type'> */
trait EggLoggerConfig extends js.Object {
  var agentLogName: String
  /** allow debug log at prod, defaults to true */
  var allowDebugAtProd: js.UndefOr[Boolean] = js.undefined
  var appLogName: String
  var buffer: js.UndefOr[Boolean] = js.undefined
  var concentrateError: js.UndefOr[duplicate | redirect | ignore] = js.undefined
  var consoleLevel: js.UndefOr[typings.eggLogger.mod.LoggerLevel] = js.undefined
  var coreLogName: String
  /** custom config of coreLogger */
  var coreLogger: js.UndefOr[PartialEggLoggerOptions] = js.undefined
  var dir: String
  /** disable logger console after app ready. defaults to `false` on local and unittest env, others is `true`. */
  var disableConsoleAfterReady: js.UndefOr[Boolean] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[String] = js.undefined
  var eol: js.UndefOr[String] = js.undefined
  var errorLogName: String
  var level: js.UndefOr[typings.eggLogger.mod.LoggerLevel] = js.undefined
  var outputJSON: js.UndefOr[Boolean] = js.undefined
}

object EggLoggerConfig {
  @scala.inline
  def apply(
    agentLogName: String,
    appLogName: String,
    coreLogName: String,
    dir: String,
    errorLogName: String,
    allowDebugAtProd: js.UndefOr[Boolean] = js.undefined,
    buffer: js.UndefOr[Boolean] = js.undefined,
    concentrateError: duplicate | redirect | ignore = null,
    consoleLevel: typings.eggLogger.mod.LoggerLevel = null,
    coreLogger: PartialEggLoggerOptions = null,
    disableConsoleAfterReady: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    env: String = null,
    eol: String = null,
    level: typings.eggLogger.mod.LoggerLevel = null,
    outputJSON: js.UndefOr[Boolean] = js.undefined
  ): EggLoggerConfig = {
    val __obj = js.Dynamic.literal(agentLogName = agentLogName.asInstanceOf[js.Any], appLogName = appLogName.asInstanceOf[js.Any], coreLogName = coreLogName.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], errorLogName = errorLogName.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDebugAtProd)) __obj.updateDynamic("allowDebugAtProd")(allowDebugAtProd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.get.asInstanceOf[js.Any])
    if (concentrateError != null) __obj.updateDynamic("concentrateError")(concentrateError.asInstanceOf[js.Any])
    if (consoleLevel != null) __obj.updateDynamic("consoleLevel")(consoleLevel.asInstanceOf[js.Any])
    if (coreLogger != null) __obj.updateDynamic("coreLogger")(coreLogger.asInstanceOf[js.Any])
    if (!js.isUndefined(disableConsoleAfterReady)) __obj.updateDynamic("disableConsoleAfterReady")(disableConsoleAfterReady.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(outputJSON)) __obj.updateDynamic("outputJSON")(outputJSON.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggLoggerConfig]
  }
}

