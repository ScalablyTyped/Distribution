package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListEnrollmentTokensResponse extends StObject {
  
  /**
    * The list of enrollment tokens.
    */
  var enrollmentTokens: js.UndefOr[js.Array[SchemaEnrollmentToken]] = js.undefined
  
  /**
    * If there are more results, a token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListEnrollmentTokensResponse {
  
  inline def apply(): SchemaListEnrollmentTokensResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListEnrollmentTokensResponse]
  }
  
  extension [Self <: SchemaListEnrollmentTokensResponse](x: Self) {
    
    inline def setEnrollmentTokens(value: js.Array[SchemaEnrollmentToken]): Self = StObject.set(x, "enrollmentTokens", value.asInstanceOf[js.Any])
    
    inline def setEnrollmentTokensUndefined: Self = StObject.set(x, "enrollmentTokens", js.undefined)
    
    inline def setEnrollmentTokensVarargs(value: SchemaEnrollmentToken*): Self = StObject.set(x, "enrollmentTokens", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
