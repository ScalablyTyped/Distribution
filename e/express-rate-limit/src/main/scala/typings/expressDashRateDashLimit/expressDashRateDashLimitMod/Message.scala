package typings.expressDashRateDashLimit.expressDashRateDashLimitMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message
  extends /* key */ StringDictionary[js.Any] {
  var message: String
  var status: Double
}

object Message {
  @scala.inline
  def apply(message: String, status: Double, StringDictionary: /* key */ StringDictionary[js.Any] = null): Message = {
    val __obj = js.Dynamic.literal(message = message, status = status)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Message]
  }
}

