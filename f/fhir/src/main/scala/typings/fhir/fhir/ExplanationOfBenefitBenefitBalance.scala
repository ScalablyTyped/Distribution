package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Balance by Benefit Category
  */
trait ExplanationOfBenefitBenefitBalance extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'excluded'.
    */
  var _excluded: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Type of services covered
    */
  var category: CodeableConcept
  /**
    * Description of the benefit or services covered
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Excluded from the plan
    */
  var excluded: js.UndefOr[Boolean] = js.undefined
  /**
    * Benefit Summary
    */
  var financial: js.UndefOr[js.Array[ExplanationOfBenefitBenefitBalanceFinancial]] = js.undefined
  /**
    * Short name for the benefit
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * In or out of network
    */
  var network: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Detailed services covered within the type
    */
  var subCategory: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Annual or lifetime
    */
  var term: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Individual or family
    */
  var unit: js.UndefOr[CodeableConcept] = js.undefined
}

object ExplanationOfBenefitBenefitBalance {
  @scala.inline
  def apply(
    category: CodeableConcept,
    _description: Element = null,
    _excluded: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    description: String = null,
    excluded: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    financial: js.Array[ExplanationOfBenefitBenefitBalanceFinancial] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    network: CodeableConcept = null,
    subCategory: CodeableConcept = null,
    term: CodeableConcept = null,
    unit: CodeableConcept = null
  ): ExplanationOfBenefitBenefitBalance = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_excluded != null) __obj.updateDynamic("_excluded")(_excluded.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(excluded)) __obj.updateDynamic("excluded")(excluded.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (financial != null) __obj.updateDynamic("financial")(financial.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (subCategory != null) __obj.updateDynamic("subCategory")(subCategory.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitBenefitBalance]
  }
}

