package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySamlLogoutResponse extends StObject {
  
  var redirect: String
}
object SecuritySamlLogoutResponse {
  
  inline def apply(redirect: String): SecuritySamlLogoutResponse = {
    val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySamlLogoutResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecuritySamlLogoutResponse] (val x: Self) extends AnyVal {
    
    inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
  }
}
