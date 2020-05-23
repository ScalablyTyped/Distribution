package typings.domMediacaptureRecord

import typings.std.Blob
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlobEvent extends Event {
  val data: Blob = js.native
  val timecode: Double = js.native
}

