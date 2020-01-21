package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductStatus extends js.Object {
  var creationDate: js.UndefOr[String] = js.undefined
  var dataQualityIssues: js.UndefOr[js.Array[ProductStatusDataQualityIssue]] = js.undefined
  var destinationStatuses: js.UndefOr[js.Array[ProductStatusDestinationStatus]] = js.undefined
  var googleExpirationDate: js.UndefOr[String] = js.undefined
  var itemLevelIssues: js.UndefOr[js.Array[ProductStatusItemLevelIssue]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lastUpdateDate: js.UndefOr[String] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var product: js.UndefOr[Product] = js.undefined
  var productId: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object ProductStatus {
  @scala.inline
  def apply(
    creationDate: String = null,
    dataQualityIssues: js.Array[ProductStatusDataQualityIssue] = null,
    destinationStatuses: js.Array[ProductStatusDestinationStatus] = null,
    googleExpirationDate: String = null,
    itemLevelIssues: js.Array[ProductStatusItemLevelIssue] = null,
    kind: String = null,
    lastUpdateDate: String = null,
    link: String = null,
    product: Product = null,
    productId: String = null,
    title: String = null
  ): ProductStatus = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (dataQualityIssues != null) __obj.updateDynamic("dataQualityIssues")(dataQualityIssues.asInstanceOf[js.Any])
    if (destinationStatuses != null) __obj.updateDynamic("destinationStatuses")(destinationStatuses.asInstanceOf[js.Any])
    if (googleExpirationDate != null) __obj.updateDynamic("googleExpirationDate")(googleExpirationDate.asInstanceOf[js.Any])
    if (itemLevelIssues != null) __obj.updateDynamic("itemLevelIssues")(itemLevelIssues.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastUpdateDate != null) __obj.updateDynamic("lastUpdateDate")(lastUpdateDate.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductStatus]
  }
}

