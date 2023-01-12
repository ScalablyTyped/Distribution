package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsReverseNestedAggregation
  extends StObject
     with AggregationsAggregation {
  
  var path: js.UndefOr[Field] = js.undefined
}
object AggregationsReverseNestedAggregation {
  
  inline def apply(): AggregationsReverseNestedAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsReverseNestedAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsReverseNestedAggregation] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Field): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
