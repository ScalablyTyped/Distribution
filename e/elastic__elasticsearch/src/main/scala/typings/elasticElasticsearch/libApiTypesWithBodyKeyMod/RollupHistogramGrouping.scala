package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupHistogramGrouping extends StObject {
  
  var fields: Fields
  
  var interval: long
}
object RollupHistogramGrouping {
  
  inline def apply(fields: Fields, interval: long): RollupHistogramGrouping = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupHistogramGrouping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollupHistogramGrouping] (val x: Self) extends AnyVal {
    
    inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setInterval(value: long): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
  }
}
