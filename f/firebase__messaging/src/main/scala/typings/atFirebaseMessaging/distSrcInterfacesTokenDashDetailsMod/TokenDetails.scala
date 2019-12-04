package typings.atFirebaseMessaging.distSrcInterfacesTokenDashDetailsMod

import typings.std.ArrayBufferLike
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenDetails extends js.Object {
  var auth: ArrayBufferLike
  var createTime: Double
  var endpoint: String
  var fcmSenderId: String
  var fcmToken: String
  var p256dh: ArrayBufferLike
  var swScope: String
  var vapidKey: Uint8Array
}

object TokenDetails {
  @scala.inline
  def apply(
    auth: ArrayBufferLike,
    createTime: Double,
    endpoint: String,
    fcmSenderId: String,
    fcmToken: String,
    p256dh: ArrayBufferLike,
    swScope: String,
    vapidKey: Uint8Array
  ): TokenDetails = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], fcmSenderId = fcmSenderId.asInstanceOf[js.Any], fcmToken = fcmToken.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any], swScope = swScope.asInstanceOf[js.Any], vapidKey = vapidKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TokenDetails]
  }
}

