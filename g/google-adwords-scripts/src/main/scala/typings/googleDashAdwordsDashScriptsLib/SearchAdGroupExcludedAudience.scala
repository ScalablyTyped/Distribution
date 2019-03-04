package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAdGroupExcludedAudience extends isAdGroupChild {
  def getAudienceId(): scala.Double
  def getId(): scala.Double
  def getName(): java.lang.String
  def remove(): scala.Unit
}

object SearchAdGroupExcludedAudience {
  @scala.inline
  def apply(
    getAdGroup: js.Function0[AdGroup],
    getAudienceId: js.Function0[scala.Double],
    getCampaign: js.Function0[Campaign],
    getId: js.Function0[scala.Double],
    getName: js.Function0[java.lang.String],
    remove: js.Function0[scala.Unit]
  ): SearchAdGroupExcludedAudience = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup, getAudienceId = getAudienceId, getCampaign = getCampaign, getId = getId, getName = getName, remove = remove)
  
    __obj.asInstanceOf[SearchAdGroupExcludedAudience]
  }
}

