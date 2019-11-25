package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#productsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** General pagination information. */
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  /** Information about a product (e.g. an app) in the Google Play store, for display to an enterprise admin. */
  var product: js.UndefOr[js.Array[Product]] = js.undefined
  /** Pagination information for token pagination. */
  var tokenPagination: js.UndefOr[TokenPagination] = js.undefined
}

object ProductsListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    pageInfo: PageInfo = null,
    product: js.Array[Product] = null,
    tokenPagination: TokenPagination = null
  ): ProductsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductsListResponse]
  }
}

