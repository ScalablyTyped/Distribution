package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSearchProfile extends StObject {
  
  var collector: js.Array[SearchCollector]
  
  var query: js.Array[SearchQueryProfile]
  
  var rewrite_time: long
}
object SearchSearchProfile {
  
  inline def apply(collector: js.Array[SearchCollector], query: js.Array[SearchQueryProfile], rewrite_time: long): SearchSearchProfile = {
    val __obj = js.Dynamic.literal(collector = collector.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], rewrite_time = rewrite_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSearchProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchSearchProfile] (val x: Self) extends AnyVal {
    
    inline def setCollector(value: js.Array[SearchCollector]): Self = StObject.set(x, "collector", value.asInstanceOf[js.Any])
    
    inline def setCollectorVarargs(value: SearchCollector*): Self = StObject.set(x, "collector", js.Array(value*))
    
    inline def setQuery(value: js.Array[SearchQueryProfile]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryVarargs(value: SearchQueryProfile*): Self = StObject.set(x, "query", js.Array(value*))
    
    inline def setRewrite_time(value: long): Self = StObject.set(x, "rewrite_time", value.asInstanceOf[js.Any])
  }
}
