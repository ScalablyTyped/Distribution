package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Actor involved in the event
  */
trait AuditEventAgent extends BackboneElement {
  /**
    * Contains extended information for property 'altId'.
    */
  var _altId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'policy'.
    */
  var _policy: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'requestor'.
    */
  var _requestor: js.UndefOr[Element] = js.undefined
  /**
    * Alternative User id e.g. authentication
    */
  var altId: js.UndefOr[String] = js.undefined
  /**
    * Where
    */
  var location: js.UndefOr[Reference] = js.undefined
  /**
    * Type of media
    */
  var media: js.UndefOr[Coding] = js.undefined
  /**
    * Human-meaningful name for the agent
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Logical network location for application activity
    */
  var network: js.UndefOr[AuditEventAgentNetwork] = js.undefined
  /**
    * Policy that authorized event
    */
  var policy: js.UndefOr[js.Array[uri]] = js.undefined
  /**
    * Reason given for this user
    */
  var purposeOfUse: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Direct reference to resource
    */
  var reference: js.UndefOr[Reference] = js.undefined
  /**
    * Whether user is initiator
    */
  var requestor: Boolean
  /**
    * Agent role in the event
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Unique identifier for the user
    */
  var userId: js.UndefOr[Identifier] = js.undefined
}

object AuditEventAgent {
  @scala.inline
  def apply(
    requestor: Boolean,
    _altId: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    _policy: js.Array[Element] = null,
    _requestor: Element = null,
    altId: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    location: Reference = null,
    media: Coding = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    network: AuditEventAgentNetwork = null,
    policy: js.Array[uri] = null,
    purposeOfUse: js.Array[CodeableConcept] = null,
    reference: Reference = null,
    role: js.Array[CodeableConcept] = null,
    userId: Identifier = null
  ): AuditEventAgent = {
    val __obj = js.Dynamic.literal(requestor = requestor.asInstanceOf[js.Any])
    if (_altId != null) __obj.updateDynamic("_altId")(_altId.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_policy != null) __obj.updateDynamic("_policy")(_policy.asInstanceOf[js.Any])
    if (_requestor != null) __obj.updateDynamic("_requestor")(_requestor.asInstanceOf[js.Any])
    if (altId != null) __obj.updateDynamic("altId")(altId.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (purposeOfUse != null) __obj.updateDynamic("purposeOfUse")(purposeOfUse.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEventAgent]
  }
}

