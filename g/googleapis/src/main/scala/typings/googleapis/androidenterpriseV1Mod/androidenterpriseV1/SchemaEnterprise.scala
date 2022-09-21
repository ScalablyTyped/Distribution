package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnterprise extends StObject {
  
  /**
    * Admins of the enterprise. This is only supported for enterprises created via the EMM-initiated flow.
    */
  var administrator: js.UndefOr[js.Array[SchemaAdministrator]] = js.undefined
  
  /**
    * The unique ID for the enterprise.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the enterprise, for example, "Example, Inc".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The enterprise's primary domain, such as "example.com".
    */
  var primaryDomain: js.UndefOr[String | Null] = js.undefined
}
object SchemaEnterprise {
  
  inline def apply(): SchemaEnterprise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnterprise]
  }
  
  extension [Self <: SchemaEnterprise](x: Self) {
    
    inline def setAdministrator(value: js.Array[SchemaAdministrator]): Self = StObject.set(x, "administrator", value.asInstanceOf[js.Any])
    
    inline def setAdministratorUndefined: Self = StObject.set(x, "administrator", js.undefined)
    
    inline def setAdministratorVarargs(value: SchemaAdministrator*): Self = StObject.set(x, "administrator", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrimaryDomain(value: String): Self = StObject.set(x, "primaryDomain", value.asInstanceOf[js.Any])
    
    inline def setPrimaryDomainNull: Self = StObject.set(x, "primaryDomain", null)
    
    inline def setPrimaryDomainUndefined: Self = StObject.set(x, "primaryDomain", js.undefined)
  }
}
