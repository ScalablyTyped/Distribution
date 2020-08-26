package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Medication supply authorization
  */
@js.native
trait MedicationRequestDispenseRequest extends BackboneElement {
  /**
    * Contains extended information for property 'numberOfRepeatsAllowed'.
    */
  var _numberOfRepeatsAllowed: js.UndefOr[Element] = js.native
  /**
    * Number of days supply per dispense
    */
  var expectedSupplyDuration: js.UndefOr[Duration] = js.native
  /**
    * Number of refills authorized
    */
  var numberOfRepeatsAllowed: js.UndefOr[positiveInt] = js.native
  /**
    * Intended dispenser
    */
  var performer: js.UndefOr[Reference] = js.native
  /**
    * Amount of medication to supply per dispense
    */
  var quantity: js.UndefOr[Quantity] = js.native
  /**
    * Time period supply is authorized for
    */
  var validityPeriod: js.UndefOr[Period] = js.native
}

object MedicationRequestDispenseRequest {
  @scala.inline
  def apply(): MedicationRequestDispenseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationRequestDispenseRequest]
  }
  @scala.inline
  implicit class MedicationRequestDispenseRequestOps[Self <: MedicationRequestDispenseRequest] (val x: Self) extends AnyVal {
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
    def set_numberOfRepeatsAllowed(value: Element): Self = this.set("_numberOfRepeatsAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_numberOfRepeatsAllowed: Self = this.set("_numberOfRepeatsAllowed", js.undefined)
    @scala.inline
    def setExpectedSupplyDuration(value: Duration): Self = this.set("expectedSupplyDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectedSupplyDuration: Self = this.set("expectedSupplyDuration", js.undefined)
    @scala.inline
    def setNumberOfRepeatsAllowed(value: positiveInt): Self = this.set("numberOfRepeatsAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfRepeatsAllowed: Self = this.set("numberOfRepeatsAllowed", js.undefined)
    @scala.inline
    def setPerformer(value: Reference): Self = this.set("performer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformer: Self = this.set("performer", js.undefined)
    @scala.inline
    def setQuantity(value: Quantity): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    @scala.inline
    def setValidityPeriod(value: Period): Self = this.set("validityPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidityPeriod: Self = this.set("validityPeriod", js.undefined)
  }
  
}

