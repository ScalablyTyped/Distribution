package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesIndexRoutingAllocationDisk extends StObject {
  
  var threshold_enabled: js.UndefOr[Boolean | String] = js.undefined
}
object IndicesIndexRoutingAllocationDisk {
  
  inline def apply(): IndicesIndexRoutingAllocationDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesIndexRoutingAllocationDisk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesIndexRoutingAllocationDisk] (val x: Self) extends AnyVal {
    
    inline def setThreshold_enabled(value: Boolean | String): Self = StObject.set(x, "threshold_enabled", value.asInstanceOf[js.Any])
    
    inline def setThreshold_enabledUndefined: Self = StObject.set(x, "threshold_enabled", js.undefined)
  }
}
