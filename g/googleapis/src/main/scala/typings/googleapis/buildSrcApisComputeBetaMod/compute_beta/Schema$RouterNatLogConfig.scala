package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of logging on a NAT.
  */
@js.native
trait Schema$RouterNatLogConfig extends js.Object {
  /**
    * Indicates whether or not to export logs. This is false by default.
    */
  var enable: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the desired filtering of logs on this NAT. If unspecified, logs
    * are exported for all connections handled by this NAT.
    */
  var filter: js.UndefOr[String] = js.native
}

object Schema$RouterNatLogConfig {
  @scala.inline
  def apply(enable: js.UndefOr[Boolean] = js.undefined, filter: String = null): Schema$RouterNatLogConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RouterNatLogConfig]
  }
}

