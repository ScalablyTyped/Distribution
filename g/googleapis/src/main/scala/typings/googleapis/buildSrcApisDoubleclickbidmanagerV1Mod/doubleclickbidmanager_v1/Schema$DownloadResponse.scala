package typings.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Download response.
  */
@js.native
trait Schema$DownloadResponse extends js.Object {
  /**
    * Retrieved ad groups in SDF format.
    */
  var adGroups: js.UndefOr[String] = js.native
  /**
    * Retrieved ads in SDF format.
    */
  var ads: js.UndefOr[String] = js.native
  /**
    * Retrieved campaigns in SDF format.
    */
  var campaigns: js.UndefOr[String] = js.native
  /**
    * Retrieved insertion orders in SDF format.
    */
  var insertionOrders: js.UndefOr[String] = js.native
  var inventorySources: js.UndefOr[String] = js.native
  /**
    * Retrieved line items in SDF format.
    */
  var lineItems: js.UndefOr[String] = js.native
}

object Schema$DownloadResponse {
  @scala.inline
  def apply(
    adGroups: String = null,
    ads: String = null,
    campaigns: String = null,
    insertionOrders: String = null,
    inventorySources: String = null,
    lineItems: String = null
  ): Schema$DownloadResponse = {
    val __obj = js.Dynamic.literal()
    if (adGroups != null) __obj.updateDynamic("adGroups")(adGroups.asInstanceOf[js.Any])
    if (ads != null) __obj.updateDynamic("ads")(ads.asInstanceOf[js.Any])
    if (campaigns != null) __obj.updateDynamic("campaigns")(campaigns.asInstanceOf[js.Any])
    if (insertionOrders != null) __obj.updateDynamic("insertionOrders")(insertionOrders.asInstanceOf[js.Any])
    if (inventorySources != null) __obj.updateDynamic("inventorySources")(inventorySources.asInstanceOf[js.Any])
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DownloadResponse]
  }
}

