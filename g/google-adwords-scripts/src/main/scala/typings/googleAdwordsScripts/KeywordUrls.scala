package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeywordUrls
  extends AdWordsUrls
     with hasGetFinalUrl
     with hasSetTrackingTemplate
     with hasSetFinalUrl {
  def clearFinalUrl(): Unit
  def clearMobileFinalUrl(): Unit
  def clearTrackingTemplate(): Unit
}

object KeywordUrls {
  @scala.inline
  def apply(
    clearFinalUrl: () => Unit,
    clearMobileFinalUrl: () => Unit,
    clearTrackingTemplate: () => Unit,
    getCustomParameters: () => js.Object,
    getFinalUrl: () => String,
    getMobileFinalUrl: () => String,
    getTrackingTemplate: () => String,
    setCustomParameters: js.Object => Unit,
    setFinalUrl: String => Unit,
    setMobileFinalUrl: String => Unit,
    setTrackingTemplate: String => Unit
  ): KeywordUrls = {
    val __obj = js.Dynamic.literal(clearFinalUrl = js.Any.fromFunction0(clearFinalUrl), clearMobileFinalUrl = js.Any.fromFunction0(clearMobileFinalUrl), clearTrackingTemplate = js.Any.fromFunction0(clearTrackingTemplate), getCustomParameters = js.Any.fromFunction0(getCustomParameters), getFinalUrl = js.Any.fromFunction0(getFinalUrl), getMobileFinalUrl = js.Any.fromFunction0(getMobileFinalUrl), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate), setCustomParameters = js.Any.fromFunction1(setCustomParameters), setFinalUrl = js.Any.fromFunction1(setFinalUrl), setMobileFinalUrl = js.Any.fromFunction1(setMobileFinalUrl), setTrackingTemplate = js.Any.fromFunction1(setTrackingTemplate))
  
    __obj.asInstanceOf[KeywordUrls]
  }
}

