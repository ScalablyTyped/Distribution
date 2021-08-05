package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Who performed event
  */
trait MedicationDispensePerformer
  extends StObject
     with BackboneElement {
  
  /**
    * Individual who was performing
    */
  var actor: Reference
  
  /**
    * Organization organization was acting for
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
}
object MedicationDispensePerformer {
  
  inline def apply(actor: Reference): MedicationDispensePerformer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationDispensePerformer]
  }
  
  extension [Self <: MedicationDispensePerformer](x: Self) {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
  }
}
