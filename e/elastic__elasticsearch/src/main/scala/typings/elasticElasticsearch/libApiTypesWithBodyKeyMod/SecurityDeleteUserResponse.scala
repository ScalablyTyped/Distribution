package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityDeleteUserResponse extends StObject {
  
  var found: Boolean
}
object SecurityDeleteUserResponse {
  
  inline def apply(found: Boolean): SecurityDeleteUserResponse = {
    val __obj = js.Dynamic.literal(found = found.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDeleteUserResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityDeleteUserResponse] (val x: Self) extends AnyVal {
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
  }
}
