package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInappproductsListResponse extends StObject {
  
  /**
    * All in-app products.
    */
  var inappproduct: js.UndefOr[js.Array[SchemaInAppProduct]] = js.undefined
  
  /**
    * The kind of this response ("androidpublisher#inappproductsListResponse").
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated and unset.
    */
  var pageInfo: js.UndefOr[SchemaPageInfo] = js.undefined
  
  /**
    * Pagination token, to handle a number of products that is over one page.
    */
  var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.undefined
}
object SchemaInappproductsListResponse {
  
  inline def apply(): SchemaInappproductsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInappproductsListResponse]
  }
  
  extension [Self <: SchemaInappproductsListResponse](x: Self) {
    
    inline def setInappproduct(value: js.Array[SchemaInAppProduct]): Self = StObject.set(x, "inappproduct", value.asInstanceOf[js.Any])
    
    inline def setInappproductUndefined: Self = StObject.set(x, "inappproduct", js.undefined)
    
    inline def setInappproductVarargs(value: SchemaInAppProduct*): Self = StObject.set(x, "inappproduct", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPageInfo(value: SchemaPageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    inline def setTokenPagination(value: SchemaTokenPagination): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
  }
}
