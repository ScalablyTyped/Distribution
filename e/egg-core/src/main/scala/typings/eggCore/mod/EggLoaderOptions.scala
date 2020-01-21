package typings.eggCore.mod

import typings.eggLogger.mod.Logger
import typings.eggLogger.mod.LoggerOptions
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
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], baseDir = baseDir.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (serverScope != null) __obj.updateDynamic("serverScope")(serverScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggLoaderOptions]
  }
}

