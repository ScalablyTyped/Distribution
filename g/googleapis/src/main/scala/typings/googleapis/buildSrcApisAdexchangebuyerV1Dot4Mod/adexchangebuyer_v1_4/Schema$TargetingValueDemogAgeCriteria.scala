package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetingValueDemogAgeCriteria extends js.Object {
  var demogAgeCriteriaIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$TargetingValueDemogAgeCriteria {
  @scala.inline
  def apply(demogAgeCriteriaIds: js.Array[String] = null): Schema$TargetingValueDemogAgeCriteria = {
    val __obj = js.Dynamic.literal()
    if (demogAgeCriteriaIds != null) __obj.updateDynamic("demogAgeCriteriaIds")(demogAgeCriteriaIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetingValueDemogAgeCriteria]
  }
}

