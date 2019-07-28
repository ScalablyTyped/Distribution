package typings.gapiDotClientDotDoubleclickbidmanager.gapiNs.clientNs

import typings.gapiDotClientDotDoubleclickbidmanager.gapiDotClientDotDoubleclickbidmanagerStrings.doubleclickbidmanager
import typings.gapiDotClientDotDoubleclickbidmanager.gapiDotClientDotDoubleclickbidmanagerStrings.v1
import typings.gapiDotClientDotDoubleclickbidmanager.gapiNs.clientNs.doubleclickbidmanagerNs.LineitemsResource
import typings.gapiDotClientDotDoubleclickbidmanager.gapiNs.clientNs.doubleclickbidmanagerNs.QueriesResource
import typings.gapiDotClientDotDoubleclickbidmanager.gapiNs.clientNs.doubleclickbidmanagerNs.ReportsResource
import typings.gapiDotClientDotDoubleclickbidmanager.gapiNs.clientNs.doubleclickbidmanagerNs.SdfResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val lineitems: LineitemsResource = js.native
  val queries: QueriesResource = js.native
  val reports: ReportsResource = js.native
  val sdf: SdfResource = js.native
  /** Load DoubleClick Bid Manager API v1 */
  def load(name: doubleclickbidmanager, version: v1): js.Thenable[Unit] = js.native
  def load(name: doubleclickbidmanager, version: v1, callback: js.Function0[_]): Unit = js.native
}

