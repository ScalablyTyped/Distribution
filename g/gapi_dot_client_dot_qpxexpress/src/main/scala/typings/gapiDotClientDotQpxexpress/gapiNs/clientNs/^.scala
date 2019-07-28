package typings.gapiDotClientDotQpxexpress.gapiNs.clientNs

import typings.gapiDotClientDotQpxexpress.gapiDotClientDotQpxexpressStrings.qpxexpress
import typings.gapiDotClientDotQpxexpress.gapiDotClientDotQpxexpressStrings.v1
import typings.gapiDotClientDotQpxexpress.gapiNs.clientNs.qpxexpressNs.TripsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val trips: TripsResource = js.native
  /** Load QPX Express API v1 */
  def load(name: qpxexpress, version: v1): js.Thenable[Unit] = js.native
  def load(name: qpxexpress, version: v1, callback: js.Function0[_]): Unit = js.native
}

