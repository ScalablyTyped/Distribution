package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCertificateMapEntriesResponse extends StObject {
  
  /**
    * A list of certificate map entries for the parent resource.
    */
  var certificateMapEntries: js.UndefOr[js.Array[SchemaCertificateMapEntry]] = js.undefined
  
  /**
    * If there might be more results than those appearing in this response, then `next_page_token` is included. To get the next set of results, call this method again using the value of `next_page_token` as `page_token`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListCertificateMapEntriesResponse {
  
  inline def apply(): SchemaListCertificateMapEntriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCertificateMapEntriesResponse]
  }
  
  extension [Self <: SchemaListCertificateMapEntriesResponse](x: Self) {
    
    inline def setCertificateMapEntries(value: js.Array[SchemaCertificateMapEntry]): Self = StObject.set(x, "certificateMapEntries", value.asInstanceOf[js.Any])
    
    inline def setCertificateMapEntriesUndefined: Self = StObject.set(x, "certificateMapEntries", js.undefined)
    
    inline def setCertificateMapEntriesVarargs(value: SchemaCertificateMapEntry*): Self = StObject.set(x, "certificateMapEntries", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
