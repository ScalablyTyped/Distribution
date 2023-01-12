package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceOperationalStatus
  extends StObject
     with BackboneElement {
  
  /**
    * The reasons given for the current operational status - i.e. why is the device switched on etc.
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * on |off | standby.
    */
  var value: CodeableConcept
}
object DeviceOperationalStatus {
  
  inline def apply(value: CodeableConcept): DeviceOperationalStatus = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceOperationalStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceOperationalStatus] (val x: Self) extends AnyVal {
    
    inline def setReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setValue(value: CodeableConcept): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
