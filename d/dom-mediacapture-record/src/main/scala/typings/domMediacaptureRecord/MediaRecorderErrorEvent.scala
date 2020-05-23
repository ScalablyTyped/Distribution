package typings.domMediacaptureRecord

import typings.std.DOMException
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaRecorderErrorEvent extends Event {
  val error: DOMException = js.native
}

