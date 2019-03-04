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
    clearTrackingTemplate: js.Function0[scala.Unit],
    getCustomParameters: js.Function0[js.Object],
    getTrackingTemplate: js.Function0[java.lang.String],
    setCustomParameters: js.Function1[js.Object, scala.Unit],
    setTrackingTemplate: js.Function1[java.lang.String, scala.Unit]
  ): CampaignUrls = {
    val __obj = js.Dynamic.literal(clearTrackingTemplate = clearTrackingTemplate, getCustomParameters = getCustomParameters, getTrackingTemplate = getTrackingTemplate, setCustomParameters = setCustomParameters, setTrackingTemplate = setTrackingTemplate)
  
    __obj.asInstanceOf[CampaignUrls]
  }
}

