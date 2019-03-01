package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedPlacement extends isAdGroupChild {
  def getId(): scala.Double
  def getUrl(): java.lang.String
  def remove(): scala.Unit
}

object ExcludedPlacement {
  @scala.inline
  def apply(
    getAdGroup: js.Function0[AdGroup],
    getCampaign: js.Function0[Campaign],
    getId: js.Function0[scala.Double],
    getUrl: js.Function0[java.lang.String],
    remove: js.Function0[scala.Unit]
  ): ExcludedPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAdGroup")(getAdGroup)
    __obj.updateDynamic("getCampaign")(getCampaign)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getUrl")(getUrl)
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[ExcludedPlacement]
  }
}

