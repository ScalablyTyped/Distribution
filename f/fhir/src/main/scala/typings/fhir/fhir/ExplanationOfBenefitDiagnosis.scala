package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of Diagnosis
  */
trait ExplanationOfBenefitDiagnosis extends BackboneElement {
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  /**
    * Patient's diagnosis
    */
  var diagnosisCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Patient's diagnosis
    */
  var diagnosisReference: js.UndefOr[Reference] = js.undefined
  /**
    * Package billing code
    */
  var packageCode: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Number to covey order of diagnosis
    */
  var sequence: positiveInt
  /**
    * Timing or nature of the diagnosis
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

object ExplanationOfBenefitDiagnosis {
  @scala.inline
  def apply(
    sequence: positiveInt,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _sequence: Element = null,
    diagnosisCodeableConcept: CodeableConcept = null,
    diagnosisReference: Reference = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    packageCode: CodeableConcept = null,
    `type`: js.Array[CodeableConcept] = null
  ): ExplanationOfBenefitDiagnosis = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_sequence != null) __obj.updateDynamic("_sequence")(_sequence.asInstanceOf[js.Any])
    if (diagnosisCodeableConcept != null) __obj.updateDynamic("diagnosisCodeableConcept")(diagnosisCodeableConcept.asInstanceOf[js.Any])
    if (diagnosisReference != null) __obj.updateDynamic("diagnosisReference")(diagnosisReference.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (packageCode != null) __obj.updateDynamic("packageCode")(packageCode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitDiagnosis]
  }
}

