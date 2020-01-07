package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a country that can be targeted by ads.
  */
@js.native
trait Schema$Country extends js.Object {
  /**
    * Country code.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * DART ID of this country. This is the ID used for targeting and generating
    * reports.
    */
  var dartId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#country&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this country.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether ad serving supports secure servers in this country.
    */
  var sslEnabled: js.UndefOr[Boolean] = js.native
}

object Schema$Country {
  @scala.inline
  def apply(
    countryCode: String = null,
    dartId: String = null,
    kind: String = null,
    name: String = null,
    sslEnabled: js.UndefOr[Boolean] = js.undefined
  ): Schema$Country = {
    val __obj = js.Dynamic.literal()
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (dartId != null) __obj.updateDynamic("dartId")(dartId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(sslEnabled)) __obj.updateDynamic("sslEnabled")(sslEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Country]
  }
}

