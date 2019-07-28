package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedLocation
  extends AdWordsEntity
     with isCampaignChild {
  def getCampaignType(): CampaignType
  def getCountryCode(): String
  def getId(): Double
  def getName(): String
  def getTargetType(): TargetType
  def getTargetingStatus(): TargetingStatus
  def getVideoCampaign(): Campaign
   // TODO: VideoCampaign
  def remove(): Unit
}

object ExcludedLocation {
  @scala.inline
  def apply(
    getCampaign: () => Campaign,
    getCampaignType: () => CampaignType,
    getCountryCode: () => String,
    getId: () => Double,
    getName: () => String,
    getTargetType: () => TargetType,
    getTargetingStatus: () => TargetingStatus,
    getVideoCampaign: () => Campaign,
    remove: () => Unit,
    getEntityType: () => String = null
  ): ExcludedLocation = {
    val __obj = js.Dynamic.literal(getCampaign = js.Any.fromFunction0(getCampaign), getCampaignType = js.Any.fromFunction0(getCampaignType), getCountryCode = js.Any.fromFunction0(getCountryCode), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getTargetType = js.Any.fromFunction0(getTargetType), getTargetingStatus = js.Any.fromFunction0(getTargetingStatus), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(js.Any.fromFunction0(getEntityType))
    __obj.asInstanceOf[ExcludedLocation]
  }
}

