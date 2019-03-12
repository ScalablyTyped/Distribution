package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignUrls
  extends AdWordsUrls
     with hasSetTrackingTemplate {
  def clearTrackingTemplate(): scala.Unit
}

object CampaignUrls {
  @scala.inline
  def apply(
    clearTrackingTemplate: () => scala.Unit,
    getCustomParameters: () => js.Object,
    getTrackingTemplate: () => java.lang.String,
    setCustomParameters: js.Object => scala.Unit,
    setTrackingTemplate: java.lang.String => scala.Unit
  ): CampaignUrls = {
    val __obj = js.Dynamic.literal(clearTrackingTemplate = js.Any.fromFunction0(clearTrackingTemplate), getCustomParameters = js.Any.fromFunction0(getCustomParameters), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate), setCustomParameters = js.Any.fromFunction1(setCustomParameters), setTrackingTemplate = js.Any.fromFunction1(setTrackingTemplate))
  
    __obj.asInstanceOf[CampaignUrls]
  }
}

