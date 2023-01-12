package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsHdrMethod extends StObject {
  
  var number_of_significant_value_digits: js.UndefOr[integer] = js.undefined
}
object AggregationsHdrMethod {
  
  inline def apply(): AggregationsHdrMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsHdrMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsHdrMethod] (val x: Self) extends AnyVal {
    
    inline def setNumber_of_significant_value_digits(value: integer): Self = StObject.set(x, "number_of_significant_value_digits", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_significant_value_digitsUndefined: Self = StObject.set(x, "number_of_significant_value_digits", js.undefined)
  }
}
