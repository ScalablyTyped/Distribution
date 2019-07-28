package typings.eggDashCore.eggDashCoreMod

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
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (serverScope != null) __obj.updateDynamic("serverScope")(serverScope)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EggCoreOptions]
  }
}

