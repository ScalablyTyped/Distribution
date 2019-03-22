package typings
package atGoogleDashCloudTextDashToDashSpeechLib.atGoogleDashCloudTextDashToDashSpeechMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVoicesRequest extends js.Object {
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
}

object ListVoicesRequest {
  @scala.inline
  def apply(languageCode: java.lang.String = null): ListVoicesRequest = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    __obj.asInstanceOf[ListVoicesRequest]
  }
}

