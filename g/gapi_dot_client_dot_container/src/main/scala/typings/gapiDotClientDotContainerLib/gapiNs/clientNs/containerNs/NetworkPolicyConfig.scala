package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkPolicyConfig extends js.Object {
  /** Whether NetworkPolicy is enabled for this cluster. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
}

object NetworkPolicyConfig {
  @scala.inline
  def apply(disabled: js.UndefOr[scala.Boolean] = js.undefined): NetworkPolicyConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[NetworkPolicyConfig]
  }
}

