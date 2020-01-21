package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdGroupUrls
  extends AdWordsUrls
     with hasSetTrackingTemplate {
  def clearTrackingTemplate(): Unit
}

object AdGroupUrls {
  @scala.inline
  def apply(
    clearTrackingTemplate: () => Unit,
    getCustomParameters: () => js.Object,
    getTrackingTemplate: () => String,
    setCustomParameters: js.Object => Unit,
    setTrackingTemplate: String => Unit
  ): AdGroupUrls = {
    val __obj = js.Dynamic.literal(clearTrackingTemplate = js.Any.fromFunction0(clearTrackingTemplate), getCustomParameters = js.Any.fromFunction0(getCustomParameters), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate), setCustomParameters = js.Any.fromFunction1(setCustomParameters), setTrackingTemplate = js.Any.fromFunction1(setTrackingTemplate))
  
    __obj.asInstanceOf[AdGroupUrls]
  }
}

