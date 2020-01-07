package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Advertisers can target different attributes of an ad slot. For example,
  * they can choose to show ads only if the user is in the U.S. Such targeting
  * criteria can be specified as part of Shared Targeting.
  */
@js.native
trait Schema$TargetingCriteria extends js.Object {
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
    * The key representing the shared targeting criterion. Targeting criteria
    * defined by Google ad servers will begin with GOOG_. Third parties may
    * define their own keys. A list of permissible keys along with the
    * acceptable values will be provided as part of the external documentation.
    */
  var key: js.UndefOr[String] = js.native
}

object Schema$TargetingCriteria {
  @scala.inline
  def apply(
    exclusions: js.Array[Schema$TargetingValue] = null,
    inclusions: js.Array[Schema$TargetingValue] = null,
    key: String = null
  ): Schema$TargetingCriteria = {
    val __obj = js.Dynamic.literal()
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions.asInstanceOf[js.Any])
    if (inclusions != null) __obj.updateDynamic("inclusions")(inclusions.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetingCriteria]
  }
}

