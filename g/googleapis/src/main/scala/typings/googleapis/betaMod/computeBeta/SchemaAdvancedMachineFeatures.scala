package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdvancedMachineFeatures extends StObject {
  
  /**
    * Whether to enable nested virtualization or not (default is false).
    */
  var enableNestedVirtualization: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to enable UEFI networking for instance creation.
    */
  var enableUefiNetworking: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
    */
  var threadsPerCore: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The number of physical cores to expose to an instance. Multiply by the number of threads per core to compute the total number of virtual CPUs to expose to the instance. If unset, the number of cores is inferred from the instance's nominal CPU count and the underlying platform's SMT width.
    */
  var visibleCoreCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAdvancedMachineFeatures {
  
  inline def apply(): SchemaAdvancedMachineFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvancedMachineFeatures]
  }
  
  extension [Self <: SchemaAdvancedMachineFeatures](x: Self) {
    
    inline def setEnableNestedVirtualization(value: Boolean): Self = StObject.set(x, "enableNestedVirtualization", value.asInstanceOf[js.Any])
    
    inline def setEnableNestedVirtualizationNull: Self = StObject.set(x, "enableNestedVirtualization", null)
    
    inline def setEnableNestedVirtualizationUndefined: Self = StObject.set(x, "enableNestedVirtualization", js.undefined)
    
    inline def setEnableUefiNetworking(value: Boolean): Self = StObject.set(x, "enableUefiNetworking", value.asInstanceOf[js.Any])
    
    inline def setEnableUefiNetworkingNull: Self = StObject.set(x, "enableUefiNetworking", null)
    
    inline def setEnableUefiNetworkingUndefined: Self = StObject.set(x, "enableUefiNetworking", js.undefined)
    
    inline def setThreadsPerCore(value: Double): Self = StObject.set(x, "threadsPerCore", value.asInstanceOf[js.Any])
    
    inline def setThreadsPerCoreNull: Self = StObject.set(x, "threadsPerCore", null)
    
    inline def setThreadsPerCoreUndefined: Self = StObject.set(x, "threadsPerCore", js.undefined)
    
    inline def setVisibleCoreCount(value: Double): Self = StObject.set(x, "visibleCoreCount", value.asInstanceOf[js.Any])
    
    inline def setVisibleCoreCountNull: Self = StObject.set(x, "visibleCoreCount", null)
    
    inline def setVisibleCoreCountUndefined: Self = StObject.set(x, "visibleCoreCount", js.undefined)
  }
}
