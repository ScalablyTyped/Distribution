package typings.expo

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var errorRecovery: js.UndefOr[js.Any] = js.undefined
  var notification: js.UndefOr[js.Any] = js.undefined
}

object AnonDictkey {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    errorRecovery: js.Any = null,
    notification: js.Any = null
  ): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (errorRecovery != null) __obj.updateDynamic("errorRecovery")(errorRecovery.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
}

