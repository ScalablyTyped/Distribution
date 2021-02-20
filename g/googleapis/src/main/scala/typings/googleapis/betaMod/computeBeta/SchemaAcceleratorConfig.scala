package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A specification of the type and number of accelerator cards attached to the
  * instance.
  */
@js.native
trait SchemaAcceleratorConfig extends StObject {
  
  /**
    * The number of the guest accelerator cards exposed to this instance.
    */
  var acceleratorCount: js.UndefOr[Double] = js.native
  
  /**
    * Full or partial URL of the accelerator type resource to attach to this
    * instance. For example:
    * projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100
    * If you are creating an instance template, specify only the accelerator
    * name. See GPUs on Compute Engine for a full list of accelerator types.
    */
  var acceleratorType: js.UndefOr[String] = js.native
}
object SchemaAcceleratorConfig {
  
  @scala.inline
  def apply(): SchemaAcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceleratorConfig]
  }
  
  @scala.inline
  implicit class SchemaAcceleratorConfigMutableBuilder[Self <: SchemaAcceleratorConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorCount(value: Double): Self = StObject.set(x, "acceleratorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorCountUndefined: Self = StObject.set(x, "acceleratorCount", js.undefined)
    
    @scala.inline
    def setAcceleratorType(value: String): Self = StObject.set(x, "acceleratorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorTypeUndefined: Self = StObject.set(x, "acceleratorType", js.undefined)
  }
}
