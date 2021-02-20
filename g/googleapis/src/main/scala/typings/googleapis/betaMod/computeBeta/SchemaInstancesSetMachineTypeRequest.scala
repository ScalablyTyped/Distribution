package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstancesSetMachineTypeRequest extends StObject {
  
  /**
    * Full or partial URL of the machine type resource. See Machine Types for a
    * full list of machine types. For example:
    * zones/us-central1-f/machineTypes/n1-standard-1
    */
  var machineType: js.UndefOr[String] = js.native
}
object SchemaInstancesSetMachineTypeRequest {
  
  @scala.inline
  def apply(): SchemaInstancesSetMachineTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesSetMachineTypeRequest]
  }
  
  @scala.inline
  implicit class SchemaInstancesSetMachineTypeRequestMutableBuilder[Self <: SchemaInstancesSetMachineTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
  }
}
