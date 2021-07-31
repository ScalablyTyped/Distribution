package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The matching products.
  */
trait SchemaProductsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#productsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * General pagination information.
    */
  var pageInfo: js.UndefOr[SchemaPageInfo] = js.undefined
  
  /**
    * Information about a product (e.g. an app) in the Google Play store, for
    * display to an enterprise admin.
    */
  var product: js.UndefOr[js.Array[SchemaProduct]] = js.undefined
  
  /**
    * Pagination information for token pagination.
    */
  var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.undefined
}
object SchemaProductsListResponse {
  
  @scala.inline
  def apply(): SchemaProductsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductsListResponse]
  }
  
  @scala.inline
  implicit class SchemaProductsListResponseMutableBuilder[Self <: SchemaProductsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPageInfo(value: SchemaPageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    @scala.inline
    def setProduct(value: js.Array[SchemaProduct]): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    @scala.inline
    def setProductVarargs(value: SchemaProduct*): Self = StObject.set(x, "product", js.Array(value :_*))
    
    @scala.inline
    def setTokenPagination(value: SchemaTokenPagination): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
  }
}
