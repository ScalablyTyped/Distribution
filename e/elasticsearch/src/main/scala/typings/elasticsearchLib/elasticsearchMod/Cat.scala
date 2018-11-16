package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cat extends js.Object {
  def aliases(params: CatAliasesParams): stdLib.Promise[_] = js.native
  def aliases(
    params: CatAliasesParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def allocation(params: CatAllocationParams): stdLib.Promise[_] = js.native
  def allocation(
    params: CatAllocationParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def count(params: CatAllocationParams): stdLib.Promise[_] = js.native
  def count(
    params: CatCountParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def fielddata(params: CatFielddataParams): stdLib.Promise[_] = js.native
  def fielddata(
    params: CatFielddataParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def health(params: CatHealthParams): stdLib.Promise[_] = js.native
  def health(
    params: CatHealthParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def help(params: CatHelpParams): stdLib.Promise[_] = js.native
  def help(
    params: CatHelpParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def indices(params: CatIndicesParams): stdLib.Promise[_] = js.native
  def indices(
    params: CatIndicesParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def master(params: CatCommonParams): stdLib.Promise[_] = js.native
  def master(
    params: CatCommonParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def nodeattrs(params: CatCommonParams): stdLib.Promise[_] = js.native
  def nodeattrs(
    params: CatCommonParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def nodes(params: CatCommonParams): stdLib.Promise[_] = js.native
  def nodes(
    params: CatCommonParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def pendingTasks(params: CatCommonParams): stdLib.Promise[_] = js.native
  def pendingTasks(
    params: CatCommonParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def plugins(params: CatCommonParams): stdLib.Promise[_] = js.native
  def plugins(
    params: CatCommonParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def recovery(params: CatRecoveryParams): stdLib.Promise[_] = js.native
  def recovery(
    params: CatRecoveryParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def repositories(params: CatCommonParams): stdLib.Promise[_] = js.native
  def repositories(
    params: CatCommonParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def segments(params: CatSegmentsParams): stdLib.Promise[_] = js.native
  def segments(
    params: CatSegmentsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def shards(params: CatShardsParams): stdLib.Promise[_] = js.native
  def shards(
    params: CatShardsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def snapshots(params: CatSnapshotsParams): stdLib.Promise[_] = js.native
  def snapshots(
    params: CatSnapshotsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def tasks(params: CatTasksParams): stdLib.Promise[_] = js.native
  def tasks(
    params: CatTasksParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def threadPool(params: CatThreadPoolParams): stdLib.Promise[_] = js.native
  def threadPool(
    params: CatThreadPoolParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

