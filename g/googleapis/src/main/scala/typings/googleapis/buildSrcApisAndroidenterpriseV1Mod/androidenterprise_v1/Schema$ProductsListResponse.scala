package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The matching products.
  */
@js.native
trait Schema$ProductsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#productsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * General pagination information.
    */
  var pageInfo: js.UndefOr[Schema$PageInfo] = js.native
  /**
    * Information about a product (e.g. an app) in the Google Play store, for
    * display to an enterprise admin.
    */
  var product: js.UndefOr[js.Array[Schema$Product]] = js.native
  /**
    * Pagination information for token pagination.
    */
  var tokenPagination: js.UndefOr[Schema$TokenPagination] = js.native
}

object Schema$ProductsListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    pageInfo: Schema$PageInfo = null,
    product: js.Array[Schema$Product] = null,
    tokenPagination: Schema$TokenPagination = null
  ): Schema$ProductsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductsListResponse]
  }
}

