package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language
  extends AdWordsEntity
     with isCampaignChild {
  def getCampaignType(): CampaignType
  def getId(): Double
  def getName(): String
  def getVideoCampaign(): Campaign
   // TODO: VideoCampaign
  def remove(): Unit
}

object Language {
  @scala.inline
  def apply(
    getCampaign: () => Campaign,
    getCampaignType: () => CampaignType,
    getId: () => Double,
    getName: () => String,
    getVideoCampaign: () => Campaign,
    remove: () => Unit,
    getEntityType: () => String = null
  ): Language = {
    val __obj = js.Dynamic.literal(getCampaign = js.Any.fromFunction0(getCampaign), getCampaignType = js.Any.fromFunction0(getCampaignType), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(js.Any.fromFunction0(getEntityType))
    __obj.asInstanceOf[Language]
  }
}

