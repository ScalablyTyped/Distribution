package typings.googleapis.apikeysV2Mod.apikeysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV2ListKeysResponse extends StObject {
  
  /**
    * A list of API keys.
    */
  var keys: js.UndefOr[js.Array[SchemaV2Key]] = js.undefined
  
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaV2ListKeysResponse {
  
  inline def apply(): SchemaV2ListKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV2ListKeysResponse]
  }
  
  extension [Self <: SchemaV2ListKeysResponse](x: Self) {
    
    inline def setKeys(value: js.Array[SchemaV2Key]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: SchemaV2Key*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
