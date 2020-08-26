package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contract Term Valued Item List
  */
@js.native
trait ContractTermValuedItem extends BackboneElement {
  /**
    * Contains extended information for property 'effectiveTime'.
    */
  var _effectiveTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'factor'.
    */
  var _factor: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'points'.
    */
  var _points: js.UndefOr[Element] = js.native
  /**
    * Contract Term Valued Item Effective Tiem
    */
  var effectiveTime: js.UndefOr[dateTime] = js.native
  /**
    * Contract Term Valued Item Type
    */
  var entityCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Contract Term Valued Item Type
    */
  var entityReference: js.UndefOr[Reference] = js.native
  /**
    * Contract Term Valued Item Price Scaling Factor
    */
  var factor: js.UndefOr[decimal] = js.native
  /**
    * Contract Term Valued Item Number
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Total Contract Term Valued Item Value
    */
  var net: js.UndefOr[Money] = js.native
  /**
    * Contract Term Valued Item Difficulty Scaling Factor
    */
  var points: js.UndefOr[decimal] = js.native
  /**
    * Contract Term Valued Item Count
    */
  var quantity: js.UndefOr[Quantity] = js.native
  /**
    * Contract Term Valued Item fee, charge, or cost
    */
  var unitPrice: js.UndefOr[Money] = js.native
}

object ContractTermValuedItem {
  @scala.inline
  def apply(): ContractTermValuedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractTermValuedItem]
  }
  @scala.inline
  implicit class ContractTermValuedItemOps[Self <: ContractTermValuedItem] (val x: Self) extends AnyVal {
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
    def set_effectiveTime(value: Element): Self = this.set("_effectiveTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_effectiveTime: Self = this.set("_effectiveTime", js.undefined)
    @scala.inline
    def set_factor(value: Element): Self = this.set("_factor", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_factor: Self = this.set("_factor", js.undefined)
    @scala.inline
    def set_points(value: Element): Self = this.set("_points", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_points: Self = this.set("_points", js.undefined)
    @scala.inline
    def setEffectiveTime(value: dateTime): Self = this.set("effectiveTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffectiveTime: Self = this.set("effectiveTime", js.undefined)
    @scala.inline
    def setEntityCodeableConcept(value: CodeableConcept): Self = this.set("entityCodeableConcept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityCodeableConcept: Self = this.set("entityCodeableConcept", js.undefined)
    @scala.inline
    def setEntityReference(value: Reference): Self = this.set("entityReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityReference: Self = this.set("entityReference", js.undefined)
    @scala.inline
    def setFactor(value: decimal): Self = this.set("factor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactor: Self = this.set("factor", js.undefined)
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setNet(value: Money): Self = this.set("net", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNet: Self = this.set("net", js.undefined)
    @scala.inline
    def setPoints(value: decimal): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    @scala.inline
    def setQuantity(value: Quantity): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    @scala.inline
    def setUnitPrice(value: Money): Self = this.set("unitPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitPrice: Self = this.set("unitPrice", js.undefined)
  }
  
}

