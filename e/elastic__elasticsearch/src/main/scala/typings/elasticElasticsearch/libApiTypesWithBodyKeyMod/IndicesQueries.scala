package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesQueries extends StObject {
  
  var cache: js.UndefOr[IndicesCacheQueries] = js.undefined
}
object IndicesQueries {
  
  inline def apply(): IndicesQueries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesQueries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesQueries] (val x: Self) extends AnyVal {
    
    inline def setCache(value: IndicesCacheQueries): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
  }
}
