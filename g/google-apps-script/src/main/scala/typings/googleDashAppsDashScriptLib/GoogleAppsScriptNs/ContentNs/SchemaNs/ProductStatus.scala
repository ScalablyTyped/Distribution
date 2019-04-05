package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductStatus extends js.Object {
  var creationDate: js.UndefOr[java.lang.String] = js.undefined
  var dataQualityIssues: js.UndefOr[js.Array[ProductStatusDataQualityIssue]] = js.undefined
  var destinationStatuses: js.UndefOr[js.Array[ProductStatusDestinationStatus]] = js.undefined
  var googleExpirationDate: js.UndefOr[java.lang.String] = js.undefined
  var itemLevelIssues: js.UndefOr[js.Array[ProductStatusItemLevelIssue]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var lastUpdateDate: js.UndefOr[java.lang.String] = js.undefined
  var link: js.UndefOr[java.lang.String] = js.undefined
  var product: js.UndefOr[Product] = js.undefined
  var productId: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ProductStatus {
  @scala.inline
  def apply(
    creationDate: java.lang.String = null,
    dataQualityIssues: js.Array[ProductStatusDataQualityIssue] = null,
    destinationStatuses: js.Array[ProductStatusDestinationStatus] = null,
    googleExpirationDate: java.lang.String = null,
    itemLevelIssues: js.Array[ProductStatusItemLevelIssue] = null,
    kind: java.lang.String = null,
    lastUpdateDate: java.lang.String = null,
    link: java.lang.String = null,
    product: Product = null,
    productId: java.lang.String = null,
    title: java.lang.String = null
  ): ProductStatus = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (dataQualityIssues != null) __obj.updateDynamic("dataQualityIssues")(dataQualityIssues)
    if (destinationStatuses != null) __obj.updateDynamic("destinationStatuses")(destinationStatuses)
    if (googleExpirationDate != null) __obj.updateDynamic("googleExpirationDate")(googleExpirationDate)
    if (itemLevelIssues != null) __obj.updateDynamic("itemLevelIssues")(itemLevelIssues)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastUpdateDate != null) __obj.updateDynamic("lastUpdateDate")(lastUpdateDate)
    if (link != null) __obj.updateDynamic("link")(link)
    if (product != null) __obj.updateDynamic("product")(product)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ProductStatus]
  }
}

