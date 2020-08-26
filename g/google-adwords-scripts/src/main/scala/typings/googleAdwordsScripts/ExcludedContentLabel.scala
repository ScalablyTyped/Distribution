package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludedContentLabel
  extends AdWordsEntity
     with isCampaignChild {
  def getCampaignType(): CampaignType = js.native
  def getContentLabelType(): String = js.native
   // TODO: ContentLabelType
  def getId(): Double = js.native
  def getVideoCampaign(): Campaign = js.native
   // TODO: VideoCampaign
  def remove(): Unit = js.native
}

object ExcludedContentLabel {
  @scala.inline
  def apply(
    getCampaign: () => Campaign,
    getCampaignType: () => CampaignType,
    getContentLabelType: () => String,
    getId: () => Double,
    getVideoCampaign: () => Campaign,
    remove: () => Unit
  ): ExcludedContentLabel = {
    val __obj = js.Dynamic.literal(getCampaign = js.Any.fromFunction0(getCampaign), getCampaignType = js.Any.fromFunction0(getCampaignType), getContentLabelType = js.Any.fromFunction0(getContentLabelType), getId = js.Any.fromFunction0(getId), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedContentLabel]
  }
  @scala.inline
  implicit class ExcludedContentLabelOps[Self <: ExcludedContentLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetCampaignType(value: () => CampaignType): Self = this.set("getCampaignType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContentLabelType(value: () => String): Self = this.set("getContentLabelType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetId(value: () => Double): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetVideoCampaign(value: () => Campaign): Self = this.set("getVideoCampaign", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
  }
  
}

