package typings.domMediacaptureRecord

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRecorderEventMap extends js.Object {
  var dataavailable: BlobEvent
  var error: MediaRecorderErrorEvent
  var pause: Event_
  var resume: Event_
  var start: Event_
  var stop: Event_
}

object MediaRecorderEventMap {
  @scala.inline
  def apply(
    dataavailable: BlobEvent,
    error: MediaRecorderErrorEvent,
    pause: Event_,
    resume: Event_,
    start: Event_,
    stop: Event_
  ): MediaRecorderEventMap = {
    val __obj = js.Dynamic.literal(dataavailable = dataavailable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaRecorderEventMap]
  }
}

