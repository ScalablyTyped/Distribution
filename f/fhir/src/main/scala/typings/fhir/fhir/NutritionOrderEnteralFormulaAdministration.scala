package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Formula feeding instruction as structured data
  */
@js.native
trait NutritionOrderEnteralFormulaAdministration extends BackboneElement {
  /**
    * The volume of formula to provide
    */
  var quantity: js.UndefOr[Quantity] = js.native
  /**
    * Speed with which the formula is provided per period of time
    */
  var rateQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Speed with which the formula is provided per period of time
    */
  var rateRatio: js.UndefOr[Ratio] = js.native
  /**
    * Scheduled frequency of enteral feeding
    */
  var schedule: js.UndefOr[Timing] = js.native
}

object NutritionOrderEnteralFormulaAdministration {
  @scala.inline
  def apply(): NutritionOrderEnteralFormulaAdministration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderEnteralFormulaAdministration]
  }
  @scala.inline
  implicit class NutritionOrderEnteralFormulaAdministrationOps[Self <: NutritionOrderEnteralFormulaAdministration] (val x: Self) extends AnyVal {
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
    def setQuantity(value: Quantity): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    @scala.inline
    def setRateQuantity(value: Quantity): Self = this.set("rateQuantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRateQuantity: Self = this.set("rateQuantity", js.undefined)
    @scala.inline
    def setRateRatio(value: Ratio): Self = this.set("rateRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRateRatio: Self = this.set("rateRatio", js.undefined)
    @scala.inline
    def setSchedule(value: Timing): Self = this.set("schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
  }
  
}

