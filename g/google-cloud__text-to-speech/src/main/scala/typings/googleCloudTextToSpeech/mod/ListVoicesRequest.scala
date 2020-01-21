package typings.googleCloudTextToSpeech.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVoicesRequest extends js.Object {
  var languageCode: js.UndefOr[String] = js.undefined
}

object ListVoicesRequest {
  @scala.inline
  def apply(languageCode: String = null): ListVoicesRequest = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVoicesRequest]
  }
}

