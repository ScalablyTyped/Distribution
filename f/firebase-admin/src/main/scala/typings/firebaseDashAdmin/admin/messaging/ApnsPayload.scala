package typings.firebaseDashAdmin.admin.messaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the payload of an APNs message. Mainly consists of the `aps`
  * dictionary. But may also contain other arbitrary custom keys.
  */
trait ApnsPayload
  extends /* customData */ StringDictionary[js.Object] {
  /**
    * The `aps` dictionary to be included in the message.
    */
  var aps: Aps
}

object ApnsPayload {
  @scala.inline
  def apply(aps: Aps, StringDictionary: /* customData */ StringDictionary[js.Object] = null): ApnsPayload = {
    val __obj = js.Dynamic.literal(aps = aps.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ApnsPayload]
  }
}

