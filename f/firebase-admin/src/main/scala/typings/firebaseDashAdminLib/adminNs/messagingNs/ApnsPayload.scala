package typings
package firebaseDashAdminLib.adminNs.messagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the payload of an APNs message. Mainly consists of the `aps`
  * dictionary. But may also contain other arbitrary custom keys.
  */
trait ApnsPayload
  extends /* customData */ org.scalablytyped.runtime.StringDictionary[js.Object] {
  /**
    * The `aps` dictionary to be included in the message.
    */
  var aps: Aps
}

object ApnsPayload {
  @scala.inline
  def apply(
    aps: Aps,
    StringDictionary: /* customData */ org.scalablytyped.runtime.StringDictionary[js.Object] = null
  ): ApnsPayload = {
    val __obj = js.Dynamic.literal(aps = aps)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ApnsPayload]
  }
}

