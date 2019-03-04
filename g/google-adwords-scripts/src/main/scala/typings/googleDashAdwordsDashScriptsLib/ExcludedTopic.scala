package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedTopic extends isAdGroupChild {
  def getId(): scala.Double
  def getTopicId(): scala.Double
  def remove(): scala.Unit
}

object ExcludedTopic {
  @scala.inline
  def apply(
    getAdGroup: js.Function0[AdGroup],
    getCampaign: js.Function0[Campaign],
    getId: js.Function0[scala.Double],
    getTopicId: js.Function0[scala.Double],
    remove: js.Function0[scala.Unit]
  ): ExcludedTopic = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup, getCampaign = getCampaign, getId = getId, getTopicId = getTopicId, remove = remove)
  
    __obj.asInstanceOf[ExcludedTopic]
  }
}

