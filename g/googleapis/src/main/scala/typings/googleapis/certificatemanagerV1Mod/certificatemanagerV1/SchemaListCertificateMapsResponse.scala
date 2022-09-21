package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCertificateMapsResponse extends StObject {
  
  /**
    * A list of certificate maps for the parent resource.
    */
  var certificateMaps: js.UndefOr[js.Array[SchemaCertificateMap]] = js.undefined
  
  /**
    * If there might be more results than those appearing in this response, then `next_page_token` is included. To get the next set of results, call this method again using the value of `next_page_token` as `page_token`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListCertificateMapsResponse {
  
  inline def apply(): SchemaListCertificateMapsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCertificateMapsResponse]
  }
  
  extension [Self <: SchemaListCertificateMapsResponse](x: Self) {
    
    inline def setCertificateMaps(value: js.Array[SchemaCertificateMap]): Self = StObject.set(x, "certificateMaps", value.asInstanceOf[js.Any])
    
    inline def setCertificateMapsUndefined: Self = StObject.set(x, "certificateMaps", js.undefined)
    
    inline def setCertificateMapsVarargs(value: SchemaCertificateMap*): Self = StObject.set(x, "certificateMaps", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
