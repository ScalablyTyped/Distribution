package typings.googleapis.binaryauthorizationV1Mod.binaryauthorizationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAttestorsResponse extends StObject {
  
  /**
    * The list of attestors.
    */
  var attestors: js.UndefOr[js.Array[SchemaAttestor]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListAttestorsRequest.page_token field in the subsequent call to the `ListAttestors` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAttestorsResponse {
  
  inline def apply(): SchemaListAttestorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAttestorsResponse]
  }
  
  extension [Self <: SchemaListAttestorsResponse](x: Self) {
    
    inline def setAttestors(value: js.Array[SchemaAttestor]): Self = StObject.set(x, "attestors", value.asInstanceOf[js.Any])
    
    inline def setAttestorsUndefined: Self = StObject.set(x, "attestors", js.undefined)
    
    inline def setAttestorsVarargs(value: SchemaAttestor*): Self = StObject.set(x, "attestors", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
