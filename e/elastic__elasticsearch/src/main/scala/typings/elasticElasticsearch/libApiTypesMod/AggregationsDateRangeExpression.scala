package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsDateRangeExpression extends StObject {
  
  var from: js.UndefOr[AggregationsFieldDateMath] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[AggregationsFieldDateMath] = js.undefined
}
object AggregationsDateRangeExpression {
  
  inline def apply(): AggregationsDateRangeExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsDateRangeExpression]
  }
  
  extension [Self <: AggregationsDateRangeExpression](x: Self) {
    
    inline def setFrom(value: AggregationsFieldDateMath): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setTo(value: AggregationsFieldDateMath): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
