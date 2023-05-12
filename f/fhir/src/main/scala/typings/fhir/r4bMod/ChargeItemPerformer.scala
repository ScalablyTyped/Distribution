package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChargeItemPerformer
  extends StObject
     with BackboneElement {
  
  /**
    * The device, practitioner, etc. who performed or participated in the service.
    */
  var actor: Reference
  
  /**
    * Describes the type of performance or participation(e.g. primary surgeon, anesthesiologiest, etc.).
    */
  var function: js.UndefOr[CodeableConcept] = js.undefined
}
object ChargeItemPerformer {
  
  inline def apply(actor: Reference): ChargeItemPerformer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChargeItemPerformer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChargeItemPerformer] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: CodeableConcept): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
  }
}
