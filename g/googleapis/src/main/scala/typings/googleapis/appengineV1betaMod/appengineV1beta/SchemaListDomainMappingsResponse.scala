package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDomainMappingsResponse extends StObject {
  
  /**
    * The domain mappings for the application.
    */
  var domainMappings: js.UndefOr[js.Array[SchemaDomainMapping]] = js.undefined
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListDomainMappingsResponse {
  
  inline def apply(): SchemaListDomainMappingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDomainMappingsResponse]
  }
  
  extension [Self <: SchemaListDomainMappingsResponse](x: Self) {
    
    inline def setDomainMappings(value: js.Array[SchemaDomainMapping]): Self = StObject.set(x, "domainMappings", value.asInstanceOf[js.Any])
    
    inline def setDomainMappingsUndefined: Self = StObject.set(x, "domainMappings", js.undefined)
    
    inline def setDomainMappingsVarargs(value: SchemaDomainMapping*): Self = StObject.set(x, "domainMappings", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
