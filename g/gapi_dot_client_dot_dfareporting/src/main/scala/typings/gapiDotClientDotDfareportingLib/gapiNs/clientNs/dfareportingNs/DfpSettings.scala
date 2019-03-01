package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DfpSettings extends js.Object {
  /** DFP network code for this directory site. */
  var dfpNetworkCode: js.UndefOr[java.lang.String] = js.undefined
  /** DFP network name for this directory site. */
  var dfpNetworkName: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this directory site accepts programmatic placements. */
  var programmaticPlacementAccepted: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether this directory site accepts publisher-paid tags. */
  var pubPaidPlacementAccepted: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether this directory site is available only via DoubleClick Publisher Portal. */
  var publisherPortalOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object DfpSettings {
  @scala.inline
  def apply(
    dfpNetworkCode: java.lang.String = null,
    dfpNetworkName: java.lang.String = null,
    programmaticPlacementAccepted: js.UndefOr[scala.Boolean] = js.undefined,
    pubPaidPlacementAccepted: js.UndefOr[scala.Boolean] = js.undefined,
    publisherPortalOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): DfpSettings = {
    val __obj = js.Dynamic.literal()
    if (dfpNetworkCode != null) __obj.updateDynamic("dfpNetworkCode")(dfpNetworkCode)
    if (dfpNetworkName != null) __obj.updateDynamic("dfpNetworkName")(dfpNetworkName)
    if (!js.isUndefined(programmaticPlacementAccepted)) __obj.updateDynamic("programmaticPlacementAccepted")(programmaticPlacementAccepted)
    if (!js.isUndefined(pubPaidPlacementAccepted)) __obj.updateDynamic("pubPaidPlacementAccepted")(pubPaidPlacementAccepted)
    if (!js.isUndefined(publisherPortalOnly)) __obj.updateDynamic("publisherPortalOnly")(publisherPortalOnly)
    __obj.asInstanceOf[DfpSettings]
  }
}

