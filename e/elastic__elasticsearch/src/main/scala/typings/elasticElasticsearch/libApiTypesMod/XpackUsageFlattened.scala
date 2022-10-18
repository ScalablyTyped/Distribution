package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageFlattened
  extends StObject
     with XpackUsageBase {
  
  var field_count: integer
}
object XpackUsageFlattened {
  
  inline def apply(available: Boolean, enabled: Boolean, field_count: integer): XpackUsageFlattened = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], field_count = field_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageFlattened]
  }
  
  extension [Self <: XpackUsageFlattened](x: Self) {
    
    inline def setField_count(value: integer): Self = StObject.set(x, "field_count", value.asInstanceOf[js.Any])
  }
}
