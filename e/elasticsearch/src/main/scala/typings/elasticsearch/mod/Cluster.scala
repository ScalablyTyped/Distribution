package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  def allocationExplain(params: ClusterAllocationExplainParams): js.Promise[_] = js.native
  def allocationExplain(
    params: ClusterAllocationExplainParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  def getSettings(params: ClusterGetSettingsParams): js.Promise[_] = js.native
  def getSettings(
    params: ClusterGetSettingsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  def health(params: ClusterHealthParams): js.Promise[_] = js.native
  def health(
    params: ClusterHealthParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  def pendingTasks(params: ClusterPendingTasksParams): js.Promise[_] = js.native
  def pendingTasks(
    params: ClusterPendingTasksParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  def putSettings(params: ClusterPutSettingsParams): js.Promise[_] = js.native
  def putSettings(
    params: ClusterPutSettingsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  def reroute(params: ClusterRerouteParams): js.Promise[_] = js.native
  def reroute(
    params: ClusterRerouteParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  def state(params: ClusterStateParams): js.Promise[_] = js.native
  def state(
    params: ClusterStateParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  def stats(params: ClusterStatsParams): js.Promise[_] = js.native
  def stats(
    params: ClusterStatsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
}

