package typings
package eggDashCoreLib.eggDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggCoreOptions extends js.Object {
  var baseDir: java.lang.String
  var plugins: js.UndefOr[js.Any] = js.undefined
  var `type`: eggDashCoreLib.eggDashCoreLibStrings.application | eggDashCoreLib.eggDashCoreLibStrings.agent
}

object EggCoreOptions {
  @scala.inline
  def apply(
    baseDir: java.lang.String,
    `type`: eggDashCoreLib.eggDashCoreLibStrings.application | eggDashCoreLib.eggDashCoreLibStrings.agent,
    plugins: js.Any = null
  ): EggCoreOptions = {
    val __obj = js.Dynamic.literal(baseDir = baseDir)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    __obj.asInstanceOf[EggCoreOptions]
  }
}

