package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueuedResourceStatus extends StObject {
  
  /**
    * Additional status detail for the FAILED state.
    */
  var failedData: js.UndefOr[SchemaQueuedResourceStatusFailedData] = js.undefined
  
  /**
    * [Output only] Fully qualified URL of the provisioning GCE operation to track the provisioning along with provisioning errors. The referenced operation may not exist after having been deleted or expired.
    */
  var provisioningOperations: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Constraints for the time when the resource(s) start provisioning. Always exposed as absolute times.
    */
  var queuingPolicy: js.UndefOr[SchemaQueuingPolicy] = js.undefined
}
object SchemaQueuedResourceStatus {
  
  inline def apply(): SchemaQueuedResourceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueuedResourceStatus]
  }
  
  extension [Self <: SchemaQueuedResourceStatus](x: Self) {
    
    inline def setFailedData(value: SchemaQueuedResourceStatusFailedData): Self = StObject.set(x, "failedData", value.asInstanceOf[js.Any])
    
    inline def setFailedDataUndefined: Self = StObject.set(x, "failedData", js.undefined)
    
    inline def setProvisioningOperations(value: js.Array[String]): Self = StObject.set(x, "provisioningOperations", value.asInstanceOf[js.Any])
    
    inline def setProvisioningOperationsNull: Self = StObject.set(x, "provisioningOperations", null)
    
    inline def setProvisioningOperationsUndefined: Self = StObject.set(x, "provisioningOperations", js.undefined)
    
    inline def setProvisioningOperationsVarargs(value: String*): Self = StObject.set(x, "provisioningOperations", js.Array(value*))
    
    inline def setQueuingPolicy(value: SchemaQueuingPolicy): Self = StObject.set(x, "queuingPolicy", value.asInstanceOf[js.Any])
    
    inline def setQueuingPolicyUndefined: Self = StObject.set(x, "queuingPolicy", js.undefined)
  }
}
