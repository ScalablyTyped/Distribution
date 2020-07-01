package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The available logging options for a firewall rule.
  */
@js.native
trait SchemaFirewallLogConfig extends js.Object {
  /**
    * This field denotes whether to enable logging for a particular firewall
    * rule.
    */
  var enable: js.UndefOr[Boolean] = js.native
}

object SchemaFirewallLogConfig {
  @scala.inline
  def apply(enable: js.UndefOr[Boolean] = js.undefined): SchemaFirewallLogConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFirewallLogConfig]
  }
}

