package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListItemNamesForUnmappedIdentityResponse extends StObject {
  
  var itemNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListItemNamesForUnmappedIdentityResponse {
  
  inline def apply(): SchemaListItemNamesForUnmappedIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListItemNamesForUnmappedIdentityResponse]
  }
  
  extension [Self <: SchemaListItemNamesForUnmappedIdentityResponse](x: Self) {
    
    inline def setItemNames(value: js.Array[String]): Self = StObject.set(x, "itemNames", value.asInstanceOf[js.Any])
    
    inline def setItemNamesUndefined: Self = StObject.set(x, "itemNames", js.undefined)
    
    inline def setItemNamesVarargs(value: String*): Self = StObject.set(x, "itemNames", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
