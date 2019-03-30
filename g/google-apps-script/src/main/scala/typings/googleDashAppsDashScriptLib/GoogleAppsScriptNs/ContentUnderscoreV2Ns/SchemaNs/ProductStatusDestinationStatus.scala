package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductStatusDestinationStatus extends js.Object {
  var approvalPending: js.UndefOr[scala.Boolean] = js.undefined
  var approvalStatus: js.UndefOr[java.lang.String] = js.undefined
  var destination: js.UndefOr[java.lang.String] = js.undefined
  var intention: js.UndefOr[java.lang.String] = js.undefined
}

object ProductStatusDestinationStatus {
  @scala.inline
  def apply(
    approvalPending: js.UndefOr[scala.Boolean] = js.undefined,
    approvalStatus: java.lang.String = null,
    destination: java.lang.String = null,
    intention: java.lang.String = null
  ): ProductStatusDestinationStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(approvalPending)) __obj.updateDynamic("approvalPending")(approvalPending)
    if (approvalStatus != null) __obj.updateDynamic("approvalStatus")(approvalStatus)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (intention != null) __obj.updateDynamic("intention")(intention)
    __obj.asInstanceOf[ProductStatusDestinationStatus]
  }
}

