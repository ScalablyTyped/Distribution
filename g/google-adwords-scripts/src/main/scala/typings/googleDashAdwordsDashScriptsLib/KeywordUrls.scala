package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeywordUrls
  extends AdWordsUrls
     with hasGetFinalUrl
     with hasSetTrackingTemplate
     with hasSetFinalUrl {
  def clearFinalUrl(): scala.Unit
  def clearMobileFinalUrl(): scala.Unit
  def clearTrackingTemplate(): scala.Unit
}

object KeywordUrls {
  @scala.inline
  def apply(
    clearFinalUrl: () => scala.Unit,
    clearMobileFinalUrl: () => scala.Unit,
    clearTrackingTemplate: () => scala.Unit,
    getCustomParameters: () => js.Object,
    getFinalUrl: () => java.lang.String,
    getMobileFinalUrl: () => java.lang.String,
    getTrackingTemplate: () => java.lang.String,
    setCustomParameters: js.Object => scala.Unit,
    setFinalUrl: java.lang.String => scala.Unit,
    setMobileFinalUrl: java.lang.String => scala.Unit,
    setTrackingTemplate: java.lang.String => scala.Unit
  ): KeywordUrls = {
    val __obj = js.Dynamic.literal(clearFinalUrl = js.Any.fromFunction0(clearFinalUrl), clearMobileFinalUrl = js.Any.fromFunction0(clearMobileFinalUrl), clearTrackingTemplate = js.Any.fromFunction0(clearTrackingTemplate), getCustomParameters = js.Any.fromFunction0(getCustomParameters), getFinalUrl = js.Any.fromFunction0(getFinalUrl), getMobileFinalUrl = js.Any.fromFunction0(getMobileFinalUrl), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate), setCustomParameters = js.Any.fromFunction1(setCustomParameters), setFinalUrl = js.Any.fromFunction1(setFinalUrl), setMobileFinalUrl = js.Any.fromFunction1(setMobileFinalUrl), setTrackingTemplate = js.Any.fromFunction1(setTrackingTemplate))
  
    __obj.asInstanceOf[KeywordUrls]
  }
}

