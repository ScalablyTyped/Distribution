package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedContentLabel
  extends AdWordsEntity
     with isCampaignChild {
  def getCampaignType(): CampaignType
  def getContentLabelType(): String
   // TODO: ContentLabelType
  def getId(): Double
  def getVideoCampaign(): Campaign
   // TODO: VideoCampaign
  def remove(): Unit
}

object ExcludedContentLabel {
  @scala.inline
  def apply(
    getCampaign: () => Campaign,
    getCampaignType: () => CampaignType,
    getContentLabelType: () => String,
    getId: () => Double,
    getVideoCampaign: () => Campaign,
    remove: () => Unit,
    getEntityType: () => String = null
  ): ExcludedContentLabel = {
    val __obj = js.Dynamic.literal(getCampaign = js.Any.fromFunction0(getCampaign), getCampaignType = js.Any.fromFunction0(getCampaignType), getContentLabelType = js.Any.fromFunction0(getContentLabelType), getId = js.Any.fromFunction0(getId), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(js.Any.fromFunction0(getEntityType))
    __obj.asInstanceOf[ExcludedContentLabel]
  }
}

