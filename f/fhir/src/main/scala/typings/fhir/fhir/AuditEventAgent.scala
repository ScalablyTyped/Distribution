package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Actor involved in the event
  */
@js.native
trait AuditEventAgent extends BackboneElement {
  /**
    * Contains extended information for property 'altId'.
    */
  var _altId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'policy'.
    */
  var _policy: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'requestor'.
    */
  var _requestor: js.UndefOr[Element] = js.native
  /**
    * Alternative User id e.g. authentication
    */
  var altId: js.UndefOr[String] = js.native
  /**
    * Where
    */
  var location: js.UndefOr[Reference] = js.native
  /**
    * Type of media
    */
  var media: js.UndefOr[Coding] = js.native
  /**
    * Human-meaningful name for the agent
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Logical network location for application activity
    */
  var network: js.UndefOr[AuditEventAgentNetwork] = js.native
  /**
    * Policy that authorized event
    */
  var policy: js.UndefOr[js.Array[uri]] = js.native
  /**
    * Reason given for this user
    */
  var purposeOfUse: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Direct reference to resource
    */
  var reference: js.UndefOr[Reference] = js.native
  /**
    * Whether user is initiator
    */
  var requestor: Boolean = js.native
  /**
    * Agent role in the event
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Unique identifier for the user
    */
  var userId: js.UndefOr[Identifier] = js.native
}

object AuditEventAgent {
  @scala.inline
  def apply(requestor: Boolean): AuditEventAgent = {
    val __obj = js.Dynamic.literal(requestor = requestor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEventAgent]
  }
  @scala.inline
  implicit class AuditEventAgentOps[Self <: AuditEventAgent] (val x: Self) extends AnyVal {
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
    def setRequestor(value: Boolean): Self = this.set("requestor", value.asInstanceOf[js.Any])
    @scala.inline
    def set_altId(value: Element): Self = this.set("_altId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_altId: Self = this.set("_altId", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def set_policyVarargs(value: Element*): Self = this.set("_policy", js.Array(value :_*))
    @scala.inline
    def set_policy(value: js.Array[Element]): Self = this.set("_policy", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_policy: Self = this.set("_policy", js.undefined)
    @scala.inline
    def set_requestor(value: Element): Self = this.set("_requestor", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_requestor: Self = this.set("_requestor", js.undefined)
    @scala.inline
    def setAltId(value: String): Self = this.set("altId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltId: Self = this.set("altId", js.undefined)
    @scala.inline
    def setLocation(value: Reference): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMedia(value: Coding): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNetwork(value: AuditEventAgentNetwork): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setPolicyVarargs(value: uri*): Self = this.set("policy", js.Array(value :_*))
    @scala.inline
    def setPolicy(value: js.Array[uri]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    @scala.inline
    def setPurposeOfUseVarargs(value: CodeableConcept*): Self = this.set("purposeOfUse", js.Array(value :_*))
    @scala.inline
    def setPurposeOfUse(value: js.Array[CodeableConcept]): Self = this.set("purposeOfUse", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurposeOfUse: Self = this.set("purposeOfUse", js.undefined)
    @scala.inline
    def setReference(value: Reference): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
    @scala.inline
    def setRoleVarargs(value: CodeableConcept*): Self = this.set("role", js.Array(value :_*))
    @scala.inline
    def setRole(value: js.Array[CodeableConcept]): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setUserId(value: Identifier): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

