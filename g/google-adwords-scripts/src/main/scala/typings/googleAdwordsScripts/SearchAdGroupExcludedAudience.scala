package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchAdGroupExcludedAudience extends isAdGroupChild {
  def getAudienceId(): Double = js.native
  def getId(): Double = js.native
  def getName(): String = js.native
  def remove(): Unit = js.native
}

object SearchAdGroupExcludedAudience {
  @scala.inline
  def apply(
    getAdGroup: () => AdGroup,
    getAudienceId: () => Double,
    getCampaign: () => Campaign,
    getId: () => Double,
    getName: () => String,
    remove: () => Unit
  ): SearchAdGroupExcludedAudience = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getAudienceId = js.Any.fromFunction0(getAudienceId), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[SearchAdGroupExcludedAudience]
  }
  @scala.inline
  implicit class SearchAdGroupExcludedAudienceOps[Self <: SearchAdGroupExcludedAudience] (val x: Self) extends AnyVal {
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
    def setGetAudienceId(value: () => Double): Self = this.set("getAudienceId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetId(value: () => Double): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
  }
  
}

