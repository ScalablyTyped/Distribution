package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedTopic extends isAdGroupChild {
  def getId(): Double
  def getTopicId(): Double
  def remove(): Unit
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
}

