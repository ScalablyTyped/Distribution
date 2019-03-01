package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Insurance or medical plan
  */
trait ExplanationOfBenefitInsurance extends BackboneElement {
  /**
    * Contains extended information for property 'preAuthRef'.
    */
  var _preAuthRef: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Insurance information
    */
  var coverage: js.UndefOr[Reference] = js.undefined
  /**
    * Pre-Authorization/Determination Reference
    */
  var preAuthRef: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ExplanationOfBenefitInsurance {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _preAuthRef: js.Array[Element] = null,
    coverage: Reference = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    preAuthRef: js.Array[java.lang.String] = null
  ): ExplanationOfBenefitInsurance = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_preAuthRef != null) __obj.updateDynamic("_preAuthRef")(_preAuthRef)
    if (coverage != null) __obj.updateDynamic("coverage")(coverage)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (preAuthRef != null) __obj.updateDynamic("preAuthRef")(preAuthRef)
    __obj.asInstanceOf[ExplanationOfBenefitInsurance]
  }
}

