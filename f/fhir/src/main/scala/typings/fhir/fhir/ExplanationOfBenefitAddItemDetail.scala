package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Added items details
  */
@js.native
trait ExplanationOfBenefitAddItemDetail extends BackboneElement {
  /**
    * Contains extended information for property 'noteNumber'.
    */
  var _noteNumber: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Added items detail adjudication
    */
  var adjudication: js.UndefOr[js.Array[ExplanationOfBenefitItemAdjudication]] = js.native
  /**
    * Type of service or product
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  /**
    * Professional fee or Product charge
    */
  var fee: js.UndefOr[Money] = js.native
  /**
    * Service/Product billing modifiers
    */
  var modifier: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * List of note numbers which apply
    */
  var noteNumber: js.UndefOr[js.Array[positiveInt]] = js.native
  /**
    * Revenue or cost center code
    */
  var revenue: js.UndefOr[CodeableConcept] = js.native
  /**
    * Billing Code
    */
  var service: js.UndefOr[CodeableConcept] = js.native
}

object ExplanationOfBenefitAddItemDetail {
  @scala.inline
  def apply(): ExplanationOfBenefitAddItemDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefitAddItemDetail]
  }
  @scala.inline
  implicit class ExplanationOfBenefitAddItemDetailOps[Self <: ExplanationOfBenefitAddItemDetail] (val x: Self) extends AnyVal {
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
    def set_noteNumberVarargs(value: Element*): Self = this.set("_noteNumber", js.Array(value :_*))
    @scala.inline
    def set_noteNumber(value: js.Array[Element]): Self = this.set("_noteNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_noteNumber: Self = this.set("_noteNumber", js.undefined)
    @scala.inline
    def setAdjudicationVarargs(value: ExplanationOfBenefitItemAdjudication*): Self = this.set("adjudication", js.Array(value :_*))
    @scala.inline
    def setAdjudication(value: js.Array[ExplanationOfBenefitItemAdjudication]): Self = this.set("adjudication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjudication: Self = this.set("adjudication", js.undefined)
    @scala.inline
    def setCategory(value: CodeableConcept): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setFee(value: Money): Self = this.set("fee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFee: Self = this.set("fee", js.undefined)
    @scala.inline
    def setModifierVarargs(value: CodeableConcept*): Self = this.set("modifier", js.Array(value :_*))
    @scala.inline
    def setModifier(value: js.Array[CodeableConcept]): Self = this.set("modifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    @scala.inline
    def setNoteNumberVarargs(value: positiveInt*): Self = this.set("noteNumber", js.Array(value :_*))
    @scala.inline
    def setNoteNumber(value: js.Array[positiveInt]): Self = this.set("noteNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoteNumber: Self = this.set("noteNumber", js.undefined)
    @scala.inline
    def setRevenue(value: CodeableConcept): Self = this.set("revenue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevenue: Self = this.set("revenue", js.undefined)
    @scala.inline
    def setService(value: CodeableConcept): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}

