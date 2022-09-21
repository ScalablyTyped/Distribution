package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSpacesResponse extends StObject {
  
  /**
    * Continuation token to retrieve the next page of results. It will be empty for the last page of results. Tokens expire in an hour. An error is thrown if an expired token is passed.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of spaces in the requested (or first) page.
    */
  var spaces: js.UndefOr[js.Array[SchemaSpace]] = js.undefined
}
object SchemaListSpacesResponse {
  
  inline def apply(): SchemaListSpacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSpacesResponse]
  }
  
  extension [Self <: SchemaListSpacesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSpaces(value: js.Array[SchemaSpace]): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    
    inline def setSpacesVarargs(value: SchemaSpace*): Self = StObject.set(x, "spaces", js.Array(value*))
  }
}
