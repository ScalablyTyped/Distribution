package typings.gapiDotClientDotSurveys.gapi.client.surveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveyCost extends js.Object {
  /** Cost per survey response in nano units of the given currency. To get the total cost for a survey, multiply this value by wanted_response_count. */
  var costPerResponseNanos: js.UndefOr[String] = js.undefined
  /** Currency code that the cost is given in. */
  var currencyCode: js.UndefOr[String] = js.undefined
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
  var maxCostPerResponseNanos: js.UndefOr[String] = js.undefined
  /** Cost of survey in nano units of the given currency. DEPRECATED in favor of cost_per_response_nanos */
  var nanos: js.UndefOr[String] = js.undefined
}

object SurveyCost {
  @scala.inline
  def apply(
    costPerResponseNanos: String = null,
    currencyCode: String = null,
    maxCostPerResponseNanos: String = null,
    nanos: String = null
  ): SurveyCost = {
    val __obj = js.Dynamic.literal()
    if (costPerResponseNanos != null) __obj.updateDynamic("costPerResponseNanos")(costPerResponseNanos.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    if (maxCostPerResponseNanos != null) __obj.updateDynamic("maxCostPerResponseNanos")(maxCostPerResponseNanos.asInstanceOf[js.Any])
    if (nanos != null) __obj.updateDynamic("nanos")(nanos.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurveyCost]
  }
}

