package typings.eggDashMock.eggDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockOption extends js.Object {
  /**
    * The directory of the application
    */
  var baseDir: js.UndefOr[String] = js.undefined
  /**
    * Cache application based on baseDir
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  /**
    * Remove $baseDir/logs
    */
  var clean: js.UndefOr[Boolean] = js.undefined
  /**
    * Swtich on process coverage, but it'll be slower
    */
  var coverage: js.UndefOr[Boolean] = js.undefined
  /**
    * The directory of the egg framework
    */
  var framework: js.UndefOr[String] = js.undefined
  /**
    * Custom you plugins
    */
  var plugins: js.UndefOr[js.Any] = js.undefined
}

object MockOption {
  @scala.inline
  def apply(
    baseDir: String = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    clean: js.UndefOr[Boolean] = js.undefined,
    coverage: js.UndefOr[Boolean] = js.undefined,
    framework: String = null,
    plugins: js.Any = null
  ): MockOption = {
    val __obj = js.Dynamic.literal()
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean.asInstanceOf[js.Any])
    if (!js.isUndefined(coverage)) __obj.updateDynamic("coverage")(coverage.asInstanceOf[js.Any])
    if (framework != null) __obj.updateDynamic("framework")(framework.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockOption]
  }
}

