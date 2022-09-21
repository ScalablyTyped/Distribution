package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDomainMapping extends StObject {
  
  /**
    * Relative name of the domain serving the application. Example: example.com.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Full path to the DomainMapping resource in the API. Example: apps/myapp/domainMapping/example.com.@OutputOnly
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource records required to configure this domain mapping. These records must be added to the domain's DNS configuration in order to serve the application via this domain mapping.@OutputOnly
    */
  var resourceRecords: js.UndefOr[js.Array[SchemaResourceRecord]] = js.undefined
  
  /**
    * SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
    */
  var sslSettings: js.UndefOr[SchemaSslSettings] = js.undefined
}
object SchemaDomainMapping {
  
  inline def apply(): SchemaDomainMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainMapping]
  }
  
  extension [Self <: SchemaDomainMapping](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceRecords(value: js.Array[SchemaResourceRecord]): Self = StObject.set(x, "resourceRecords", value.asInstanceOf[js.Any])
    
    inline def setResourceRecordsUndefined: Self = StObject.set(x, "resourceRecords", js.undefined)
    
    inline def setResourceRecordsVarargs(value: SchemaResourceRecord*): Self = StObject.set(x, "resourceRecords", js.Array(value*))
    
    inline def setSslSettings(value: SchemaSslSettings): Self = StObject.set(x, "sslSettings", value.asInstanceOf[js.Any])
    
    inline def setSslSettingsUndefined: Self = StObject.set(x, "sslSettings", js.undefined)
  }
}
