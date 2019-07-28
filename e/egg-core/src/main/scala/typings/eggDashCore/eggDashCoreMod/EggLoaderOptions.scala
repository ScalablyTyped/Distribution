package typings.eggDashCore.eggDashCoreMod

import typings.eggDashLogger.eggDashLoggerMod.Logger
import typings.eggDashLogger.eggDashLoggerMod.LoggerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggLoaderOptions extends js.Object {
  /** Application instance */
  var app: EggCore[PlainObject[_]]
  /** the directory of application */
  var baseDir: String
  /** egg logger */
  var logger: Logger[LoggerOptions]
  /** custom plugins */
  var plugins: js.UndefOr[Plugins] = js.undefined
  /** server scope */
  var serverScope: js.UndefOr[String] = js.undefined
}

object EggLoaderOptions {
  @scala.inline
  def apply(
    app: EggCore[PlainObject[_]],
    baseDir: String,
    logger: Logger[LoggerOptions],
    plugins: Plugins = null,
    serverScope: String = null
  ): EggLoaderOptions = {
    val __obj = js.Dynamic.literal(app = app, baseDir = baseDir, logger = logger)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (serverScope != null) __obj.updateDynamic("serverScope")(serverScope)
    __obj.asInstanceOf[EggLoaderOptions]
  }
}

