package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Floodlight Configuration List Response
  */
@js.native
trait Schema$FloodlightConfigurationsListResponse extends js.Object {
  /**
    * Floodlight configuration collection.
    */
  var floodlightConfigurations: js.UndefOr[js.Array[Schema$FloodlightConfiguration]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightConfigurationsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$FloodlightConfigurationsListResponse {
  @scala.inline
  def apply(floodlightConfigurations: js.Array[Schema$FloodlightConfiguration] = null, kind: String = null): Schema$FloodlightConfigurationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightConfigurations != null) __obj.updateDynamic("floodlightConfigurations")(floodlightConfigurations.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FloodlightConfigurationsListResponse]
  }
}

