package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SharedTargeting extends js.Object {
  /**
    * The list of values to exclude from targeting. Each value is AND&#39;d
    * together.
    */
  var exclusions: js.UndefOr[js.Array[Schema$TargetingValue]] = js.native
  /**
    * The list of value to include as part of the targeting. Each value is
    * OR&#39;d together.
    */
  var inclusions: js.UndefOr[js.Array[Schema$TargetingValue]] = js.native
  /**
    * The key representing the shared targeting criterion.
    */
  var key: js.UndefOr[String] = js.native
}

object Schema$SharedTargeting {
  @scala.inline
  def apply(
    exclusions: js.Array[Schema$TargetingValue] = null,
    inclusions: js.Array[Schema$TargetingValue] = null,
    key: String = null
  ): Schema$SharedTargeting = {
    val __obj = js.Dynamic.literal()
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions.asInstanceOf[js.Any])
    if (inclusions != null) __obj.updateDynamic("inclusions")(inclusions.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SharedTargeting]
  }
}

