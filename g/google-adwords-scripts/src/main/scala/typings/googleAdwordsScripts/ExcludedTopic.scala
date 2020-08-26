package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludedTopic extends isAdGroupChild {
  def getId(): Double = js.native
  def getTopicId(): Double = js.native
  def remove(): Unit = js.native
}

object ExcludedTopic {
  @scala.inline
  def apply(
    getAdGroup: () => AdGroup,
    getCampaign: () => Campaign,
    getId: () => Double,
    getTopicId: () => Double,
    remove: () => Unit
  ): ExcludedTopic = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), getTopicId = js.Any.fromFunction0(getTopicId), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedTopic]
  }
  @scala.inline
  implicit class ExcludedTopicOps[Self <: ExcludedTopic] (val x: Self) extends AnyVal {
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
    def setGetId(value: () => Double): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTopicId(value: () => Double): Self = this.set("getTopicId", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
  }
  
}

