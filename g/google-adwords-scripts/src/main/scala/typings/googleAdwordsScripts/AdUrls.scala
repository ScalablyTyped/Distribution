package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdUrls
  extends AdWordsUrls
     with hasGetFinalUrl

object AdUrls {
  @scala.inline
  def apply(
    getCustomParameters: () => js.Object,
    getFinalUrl: () => String,
    getMobileFinalUrl: () => String,
    getTrackingTemplate: () => String
  ): AdUrls = {
    val __obj = js.Dynamic.literal(getCustomParameters = js.Any.fromFunction0(getCustomParameters), getFinalUrl = js.Any.fromFunction0(getFinalUrl), getMobileFinalUrl = js.Any.fromFunction0(getMobileFinalUrl), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate))
    __obj.asInstanceOf[AdUrls]
  }
}

