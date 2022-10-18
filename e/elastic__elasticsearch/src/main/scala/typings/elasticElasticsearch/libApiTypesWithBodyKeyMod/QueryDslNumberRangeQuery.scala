package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslNumberRangeQuery
  extends StObject
     with QueryDslRangeQueryBase
     with QueryDslRangeQuery {
  
  var from: js.UndefOr[double | Null] = js.undefined
  
  var gt: js.UndefOr[double] = js.undefined
  
  var gte: js.UndefOr[double] = js.undefined
  
  var lt: js.UndefOr[double] = js.undefined
  
  var lte: js.UndefOr[double] = js.undefined
  
  var to: js.UndefOr[double | Null] = js.undefined
}
object QueryDslNumberRangeQuery {
  
  inline def apply(): QueryDslNumberRangeQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslNumberRangeQuery]
  }
  
  extension [Self <: QueryDslNumberRangeQuery](x: Self) {
    
    inline def setFrom(value: double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setGt(value: double): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    inline def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
    
    inline def setGte(value: double): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
    
    inline def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
    
    inline def setLt(value: double): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    
    inline def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
    
    inline def setLte(value: double): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
    
    inline def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
    
    inline def setTo(value: double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
