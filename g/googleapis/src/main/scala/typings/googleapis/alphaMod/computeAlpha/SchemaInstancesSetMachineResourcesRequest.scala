package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstancesSetMachineResourcesRequest extends StObject {
  
  /**
    * A list of the type and count of accelerator cards attached to the
    * instance.
    */
  var guestAccelerators: js.UndefOr[js.Array[SchemaAcceleratorConfig]] = js.undefined
}
object SchemaInstancesSetMachineResourcesRequest {
  
  inline def apply(): SchemaInstancesSetMachineResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesSetMachineResourcesRequest]
  }
  
  extension [Self <: SchemaInstancesSetMachineResourcesRequest](x: Self) {
    
    inline def setGuestAccelerators(value: js.Array[SchemaAcceleratorConfig]): Self = StObject.set(x, "guestAccelerators", value.asInstanceOf[js.Any])
    
    inline def setGuestAcceleratorsUndefined: Self = StObject.set(x, "guestAccelerators", js.undefined)
    
    inline def setGuestAcceleratorsVarargs(value: SchemaAcceleratorConfig*): Self = StObject.set(x, "guestAccelerators", js.Array(value :_*))
  }
}
