package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Commitment for a particular resource (a Commitment is composed of one or
  * more of these).
  */
trait SchemaResourceCommitment extends StObject {
  
  /**
    * Name of the accelerator type resource. Applicable only when the type is
    * ACCELERATOR.
    */
  var acceleratorType: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of the resource purchased (in a type-dependent unit, such as
    * bytes). For vCPUs, this can just be an integer. For memory, this must be
    * provided in MB. Memory must be a multiple of 256 MB, with up to 6.5GB of
    * memory per every vCPU.
    */
  var amount: js.UndefOr[String] = js.undefined
  
  /**
    * Type of resource for which this commitment applies. Possible values are
    * VCPU and MEMORY
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaResourceCommitment {
  
  @scala.inline
  def apply(): SchemaResourceCommitment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceCommitment]
  }
  
  @scala.inline
  implicit class SchemaResourceCommitmentMutableBuilder[Self <: SchemaResourceCommitment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorType(value: String): Self = StObject.set(x, "acceleratorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorTypeUndefined: Self = StObject.set(x, "acceleratorType", js.undefined)
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
