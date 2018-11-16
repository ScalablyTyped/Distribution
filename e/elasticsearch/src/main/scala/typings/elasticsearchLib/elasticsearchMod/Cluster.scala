package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  def allocationExplain(params: ClusterAllocationExplainParams): stdLib.Promise[_] = js.native
  def allocationExplain(
    params: ClusterAllocationExplainParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getSettings(params: ClusterGetSettingsParams): stdLib.Promise[_] = js.native
  def getSettings(
    params: ClusterGetSettingsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def health(params: ClusterHealthParams): stdLib.Promise[_] = js.native
  def health(
    params: ClusterHealthParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def pendingTasks(params: ClusterPendingTasksParams): stdLib.Promise[_] = js.native
  def pendingTasks(
    params: ClusterPendingTasksParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def putSettings(params: ClusterPutSettingsParams): stdLib.Promise[_] = js.native
  def putSettings(
    params: ClusterPutSettingsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def reroute(params: ClusterRerouteParams): stdLib.Promise[_] = js.native
  def reroute(
    params: ClusterRerouteParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def state(params: ClusterStateParams): stdLib.Promise[_] = js.native
  def state(
    params: ClusterStateParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def stats(params: ClusterStatsParams): stdLib.Promise[_] = js.native
  def stats(
    params: ClusterStatsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

