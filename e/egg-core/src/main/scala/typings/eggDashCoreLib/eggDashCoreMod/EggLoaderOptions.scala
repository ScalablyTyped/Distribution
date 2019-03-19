package typings
package eggDashCoreLib.eggDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggLoaderOptions extends js.Object {
  /** Application instance */
  var app: EggCore[PlainObject[_]]
  /** the directory of application */
  var baseDir: java.lang.String
  /** egg logger */
  var logger: eggDashLoggerLib.eggDashLoggerMod.Logger[eggDashLoggerLib.eggDashLoggerMod.LoggerOptions]
  /** custom plugins */
  var plugins: js.UndefOr[Plugins] = js.undefined
  /** server scope */
  var serverScope: js.UndefOr[java.lang.String] = js.undefined
}

object EggLoaderOptions {
  @scala.inline
  def apply(
    app: EggCore[PlainObject[_]],
    baseDir: java.lang.String,
    logger: eggDashLoggerLib.eggDashLoggerMod.Logger[eggDashLoggerLib.eggDashLoggerMod.LoggerOptions],
    plugins: Plugins = null,
    serverScope: java.lang.String = null
  ): EggLoaderOptions = {
    val __obj = js.Dynamic.literal(app = app, baseDir = baseDir, logger = logger)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (serverScope != null) __obj.updateDynamic("serverScope")(serverScope)
    __obj.asInstanceOf[EggLoaderOptions]
  }
}

