package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents targeting about various types of technology.
  */
@js.native
trait Schema$TechnologyTargeting extends js.Object {
  /**
    * IDs of device capabilities to be included/excluded.
    */
  var deviceCapabilityTargeting: js.UndefOr[Schema$CriteriaTargeting] = js.native
  /**
    * IDs of device categories to be included/excluded.
    */
  var deviceCategoryTargeting: js.UndefOr[Schema$CriteriaTargeting] = js.native
  /**
    * Operating system related targeting information.
    */
  var operatingSystemTargeting: js.UndefOr[Schema$OperatingSystemTargeting] = js.native
}

object Schema$TechnologyTargeting {
  @scala.inline
  def apply(
    deviceCapabilityTargeting: Schema$CriteriaTargeting = null,
    deviceCategoryTargeting: Schema$CriteriaTargeting = null,
    operatingSystemTargeting: Schema$OperatingSystemTargeting = null
  ): Schema$TechnologyTargeting = {
    val __obj = js.Dynamic.literal()
    if (deviceCapabilityTargeting != null) __obj.updateDynamic("deviceCapabilityTargeting")(deviceCapabilityTargeting.asInstanceOf[js.Any])
    if (deviceCategoryTargeting != null) __obj.updateDynamic("deviceCategoryTargeting")(deviceCategoryTargeting.asInstanceOf[js.Any])
    if (operatingSystemTargeting != null) __obj.updateDynamic("operatingSystemTargeting")(operatingSystemTargeting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TechnologyTargeting]
  }
}

