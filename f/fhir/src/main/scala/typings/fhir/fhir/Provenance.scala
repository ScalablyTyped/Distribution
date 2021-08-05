package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Who, What, When for a set of resources
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Provenance
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'policy'.
    */
  var _policy: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'recorded'.
    */
  var _recorded: js.UndefOr[Element] = js.undefined
  
  /**
    * Activity that occurred
    */
  var activity: js.UndefOr[Coding] = js.undefined
  
  /**
    * Actor involved
    */
  var agent: js.Array[ProvenanceAgent]
  
  /**
    * An entity used in this activity
    */
  var entity: js.UndefOr[js.Array[ProvenanceEntity]] = js.undefined
  
  /**
    * Where the activity occurred, if relevant
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * When the activity occurred
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Policy or plan the activity was defined by
    */
  var policy: js.UndefOr[js.Array[uri]] = js.undefined
  
  /**
    * Reason the activity is occurring
    */
  var reason: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * When the activity was recorded / updated
    */
  var recorded: instant
  
  /**
    * Signature on target
    */
  var signature: js.UndefOr[js.Array[Signature]] = js.undefined
  
  /**
    * Target Reference(s) (usually version specific)
    */
  var target: js.Array[Reference]
}
object Provenance {
  
  inline def apply(agent: js.Array[ProvenanceAgent], recorded: instant, target: js.Array[Reference]): Provenance = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], recorded = recorded.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provenance]
  }
  
  extension [Self <: Provenance](x: Self) {
    
    inline def setActivity(value: Coding): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    inline def setAgent(value: js.Array[ProvenanceAgent]): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentVarargs(value: ProvenanceAgent*): Self = StObject.set(x, "agent", js.Array(value :_*))
    
    inline def setEntity(value: js.Array[ProvenanceEntity]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setEntityVarargs(value: ProvenanceEntity*): Self = StObject.set(x, "entity", js.Array(value :_*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPolicy(value: js.Array[uri]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setPolicyVarargs(value: uri*): Self = StObject.set(x, "policy", js.Array(value :_*))
    
    inline def setReason(value: js.Array[Coding]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: Coding*): Self = StObject.set(x, "reason", js.Array(value :_*))
    
    inline def setRecorded(value: instant): Self = StObject.set(x, "recorded", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: js.Array[Signature]): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSignatureVarargs(value: Signature*): Self = StObject.set(x, "signature", js.Array(value :_*))
    
    inline def setTarget(value: js.Array[Reference]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetVarargs(value: Reference*): Self = StObject.set(x, "target", js.Array(value :_*))
    
    inline def set_policy(value: js.Array[Element]): Self = StObject.set(x, "_policy", value.asInstanceOf[js.Any])
    
    inline def set_policyUndefined: Self = StObject.set(x, "_policy", js.undefined)
    
    inline def set_policyVarargs(value: Element*): Self = StObject.set(x, "_policy", js.Array(value :_*))
    
    inline def set_recorded(value: Element): Self = StObject.set(x, "_recorded", value.asInstanceOf[js.Any])
    
    inline def set_recordedUndefined: Self = StObject.set(x, "_recorded", js.undefined)
  }
}
