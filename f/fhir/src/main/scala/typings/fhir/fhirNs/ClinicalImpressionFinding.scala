package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Possible or likely findings and diagnoses
  */
trait ClinicalImpressionFinding extends BackboneElement {
  /**
    * Contains extended information for property 'basis'.
    */
  var _basis: js.UndefOr[Element] = js.undefined
  /**
    * Which investigations support finding
    */
  var basis: js.UndefOr[String] = js.undefined
  /**
    * What was found
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * What was found
    */
  var itemReference: js.UndefOr[Reference] = js.undefined
}

object ClinicalImpressionFinding {
  @scala.inline
  def apply(
    _basis: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    basis: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    itemCodeableConcept: CodeableConcept = null,
    itemReference: Reference = null,
    modifierExtension: js.Array[Extension] = null
  ): ClinicalImpressionFinding = {
    val __obj = js.Dynamic.literal()
    if (_basis != null) __obj.updateDynamic("_basis")(_basis)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (basis != null) __obj.updateDynamic("basis")(basis)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemCodeableConcept != null) __obj.updateDynamic("itemCodeableConcept")(itemCodeableConcept)
    if (itemReference != null) __obj.updateDynamic("itemReference")(itemReference)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[ClinicalImpressionFinding]
  }
}

