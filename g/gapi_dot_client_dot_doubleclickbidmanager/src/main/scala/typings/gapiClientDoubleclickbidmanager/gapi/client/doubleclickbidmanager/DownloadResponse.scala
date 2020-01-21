package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadResponse extends js.Object {
  /** Retrieved ad groups in SDF format. */
  var adGroups: js.UndefOr[String] = js.undefined
  /** Retrieved ads in SDF format. */
  var ads: js.UndefOr[String] = js.undefined
  /** Retrieved insertion orders in SDF format. */
  var insertionOrders: js.UndefOr[String] = js.undefined
  /** Retrieved line items in SDF format. */
  var lineItems: js.UndefOr[String] = js.undefined
}

object DownloadResponse {
  @scala.inline
  def apply(
    adGroups: String = null,
    ads: String = null,
    insertionOrders: String = null,
    lineItems: String = null
  ): DownloadResponse = {
    val __obj = js.Dynamic.literal()
    if (adGroups != null) __obj.updateDynamic("adGroups")(adGroups.asInstanceOf[js.Any])
    if (ads != null) __obj.updateDynamic("ads")(ads.asInstanceOf[js.Any])
    if (insertionOrders != null) __obj.updateDynamic("insertionOrders")(insertionOrders.asInstanceOf[js.Any])
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadResponse]
  }
}

