package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySamlPrepareAuthenticationResponse extends StObject {
  
  var id: Id
  
  var realm: String
  
  var redirect: String
}
object SecuritySamlPrepareAuthenticationResponse {
  
  inline def apply(id: Id, realm: String, redirect: String): SecuritySamlPrepareAuthenticationResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySamlPrepareAuthenticationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecuritySamlPrepareAuthenticationResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
  }
}
