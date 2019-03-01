package typings
package diagnosticDashChannelDashPublishersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: js.UndefOr[Anon_Host] = js.undefined
}

object Anon_Config {
  @scala.inline
  def apply(config: Anon_Host = null): Anon_Config = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[Anon_Config]
  }
}

