package typings.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTarget

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonStandardEvent
  extends /* key */ StringDictionary[js.Any]
     with _EventData[js.Any, js.Any, js.Any] {
  var `type`: String
}

object NonStandardEvent {
  @scala.inline
  def apply(`type`: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): NonStandardEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NonStandardEvent]
  }
}

