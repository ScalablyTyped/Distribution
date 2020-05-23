package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Money extends js.Object {
  /** The 3-letter currency code defined in ISO 4217. */
  var currencyCode: js.UndefOr[String] = js.undefined
  /**
    * Number of nano (10^-9) units of the amount.
    * The value must be between -999,999,999 and +999,999,999 inclusive.
    * If `units` is positive, `nanos` must be positive or zero.
    * If `units` is zero, `nanos` can be positive, zero, or negative.
    * If `units` is negative, `nanos` must be negative or zero.
    * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
    */
  var nanos: js.UndefOr[Double] = js.undefined
  /**
    * The whole units of the amount.
    * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
    */
  var units: js.UndefOr[String] = js.undefined
}

object Money {
  @scala.inline
  def apply(currencyCode: String = null, nanos: js.UndefOr[Double] = js.undefined, units: String = null): Money = {
    val __obj = js.Dynamic.literal()
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(nanos)) __obj.updateDynamic("nanos")(nanos.get.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[Money]
  }
}

