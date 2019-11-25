package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An entity used in this activity
  */
trait ProvenanceEntity extends BackboneElement {
  /**
    * Contains extended information for property 'role'.
    */
  var _role: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'whatUri'.
    */
  var _whatUri: js.UndefOr[Element] = js.undefined
  /**
    * Entity is attributed to this agent
    */
  var agent: js.UndefOr[js.Array[ProvenanceAgent]] = js.undefined
  /**
    * derivation | revision | quotation | source | removal
    */
  var role: code
  /**
    * Identity of entity
    */
  var whatIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Identity of entity
    */
  var whatReference: js.UndefOr[Reference] = js.undefined
  /**
    * Identity of entity
    */
  var whatUri: js.UndefOr[uri] = js.undefined
}

object ProvenanceEntity {
  @scala.inline
  def apply(
    role: code,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _role: Element = null,
    _whatUri: Element = null,
    agent: js.Array[ProvenanceAgent] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    whatIdentifier: Identifier = null,
    whatReference: Reference = null,
    whatUri: uri = null
  ): ProvenanceEntity = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_role != null) __obj.updateDynamic("_role")(_role.asInstanceOf[js.Any])
    if (_whatUri != null) __obj.updateDynamic("_whatUri")(_whatUri.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (whatIdentifier != null) __obj.updateDynamic("whatIdentifier")(whatIdentifier.asInstanceOf[js.Any])
    if (whatReference != null) __obj.updateDynamic("whatReference")(whatReference.asInstanceOf[js.Any])
    if (whatUri != null) __obj.updateDynamic("whatUri")(whatUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvenanceEntity]
  }
}

