package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Country extends js.Object {
  /** Country code. */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /** DART ID of this country. This is the ID used for targeting and generating reports. */
  var dartId: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#country". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this country. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Whether ad serving supports secure servers in this country. */
  var sslEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object Country {
  @scala.inline
  def apply(
    countryCode: java.lang.String = null,
    dartId: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    sslEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Country = {
    val __obj = js.Dynamic.literal()
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (dartId != null) __obj.updateDynamic("dartId")(dartId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(sslEnabled)) __obj.updateDynamic("sslEnabled")(sslEnabled)
    __obj.asInstanceOf[Country]
  }
}

