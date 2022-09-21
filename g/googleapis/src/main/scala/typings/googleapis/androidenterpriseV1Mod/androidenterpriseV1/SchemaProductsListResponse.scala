package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductsListResponse extends StObject {
  
  /**
    * General pagination information.
    */
  var pageInfo: js.UndefOr[SchemaPageInfo] = js.undefined
  
  /**
    * Information about a product (e.g. an app) in the Google Play store, for display to an enterprise admin.
    */
  var product: js.UndefOr[js.Array[SchemaProduct]] = js.undefined
  
  /**
    * Pagination information for token pagination.
    */
  var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.undefined
}
object SchemaProductsListResponse {
  
  inline def apply(): SchemaProductsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductsListResponse]
  }
  
  extension [Self <: SchemaProductsListResponse](x: Self) {
    
    inline def setPageInfo(value: SchemaPageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    inline def setProduct(value: js.Array[SchemaProduct]): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setProductVarargs(value: SchemaProduct*): Self = StObject.set(x, "product", js.Array(value*))
    
    inline def setTokenPagination(value: SchemaTokenPagination): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
  }
}
