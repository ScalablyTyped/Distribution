package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional items
  */
@js.native
trait ClaimItemDetail extends BackboneElement {
  /**
    * Contains extended information for property 'factor'.
    */
  var _factor: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  /**
    * Type of service or product
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  /**
    * Price scaling factor
    */
  var factor: js.UndefOr[decimal] = js.native
  /**
    * Service/Product billing modifiers
    */
  var modifier: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Total additional item cost
    */
  var net: js.UndefOr[Money] = js.native
  /**
    * Program specific reason for item inclusion
    */
  var programCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Count of Products or Services
    */
  var quantity: js.UndefOr[Quantity] = js.native
  /**
    * Revenue or cost center code
    */
  var revenue: js.UndefOr[CodeableConcept] = js.native
  /**
    * Service instance
    */
  var sequence: positiveInt = js.native
  /**
    * Billing Code
    */
  var service: js.UndefOr[CodeableConcept] = js.native
  /**
    * Additional items
    */
  var subDetail: js.UndefOr[js.Array[ClaimItemDetailSubDetail]] = js.native
  /**
    * Unique Device Identifier
    */
  var udi: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Fee, charge or cost per point
    */
  var unitPrice: js.UndefOr[Money] = js.native
}

object ClaimItemDetail {
  @scala.inline
  def apply(sequence: positiveInt): ClaimItemDetail = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimItemDetail]
  }
  @scala.inline
  implicit class ClaimItemDetailOps[Self <: ClaimItemDetail] (val x: Self) extends AnyVal {
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
    def setSequence(value: positiveInt): Self = this.set("sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def set_factor(value: Element): Self = this.set("_factor", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_factor: Self = this.set("_factor", js.undefined)
    @scala.inline
    def set_sequence(value: Element): Self = this.set("_sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sequence: Self = this.set("_sequence", js.undefined)
    @scala.inline
    def setCategory(value: CodeableConcept): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setFactor(value: decimal): Self = this.set("factor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactor: Self = this.set("factor", js.undefined)
    @scala.inline
    def setModifierVarargs(value: CodeableConcept*): Self = this.set("modifier", js.Array(value :_*))
    @scala.inline
    def setModifier(value: js.Array[CodeableConcept]): Self = this.set("modifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    @scala.inline
    def setNet(value: Money): Self = this.set("net", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNet: Self = this.set("net", js.undefined)
    @scala.inline
    def setProgramCodeVarargs(value: CodeableConcept*): Self = this.set("programCode", js.Array(value :_*))
    @scala.inline
    def setProgramCode(value: js.Array[CodeableConcept]): Self = this.set("programCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgramCode: Self = this.set("programCode", js.undefined)
    @scala.inline
    def setQuantity(value: Quantity): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    @scala.inline
    def setRevenue(value: CodeableConcept): Self = this.set("revenue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevenue: Self = this.set("revenue", js.undefined)
    @scala.inline
    def setService(value: CodeableConcept): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    @scala.inline
    def setSubDetailVarargs(value: ClaimItemDetailSubDetail*): Self = this.set("subDetail", js.Array(value :_*))
    @scala.inline
    def setSubDetail(value: js.Array[ClaimItemDetailSubDetail]): Self = this.set("subDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubDetail: Self = this.set("subDetail", js.undefined)
    @scala.inline
    def setUdiVarargs(value: Reference*): Self = this.set("udi", js.Array(value :_*))
    @scala.inline
    def setUdi(value: js.Array[Reference]): Self = this.set("udi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUdi: Self = this.set("udi", js.undefined)
    @scala.inline
    def setUnitPrice(value: Money): Self = this.set("unitPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitPrice: Self = this.set("unitPrice", js.undefined)
  }
  
}

