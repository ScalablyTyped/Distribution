package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceAssociationOperation
  extends StObject
     with BackboneElement {
  
  /**
    * The individual performing the action enabled by the device.
    */
  var operator: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Begin and end dates and times for the device's operation.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Device operational condition corresponding to the association.
    */
  var status: CodeableConcept
}
object DeviceAssociationOperation {
  
  inline def apply(status: CodeableConcept): DeviceAssociationOperation = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceAssociationOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceAssociationOperation] (val x: Self) extends AnyVal {
    
    inline def setOperator(value: js.Array[Reference]): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setOperatorVarargs(value: Reference*): Self = StObject.set(x, "operator", js.Array(value*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setStatus(value: CodeableConcept): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
