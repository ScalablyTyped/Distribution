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
    getAdGroup: js.Function0[AdGroup],
    getAudienceId: js.Function0[scala.Double],
    getAudienceType: js.Function0[AudienceType],
    getCampaign: js.Function0[Campaign],
    getId: js.Function0[scala.Double],
    remove: js.Function0[scala.Unit]
  ): ExcludedAudience = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAdGroup")(getAdGroup)
    __obj.updateDynamic("getAudienceId")(getAudienceId)
    __obj.updateDynamic("getAudienceType")(getAudienceType)
    __obj.updateDynamic("getCampaign")(getCampaign)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[ExcludedAudience]
  }
}

