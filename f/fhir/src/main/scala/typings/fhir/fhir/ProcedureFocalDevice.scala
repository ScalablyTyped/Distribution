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
  
  @scala.inline
  def apply(manipulated: Reference): ProcedureFocalDevice = {
    val __obj = js.Dynamic.literal(manipulated = manipulated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureFocalDevice]
  }
  
  @scala.inline
  implicit class ProcedureFocalDeviceMutableBuilder[Self <: ProcedureFocalDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: CodeableConcept): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setManipulated(value: Reference): Self = StObject.set(x, "manipulated", value.asInstanceOf[js.Any])
  }
}
