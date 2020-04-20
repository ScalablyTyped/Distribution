package typings.detectIt.mod

import typings.detectHover.mod.detectHover
import typings.detectPassiveEvents.mod.detectPassiveEvents
import typings.detectPointer.mod.detectPointer
import typings.detectTouchEvents.mod.detectTouchEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait state extends js.Object {
  var detectHover: typings.detectHover.mod.detectHover
  var detectPassiveEvents: typings.detectPassiveEvents.mod.detectPassiveEvents
  var detectPointer: typings.detectPointer.mod.detectPointer
  var detectTouchEvents: typings.detectTouchEvents.mod.detectTouchEvents
}

object state {
  @scala.inline
  def apply(
    detectHover: detectHover,
    detectPassiveEvents: detectPassiveEvents,
    detectPointer: detectPointer,
    detectTouchEvents: detectTouchEvents
  ): state = {
    val __obj = js.Dynamic.literal(detectHover = detectHover.asInstanceOf[js.Any], detectPassiveEvents = detectPassiveEvents.asInstanceOf[js.Any], detectPointer = detectPointer.asInstanceOf[js.Any], detectTouchEvents = detectTouchEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[state]
  }
}

