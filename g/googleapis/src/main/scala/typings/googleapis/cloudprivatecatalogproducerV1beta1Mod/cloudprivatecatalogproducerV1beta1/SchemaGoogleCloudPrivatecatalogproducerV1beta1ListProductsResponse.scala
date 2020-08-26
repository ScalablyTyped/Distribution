package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse extends js.Object {
  /**
    * A pagination token returned from a previous call to ListProducts that
    * indicates where the listing should continue from. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The `Product` returned from the list call.
    */
  var products: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]] = js.native
}

object SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponseOps[Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse] (val x: Self) extends AnyVal {
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
    def setProductsVarargs(value: SchemaGoogleCloudPrivatecatalogproducerV1beta1Product*): Self = this.set("products", js.Array(value :_*))
    @scala.inline
    def setProducts(value: js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]): Self = this.set("products", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProducts: Self = this.set("products", js.undefined)
  }
  
}

