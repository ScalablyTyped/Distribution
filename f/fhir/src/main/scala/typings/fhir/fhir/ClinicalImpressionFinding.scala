package typings.fhir.fhir

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
    if (_basis != null) __obj.updateDynamic("_basis")(_basis.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (basis != null) __obj.updateDynamic("basis")(basis.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemCodeableConcept != null) __obj.updateDynamic("itemCodeableConcept")(itemCodeableConcept.asInstanceOf[js.Any])
    if (itemReference != null) __obj.updateDynamic("itemReference")(itemReference.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClinicalImpressionFinding]
  }
}

