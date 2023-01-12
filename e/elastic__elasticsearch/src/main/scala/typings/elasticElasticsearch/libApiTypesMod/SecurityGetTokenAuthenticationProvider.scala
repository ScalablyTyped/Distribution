package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetTokenAuthenticationProvider extends StObject {
  
  var name: Name
  
  var `type`: String
}
object SecurityGetTokenAuthenticationProvider {
  
  inline def apply(name: Name, `type`: String): SecurityGetTokenAuthenticationProvider = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetTokenAuthenticationProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGetTokenAuthenticationProvider] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
