package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdGroupUrls
  extends AdWordsUrls
     with hasSetTrackingTemplate {
  def clearTrackingTemplate(): scala.Unit
}

object AdGroupUrls {
  @scala.inline
  def apply(
    clearTrackingTemplate: js.Function0[scala.Unit],
    getCustomParameters: js.Function0[js.Object],
    getTrackingTemplate: js.Function0[java.lang.String],
    setCustomParameters: js.Function1[js.Object, scala.Unit],
    setTrackingTemplate: js.Function1[java.lang.String, scala.Unit]
  ): AdGroupUrls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearTrackingTemplate")(clearTrackingTemplate)
    __obj.updateDynamic("getCustomParameters")(getCustomParameters)
    __obj.updateDynamic("getTrackingTemplate")(getTrackingTemplate)
    __obj.updateDynamic("setCustomParameters")(setCustomParameters)
    __obj.updateDynamic("setTrackingTemplate")(setTrackingTemplate)
    __obj.asInstanceOf[AdGroupUrls]
  }
}

