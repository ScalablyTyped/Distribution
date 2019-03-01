package typings
package expressDashRateDashLimitLib.expressDashRateDashLimitMod.RateLimitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var message: java.lang.String
  var status: scala.Double
}

object Message {
  @scala.inline
  def apply(
    message: java.lang.String,
    status: scala.Double,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("status")(status)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Message]
  }
}

