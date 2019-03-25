package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof egg-core.egg-core.FileLoaderOption, 'inject' | 'target'> ]: egg-core.egg-core.FileLoaderOption[P]} */ trait CustomLoaderConfig extends js.Object {
  /**
    * an object you wanner load to, value can only be 'ctx' or 'app'. default to app
    */
  var inject: js.UndefOr[eggLib.eggLibStrings.ctx | eggLib.eggLibStrings.app] = js.undefined
  /**
    * whether need to load files in plugins or framework, default to false
    */
  var loadunit: js.UndefOr[scala.Boolean] = js.undefined
}

object CustomLoaderConfig {
  @scala.inline
  def apply(
    inject: eggLib.eggLibStrings.ctx | eggLib.eggLibStrings.app = null,
    loadunit: js.UndefOr[scala.Boolean] = js.undefined
  ): CustomLoaderConfig = {
    val __obj = js.Dynamic.literal()
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (!js.isUndefined(loadunit)) __obj.updateDynamic("loadunit")(loadunit)
    __obj.asInstanceOf[CustomLoaderConfig]
  }
}

