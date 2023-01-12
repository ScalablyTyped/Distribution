package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityDeleteServiceTokenResponse extends StObject {
  
  var found: Boolean
}
object SecurityDeleteServiceTokenResponse {
  
  inline def apply(found: Boolean): SecurityDeleteServiceTokenResponse = {
    val __obj = js.Dynamic.literal(found = found.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDeleteServiceTokenResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityDeleteServiceTokenResponse] (val x: Self) extends AnyVal {
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
  }
}
