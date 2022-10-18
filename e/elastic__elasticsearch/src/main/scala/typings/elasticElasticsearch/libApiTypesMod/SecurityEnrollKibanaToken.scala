package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityEnrollKibanaToken extends StObject {
  
  var name: String
  
  var value: String
}
object SecurityEnrollKibanaToken {
  
  inline def apply(name: String, value: String): SecurityEnrollKibanaToken = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityEnrollKibanaToken]
  }
  
  extension [Self <: SecurityEnrollKibanaToken](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
