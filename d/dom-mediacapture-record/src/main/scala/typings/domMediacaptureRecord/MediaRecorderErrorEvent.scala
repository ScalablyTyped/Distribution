package typings.domMediacaptureRecord

import typings.std.DOMException
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaRecorderErrorEvent")
@js.native
class MediaRecorderErrorEvent protected () extends Event_ {
  def this(`type`: String, eventInitDict: MediaRecorderErrorEventInit) = this()
  val error: DOMException = js.native
}

