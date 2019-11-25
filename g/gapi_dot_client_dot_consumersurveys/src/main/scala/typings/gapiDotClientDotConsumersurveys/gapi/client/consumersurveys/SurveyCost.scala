package typings.gapiDotClientDotConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveyCost extends js.Object {
  var costPerResponseNanos: js.UndefOr[String] = js.undefined
  var currencyCode: js.UndefOr[String] = js.undefined
  var maxCostPerResponseNanos: js.UndefOr[String] = js.undefined
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

