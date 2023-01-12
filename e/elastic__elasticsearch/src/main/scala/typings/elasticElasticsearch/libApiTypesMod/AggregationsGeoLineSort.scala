package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeoLineSort extends StObject {
  
  var field: Field
}
object AggregationsGeoLineSort {
  
  inline def apply(field: Field): AggregationsGeoLineSort = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsGeoLineSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsGeoLineSort] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
