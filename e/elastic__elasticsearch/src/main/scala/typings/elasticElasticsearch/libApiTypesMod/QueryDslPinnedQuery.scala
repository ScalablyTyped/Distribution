package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslPinnedQuery
  extends StObject
     with QueryDslQueryBase {
  
  var docs: js.UndefOr[js.Array[QueryDslPinnedDoc]] = js.undefined
  
  var ids: js.UndefOr[js.Array[Id]] = js.undefined
  
  var organic: QueryDslQueryContainer
}
object QueryDslPinnedQuery {
  
  inline def apply(organic: QueryDslQueryContainer): QueryDslPinnedQuery = {
    val __obj = js.Dynamic.literal(organic = organic.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslPinnedQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslPinnedQuery] (val x: Self) extends AnyVal {
    
    inline def setDocs(value: js.Array[QueryDslPinnedDoc]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setDocsVarargs(value: QueryDslPinnedDoc*): Self = StObject.set(x, "docs", js.Array(value*))
    
    inline def setIds(value: js.Array[Id]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: Id*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setOrganic(value: QueryDslQueryContainer): Self = StObject.set(x, "organic", value.asInstanceOf[js.Any])
  }
}
