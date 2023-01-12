package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySamlInvalidateResponse extends StObject {
  
  var invalidated: integer
  
  var realm: String
  
  var redirect: String
}
object SecuritySamlInvalidateResponse {
  
  inline def apply(invalidated: integer, realm: String, redirect: String): SecuritySamlInvalidateResponse = {
    val __obj = js.Dynamic.literal(invalidated = invalidated.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySamlInvalidateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecuritySamlInvalidateResponse] (val x: Self) extends AnyVal {
    
    inline def setInvalidated(value: integer): Self = StObject.set(x, "invalidated", value.asInstanceOf[js.Any])
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
  }
}
