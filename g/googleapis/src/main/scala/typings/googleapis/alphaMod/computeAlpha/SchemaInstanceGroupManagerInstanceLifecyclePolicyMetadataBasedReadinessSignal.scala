package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignal extends StObject {
  
  /**
    * The number of seconds to wait for a readiness signal during initialization before timing out.
    */
  var timeoutSec: js.UndefOr[Double | Null] = js.undefined
}
object SchemaInstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignal {
  
  inline def apply(): SchemaInstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignal]
  }
  
  extension [Self <: SchemaInstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignal](x: Self) {
    
    inline def setTimeoutSec(value: Double): Self = StObject.set(x, "timeoutSec", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecNull: Self = StObject.set(x, "timeoutSec", null)
    
    inline def setTimeoutSecUndefined: Self = StObject.set(x, "timeoutSec", js.undefined)
  }
}
