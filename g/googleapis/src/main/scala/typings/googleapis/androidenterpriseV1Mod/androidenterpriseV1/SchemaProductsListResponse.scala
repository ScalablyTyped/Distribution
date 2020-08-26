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
  def apply(): SchemaProductsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductsListResponse]
  }
  @scala.inline
  implicit class SchemaProductsListResponseOps[Self <: SchemaProductsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPageInfo(value: SchemaPageInfo): Self = this.set("pageInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageInfo: Self = this.set("pageInfo", js.undefined)
    @scala.inline
    def setProductVarargs(value: SchemaProduct*): Self = this.set("product", js.Array(value :_*))
    @scala.inline
    def setProduct(value: js.Array[SchemaProduct]): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    @scala.inline
    def setTokenPagination(value: SchemaTokenPagination): Self = this.set("tokenPagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenPagination: Self = this.set("tokenPagination", js.undefined)
  }
  
}

