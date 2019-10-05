package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDataflow.Anon_Accesstoken
import typings.gapiDotClientDotDataflow.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemsResource extends js.Object {
  /** Leases a dataflow WorkItem to run. */
  def lease(request: Anon_Accesstoken): Request[LeaseWorkItemResponse] = js.native
  /** Leases a dataflow WorkItem to run. */
  def lease(request: Anon_AccesstokenAlt): Request[LeaseWorkItemResponse] = js.native
  /** Reports the status of dataflow WorkItems leased by a worker. */
  def reportStatus(request: Anon_Accesstoken): Request[ReportWorkItemStatusResponse] = js.native
  /** Reports the status of dataflow WorkItems leased by a worker. */
  def reportStatus(request: Anon_AccesstokenAlt): Request[ReportWorkItemStatusResponse] = js.native
}

