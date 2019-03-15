package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggLoaderOptions extends js.Object {
  var app: eggDashViewLib.eggMod.Application
  var baseDir: java.lang.String
  var logger: eggDashLoggerLib.eggDashLoggerMod.EggLogger
  var plugins: js.UndefOr[js.Any] = js.undefined
  var typescript: js.UndefOr[scala.Boolean] = js.undefined
}

object EggLoaderOptions {
  @scala.inline
  def apply(
    app: eggDashViewLib.eggMod.Application,
    baseDir: java.lang.String,
    logger: eggDashLoggerLib.eggDashLoggerMod.EggLogger,
    plugins: js.Any = null,
    typescript: js.UndefOr[scala.Boolean] = js.undefined
  ): EggLoaderOptions = {
    val __obj = js.Dynamic.literal(app = app, baseDir = baseDir, logger = logger)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(typescript)) __obj.updateDynamic("typescript")(typescript)
    __obj.asInstanceOf[EggLoaderOptions]
  }
}

