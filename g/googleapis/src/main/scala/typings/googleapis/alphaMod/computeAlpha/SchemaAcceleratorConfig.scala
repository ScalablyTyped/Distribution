package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAcceleratorConfig extends StObject {
  
  /**
    * The number of the guest accelerator cards exposed to this instance.
    */
  var acceleratorCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Full or partial URL of the accelerator type resource to attach to this instance. For example: projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are creating an instance template, specify only the accelerator name. See GPUs on Compute Engine for a full list of accelerator types.
    */
  var acceleratorType: js.UndefOr[String | Null] = js.undefined
}
object SchemaAcceleratorConfig {
  
  inline def apply(): SchemaAcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceleratorConfig]
  }
  
  extension [Self <: SchemaAcceleratorConfig](x: Self) {
    
    inline def setAcceleratorCount(value: Double): Self = StObject.set(x, "acceleratorCount", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorCountNull: Self = StObject.set(x, "acceleratorCount", null)
    
    inline def setAcceleratorCountUndefined: Self = StObject.set(x, "acceleratorCount", js.undefined)
    
    inline def setAcceleratorType(value: String): Self = StObject.set(x, "acceleratorType", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypeNull: Self = StObject.set(x, "acceleratorType", null)
    
    inline def setAcceleratorTypeUndefined: Self = StObject.set(x, "acceleratorType", js.undefined)
  }
}
