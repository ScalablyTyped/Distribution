package typings.firebaseRemoteConfig.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrottleMetadata extends js.Object {
  var backoffCount: Double
  var throttleEndTimeMillis: Double
}

object ThrottleMetadata {
  @scala.inline
  def apply(backoffCount: Double, throttleEndTimeMillis: Double): ThrottleMetadata = {
    val __obj = js.Dynamic.literal(backoffCount = backoffCount.asInstanceOf[js.Any], throttleEndTimeMillis = throttleEndTimeMillis.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ThrottleMetadata]
  }
}

