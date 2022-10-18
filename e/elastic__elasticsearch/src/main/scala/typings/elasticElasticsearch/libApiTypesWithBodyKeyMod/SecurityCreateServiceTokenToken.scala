package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityCreateServiceTokenToken extends StObject {
  
  var name: Name
  
  var value: String
}
object SecurityCreateServiceTokenToken {
  
  inline def apply(name: Name, value: String): SecurityCreateServiceTokenToken = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityCreateServiceTokenToken]
  }
  
  extension [Self <: SecurityCreateServiceTokenToken](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
