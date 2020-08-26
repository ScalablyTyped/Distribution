package typings.gapiClientSurveys.gapi.client.surveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurveyCost extends js.Object {
  /** Cost per survey response in nano units of the given currency. To get the total cost for a survey, multiply this value by wanted_response_count. */
  var costPerResponseNanos: js.UndefOr[String] = js.native
  /** Currency code that the cost is given in. */
  var currencyCode: js.UndefOr[String] = js.native
  /**
    * Threshold to start a survey automatically if the quoted price is at most this value. When a survey has a Screener (threshold) question, it must go
    * through an incidence pricing test to determine the final cost per response. Typically you will have to make a followup call to start the survey giving
    * the final computed cost per response. If the survey has no threshold_answers, setting this property will return an error. By specifying this property,
    * you indicate the max price per response you are willing to pay in advance of the incidence test. If the price turns out to be lower than the specified
    * value, the survey will begin immediately and you will be charged at the rate determined by the incidence pricing test. If the price turns out to be
    * greater than the specified value the survey will not be started and you will instead be notified what price was determined by the incidence test. At
    * that point, you must raise the value of this property to be greater than or equal to that cost before attempting to start the survey again. This will
    * immediately start the survey as long the incidence test was run within the last 21 days.
    */
  var maxCostPerResponseNanos: js.UndefOr[String] = js.native
  /** Cost of survey in nano units of the given currency. DEPRECATED in favor of cost_per_response_nanos */
  var nanos: js.UndefOr[String] = js.native
}

object SurveyCost {
  @scala.inline
  def apply(): SurveyCost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurveyCost]
  }
  @scala.inline
  implicit class SurveyCostOps[Self <: SurveyCost] (val x: Self) extends AnyVal {
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
    def setCostPerResponseNanos(value: String): Self = this.set("costPerResponseNanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCostPerResponseNanos: Self = this.set("costPerResponseNanos", js.undefined)
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    @scala.inline
    def setMaxCostPerResponseNanos(value: String): Self = this.set("maxCostPerResponseNanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCostPerResponseNanos: Self = this.set("maxCostPerResponseNanos", js.undefined)
    @scala.inline
    def setNanos(value: String): Self = this.set("nanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNanos: Self = this.set("nanos", js.undefined)
  }
  
}

