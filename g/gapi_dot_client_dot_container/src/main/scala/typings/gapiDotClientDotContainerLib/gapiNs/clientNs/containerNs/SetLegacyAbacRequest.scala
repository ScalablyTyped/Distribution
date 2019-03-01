package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetLegacyAbacRequest extends js.Object {
  /** Whether ABAC authorization will be enabled in the cluster. */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
}

object SetLegacyAbacRequest {
  @scala.inline
  def apply(enabled: js.UndefOr[scala.Boolean] = js.undefined): SetLegacyAbacRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[SetLegacyAbacRequest]
  }
}

