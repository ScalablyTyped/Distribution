package typings
package atFirebaseDatabaseLib.distSrcCoreRepoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/Repo", "Repo")
@js.native
class Repo protected () extends js.Object {
  /**
    * @param {!RepoInfo} repoInfo_
    * @param {boolean} forceRestClient
    * @param {!FirebaseApp} app
    */
  def this(`repoInfo_`: atFirebaseDatabaseLib.distSrcCoreRepoInfoMod.RepoInfo, forceRestClient: scala.Boolean, app: atFirebaseAppDashTypesLib.appDashTypesMod.FirebaseApp) = this()
  var __database: js.Any = js.native
  var `abortTransactions_`: js.Any = js.native
  var app: atFirebaseAppDashTypesLib.appDashTypesMod.FirebaseApp = js.native
  var dataUpdateCount: scala.Double = js.native
  val database: atFirebaseDatabaseLib.distSrcApiDatabaseMod.Database = js.native
  var `eventQueue_`: js.Any = js.native
  var `infoData_`: js.Any = js.native
  var `infoSyncTree_`: js.Any = js.native
  var `interceptServerDataCallback_`: js.Any = js.native
  var `nextWriteId_`: js.Any = js.native
  var `onDisconnect_`: js.Any = js.native
  /**
    * TODO: This should be @private but it's used by test_access.js and internal.js
    * @type {?PersistentConnection}
    */
  var `persistentConnection_`: atFirebaseDatabaseLib.distSrcCorePersistentConnectionMod.PersistentConnection | scala.Null = js.native
  var `repoInfo_`: atFirebaseDatabaseLib.distSrcCoreRepoInfoMod.RepoInfo = js.native
  var `rerunTransactions_`: js.Any = js.native
  var `serverSyncTree_`: js.Any = js.native
  var `server_`: js.Any = js.native
  var `statsListener_`: js.Any = js.native
  var `statsReporter_`: js.Any = js.native
  var `stats_`: js.Any = js.native
  var `transactions_init_`: js.Any = js.native
  /**
    * @param {!Query} query
    * @param {!EventRegistration} eventRegistration
    */
  def addEventCallbackForQuery(
    query: atFirebaseDatabaseLib.distSrcApiQueryMod.Query,
    eventRegistration: atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod.EventRegistration
  ): scala.Unit = js.native
  /**
    * @param {?function(?Error, *=)} callback
    * @param {!string} status
    * @param {?string=} errorReason
    */
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
    * @return {!Object}
    */
  def generateServerValues(): js.Object = js.native
  /**
    * @return {!number}
    * @private
    */
  /* private */ def `getNextWriteId_`(): js.Any = js.native
  def `interceptServerData_`(): scala.Unit = js.native
  /**
    * TODO: This should be @private but it's used by test_access.js and internal.js
    * @param {?function(!string, *):*} callback
    * @private
    */
  def `interceptServerData_`(callback: js.Function2[/* a */ java.lang.String, /* b */ js.Any, _]): scala.Unit = js.native
  def interrupt(): scala.Unit = js.native
  /**
    * @param {...*} var_args
    * @private
    */
  /* private */ def `log_`(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param var_args because its type <none> is not an array type */ var_args: js.Any
  ): js.Any = js.native
  /**
    * @return {!string} The namespace represented by the repo.
    */
  def name(): java.lang.String = js.native
  /**
    * @param {!boolean} connectStatus
    * @private
    */
  /* private */ def `onConnectStatus_`(connectStatus: js.Any): js.Any = js.native
  /**
    * Called by realtime when we get new messages from the server.
    *
    * @private
    * @param {string} pathString
    * @param {*} data
    * @param {boolean} isMerge
    * @param {?number} tag
    */
  /* private */ def `onDataUpdate_`(pathString: js.Any, data: js.Any, isMerge: js.Any, tag: js.Any): js.Any = js.native
  def onDisconnectCancel(path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path): scala.Unit = js.native
  /**
    * @param {!Path} path
    * @param {?function(?Error, *=)} onComplete
    */
  def onDisconnectCancel(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    onComplete: js.Function2[
      /* status */ stdLib.Error | scala.Null, 
      /* errorReason */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def onDisconnectSet(path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path, value: js.Any): scala.Unit = js.native
  /**
    * @param {!Path} path
    * @param {*} value
    * @param {?function(?Error, *=)} onComplete
    */
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
  /**
    * @param {!Path} path
    * @param {*} value
    * @param {*} priority
    * @param {?function(?Error, *=)} onComplete
    */
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
  /**
    * @param {!Path} path
    * @param {*} childrenToMerge
    * @param {?function(?Error, *=)} onComplete
    */
  def onDisconnectUpdate(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    childrenToMerge: org.scalablytyped.runtime.StringDictionary[js.Any],
    onComplete: js.Function2[
      /* status */ stdLib.Error | scala.Null, 
      /* errorReason */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * @param {!Object} updates
    * @private
    */
  /* private */ def `onServerInfoUpdate_`(updates: js.Any): js.Any = js.native
  /**
    * @param {!Query} query
    * @param {?EventRegistration} eventRegistration
    */
  def removeEventCallbackForQuery(
    query: atFirebaseDatabaseLib.distSrcApiQueryMod.Query,
    eventRegistration: atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod.EventRegistration
  ): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  /**
    * Applies all of the changes stored up in the onDisconnect_ tree.
    * @private
    */
  /* private */ def `runOnDisconnectEvents_`(): js.Any = js.native
  /**
    * @return {!number} The time in milliseconds, taking the server offset into account if we have one.
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
  /**
    * @param {!Path} path
    * @param {*} newVal
    * @param {number|string|null} newPriority
    * @param {?function(?Error, *=)} onComplete
    */
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
  /**
    * @param {!Path} path
    * @param {!Object} childrenToMerge
    * @param {?function(?Error, *=)} onComplete
    */
  def update(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    childrenToMerge: org.scalablytyped.runtime.StringDictionary[js.Any],
    onComplete: js.Function2[
      /* status */ stdLib.Error | scala.Null, 
      /* errorReason */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    *
    * @param {!string} pathString
    * @param {*} value
    * @private
    */
  /* private */ def `updateInfo_`(pathString: js.Any, value: js.Any): js.Any = js.native
}

