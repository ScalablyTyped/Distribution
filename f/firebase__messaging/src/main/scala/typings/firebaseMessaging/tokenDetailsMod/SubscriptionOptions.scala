package typings.firebaseMessaging.tokenDetailsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionOptions extends js.Object {
  var auth: String
  var endpoint: String
  var p256dh: String
  var swScope: String
  var vapidKey: String
}

object SubscriptionOptions {
  @scala.inline
  def apply(auth: String, endpoint: String, p256dh: String, swScope: String, vapidKey: String): SubscriptionOptions = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any], swScope = swScope.asInstanceOf[js.Any], vapidKey = vapidKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscriptionOptions]
  }
}

