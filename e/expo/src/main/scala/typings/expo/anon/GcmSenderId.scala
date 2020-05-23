package typings.expo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GcmSenderId extends js.Object {
  var gcmSenderId: js.UndefOr[String] = js.undefined
}

object GcmSenderId {
  @scala.inline
  def apply(gcmSenderId: String = null): GcmSenderId = {
    val __obj = js.Dynamic.literal()
    if (gcmSenderId != null) __obj.updateDynamic("gcmSenderId")(gcmSenderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GcmSenderId]
  }
}

