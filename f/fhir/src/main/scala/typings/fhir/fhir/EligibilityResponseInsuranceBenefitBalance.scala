package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Benefits by Category
  */
@js.native
trait EligibilityResponseInsuranceBenefitBalance extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'excluded'.
    */
  var _excluded: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Type of services covered
    */
  var category: CodeableConcept = js.native
  /**
    * Description of the benefit or services covered
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Excluded from the plan
    */
  var excluded: js.UndefOr[Boolean] = js.native
  /**
    * Benefit Summary
    */
  var financial: js.UndefOr[js.Array[EligibilityResponseInsuranceBenefitBalanceFinancial]] = js.native
  /**
    * Short name for the benefit
    */
  var name: js.UndefOr[String] = js.native
  /**
    * In or out of network
    */
  var network: js.UndefOr[CodeableConcept] = js.native
  /**
    * Detailed services covered within the type
    */
  var subCategory: js.UndefOr[CodeableConcept] = js.native
  /**
    * Annual or lifetime
    */
  var term: js.UndefOr[CodeableConcept] = js.native
  /**
    * Individual or family
    */
  var unit: js.UndefOr[CodeableConcept] = js.native
}

object EligibilityResponseInsuranceBenefitBalance {
  @scala.inline
  def apply(category: CodeableConcept): EligibilityResponseInsuranceBenefitBalance = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[EligibilityResponseInsuranceBenefitBalance]
  }
  @scala.inline
  implicit class EligibilityResponseInsuranceBenefitBalanceOps[Self <: EligibilityResponseInsuranceBenefitBalance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCategory(value: CodeableConcept): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_excluded(value: Element): Self = this.set("_excluded", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_excluded: Self = this.set("_excluded", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExcluded(value: Boolean): Self = this.set("excluded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcluded: Self = this.set("excluded", js.undefined)
    @scala.inline
    def setFinancialVarargs(value: EligibilityResponseInsuranceBenefitBalanceFinancial*): Self = this.set("financial", js.Array(value :_*))
    @scala.inline
    def setFinancial(value: js.Array[EligibilityResponseInsuranceBenefitBalanceFinancial]): Self = this.set("financial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinancial: Self = this.set("financial", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNetwork(value: CodeableConcept): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setSubCategory(value: CodeableConcept): Self = this.set("subCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubCategory: Self = this.set("subCategory", js.undefined)
    @scala.inline
    def setTerm(value: CodeableConcept): Self = this.set("term", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerm: Self = this.set("term", js.undefined)
    @scala.inline
    def setUnit(value: CodeableConcept): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

