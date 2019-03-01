package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VcardAddress extends js.Object {
  /** The postal code associated with the address. For example: 94423. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** The country name. For example: US. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** The city or local equivalent portion of the address. For example: San Jose. */
  var locality: js.UndefOr[java.lang.String] = js.undefined
  /** An optional post office box number. */
  var pobox: js.UndefOr[java.lang.String] = js.undefined
  /** The state or local equivalent portion of the address. For example: CA. */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /** The street number and name. For example: 123 Any St. */
  var street: js.UndefOr[java.lang.String] = js.undefined
}

object VcardAddress {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    country: java.lang.String = null,
    locality: java.lang.String = null,
    pobox: java.lang.String = null,
    region: java.lang.String = null,
    street: java.lang.String = null
  ): VcardAddress = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (country != null) __obj.updateDynamic("country")(country)
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (pobox != null) __obj.updateDynamic("pobox")(pobox)
    if (region != null) __obj.updateDynamic("region")(region)
    if (street != null) __obj.updateDynamic("street")(street)
    __obj.asInstanceOf[VcardAddress]
  }
}

