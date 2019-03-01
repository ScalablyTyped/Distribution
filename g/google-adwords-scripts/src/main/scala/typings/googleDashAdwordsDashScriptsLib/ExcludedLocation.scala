package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedLocation
  extends AdWordsEntity
     with isCampaignChild {
  def getCampaignType(): CampaignType
  def getCountryCode(): java.lang.String
  def getId(): scala.Double
  def getName(): java.lang.String
  def getTargetType(): TargetType
  def getTargetingStatus(): TargetingStatus
  def getVideoCampaign(): Campaign
   // TODO: VideoCampaign
  def remove(): scala.Unit
}

object ExcludedLocation {
  @scala.inline
  def apply(
    getCampaign: js.Function0[Campaign],
    getCampaignType: js.Function0[CampaignType],
    getCountryCode: js.Function0[java.lang.String],
    getId: js.Function0[scala.Double],
    getName: js.Function0[java.lang.String],
    getTargetType: js.Function0[TargetType],
    getTargetingStatus: js.Function0[TargetingStatus],
    getVideoCampaign: js.Function0[Campaign],
    remove: js.Function0[scala.Unit],
    getEntityType: js.Function0[java.lang.String] = null
  ): ExcludedLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCampaign")(getCampaign)
    __obj.updateDynamic("getCampaignType")(getCampaignType)
    __obj.updateDynamic("getCountryCode")(getCountryCode)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getTargetType")(getTargetType)
    __obj.updateDynamic("getTargetingStatus")(getTargetingStatus)
    __obj.updateDynamic("getVideoCampaign")(getVideoCampaign)
    __obj.updateDynamic("remove")(remove)
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(getEntityType)
    __obj.asInstanceOf[ExcludedLocation]
  }
}

