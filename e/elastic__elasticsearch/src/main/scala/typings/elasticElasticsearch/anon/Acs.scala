package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acs extends StObject {
  
  var acs: js.UndefOr[String] = js.undefined
  
  var query_string: String
  
  var realm: js.UndefOr[String] = js.undefined
}
object Acs {
  
  inline def apply(query_string: String): Acs = {
    val __obj = js.Dynamic.literal(query_string = query_string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Acs] (val x: Self) extends AnyVal {
    
    inline def setAcs(value: String): Self = StObject.set(x, "acs", value.asInstanceOf[js.Any])
    
    inline def setAcsUndefined: Self = StObject.set(x, "acs", js.undefined)
    
    inline def setQuery_string(value: String): Self = StObject.set(x, "query_string", value.asInstanceOf[js.Any])
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
  }
}
