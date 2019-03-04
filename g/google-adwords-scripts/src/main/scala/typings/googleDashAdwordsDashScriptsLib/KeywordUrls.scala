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
    clearFinalUrl: js.Function0[scala.Unit],
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
  ): KeywordUrls = {
    val __obj = js.Dynamic.literal(clearFinalUrl = clearFinalUrl, clearMobileFinalUrl = clearMobileFinalUrl, clearTrackingTemplate = clearTrackingTemplate, getCustomParameters = getCustomParameters, getFinalUrl = getFinalUrl, getMobileFinalUrl = getMobileFinalUrl, getTrackingTemplate = getTrackingTemplate, setCustomParameters = setCustomParameters, setFinalUrl = setFinalUrl, setMobileFinalUrl = setMobileFinalUrl, setTrackingTemplate = setTrackingTemplate)
  
    __obj.asInstanceOf[KeywordUrls]
  }
}

