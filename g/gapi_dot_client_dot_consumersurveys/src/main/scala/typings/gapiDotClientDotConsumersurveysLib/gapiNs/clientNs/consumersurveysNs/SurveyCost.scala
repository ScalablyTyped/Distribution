package typings
package gapiDotClientDotConsumersurveysLib.gapiNs.clientNs.consumersurveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveyCost extends js.Object {
  var costPerResponseNanos: js.UndefOr[java.lang.String] = js.undefined
  var currencyCode: js.UndefOr[java.lang.String] = js.undefined
  var maxCostPerResponseNanos: js.UndefOr[java.lang.String] = js.undefined
  var nanos: js.UndefOr[java.lang.String] = js.undefined
}

object SurveyCost {
  @scala.inline
  def apply(
    costPerResponseNanos: java.lang.String = null,
    currencyCode: java.lang.String = null,
    maxCostPerResponseNanos: java.lang.String = null,
    nanos: java.lang.String = null
  ): SurveyCost = {
    val __obj = js.Dynamic.literal()
    if (costPerResponseNanos != null) __obj.updateDynamic("costPerResponseNanos")(costPerResponseNanos)
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode)
    if (maxCostPerResponseNanos != null) __obj.updateDynamic("maxCostPerResponseNanos")(maxCostPerResponseNanos)
    if (nanos != null) __obj.updateDynamic("nanos")(nanos)
    __obj.asInstanceOf[SurveyCost]
  }
}

