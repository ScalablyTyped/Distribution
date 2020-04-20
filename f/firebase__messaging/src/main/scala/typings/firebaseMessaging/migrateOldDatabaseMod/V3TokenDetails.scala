package typings.firebaseMessaging.migrateOldDatabaseMod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V3TokenDetails extends js.Object {
  var auth: ArrayBuffer
  var createTime: Double
  var endpoint: String
  var fcmPushSet: String
  var fcmSenderId: String
  var fcmToken: String
  var p256dh: ArrayBuffer
  var swScope: String
  var vapidKey: Uint8Array
}

object V3TokenDetails {
  @scala.inline
  def apply(
    auth: ArrayBuffer,
    createTime: Double,
    endpoint: String,
    fcmPushSet: String,
    fcmSenderId: String,
    fcmToken: String,
    p256dh: ArrayBuffer,
    swScope: String,
    vapidKey: Uint8Array
  ): V3TokenDetails = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], fcmPushSet = fcmPushSet.asInstanceOf[js.Any], fcmSenderId = fcmSenderId.asInstanceOf[js.Any], fcmToken = fcmToken.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any], swScope = swScope.asInstanceOf[js.Any], vapidKey = vapidKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[V3TokenDetails]
  }
}

