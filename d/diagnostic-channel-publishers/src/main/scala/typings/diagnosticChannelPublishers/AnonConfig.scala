package typings.diagnosticChannelPublishers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfig extends js.Object {
  var config: js.UndefOr[AnonHost] = js.undefined
}

object AnonConfig {
  @scala.inline
  def apply(config: AnonHost = null): AnonConfig = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfig]
  }
}

