package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdUrls
  extends AdWordsUrls
     with hasGetFinalUrl

object AdUrls {
  @scala.inline
  def apply(
    getCustomParameters: js.Function0[js.Object],
    getFinalUrl: js.Function0[java.lang.String],
    getMobileFinalUrl: js.Function0[java.lang.String],
    getTrackingTemplate: js.Function0[java.lang.String]
  ): AdUrls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCustomParameters")(getCustomParameters)
    __obj.updateDynamic("getFinalUrl")(getFinalUrl)
    __obj.updateDynamic("getMobileFinalUrl")(getMobileFinalUrl)
    __obj.updateDynamic("getTrackingTemplate")(getTrackingTemplate)
    __obj.asInstanceOf[AdUrls]
  }
}

