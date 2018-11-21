package typings
package domDashMediacaptureDashRecordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BlobEvent")
@js.native
class BlobEvent protected ()
  extends stdLib.Event {
  def this(`type`: java.lang.String, eventInitDict: BlobEventInit) = this()
  val data: stdLib.Blob = js.native
  val timecode: scala.Double = js.native
}

