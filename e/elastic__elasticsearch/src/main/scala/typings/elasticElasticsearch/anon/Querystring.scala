package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Querystring extends StObject {
  
  var content: js.UndefOr[String] = js.undefined
  
  var ids: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Ids
  
  var query_string: js.UndefOr[String] = js.undefined
  
  var realm: String
}
object Querystring {
  
  inline def apply(ids: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Ids, realm: String): Querystring = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Querystring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Querystring] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setIds(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Ids): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setQuery_string(value: String): Self = StObject.set(x, "query_string", value.asInstanceOf[js.Any])
    
    inline def setQuery_stringUndefined: Self = StObject.set(x, "query_string", js.undefined)
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
  }
}
