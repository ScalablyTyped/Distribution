package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludedLocation
  extends AdWordsEntity
     with isCampaignChild {
  def getCampaignType(): CampaignType = js.native
  def getCountryCode(): String = js.native
  def getId(): Double = js.native
  def getName(): String = js.native
  def getTargetType(): TargetType = js.native
  def getTargetingStatus(): TargetingStatus = js.native
  def getVideoCampaign(): Campaign = js.native
   // TODO: VideoCampaign
  def remove(): Unit = js.native
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
    remove: () => Unit
  ): ExcludedLocation = {
    val __obj = js.Dynamic.literal(getCampaign = js.Any.fromFunction0(getCampaign), getCampaignType = js.Any.fromFunction0(getCampaignType), getCountryCode = js.Any.fromFunction0(getCountryCode), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getTargetType = js.Any.fromFunction0(getTargetType), getTargetingStatus = js.Any.fromFunction0(getTargetingStatus), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedLocation]
  }
  @scala.inline
  implicit class ExcludedLocationOps[Self <: ExcludedLocation] (val x: Self) extends AnyVal {
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
    def setGetCountryCode(value: () => String): Self = this.set("getCountryCode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetId(value: () => Double): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTargetType(value: () => TargetType): Self = this.set("getTargetType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTargetingStatus(value: () => TargetingStatus): Self = this.set("getTargetingStatus", js.Any.fromFunction0(value))
    @scala.inline
    def setGetVideoCampaign(value: () => Campaign): Self = this.set("getVideoCampaign", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
  }
  
}

