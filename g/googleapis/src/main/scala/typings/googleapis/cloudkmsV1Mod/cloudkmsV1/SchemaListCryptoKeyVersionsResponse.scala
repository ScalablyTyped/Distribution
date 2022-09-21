package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCryptoKeyVersionsResponse extends StObject {
  
  /**
    * The list of CryptoKeyVersions.
    */
  var cryptoKeyVersions: js.UndefOr[js.Array[SchemaCryptoKeyVersion]] = js.undefined
  
  /**
    * A token to retrieve next page of results. Pass this value in ListCryptoKeyVersionsRequest.page_token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total number of CryptoKeyVersions that matched the query.
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaListCryptoKeyVersionsResponse {
  
  inline def apply(): SchemaListCryptoKeyVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCryptoKeyVersionsResponse]
  }
  
  extension [Self <: SchemaListCryptoKeyVersionsResponse](x: Self) {
    
    inline def setCryptoKeyVersions(value: js.Array[SchemaCryptoKeyVersion]): Self = StObject.set(x, "cryptoKeyVersions", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeyVersionsUndefined: Self = StObject.set(x, "cryptoKeyVersions", js.undefined)
    
    inline def setCryptoKeyVersionsVarargs(value: SchemaCryptoKeyVersion*): Self = StObject.set(x, "cryptoKeyVersions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
