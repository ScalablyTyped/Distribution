package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedAudience extends isAdGroupChild {
  def getAudienceId(): scala.Double
  def getAudienceType(): AudienceType
  def getId(): scala.Double
  def remove(): scala.Unit
}

object ExcludedAudience {
  @scala.inline
  def apply(
    getAdGroup: () => AdGroup,
    getAudienceId: () => scala.Double,
    getAudienceType: () => AudienceType,
    getCampaign: () => Campaign,
    getId: () => scala.Double,
    remove: () => scala.Unit
  ): ExcludedAudience = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getAudienceId = js.Any.fromFunction0(getAudienceId), getAudienceType = js.Any.fromFunction0(getAudienceType), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[ExcludedAudience]
  }
}

