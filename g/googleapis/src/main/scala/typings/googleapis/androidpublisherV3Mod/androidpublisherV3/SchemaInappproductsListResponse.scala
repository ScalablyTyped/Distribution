package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInappproductsListResponse extends StObject {
  
  var inappproduct: js.UndefOr[js.Array[SchemaInAppProduct]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#inappproductsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var pageInfo: js.UndefOr[SchemaPageInfo] = js.undefined
  
  var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.undefined
}
object SchemaInappproductsListResponse {
  
  @scala.inline
  def apply(): SchemaInappproductsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInappproductsListResponse]
  }
  
  @scala.inline
  implicit class SchemaInappproductsListResponseMutableBuilder[Self <: SchemaInappproductsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInappproduct(value: js.Array[SchemaInAppProduct]): Self = StObject.set(x, "inappproduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInappproductUndefined: Self = StObject.set(x, "inappproduct", js.undefined)
    
    @scala.inline
    def setInappproductVarargs(value: SchemaInAppProduct*): Self = StObject.set(x, "inappproduct", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPageInfo(value: SchemaPageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    @scala.inline
    def setTokenPagination(value: SchemaTokenPagination): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
  }
}
