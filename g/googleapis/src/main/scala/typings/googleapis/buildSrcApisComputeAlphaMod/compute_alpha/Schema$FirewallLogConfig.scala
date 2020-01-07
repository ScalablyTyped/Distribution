package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The available logging options for a firewall rule.
  */
@js.native
trait Schema$FirewallLogConfig extends js.Object {
  /**
    * This field denotes whether to enable logging for a particular firewall
    * rule.
    */
  var enable: js.UndefOr[Boolean] = js.native
  /**
    * This field can only be specified for a particular firewall rule if
    * logging is enabled for that rule. This field denotes whether to include
    * or exclude metadata for firewall logs.
    */
  var metadata: js.UndefOr[String] = js.native
}

object Schema$FirewallLogConfig {
  @scala.inline
  def apply(enable: js.UndefOr[Boolean] = js.undefined, metadata: String = null): Schema$FirewallLogConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FirewallLogConfig]
  }
}

