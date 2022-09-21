package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cat extends StObject {
  
  def aliases(params: CatAliasesParams): js.Promise[Any] = js.native
  def aliases(params: CatAliasesParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
  
  def allocation(params: CatAllocationParams): js.Promise[Any] = js.native
  def allocation(params: CatAllocationParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
  
  def count(params: CatAllocationParams): js.Promise[Any] = js.native
  def count(params: CatCountParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
  
  def fielddata(params: CatFielddataParams): js.Promise[Any] = js.native
  def fielddata(params: CatFielddataParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
  
  def health(params: CatHealthParams): js.Promise[Any] = js.native
  def health(params: CatHealthParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
  
  def help(params: CatHelpParams): js.Promise[Any] = js.native
  def help(params: CatHelpParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
  
  def indices(params: CatIndicesParams): js.Promise[Any] = js.native
  def indices(params: CatIndicesParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
  
  def master(params: CatCommonParams): js.Promise[Any] = js.native
  def master(params: CatCommonParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
  
  def nodeattrs(params: CatCommonParams): js.Promise[Any] = js.native
  def nodeattrs(params: CatCommonParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
  
  def nodes(params: CatCommonParams): js.Promise[Any] = js.native
  def nodes(params: CatCommonParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
  
  def pendingTasks(params: CatCommonParams): js.Promise[Any] = js.native
  def pendingTasks(params: CatCommonParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
  
  def plugins(params: CatCommonParams): js.Promise[Any] = js.native
  def plugins(params: CatCommonParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
  
  def recovery(params: CatRecoveryParams): js.Promise[Any] = js.native
  def recovery(params: CatRecoveryParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
  
  def repositories(params: CatCommonParams): js.Promise[Any] = js.native
  def repositories(params: CatCommonParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
  
  def segments(params: CatSegmentsParams): js.Promise[Any] = js.native
  def segments(params: CatSegmentsParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
  
  def shards(params: CatShardsParams): js.Promise[Any] = js.native
  def shards(params: CatShardsParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
  
  def snapshots(params: CatSnapshotsParams): js.Promise[Any] = js.native
  def snapshots(params: CatSnapshotsParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
  
  def tasks(params: CatTasksParams): js.Promise[Any] = js.native
  def tasks(params: CatTasksParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
  
  def threadPool(params: CatThreadPoolParams): js.Promise[Any] = js.native
  def threadPool(params: CatThreadPoolParams, callback: js.Function2[/* error */ Any, /* response */ Any, Unit]): Unit = js.native
}
