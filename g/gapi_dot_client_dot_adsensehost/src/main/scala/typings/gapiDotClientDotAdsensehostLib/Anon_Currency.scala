package typings
package gapiDotClientDotAdsensehostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Currency extends js.Object {
  /** The currency of this column. Only present if the header type is METRIC_CURRENCY. */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the header. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the header; one of DIMENSION, METRIC_TALLY, METRIC_RATIO, or METRIC_CURRENCY. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Currency {
  @scala.inline
  def apply(currency: java.lang.String = null, name: java.lang.String = null, `type`: java.lang.String = null): Anon_Currency = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Currency]
  }
}

