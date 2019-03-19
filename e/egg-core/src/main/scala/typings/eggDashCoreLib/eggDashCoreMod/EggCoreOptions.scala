package typings
package eggDashCoreLib.eggDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggCoreOptions extends js.Object {
  /** the directory of application */
  var baseDir: js.UndefOr[java.lang.String] = js.undefined
  /** custom plugins */
  var plugins: js.UndefOr[Plugins] = js.undefined
  /** server scope */
  var serverScope: js.UndefOr[java.lang.String] = js.undefined
  /** egg type, application or agent */
  var `type`: js.UndefOr[eggDashCoreLib.EggType] = js.undefined
}

object EggCoreOptions {
  @scala.inline
  def apply(
    baseDir: java.lang.String = null,
    plugins: Plugins = null,
    serverScope: java.lang.String = null,
    `type`: eggDashCoreLib.EggType = null
  ): EggCoreOptions = {
    val __obj = js.Dynamic.literal()
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (serverScope != null) __obj.updateDynamic("serverScope")(serverScope)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EggCoreOptions]
  }
}

