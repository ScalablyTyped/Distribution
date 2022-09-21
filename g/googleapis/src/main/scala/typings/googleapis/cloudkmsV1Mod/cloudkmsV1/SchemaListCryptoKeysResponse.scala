package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCryptoKeysResponse extends StObject {
  
  /**
    * The list of CryptoKeys.
    */
  var cryptoKeys: js.UndefOr[js.Array[SchemaCryptoKey]] = js.undefined
  
  /**
    * A token to retrieve next page of results. Pass this value in ListCryptoKeysRequest.page_token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total number of CryptoKeys that matched the query.
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaListCryptoKeysResponse {
  
  inline def apply(): SchemaListCryptoKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCryptoKeysResponse]
  }
  
  extension [Self <: SchemaListCryptoKeysResponse](x: Self) {
    
    inline def setCryptoKeys(value: js.Array[SchemaCryptoKey]): Self = StObject.set(x, "cryptoKeys", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeysUndefined: Self = StObject.set(x, "cryptoKeys", js.undefined)
    
    inline def setCryptoKeysVarargs(value: SchemaCryptoKey*): Self = StObject.set(x, "cryptoKeys", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
