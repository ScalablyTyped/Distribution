package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse extends StObject {
  
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
  implicit class SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponseMutableBuilder[Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setProducts(value: js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    @scala.inline
    def setProductsVarargs(value: SchemaGoogleCloudPrivatecatalogproducerV1beta1Product*): Self = StObject.set(x, "products", js.Array(value :_*))
  }
}
