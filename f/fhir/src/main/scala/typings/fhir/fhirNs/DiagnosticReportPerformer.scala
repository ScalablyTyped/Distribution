package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Participants in producing the report
  */
trait DiagnosticReportPerformer extends BackboneElement {
  /**
    * Practitioner or Organization  participant
    */
  var actor: Reference
  /**
    * Type of performer
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}

object DiagnosticReportPerformer {
  @scala.inline
  def apply(
    actor: Reference,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    role: CodeableConcept = null
  ): DiagnosticReportPerformer = {
    val __obj = js.Dynamic.literal(actor = actor)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[DiagnosticReportPerformer]
  }
}

