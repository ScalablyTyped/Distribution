package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DfpSettings extends js.Object {
  var dfpNetworkCode: js.UndefOr[String] = js.undefined
  var dfpNetworkName: js.UndefOr[String] = js.undefined
  var programmaticPlacementAccepted: js.UndefOr[Boolean] = js.undefined
  var pubPaidPlacementAccepted: js.UndefOr[Boolean] = js.undefined
  var publisherPortalOnly: js.UndefOr[Boolean] = js.undefined
}

object DfpSettings {
  @scala.inline
  def apply(
    dfpNetworkCode: String = null,
    dfpNetworkName: String = null,
    programmaticPlacementAccepted: js.UndefOr[Boolean] = js.undefined,
    pubPaidPlacementAccepted: js.UndefOr[Boolean] = js.undefined,
    publisherPortalOnly: js.UndefOr[Boolean] = js.undefined
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

