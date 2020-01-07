package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a region that can be targeted by ads.
  */
@js.native
trait Schema$Region extends js.Object {
  /**
    * Country code of the country to which this region belongs.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * DART ID of the country to which this region belongs.
    */
  var countryDartId: js.UndefOr[String] = js.native
  /**
    * DART ID of this region.
    */
  var dartId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#region&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this region.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Region code.
    */
  var regionCode: js.UndefOr[String] = js.native
}

object Schema$Region {
  @scala.inline
  def apply(
    countryCode: String = null,
    countryDartId: String = null,
    dartId: String = null,
    kind: String = null,
    name: String = null,
    regionCode: String = null
  ): Schema$Region = {
    val __obj = js.Dynamic.literal()
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (countryDartId != null) __obj.updateDynamic("countryDartId")(countryDartId.asInstanceOf[js.Any])
    if (dartId != null) __obj.updateDynamic("dartId")(dartId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Region]
  }
}

