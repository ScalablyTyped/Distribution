package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of Diagnosis
  */
trait ClaimDiagnosis extends BackboneElement {
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

object ClaimDiagnosis {
  @scala.inline
  def apply(
    sequence: positiveInt,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _sequence: Element = null,
    diagnosisCodeableConcept: CodeableConcept = null,
    diagnosisReference: Reference = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    packageCode: CodeableConcept = null,
    `type`: js.Array[CodeableConcept] = null
  ): ClaimDiagnosis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sequence")(sequence)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_sequence != null) __obj.updateDynamic("_sequence")(_sequence)
    if (diagnosisCodeableConcept != null) __obj.updateDynamic("diagnosisCodeableConcept")(diagnosisCodeableConcept)
    if (diagnosisReference != null) __obj.updateDynamic("diagnosisReference")(diagnosisReference)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (packageCode != null) __obj.updateDynamic("packageCode")(packageCode)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ClaimDiagnosis]
  }
}

