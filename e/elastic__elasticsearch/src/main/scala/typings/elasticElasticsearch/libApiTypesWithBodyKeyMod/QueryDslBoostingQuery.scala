package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslBoostingQuery
  extends StObject
     with QueryDslQueryBase {
  
  var negative: QueryDslQueryContainer
  
  var negative_boost: double
  
  var positive: QueryDslQueryContainer
}
object QueryDslBoostingQuery {
  
  inline def apply(negative: QueryDslQueryContainer, negative_boost: double, positive: QueryDslQueryContainer): QueryDslBoostingQuery = {
    val __obj = js.Dynamic.literal(negative = negative.asInstanceOf[js.Any], negative_boost = negative_boost.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslBoostingQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslBoostingQuery] (val x: Self) extends AnyVal {
    
    inline def setNegative(value: QueryDslQueryContainer): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNegative_boost(value: double): Self = StObject.set(x, "negative_boost", value.asInstanceOf[js.Any])
    
    inline def setPositive(value: QueryDslQueryContainer): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
  }
}
