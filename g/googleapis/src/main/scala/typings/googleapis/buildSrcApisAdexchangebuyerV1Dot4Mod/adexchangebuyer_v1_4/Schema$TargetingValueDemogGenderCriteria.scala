package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetingValueDemogGenderCriteria extends js.Object {
  var demogGenderCriteriaIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$TargetingValueDemogGenderCriteria {
  @scala.inline
  def apply(demogGenderCriteriaIds: js.Array[String] = null): Schema$TargetingValueDemogGenderCriteria = {
    val __obj = js.Dynamic.literal()
    if (demogGenderCriteriaIds != null) __obj.updateDynamic("demogGenderCriteriaIds")(demogGenderCriteriaIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetingValueDemogGenderCriteria]
  }
}

