package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemsResource extends js.Object {
  /** Leases a dataflow WorkItem to run. */
  def lease(request: gapiDotClientDotDataflowLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[LeaseWorkItemResponse] = js.native
  /** Leases a dataflow WorkItem to run. */
  def lease(request: gapiDotClientDotDataflowLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[LeaseWorkItemResponse] = js.native
  /** Reports the status of dataflow WorkItems leased by a worker. */
  def reportStatus(request: gapiDotClientDotDataflowLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ReportWorkItemStatusResponse] = js.native
  /** Reports the status of dataflow WorkItems leased by a worker. */
  def reportStatus(request: gapiDotClientDotDataflowLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[ReportWorkItemStatusResponse] = js.native
}

