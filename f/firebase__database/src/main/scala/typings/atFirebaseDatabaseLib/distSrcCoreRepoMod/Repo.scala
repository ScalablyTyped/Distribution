package typings
package atFirebaseDatabaseLib.distSrcCoreRepoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/Repo", "Repo")
@js.native
class Repo protected () extends js.Object {
  def this(repoInfo_ : atFirebaseDatabaseLib.distSrcCoreRepoInfoMod.RepoInfo, forceRestClient: scala.Boolean, app: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FirebaseApp */ js.Any) = this()
  var __database: js.Any = js.native
  var abortTransactions_ : js.Any = js.native
  var app: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FirebaseApp */ js.Any = js.native
  var dataUpdateCount: scala.Double = js.native
  val database: atFirebaseDatabaseLib.distSrcApiDatabaseMod.Database = js.native
  var eventQueue_ : js.Any = js.native
  var getNextWriteId_ : js.Any = js.native
  var infoData_ : js.Any = js.native
  var infoSyncTree_ : js.Any = js.native
  var interceptServerDataCallback_ : js.Any = js.native
  var log_ : js.Any = js.native
  var nextWriteId_ : js.Any = js.native
  var onConnectStatus_ : js.Any = js.native
  /**
    * Called by realtime when we get new messages from the server.
    */
  var onDataUpdate_ : js.Any = js.native
  /** A list of data pieces and paths to be set when this client disconnects. */
  var onDisconnect_ : js.Any = js.native
  var onServerInfoUpdate_ : js.Any = js.native
  var persistentConnection_ : atFirebaseDatabaseLib.distSrcCorePersistentConnectionMod.PersistentConnection | scala.Null = js.native
  var repoInfo_ : atFirebaseDatabaseLib.distSrcCoreRepoInfoMod.RepoInfo = js.native
  var rerunTransactions_ : js.Any = js.native
  /**
    * Applies all of the changes stored up in the onDisconnect_ tree.
    */
  var runOnDisconnectEvents_ : js.Any = js.native
  var serverSyncTree_ : js.Any = js.native
  var server_ : js.Any = js.native
  var statsListener_ : js.Any = js.native
  var statsReporter_ : js.Any = js.native
  var stats_ : js.Any = js.native
  var transactions_init_ : js.Any = js.native
  var updateInfo_ : js.Any = js.native
  def addEventCallbackForQuery(
    query: atFirebaseDatabaseLib.distSrcApiQueryMod.Query,
    eventRegistration: atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod.EventRegistration
  ): scala.Unit = js.native
  def callOnCompleteCallback(
    callback: js.Function2[
      /* status */ stdLib.Error | scala.Null, 
      /* errorReason */ js.UndefOr[java.lang.String], 
      scala.Unit
    ],
    status: java.lang.String
  ): scala.Unit = js.native
  def callOnCompleteCallback(
    callback: js.Function2[
      /* status */ stdLib.Error | scala.Null, 
      /* errorReason */ js.UndefOr[java.lang.String], 
      scala.Unit
    ],
    status: java.lang.String,
    errorReason: java.lang.String
  ): scala.Unit = js.native
  def callOnCompleteCallback(callback: scala.Null, status: java.lang.String): scala.Unit = js.native
  def callOnCompleteCallback(callback: scala.Null, status: java.lang.String, errorReason: java.lang.String): scala.Unit = js.native
  /**
    * Generate ServerValues using some variables from the repo object.
    */
  def generateServerValues(): js.Object = js.native
  def interceptServerData_(): scala.Unit = js.native
  def interceptServerData_(callback: js.Function2[/* a */ java.lang.String, /* b */ js.Any, _]): scala.Unit = js.native
  def interrupt(): scala.Unit = js.native
  /**
    * @return The namespace represented by the repo.
    */
  def name(): java.lang.String = js.native
  def onDisconnectCancel(path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path): scala.Unit = js.native
  def onDisconnectCancel(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    onComplete: js.Function2[
      /* status */ stdLib.Error | scala.Null, 
      /* errorReason */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def onDisconnectSet(path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path, value: js.Any): scala.Unit = js.native
  def onDisconnectSet(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    value: js.Any,
    onComplete: js.Function2[
      /* status */ stdLib.Error | scala.Null, 
      /* errorReason */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def onDisconnectSetWithPriority(path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path, value: js.Any, priority: js.Any): scala.Unit = js.native
  def onDisconnectSetWithPriority(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    value: js.Any,
    priority: js.Any,
    onComplete: js.Function2[
      /* status */ stdLib.Error | scala.Null, 
      /* errorReason */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def onDisconnectUpdate(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    childrenToMerge: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def onDisconnectUpdate(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    childrenToMerge: org.scalablytyped.runtime.StringDictionary[js.Any],
    onComplete: js.Function2[
      /* status */ stdLib.Error | scala.Null, 
      /* errorReason */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def removeEventCallbackForQuery(
    query: atFirebaseDatabaseLib.distSrcApiQueryMod.Query,
    eventRegistration: atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod.EventRegistration
  ): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  /**
    * @return The time in milliseconds, taking the server offset into account if we have one.
    */
  def serverTime(): scala.Double = js.native
  def setWithPriority(path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path, newVal: js.Any): scala.Unit = js.native
  def setWithPriority(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    newVal: js.Any,
    newPriority: java.lang.String
  ): scala.Unit = js.native
  def setWithPriority(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    newVal: js.Any,
    newPriority: java.lang.String,
    onComplete: js.Function2[
      /* status */ stdLib.Error | scala.Null, 
      /* errorReason */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def setWithPriority(path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path, newVal: js.Any, newPriority: scala.Double): scala.Unit = js.native
  def setWithPriority(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    newVal: js.Any,
    newPriority: scala.Double,
    onComplete: js.Function2[
      /* status */ stdLib.Error | scala.Null, 
      /* errorReason */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def setWithPriority(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    newVal: js.Any,
    newPriority: scala.Null,
    onComplete: js.Function2[
      /* status */ stdLib.Error | scala.Null, 
      /* errorReason */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def stats(): scala.Unit = js.native
  def stats(showDelta: scala.Boolean): scala.Unit = js.native
  def statsIncrementCounter(metric: java.lang.String): scala.Unit = js.native
  def update(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    childrenToMerge: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def update(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    childrenToMerge: org.scalablytyped.runtime.StringDictionary[js.Any],
    onComplete: js.Function2[
      /* status */ stdLib.Error | scala.Null, 
      /* errorReason */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

