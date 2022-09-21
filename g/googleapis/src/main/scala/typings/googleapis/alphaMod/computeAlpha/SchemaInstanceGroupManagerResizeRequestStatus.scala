package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerResizeRequestStatus extends StObject {
  
  /**
    * Constraints for the time when the instances start provisioning. Always exposed as absolute time.
    */
  var queuingPolicy: js.UndefOr[SchemaQueuingPolicy] = js.undefined
}
object SchemaInstanceGroupManagerResizeRequestStatus {
  
  inline def apply(): SchemaInstanceGroupManagerResizeRequestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerResizeRequestStatus]
  }
  
  extension [Self <: SchemaInstanceGroupManagerResizeRequestStatus](x: Self) {
    
    inline def setQueuingPolicy(value: SchemaQueuingPolicy): Self = StObject.set(x, "queuingPolicy", value.asInstanceOf[js.Any])
    
    inline def setQueuingPolicyUndefined: Self = StObject.set(x, "queuingPolicy", js.undefined)
  }
}
