package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductStatus extends js.Object {
  /** Date on which the item has been created, in ISO 8601 format. */
  var creationDate: js.UndefOr[String] = js.undefined
  /** A list of data quality issues associated with the product. */
  var dataQualityIssues: js.UndefOr[js.Array[ProductStatusDataQualityIssue]] = js.undefined
  /** The intended destinations for the product. */
  var destinationStatuses: js.UndefOr[js.Array[ProductStatusDestinationStatus]] = js.undefined
  /** Date on which the item expires in Google Shopping, in ISO 8601 format. */
  var googleExpirationDate: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#productStatus". */
  var kind: js.UndefOr[String] = js.undefined
  /** Date on which the item has been last updated, in ISO 8601 format. */
  var lastUpdateDate: js.UndefOr[String] = js.undefined
  /** The link to the product. */
  var link: js.UndefOr[String] = js.undefined
  /** Product data after applying all the join inputs. */
  var product: js.UndefOr[Product] = js.undefined
  /** The id of the product for which status is reported. */
  var productId: js.UndefOr[String] = js.undefined
  /** The title of the product. */
  var title: js.UndefOr[String] = js.undefined
}

object ProductStatus {
  @scala.inline
  def apply(
    creationDate: String = null,
    dataQualityIssues: js.Array[ProductStatusDataQualityIssue] = null,
    destinationStatuses: js.Array[ProductStatusDestinationStatus] = null,
    googleExpirationDate: String = null,
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
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastUpdateDate != null) __obj.updateDynamic("lastUpdateDate")(lastUpdateDate.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductStatus]
  }
}

