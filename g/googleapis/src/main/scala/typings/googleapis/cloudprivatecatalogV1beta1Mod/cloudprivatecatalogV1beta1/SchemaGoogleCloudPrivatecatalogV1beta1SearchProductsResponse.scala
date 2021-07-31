package typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for PrivateCatalog.SearchProducts.
  */
trait SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse extends StObject {
  
  /**
    * A pagination token returned from a previous call to SearchProducts that
    * indicates from where listing should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The `Product` resources computed from the resource context.
    */
  var products: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Product]] = js.undefined
}
object SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponseMutableBuilder[Self <: SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setProducts(value: js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    @scala.inline
    def setProductsVarargs(value: SchemaGoogleCloudPrivatecatalogV1beta1Product*): Self = StObject.set(x, "products", js.Array(value :_*))
  }
}
