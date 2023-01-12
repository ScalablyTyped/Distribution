package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimCareTeam
  extends StObject
     with BackboneElement {
  
  var _responsible: js.UndefOr[Element] = js.undefined
  
  /**
    * Member of the team who provided the overall service.
    */
  var provider: Reference
  
  /**
    * The qualification which is applicable for this service.
    */
  var qualification: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The party who is billing and responsible for the claimed good or service rendered to the patient.
    */
  var responsible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The lead, assisting or supervising practitioner and their discipline if a multidisiplinary team.
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Sequence of the careTeam which serves to order and provide a link.
    */
  var sequence: Double
}
object ClaimCareTeam {
  
  inline def apply(provider: Reference, sequence: Double): ClaimCareTeam = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimCareTeam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimCareTeam] (val x: Self) extends AnyVal {
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setQualification(value: CodeableConcept): Self = StObject.set(x, "qualification", value.asInstanceOf[js.Any])
    
    inline def setQualificationUndefined: Self = StObject.set(x, "qualification", js.undefined)
    
    inline def setResponsible(value: Boolean): Self = StObject.set(x, "responsible", value.asInstanceOf[js.Any])
    
    inline def setResponsibleUndefined: Self = StObject.set(x, "responsible", js.undefined)
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def set_responsible(value: Element): Self = StObject.set(x, "_responsible", value.asInstanceOf[js.Any])
    
    inline def set_responsibleUndefined: Self = StObject.set(x, "_responsible", js.undefined)
  }
}
