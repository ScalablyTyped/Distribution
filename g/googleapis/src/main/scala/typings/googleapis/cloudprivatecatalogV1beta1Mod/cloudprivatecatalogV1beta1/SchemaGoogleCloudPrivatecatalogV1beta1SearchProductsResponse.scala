package typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for PrivateCatalog.SearchProducts.
  */
@js.native
trait SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse extends js.Object {
  /**
    * A pagination token returned from a previous call to SearchProducts that
    * indicates from where listing should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The `Product` resources computed from the resource context.
    */
  var products: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Product]] = js.native
}

object SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponseOps[Self <: SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setProductsVarargs(value: SchemaGoogleCloudPrivatecatalogV1beta1Product*): Self = this.set("products", js.Array(value :_*))
    @scala.inline
    def setProducts(value: js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Product]): Self = this.set("products", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProducts: Self = this.set("products", js.undefined)
  }
  
}

