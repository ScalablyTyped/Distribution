package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse extends StObject {
  
  /**
    * A pagination token returned from a previous call to ListProducts that
    * indicates where the listing should continue from. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The `Product` returned from the list call.
    */
  var products: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]] = js.undefined
}
object SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse {
  
  inline def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProducts(value: js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: SchemaGoogleCloudPrivatecatalogproducerV1beta1Product*): Self = StObject.set(x, "products", js.Array(value :_*))
  }
}
