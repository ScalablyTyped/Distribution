package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents creative restrictions associated to Programmatic Guaranteed/
  * Preferred Deal in Ad Manager. This doesn&#39;t apply to Private Auction and
  * AdX Preferred Deals.
  */
@js.native
trait Schema$CreativeRestrictions extends js.Object {
  /**
    * The format of the environment that the creatives will be displayed in.
    */
  var creativeFormat: js.UndefOr[String] = js.native
  var creativeSpecifications: js.UndefOr[js.Array[Schema$CreativeSpecification]] = js.native
  /**
    * Skippable video ads allow viewers to skip ads after 5 seconds.
    */
  var skippableAdType: js.UndefOr[String] = js.native
}

object Schema$CreativeRestrictions {
  @scala.inline
  def apply(
    creativeFormat: String = null,
    creativeSpecifications: js.Array[Schema$CreativeSpecification] = null,
    skippableAdType: String = null
  ): Schema$CreativeRestrictions = {
    val __obj = js.Dynamic.literal()
    if (creativeFormat != null) __obj.updateDynamic("creativeFormat")(creativeFormat.asInstanceOf[js.Any])
    if (creativeSpecifications != null) __obj.updateDynamic("creativeSpecifications")(creativeSpecifications.asInstanceOf[js.Any])
    if (skippableAdType != null) __obj.updateDynamic("skippableAdType")(skippableAdType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativeRestrictions]
  }
}

