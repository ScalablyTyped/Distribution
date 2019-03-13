package typings
package eggDashCoreLib.eggDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggLoaderOptions extends js.Object {
  var app: EggCore
  var baseDir: java.lang.String
  var logger: eggDashLoggerLib.eggDashLoggerMod.Logger[eggDashLoggerLib.eggDashLoggerMod.LoggerOptions]
  var plugins: js.UndefOr[js.Any] = js.undefined
}

object EggLoaderOptions {
  @scala.inline
  def apply(
    app: EggCore,
    baseDir: java.lang.String,
    logger: eggDashLoggerLib.eggDashLoggerMod.Logger[eggDashLoggerLib.eggDashLoggerMod.LoggerOptions],
    plugins: js.Any = null
  ): EggLoaderOptions = {
    val __obj = js.Dynamic.literal(app = app, baseDir = baseDir, logger = logger)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    __obj.asInstanceOf[EggLoaderOptions]
  }
}

