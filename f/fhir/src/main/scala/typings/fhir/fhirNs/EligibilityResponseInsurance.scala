package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details by insurance coverage
  */
trait EligibilityResponseInsurance extends BackboneElement {
  /**
    * Benefits by Category
    */
  var benefitBalance: js.UndefOr[js.Array[EligibilityResponseInsuranceBenefitBalance]] = js.undefined
  /**
    * Contract details
    */
  var contract: js.UndefOr[Reference] = js.undefined
  /**
    * Updated Coverage details
    */
  var coverage: js.UndefOr[Reference] = js.undefined
}

object EligibilityResponseInsurance {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    benefitBalance: js.Array[EligibilityResponseInsuranceBenefitBalance] = null,
    contract: Reference = null,
    coverage: Reference = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): EligibilityResponseInsurance = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (benefitBalance != null) __obj.updateDynamic("benefitBalance")(benefitBalance)
    if (contract != null) __obj.updateDynamic("contract")(contract)
    if (coverage != null) __obj.updateDynamic("coverage")(coverage)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[EligibilityResponseInsurance]
  }
}

