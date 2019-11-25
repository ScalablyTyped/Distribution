package typings.egg.eggMod

import typings.eggDashLogger.eggDashLoggerMod.EggLoggerOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof egg-logger.egg-logger.EggLoggersOptions, 'type'> ]: egg-logger.egg-logger.EggLoggersOptions[P]} */ trait EggLoggerConfig extends js.Object {
  /** allow debug log at prod, defaults to true */
  var allowDebugAtProd: js.UndefOr[Boolean] = js.undefined
  /** custom config of coreLogger */
  var coreLogger: js.UndefOr[Partial[EggLoggerOptions]] = js.undefined
  /** disable logger console after app ready. defaults to `false` on local and unittest env, others is `true`. */
  var disableConsoleAfterReady: js.UndefOr[Boolean] = js.undefined
}

object EggLoggerConfig {
  @scala.inline
  def apply(
    allowDebugAtProd: js.UndefOr[Boolean] = js.undefined,
    coreLogger: Partial[EggLoggerOptions] = null,
    disableConsoleAfterReady: js.UndefOr[Boolean] = js.undefined
  ): EggLoggerConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDebugAtProd)) __obj.updateDynamic("allowDebugAtProd")(allowDebugAtProd.asInstanceOf[js.Any])
    if (coreLogger != null) __obj.updateDynamic("coreLogger")(coreLogger.asInstanceOf[js.Any])
    if (!js.isUndefined(disableConsoleAfterReady)) __obj.updateDynamic("disableConsoleAfterReady")(disableConsoleAfterReady.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggLoggerConfig]
  }
}

