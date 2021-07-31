package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Who administered substance
  */
trait MedicationAdministrationPerformer
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
object MedicationAdministrationPerformer {
  
  @scala.inline
  def apply(actor: Reference): MedicationAdministrationPerformer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationAdministrationPerformer]
  }
  
  @scala.inline
  implicit class MedicationAdministrationPerformerMutableBuilder[Self <: MedicationAdministrationPerformer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
  }
}
