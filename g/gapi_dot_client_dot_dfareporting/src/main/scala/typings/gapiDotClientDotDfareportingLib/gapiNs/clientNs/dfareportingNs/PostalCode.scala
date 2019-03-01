package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCode extends js.Object {
  /** Postal code. This is equivalent to the id field. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** Country code of the country to which this postal code belongs. */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /** DART ID of the country to which this postal code belongs. */
  var countryDartId: js.UndefOr[java.lang.String] = js.undefined
  /** ID of this postal code. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#postalCode". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object PostalCode {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    countryCode: java.lang.String = null,
    countryDartId: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null
  ): PostalCode = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (countryDartId != null) __obj.updateDynamic("countryDartId")(countryDartId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[PostalCode]
  }
}

