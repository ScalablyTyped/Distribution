package typings
package eggDashMockLib.eggDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockOption extends js.Object {
  /**
    * The directory of the application
    */
  var baseDir: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Cache application based on baseDir
    */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Remove $baseDir/logs
    */
  var clean: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Swtich on process coverage, but it'll be slower
    */
  var coverage: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The directory of the egg framework
    */
  var framework: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom you plugins
    */
  var plugins: js.UndefOr[js.Any] = js.undefined
}

object MockOption {
  @scala.inline
  def apply(
    baseDir: java.lang.String = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    clean: js.UndefOr[scala.Boolean] = js.undefined,
    coverage: js.UndefOr[scala.Boolean] = js.undefined,
    framework: java.lang.String = null,
    plugins: js.Any = null
  ): MockOption = {
    val __obj = js.Dynamic.literal()
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean)
    if (!js.isUndefined(coverage)) __obj.updateDynamic("coverage")(coverage)
    if (framework != null) __obj.updateDynamic("framework")(framework)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    __obj.asInstanceOf[MockOption]
  }
}

