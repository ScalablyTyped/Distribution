package typings.fhir.fhir

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
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (benefitBalance != null) __obj.updateDynamic("benefitBalance")(benefitBalance.asInstanceOf[js.Any])
    if (contract != null) __obj.updateDynamic("contract")(contract.asInstanceOf[js.Any])
    if (coverage != null) __obj.updateDynamic("coverage")(coverage.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[EligibilityResponseInsurance]
  }
}

