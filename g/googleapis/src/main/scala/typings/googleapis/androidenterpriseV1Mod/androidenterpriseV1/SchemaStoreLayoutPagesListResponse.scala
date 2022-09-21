package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStoreLayoutPagesListResponse extends StObject {
  
  /**
    * A store page of an enterprise.
    */
  var page: js.UndefOr[js.Array[SchemaStorePage]] = js.undefined
}
object SchemaStoreLayoutPagesListResponse {
  
  inline def apply(): SchemaStoreLayoutPagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStoreLayoutPagesListResponse]
  }
  
  extension [Self <: SchemaStoreLayoutPagesListResponse](x: Self) {
    
    inline def setPage(value: js.Array[SchemaStorePage]): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPageVarargs(value: SchemaStorePage*): Self = StObject.set(x, "page", js.Array(value*))
  }
}
