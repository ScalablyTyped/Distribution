package typings.gapiDotClientDotServiceuser.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageRule extends js.Object {
  /** True, if the method allows unregistered calls; false otherwise. */
  var allowUnregisteredCalls: js.UndefOr[Boolean] = js.undefined
  /**
    * Selects the methods to which this rule applies. Use '&#42;' to indicate all
    * methods in all APIs.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.undefined
  /**
    * True, if the method should skip service control. If so, no control plane
    * feature (like quota and billing) will be enabled.
    */
  var skipServiceControl: js.UndefOr[Boolean] = js.undefined
}

object UsageRule {
  @scala.inline
  def apply(
    allowUnregisteredCalls: js.UndefOr[Boolean] = js.undefined,
    selector: String = null,
    skipServiceControl: js.UndefOr[Boolean] = js.undefined
  ): UsageRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnregisteredCalls)) __obj.updateDynamic("allowUnregisteredCalls")(allowUnregisteredCalls)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (!js.isUndefined(skipServiceControl)) __obj.updateDynamic("skipServiceControl")(skipServiceControl)
    __obj.asInstanceOf[UsageRule]
  }
}

