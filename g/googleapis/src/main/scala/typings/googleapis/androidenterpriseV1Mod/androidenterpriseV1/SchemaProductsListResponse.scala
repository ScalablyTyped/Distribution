package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The matching products.
  */
@js.native
trait SchemaProductsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#productsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * General pagination information.
    */
  var pageInfo: js.UndefOr[SchemaPageInfo] = js.native
  /**
    * Information about a product (e.g. an app) in the Google Play store, for
    * display to an enterprise admin.
    */
  var product: js.UndefOr[js.Array[SchemaProduct]] = js.native
  /**
    * Pagination information for token pagination.
    */
  var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.native
}

object SchemaProductsListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    pageInfo: SchemaPageInfo = null,
    product: js.Array[SchemaProduct] = null,
    tokenPagination: SchemaTokenPagination = null
  ): SchemaProductsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductsListResponse]
  }
}

