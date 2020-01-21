package typings.firebaseMessaging.messagePayloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FcmOptions extends js.Object {
  var link: js.UndefOr[String] = js.undefined
}

object FcmOptions {
  @scala.inline
  def apply(link: String = null): FcmOptions = {
    val __obj = js.Dynamic.literal()
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    __obj.asInstanceOf[FcmOptions]
  }
}

