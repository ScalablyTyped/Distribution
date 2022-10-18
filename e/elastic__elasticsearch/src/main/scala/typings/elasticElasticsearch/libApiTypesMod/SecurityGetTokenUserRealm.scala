package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetTokenUserRealm extends StObject {
  
  var name: Name
  
  var `type`: String
}
object SecurityGetTokenUserRealm {
  
  inline def apply(name: Name, `type`: String): SecurityGetTokenUserRealm = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetTokenUserRealm]
  }
  
  extension [Self <: SecurityGetTokenUserRealm](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
