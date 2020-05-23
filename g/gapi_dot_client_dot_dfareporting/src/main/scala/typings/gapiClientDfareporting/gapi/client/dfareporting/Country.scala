package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Country extends js.Object {
  /** Country code. */
  var countryCode: js.UndefOr[String] = js.undefined
  /** DART ID of this country. This is the ID used for targeting and generating reports. */
  var dartId: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#country". */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of this country. */
  var name: js.UndefOr[String] = js.undefined
  /** Whether ad serving supports secure servers in this country. */
  var sslEnabled: js.UndefOr[Boolean] = js.undefined
}

object Country {
  @scala.inline
  def apply(
    countryCode: String = null,
    dartId: String = null,
    kind: String = null,
    name: String = null,
    sslEnabled: js.UndefOr[Boolean] = js.undefined
  ): Country = {
    val __obj = js.Dynamic.literal()
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (dartId != null) __obj.updateDynamic("dartId")(dartId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(sslEnabled)) __obj.updateDynamic("sslEnabled")(sslEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Country]
  }
}

