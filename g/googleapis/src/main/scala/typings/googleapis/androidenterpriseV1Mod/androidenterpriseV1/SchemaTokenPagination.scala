package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTokenPagination extends StObject {
  
  /**
    * Tokens to pass to the standard list field 'page_token'. Whenever available, tokens are preferred over manipulating start_index.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  var previousPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaTokenPagination {
  
  inline def apply(): SchemaTokenPagination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTokenPagination]
  }
  
  extension [Self <: SchemaTokenPagination](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPreviousPageToken(value: String): Self = StObject.set(x, "previousPageToken", value.asInstanceOf[js.Any])
    
    inline def setPreviousPageTokenNull: Self = StObject.set(x, "previousPageToken", null)
    
    inline def setPreviousPageTokenUndefined: Self = StObject.set(x, "previousPageToken", js.undefined)
  }
}
