package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Actor involved
  */
trait ProvenanceAgent extends BackboneElement {
  /**
    * Contains extended information for property 'onBehalfOfUri'.
    */
  var _onBehalfOfUri: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'whoUri'.
    */
  var _whoUri: js.UndefOr[Element] = js.undefined
  /**
    * Who the agent is representing
    */
  var onBehalfOfReference: js.UndefOr[Reference] = js.undefined
  /**
    * Who the agent is representing
    */
  var onBehalfOfUri: js.UndefOr[uri] = js.undefined
  /**
    * Type of relationship between agents
    */
  var relatedAgentType: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * What the agents role was
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Who participated
    */
  var whoReference: js.UndefOr[Reference] = js.undefined
  /**
    * Who participated
    */
  var whoUri: js.UndefOr[uri] = js.undefined
}

object ProvenanceAgent {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _onBehalfOfUri: Element = null,
    _whoUri: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    onBehalfOfReference: Reference = null,
    onBehalfOfUri: uri = null,
    relatedAgentType: CodeableConcept = null,
    role: js.Array[CodeableConcept] = null,
    whoReference: Reference = null,
    whoUri: uri = null
  ): ProvenanceAgent = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_onBehalfOfUri != null) __obj.updateDynamic("_onBehalfOfUri")(_onBehalfOfUri.asInstanceOf[js.Any])
    if (_whoUri != null) __obj.updateDynamic("_whoUri")(_whoUri.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (onBehalfOfReference != null) __obj.updateDynamic("onBehalfOfReference")(onBehalfOfReference.asInstanceOf[js.Any])
    if (onBehalfOfUri != null) __obj.updateDynamic("onBehalfOfUri")(onBehalfOfUri.asInstanceOf[js.Any])
    if (relatedAgentType != null) __obj.updateDynamic("relatedAgentType")(relatedAgentType.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (whoReference != null) __obj.updateDynamic("whoReference")(whoReference.asInstanceOf[js.Any])
    if (whoUri != null) __obj.updateDynamic("whoUri")(whoUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvenanceAgent]
  }
}

