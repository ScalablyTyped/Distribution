package typings.firebaseMessaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApplicationPubKey extends js.Object {
  var applicationPubKey: js.UndefOr[String] = js.undefined
  var auth: String
  var endpoint: String
  var p256dh: String
}

object AnonApplicationPubKey {
  @scala.inline
  def apply(auth: String, endpoint: String, p256dh: String, applicationPubKey: String = null): AnonApplicationPubKey = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any])
    if (applicationPubKey != null) __obj.updateDynamic("applicationPubKey")(applicationPubKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApplicationPubKey]
  }
}

