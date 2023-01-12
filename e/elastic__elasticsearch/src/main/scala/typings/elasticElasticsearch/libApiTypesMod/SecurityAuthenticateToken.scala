package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityAuthenticateToken extends StObject {
  
  var name: Name
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SecurityAuthenticateToken {
  
  inline def apply(name: Name): SecurityAuthenticateToken = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityAuthenticateToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityAuthenticateToken] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
