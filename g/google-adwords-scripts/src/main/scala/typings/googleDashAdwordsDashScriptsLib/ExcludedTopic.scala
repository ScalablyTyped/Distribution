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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAdGroup")(getAdGroup)
    __obj.updateDynamic("getCampaign")(getCampaign)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getTopicId")(getTopicId)
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[ExcludedTopic]
  }
}

