package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggLoaderOptions
  extends eggDashCoreLib.eggDashCoreMod.EggLoaderOptions

object EggLoaderOptions {
  @scala.inline
  def apply(
    app: eggDashCoreLib.eggDashCoreMod.EggCore[eggDashCoreLib.eggDashCoreMod.PlainObject[_]],
    baseDir: java.lang.String,
    logger: eggDashLoggerLib.eggDashLoggerMod.Logger[eggDashLoggerLib.eggDashLoggerMod.LoggerOptions],
    plugins: eggDashCoreLib.eggDashCoreMod.Plugins = null,
    serverScope: java.lang.String = null
  ): EggLoaderOptions = {
    val __obj = js.Dynamic.literal(app = app, baseDir = baseDir, logger = logger)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (serverScope != null) __obj.updateDynamic("serverScope")(serverScope)
    __obj.asInstanceOf[EggLoaderOptions]
  }
}

