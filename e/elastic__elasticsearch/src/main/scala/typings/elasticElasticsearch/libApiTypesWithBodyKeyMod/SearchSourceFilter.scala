package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSourceFilter extends StObject {
  
  var exclude: js.UndefOr[Fields] = js.undefined
  
  var excludes: js.UndefOr[Fields] = js.undefined
  
  var include: js.UndefOr[Fields] = js.undefined
  
  var includes: js.UndefOr[Fields] = js.undefined
}
object SearchSourceFilter {
  
  inline def apply(): SearchSourceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSourceFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchSourceFilter] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: Fields): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: Field*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setExcludes(value: Fields): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    inline def setExcludesVarargs(value: Field*): Self = StObject.set(x, "excludes", js.Array(value*))
    
    inline def setInclude(value: Fields): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: Field*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setIncludes(value: Fields): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
    
    inline def setIncludesVarargs(value: Field*): Self = StObject.set(x, "includes", js.Array(value*))
  }
}
