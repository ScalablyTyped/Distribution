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
    getAdGroup: () => AdGroup,
    getAudienceId: () => scala.Double,
    getCampaign: () => Campaign,
    getId: () => scala.Double,
    getName: () => java.lang.String,
    remove: () => scala.Unit
  ): SearchAdGroupExcludedAudience = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getAudienceId = js.Any.fromFunction0(getAudienceId), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[SearchAdGroupExcludedAudience]
  }
}

