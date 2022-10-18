package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageFrozenIndices
  extends StObject
     with XpackUsageBase {
  
  var indices_count: long
}
object XpackUsageFrozenIndices {
  
  inline def apply(available: Boolean, enabled: Boolean, indices_count: long): XpackUsageFrozenIndices = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], indices_count = indices_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageFrozenIndices]
  }
  
  extension [Self <: XpackUsageFrozenIndices](x: Self) {
    
    inline def setIndices_count(value: long): Self = StObject.set(x, "indices_count", value.asInstanceOf[js.Any])
  }
}
