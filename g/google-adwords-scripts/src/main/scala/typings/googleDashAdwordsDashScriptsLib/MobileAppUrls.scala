package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileAppUrls
  extends AdWordsUrls
     with hasGetFinalUrl
     with hasSetFinalUrl
     with hasSetTrackingTemplate {
  def clearMobileFinalUrl(): scala.Unit
  def clearTrackingTemplate(): scala.Unit
}

object MobileAppUrls {
  @scala.inline
  def apply(
    clearMobileFinalUrl: js.Function0[scala.Unit],
    clearTrackingTemplate: js.Function0[scala.Unit],
    getCustomParameters: js.Function0[js.Object],
    getFinalUrl: js.Function0[java.lang.String],
    getMobileFinalUrl: js.Function0[java.lang.String],
    getTrackingTemplate: js.Function0[java.lang.String],
    setCustomParameters: js.Function1[js.Object, scala.Unit],
    setFinalUrl: js.Function1[java.lang.String, scala.Unit],
    setMobileFinalUrl: js.Function1[java.lang.String, scala.Unit],
    setTrackingTemplate: js.Function1[java.lang.String, scala.Unit]
  ): MobileAppUrls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearMobileFinalUrl")(clearMobileFinalUrl)
    __obj.updateDynamic("clearTrackingTemplate")(clearTrackingTemplate)
    __obj.updateDynamic("getCustomParameters")(getCustomParameters)
    __obj.updateDynamic("getFinalUrl")(getFinalUrl)
    __obj.updateDynamic("getMobileFinalUrl")(getMobileFinalUrl)
    __obj.updateDynamic("getTrackingTemplate")(getTrackingTemplate)
    __obj.updateDynamic("setCustomParameters")(setCustomParameters)
    __obj.updateDynamic("setFinalUrl")(setFinalUrl)
    __obj.updateDynamic("setMobileFinalUrl")(setMobileFinalUrl)
    __obj.updateDynamic("setTrackingTemplate")(setTrackingTemplate)
    __obj.asInstanceOf[MobileAppUrls]
  }
}

