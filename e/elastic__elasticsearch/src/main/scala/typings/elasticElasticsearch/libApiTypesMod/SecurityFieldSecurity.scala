package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityFieldSecurity extends StObject {
  
  var except: js.UndefOr[Fields] = js.undefined
  
  var grant: js.UndefOr[Fields] = js.undefined
}
object SecurityFieldSecurity {
  
  inline def apply(): SecurityFieldSecurity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityFieldSecurity]
  }
  
  extension [Self <: SecurityFieldSecurity](x: Self) {
    
    inline def setExcept(value: Fields): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
    
    inline def setExceptUndefined: Self = StObject.set(x, "except", js.undefined)
    
    inline def setExceptVarargs(value: Field*): Self = StObject.set(x, "except", js.Array(value*))
    
    inline def setGrant(value: Fields): Self = StObject.set(x, "grant", value.asInstanceOf[js.Any])
    
    inline def setGrantUndefined: Self = StObject.set(x, "grant", js.undefined)
    
    inline def setGrantVarargs(value: Field*): Self = StObject.set(x, "grant", js.Array(value*))
  }
}
