package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Device changed in procedure
  */
trait ProcedureFocalDevice
  extends StObject
     with BackboneElement {
  
  /**
    * Kind of change to device
    */
  var action: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Device that was changed
    */
  var manipulated: Reference
}
object ProcedureFocalDevice {
  
  inline def apply(manipulated: Reference): ProcedureFocalDevice = {
    val __obj = js.Dynamic.literal(manipulated = manipulated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureFocalDevice]
  }
  
  extension [Self <: ProcedureFocalDevice](x: Self) {
    
    inline def setAction(value: CodeableConcept): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setManipulated(value: Reference): Self = StObject.set(x, "manipulated", value.asInstanceOf[js.Any])
  }
}
