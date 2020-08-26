package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adjudication details
  */
@js.native
trait ClaimResponseItemAdjudication extends BackboneElement {
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  /**
    * Monetary amount
    */
  var amount: js.UndefOr[Money] = js.native
  /**
    * Adjudication category such as co-pay, eligible, benefit, etc.
    */
  var category: CodeableConcept = js.native
  /**
    * Explanation of Adjudication outcome
    */
  var reason: js.UndefOr[CodeableConcept] = js.native
  /**
    * Non-monetary value
    */
  var value: js.UndefOr[decimal] = js.native
}

object ClaimResponseItemAdjudication {
  @scala.inline
  def apply(category: CodeableConcept): ClaimResponseItemAdjudication = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseItemAdjudication]
  }
  @scala.inline
  implicit class ClaimResponseItemAdjudicationOps[Self <: ClaimResponseItemAdjudication] (val x: Self) extends AnyVal {
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
    def set_value(value: Element): Self = this.set("_value", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_value: Self = this.set("_value", js.undefined)
    @scala.inline
    def setAmount(value: Money): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setReason(value: CodeableConcept): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setValue(value: decimal): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

