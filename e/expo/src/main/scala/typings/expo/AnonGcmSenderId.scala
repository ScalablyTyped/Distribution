package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGcmSenderId extends js.Object {
  var gcmSenderId: js.UndefOr[String] = js.undefined
}

object AnonGcmSenderId {
  @scala.inline
  def apply(gcmSenderId: String = null): AnonGcmSenderId = {
    val __obj = js.Dynamic.literal()
    if (gcmSenderId != null) __obj.updateDynamic("gcmSenderId")(gcmSenderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGcmSenderId]
  }
}

