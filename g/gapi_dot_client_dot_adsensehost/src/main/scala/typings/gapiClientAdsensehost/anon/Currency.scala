package typings.gapiClientAdsensehost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency extends js.Object {
  /** The currency of this column. Only present if the header type is METRIC_CURRENCY. */
  var currency: js.UndefOr[String] = js.undefined
  /** The name of the header. */
  var name: js.UndefOr[String] = js.undefined
  /** The type of the header; one of DIMENSION, METRIC_TALLY, METRIC_RATIO, or METRIC_CURRENCY. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Currency {
  @scala.inline
  def apply(currency: String = null, name: String = null, `type`: String = null): Currency = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
}

