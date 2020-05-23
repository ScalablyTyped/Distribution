package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Benefit Summary
  */
trait EligibilityResponseInsuranceBenefitBalanceFinancial extends BackboneElement {
  /**
    * Contains extended information for property 'allowedString'.
    */
  var _allowedString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'allowedUnsignedInt'.
    */
  var _allowedUnsignedInt: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'usedUnsignedInt'.
    */
  var _usedUnsignedInt: js.UndefOr[Element] = js.undefined
  /**
    * Benefits allowed
    */
  var allowedMoney: js.UndefOr[Money] = js.undefined
  /**
    * Benefits allowed
    */
  var allowedString: js.UndefOr[String] = js.undefined
  /**
    * Benefits allowed
    */
  var allowedUnsignedInt: js.UndefOr[unsignedInt] = js.undefined
  /**
    * Deductable, visits, benefit amount
    */
  var `type`: CodeableConcept
  /**
    * Benefits used
    */
  var usedMoney: js.UndefOr[Money] = js.undefined
  /**
    * Benefits used
    */
  var usedUnsignedInt: js.UndefOr[unsignedInt] = js.undefined
}

object EligibilityResponseInsuranceBenefitBalanceFinancial {
  @scala.inline
  def apply(
    `type`: CodeableConcept,
    _allowedString: Element = null,
    _allowedUnsignedInt: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _usedUnsignedInt: Element = null,
    allowedMoney: Money = null,
    allowedString: String = null,
    allowedUnsignedInt: js.UndefOr[unsignedInt] = js.undefined,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    usedMoney: Money = null,
    usedUnsignedInt: js.UndefOr[unsignedInt] = js.undefined
  ): EligibilityResponseInsuranceBenefitBalanceFinancial = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_allowedString != null) __obj.updateDynamic("_allowedString")(_allowedString.asInstanceOf[js.Any])
    if (_allowedUnsignedInt != null) __obj.updateDynamic("_allowedUnsignedInt")(_allowedUnsignedInt.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_usedUnsignedInt != null) __obj.updateDynamic("_usedUnsignedInt")(_usedUnsignedInt.asInstanceOf[js.Any])
    if (allowedMoney != null) __obj.updateDynamic("allowedMoney")(allowedMoney.asInstanceOf[js.Any])
    if (allowedString != null) __obj.updateDynamic("allowedString")(allowedString.asInstanceOf[js.Any])
    if (!js.isUndefined(allowedUnsignedInt)) __obj.updateDynamic("allowedUnsignedInt")(allowedUnsignedInt.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (usedMoney != null) __obj.updateDynamic("usedMoney")(usedMoney.asInstanceOf[js.Any])
    if (!js.isUndefined(usedUnsignedInt)) __obj.updateDynamic("usedUnsignedInt")(usedUnsignedInt.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EligibilityResponseInsuranceBenefitBalanceFinancial]
  }
}

