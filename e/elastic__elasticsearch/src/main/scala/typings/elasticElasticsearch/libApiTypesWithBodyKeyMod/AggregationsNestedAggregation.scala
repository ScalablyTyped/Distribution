package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsNestedAggregation
  extends StObject
     with AggregationsAggregation {
  
  var path: js.UndefOr[Field] = js.undefined
}
object AggregationsNestedAggregation {
  
  inline def apply(): AggregationsNestedAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsNestedAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsNestedAggregation] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Field): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
