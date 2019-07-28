package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileCarrier extends js.Object {
  /** Country code of the country to which this mobile carrier belongs. */
  var countryCode: js.UndefOr[String] = js.undefined
  /** DART ID of the country to which this mobile carrier belongs. */
  var countryDartId: js.UndefOr[String] = js.undefined
  /** ID of this mobile carrier. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#mobileCarrier". */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of this mobile carrier. */
  var name: js.UndefOr[String] = js.undefined
}

object MobileCarrier {
  @scala.inline
  def apply(
    countryCode: String = null,
    countryDartId: String = null,
    id: String = null,
    kind: String = null,
    name: String = null
  ): MobileCarrier = {
    val __obj = js.Dynamic.literal()
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (countryDartId != null) __obj.updateDynamic("countryDartId")(countryDartId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MobileCarrier]
  }
}

