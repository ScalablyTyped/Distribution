package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdverseEventSuspectEntity
  extends StObject
     with BackboneElement {
  
  /**
    * Information on the possible cause of the event.
    */
  var causality: js.UndefOr[js.Array[AdverseEventSuspectEntityCausality]] = js.undefined
  
  /**
    * Identifies the actual instance of what caused the adverse event.  May be a substance, medication, medication administration, medication statement or a device.
    */
  var instance: Reference
}
object AdverseEventSuspectEntity {
  
  inline def apply(instance: Reference): AdverseEventSuspectEntity = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdverseEventSuspectEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdverseEventSuspectEntity] (val x: Self) extends AnyVal {
    
    inline def setCausality(value: js.Array[AdverseEventSuspectEntityCausality]): Self = StObject.set(x, "causality", value.asInstanceOf[js.Any])
    
    inline def setCausalityUndefined: Self = StObject.set(x, "causality", js.undefined)
    
    inline def setCausalityVarargs(value: AdverseEventSuspectEntityCausality*): Self = StObject.set(x, "causality", js.Array(value*))
    
    inline def setInstance(value: Reference): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
  }
}
