package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generic targeting used for targeting dimensions that contains a list of
  * included and excluded numeric IDs.
  */
@js.native
trait Schema$CriteriaTargeting extends js.Object {
  /**
    * A list of numeric IDs to be excluded.
    */
  var excludedCriteriaIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of numeric IDs to be included.
    */
  var targetedCriteriaIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$CriteriaTargeting {
  @scala.inline
  def apply(excludedCriteriaIds: js.Array[String] = null, targetedCriteriaIds: js.Array[String] = null): Schema$CriteriaTargeting = {
    val __obj = js.Dynamic.literal()
    if (excludedCriteriaIds != null) __obj.updateDynamic("excludedCriteriaIds")(excludedCriteriaIds.asInstanceOf[js.Any])
    if (targetedCriteriaIds != null) __obj.updateDynamic("targetedCriteriaIds")(targetedCriteriaIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CriteriaTargeting]
  }
}

