package typings.domDashMediacaptureDashRecord

import typings.std.DOMException
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaRecorderErrorEvent")
@js.native
class MediaRecorderErrorEvent protected () extends Event {
  def this(`type`: String, eventInitDict: MediaRecorderErrorEventInit) = this()
  val error: DOMException = js.native
}

