package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslBoolQuery
  extends StObject
     with QueryDslQueryBase {
  
  var filter: js.UndefOr[QueryDslQueryContainer | js.Array[QueryDslQueryContainer]] = js.undefined
  
  var minimum_should_match: js.UndefOr[MinimumShouldMatch] = js.undefined
  
  var must: js.UndefOr[QueryDslQueryContainer | js.Array[QueryDslQueryContainer]] = js.undefined
  
  var must_not: js.UndefOr[QueryDslQueryContainer | js.Array[QueryDslQueryContainer]] = js.undefined
  
  var should: js.UndefOr[QueryDslQueryContainer | js.Array[QueryDslQueryContainer]] = js.undefined
}
object QueryDslBoolQuery {
  
  inline def apply(): QueryDslBoolQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslBoolQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslBoolQuery] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: QueryDslQueryContainer | js.Array[QueryDslQueryContainer]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: QueryDslQueryContainer*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setMinimum_should_match(value: MinimumShouldMatch): Self = StObject.set(x, "minimum_should_match", value.asInstanceOf[js.Any])
    
    inline def setMinimum_should_matchUndefined: Self = StObject.set(x, "minimum_should_match", js.undefined)
    
    inline def setMust(value: QueryDslQueryContainer | js.Array[QueryDslQueryContainer]): Self = StObject.set(x, "must", value.asInstanceOf[js.Any])
    
    inline def setMustUndefined: Self = StObject.set(x, "must", js.undefined)
    
    inline def setMustVarargs(value: QueryDslQueryContainer*): Self = StObject.set(x, "must", js.Array(value*))
    
    inline def setMust_not(value: QueryDslQueryContainer | js.Array[QueryDslQueryContainer]): Self = StObject.set(x, "must_not", value.asInstanceOf[js.Any])
    
    inline def setMust_notUndefined: Self = StObject.set(x, "must_not", js.undefined)
    
    inline def setMust_notVarargs(value: QueryDslQueryContainer*): Self = StObject.set(x, "must_not", js.Array(value*))
    
    inline def setShould(value: QueryDslQueryContainer | js.Array[QueryDslQueryContainer]): Self = StObject.set(x, "should", value.asInstanceOf[js.Any])
    
    inline def setShouldUndefined: Self = StObject.set(x, "should", js.undefined)
    
    inline def setShouldVarargs(value: QueryDslQueryContainer*): Self = StObject.set(x, "should", js.Array(value*))
  }
}
