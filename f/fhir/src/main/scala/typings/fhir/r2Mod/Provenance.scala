package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Provenance
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _policy: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _recorded: js.UndefOr[Element] = js.undefined
  
  /**
    * An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities.
    */
  var activity: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * An agent takes a role in an activity such that the agent can be assigned some degree of responsibility for the activity taking place. An agent can be a person, an organization, software, or other entities that may be ascribed responsibility.
    */
  var agent: js.UndefOr[js.Array[ProvenanceAgent]] = js.undefined
  
  /**
    * An entity used in this activity.
    */
  var entity: js.UndefOr[js.Array[ProvenanceEntity]] = js.undefined
  
  /**
    * Where the activity occurred, if relevant.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * The period during which the activity occurred.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.
    */
  var policy: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The reason that the activity was taking place.
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The instant of time at which the activity was recorded.
    */
  var recorded: String
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Provenance: typings.fhir.fhirStrings.Provenance
  
  /**
    * A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.
    */
  var signature: js.UndefOr[js.Array[Signature]] = js.undefined
  
  /**
    * The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity.
    */
  var target: js.Array[Reference]
}
object Provenance {
  
  inline def apply(recorded: String, target: js.Array[Reference]): Provenance = {
    val __obj = js.Dynamic.literal(recorded = recorded.asInstanceOf[js.Any], resourceType = "Provenance", target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provenance]
  }
  
  extension [Self <: Provenance](x: Self) {
    
    inline def setActivity(value: CodeableConcept): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    inline def setAgent(value: js.Array[ProvenanceAgent]): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setAgentVarargs(value: ProvenanceAgent*): Self = StObject.set(x, "agent", js.Array(value*))
    
    inline def setEntity(value: js.Array[ProvenanceEntity]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setEntityVarargs(value: ProvenanceEntity*): Self = StObject.set(x, "entity", js.Array(value*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPolicy(value: js.Array[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setPolicyVarargs(value: String*): Self = StObject.set(x, "policy", js.Array(value*))
    
    inline def setReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setRecorded(value: String): Self = StObject.set(x, "recorded", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Provenance): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: js.Array[Signature]): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSignatureVarargs(value: Signature*): Self = StObject.set(x, "signature", js.Array(value*))
    
    inline def setTarget(value: js.Array[Reference]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetVarargs(value: Reference*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def set_policy(value: js.Array[Element]): Self = StObject.set(x, "_policy", value.asInstanceOf[js.Any])
    
    inline def set_policyUndefined: Self = StObject.set(x, "_policy", js.undefined)
    
    inline def set_policyVarargs(value: Element*): Self = StObject.set(x, "_policy", js.Array(value*))
    
    inline def set_recorded(value: Element): Self = StObject.set(x, "_recorded", value.asInstanceOf[js.Any])
    
    inline def set_recordedUndefined: Self = StObject.set(x, "_recorded", js.undefined)
  }
}
