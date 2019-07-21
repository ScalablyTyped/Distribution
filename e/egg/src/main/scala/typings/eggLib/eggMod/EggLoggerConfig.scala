package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof egg-logger.egg-logger.EggLoggersOptions, 'type'> ]: egg-logger.egg-logger.EggLoggersOptions[P]} */ trait EggLoggerConfig extends js.Object {
  /** allow debug log at prod, defaults to true */
  var allowDebugAtProd: js.UndefOr[scala.Boolean] = js.undefined
  /** custom config of coreLogger */
  var coreLogger: js.UndefOr[stdLib.Partial[eggDashLoggerLib.eggDashLoggerMod.EggLoggerOptions]] = js.undefined
  /** disable logger console after app ready. defaults to `false` on local and unittest env, others is `true`. */
  var disableConsoleAfterReady: js.UndefOr[scala.Boolean] = js.undefined
}

object EggLoggerConfig {
  @scala.inline
  def apply(
    allowDebugAtProd: js.UndefOr[scala.Boolean] = js.undefined,
    coreLogger: stdLib.Partial[eggDashLoggerLib.eggDashLoggerMod.EggLoggerOptions] = null,
    disableConsoleAfterReady: js.UndefOr[scala.Boolean] = js.undefined
  ): EggLoggerConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDebugAtProd)) __obj.updateDynamic("allowDebugAtProd")(allowDebugAtProd)
    if (coreLogger != null) __obj.updateDynamic("coreLogger")(coreLogger)
    if (!js.isUndefined(disableConsoleAfterReady)) __obj.updateDynamic("disableConsoleAfterReady")(disableConsoleAfterReady)
    __obj.asInstanceOf[EggLoggerConfig]
  }
}

