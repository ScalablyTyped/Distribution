package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSlowlogTresholds extends StObject {
  
  var fetch: js.UndefOr[IndicesSlowlogTresholdLevels] = js.undefined
  
  var index: js.UndefOr[IndicesSlowlogTresholdLevels] = js.undefined
  
  var query: js.UndefOr[IndicesSlowlogTresholdLevels] = js.undefined
}
object IndicesSlowlogTresholds {
  
  inline def apply(): IndicesSlowlogTresholds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesSlowlogTresholds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesSlowlogTresholds] (val x: Self) extends AnyVal {
    
    inline def setFetch(value: IndicesSlowlogTresholdLevels): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
    
    inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
    
    inline def setIndex(value: IndicesSlowlogTresholdLevels): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setQuery(value: IndicesSlowlogTresholdLevels): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
