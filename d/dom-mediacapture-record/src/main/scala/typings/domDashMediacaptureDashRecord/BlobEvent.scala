package typings.domDashMediacaptureDashRecord

import typings.std.Blob
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BlobEvent")
@js.native
class BlobEvent protected () extends Event {
  def this(`type`: String, eventInitDict: BlobEventInit) = this()
  val data: Blob = js.native
  val timecode: Double = js.native
}

