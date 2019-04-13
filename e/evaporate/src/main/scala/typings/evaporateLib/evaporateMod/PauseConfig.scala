package typings
package evaporateLib.evaporateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PauseConfig extends js.Object {
  var force: js.UndefOr[scala.Boolean] = js.undefined
}

object PauseConfig {
  @scala.inline
  def apply(force: js.UndefOr[scala.Boolean] = js.undefined): PauseConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[PauseConfig]
  }
}

