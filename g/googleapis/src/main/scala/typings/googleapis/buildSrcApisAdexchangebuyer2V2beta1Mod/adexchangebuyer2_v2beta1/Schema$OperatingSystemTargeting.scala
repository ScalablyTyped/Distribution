package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents targeting information for operating systems.
  */
@js.native
trait Schema$OperatingSystemTargeting extends js.Object {
  /**
    * IDs of operating systems to be included/excluded.
    */
  var operatingSystemCriteria: js.UndefOr[Schema$CriteriaTargeting] = js.native
  /**
    * IDs of operating system versions to be included/excluded.
    */
  var operatingSystemVersionCriteria: js.UndefOr[Schema$CriteriaTargeting] = js.native
}

object Schema$OperatingSystemTargeting {
  @scala.inline
  def apply(
    operatingSystemCriteria: Schema$CriteriaTargeting = null,
    operatingSystemVersionCriteria: Schema$CriteriaTargeting = null
  ): Schema$OperatingSystemTargeting = {
    val __obj = js.Dynamic.literal()
    if (operatingSystemCriteria != null) __obj.updateDynamic("operatingSystemCriteria")(operatingSystemCriteria.asInstanceOf[js.Any])
    if (operatingSystemVersionCriteria != null) __obj.updateDynamic("operatingSystemVersionCriteria")(operatingSystemVersionCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OperatingSystemTargeting]
  }
}

