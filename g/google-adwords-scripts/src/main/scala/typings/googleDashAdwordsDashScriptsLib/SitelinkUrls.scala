package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitelinkUrls
  extends AdWordsUrls
     with hasSetTrackingTemplate
     with hasGetFinalUrl
     with hasSetFinalUrl {
  def clearMobileFinalUrl(): scala.Unit
}

object SitelinkUrls {
  @scala.inline
  def apply(
    clearMobileFinalUrl: () => scala.Unit,
    getCustomParameters: () => js.Object,
    getFinalUrl: () => java.lang.String,
    getMobileFinalUrl: () => java.lang.String,
    getTrackingTemplate: () => java.lang.String,
    setCustomParameters: js.Object => scala.Unit,
    setFinalUrl: java.lang.String => scala.Unit,
    setMobileFinalUrl: java.lang.String => scala.Unit,
    setTrackingTemplate: java.lang.String => scala.Unit
  ): SitelinkUrls = {
    val __obj = js.Dynamic.literal(clearMobileFinalUrl = js.Any.fromFunction0(clearMobileFinalUrl), getCustomParameters = js.Any.fromFunction0(getCustomParameters), getFinalUrl = js.Any.fromFunction0(getFinalUrl), getMobileFinalUrl = js.Any.fromFunction0(getMobileFinalUrl), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate), setCustomParameters = js.Any.fromFunction1(setCustomParameters), setFinalUrl = js.Any.fromFunction1(setFinalUrl), setMobileFinalUrl = js.Any.fromFunction1(setMobileFinalUrl), setTrackingTemplate = js.Any.fromFunction1(setTrackingTemplate))
  
    __obj.asInstanceOf[SitelinkUrls]
  }
}

