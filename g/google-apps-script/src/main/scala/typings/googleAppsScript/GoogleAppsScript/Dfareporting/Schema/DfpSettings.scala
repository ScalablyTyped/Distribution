package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

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
    if (dfpNetworkCode != null) __obj.updateDynamic("dfpNetworkCode")(dfpNetworkCode.asInstanceOf[js.Any])
    if (dfpNetworkName != null) __obj.updateDynamic("dfpNetworkName")(dfpNetworkName.asInstanceOf[js.Any])
    if (!js.isUndefined(programmaticPlacementAccepted)) __obj.updateDynamic("programmaticPlacementAccepted")(programmaticPlacementAccepted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pubPaidPlacementAccepted)) __obj.updateDynamic("pubPaidPlacementAccepted")(pubPaidPlacementAccepted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherPortalOnly)) __obj.updateDynamic("publisherPortalOnly")(publisherPortalOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DfpSettings]
  }
}

