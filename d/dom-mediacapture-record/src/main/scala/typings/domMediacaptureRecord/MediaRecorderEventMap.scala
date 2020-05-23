package typings.domMediacaptureRecord

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRecorderEventMap extends js.Object {
  var dataavailable: BlobEvent
  var error: MediaRecorderErrorEvent
  var pause: Event
  var resume: Event
  var start: Event
  var stop: Event
}

object MediaRecorderEventMap {
  @scala.inline
  def apply(
    dataavailable: BlobEvent,
    error: MediaRecorderErrorEvent,
    pause: Event,
    resume: Event,
    start: Event,
    stop: Event
  ): MediaRecorderEventMap = {
    val __obj = js.Dynamic.literal(dataavailable = dataavailable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRecorderEventMap]
  }
}

