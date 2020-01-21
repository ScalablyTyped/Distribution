package typings.gaxios

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfig extends js.Object {
  var config: js.UndefOr[scala.Nothing] = js.undefined
  var shouldRetry: Boolean
}

object AnonConfig {
  @scala.inline
  def apply(shouldRetry: Boolean, config: js.UndefOr[scala.Nothing] = js.undefined): AnonConfig = {
    val __obj = js.Dynamic.literal(shouldRetry = shouldRetry.asInstanceOf[js.Any])
    if (!js.isUndefined(config)) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfig]
  }
}

