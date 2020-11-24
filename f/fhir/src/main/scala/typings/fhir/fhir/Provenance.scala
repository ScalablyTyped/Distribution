package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Who, What, When for a set of resources
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Provenance extends DomainResource {
  
  /**
    * Contains extended information for property 'policy'.
    */
  var _policy: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'recorded'.
    */
  var _recorded: js.UndefOr[Element] = js.native
  
  /**
    * Activity that occurred
    */
  var activity: js.UndefOr[Coding] = js.native
  
  /**
    * Actor involved
    */
  var agent: js.Array[ProvenanceAgent] = js.native
  
  /**
    * An entity used in this activity
    */
  var entity: js.UndefOr[js.Array[ProvenanceEntity]] = js.native
  
  /**
    * Where the activity occurred, if relevant
    */
  var location: js.UndefOr[Reference] = js.native
  
  /**
    * When the activity occurred
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * Policy or plan the activity was defined by
    */
  var policy: js.UndefOr[js.Array[uri]] = js.native
  
  /**
    * Reason the activity is occurring
    */
  var reason: js.UndefOr[js.Array[Coding]] = js.native
  
  /**
    * When the activity was recorded / updated
    */
  var recorded: instant = js.native
  
  /**
    * Signature on target
    */
  var signature: js.UndefOr[js.Array[Signature]] = js.native
  
  /**
    * Target Reference(s) (usually version specific)
    */
  var target: js.Array[Reference] = js.native
}
object Provenance {
  
  @scala.inline
  def apply(agent: js.Array[ProvenanceAgent], recorded: instant, target: js.Array[Reference]): Provenance = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], recorded = recorded.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provenance]
  }
  
  @scala.inline
  implicit class ProvenanceOps[Self <: Provenance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgentVarargs(value: ProvenanceAgent*): Self = this.set("agent", js.Array(value :_*))
    
    @scala.inline
    def setAgent(value: js.Array[ProvenanceAgent]): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecorded(value: instant): Self = this.set("recorded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVarargs(value: Reference*): Self = this.set("target", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Array[Reference]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_policyVarargs(value: Element*): Self = this.set("_policy", js.Array(value :_*))
    
    @scala.inline
    def set_policy(value: js.Array[Element]): Self = this.set("_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_policy: Self = this.set("_policy", js.undefined)
    
    @scala.inline
    def set_recorded(value: Element): Self = this.set("_recorded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_recorded: Self = this.set("_recorded", js.undefined)
    
    @scala.inline
    def setActivity(value: Coding): Self = this.set("activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivity: Self = this.set("activity", js.undefined)
    
    @scala.inline
    def setEntityVarargs(value: ProvenanceEntity*): Self = this.set("entity", js.Array(value :_*))
    
    @scala.inline
    def setEntity(value: js.Array[ProvenanceEntity]): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    
    @scala.inline
    def setLocation(value: Reference): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setPolicyVarargs(value: uri*): Self = this.set("policy", js.Array(value :_*))
    
    @scala.inline
    def setPolicy(value: js.Array[uri]): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    
    @scala.inline
    def setReasonVarargs(value: Coding*): Self = this.set("reason", js.Array(value :_*))
    
    @scala.inline
    def setReason(value: js.Array[Coding]): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setSignatureVarargs(value: Signature*): Self = this.set("signature", js.Array(value :_*))
    
    @scala.inline
    def setSignature(value: js.Array[Signature]): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
  }
}
