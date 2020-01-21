package typings.eggCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggCoreOptions extends js.Object {
  /** the directory of application */
  var baseDir: js.UndefOr[String] = js.undefined
  /** custom plugins */
  var plugins: js.UndefOr[Plugins] = js.undefined
  /** server scope */
  var serverScope: js.UndefOr[String] = js.undefined
  /** egg type, application or agent */
  var `type`: js.UndefOr[EggType] = js.undefined
}

object EggCoreOptions {
  @scala.inline
  def apply(
    baseDir: String = null,
    plugins: Plugins = null,
    serverScope: String = null,
    `type`: EggType = null
  ): EggCoreOptions = {
    val __obj = js.Dynamic.literal()
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (serverScope != null) __obj.updateDynamic("serverScope")(serverScope.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggCoreOptions]
  }
}

