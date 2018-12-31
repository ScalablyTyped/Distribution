package typings
package atFirebaseDatabaseLib.distSrcCorePersistentConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/PersistentConnection", "PersistentConnection")
@js.native
class PersistentConnection protected ()
  extends atFirebaseDatabaseLib.distSrcCoreServerActionsMod.ServerActions {
  /**
    * @implements {ServerActions}
    * @param {!RepoInfo} repoInfo_ Data about the namespace we are connecting to
    * @param {function(string, *, boolean, ?number)} onDataUpdate_ A callback for new data from the server
    * @param onConnectStatus_
    * @param onServerInfoUpdate_
    * @param authTokenProvider_
    * @param authOverride_
    */
  def this(`repoInfo_`: atFirebaseDatabaseLib.distSrcCoreRepoInfoMod.RepoInfo, `onDataUpdate_`: js.Function4[
      /* a */ java.lang.String, 
      /* b */ js.Any, 
      /* c */ scala.Boolean, 
      /* d */ scala.Double | scala.Null, 
      scala.Unit
    ], `onConnectStatus_`: js.Function1[/* a */ scala.Boolean, scala.Unit], `onServerInfoUpdate_`: js.Function1[/* a */ js.Any, scala.Unit], `authTokenProvider_`: atFirebaseDatabaseLib.distSrcCoreAuthTokenProviderMod.AuthTokenProvider) = this()
  def this(`repoInfo_`: atFirebaseDatabaseLib.distSrcCoreRepoInfoMod.RepoInfo, `onDataUpdate_`: js.Function4[
      /* a */ java.lang.String, 
      /* b */ js.Any, 
      /* c */ scala.Boolean, 
      /* d */ scala.Double | scala.Null, 
      scala.Unit
    ], `onConnectStatus_`: js.Function1[/* a */ scala.Boolean, scala.Unit], `onServerInfoUpdate_`: js.Function1[/* a */ js.Any, scala.Unit], `authTokenProvider_`: atFirebaseDatabaseLib.distSrcCoreAuthTokenProviderMod.AuthTokenProvider, `authOverride_`: js.Object) = this()
  var `authOverride_`: js.Any = js.native
  var `authTokenProvider_`: js.Any = js.native
  /** @private {string|null} */
  var `authToken_`: js.Any = js.native
  var `connected_`: js.Any = js.native
  /** @private {number|null} */
  var `establishConnectionTimer_`: js.Any = js.native
  var `firstConnection_`: js.Any = js.native
  var `forceTokenRefresh_`: js.Any = js.native
  var id: scala.Double = js.native
  /** @private {Object} */
  var `interruptReasons_`: js.Any = js.native
  var `invalidAuthTokenCount_`: js.Any = js.native
  var `lastConnectionAttemptTime_`: js.Any = js.native
  var `lastConnectionEstablishedTime_`: js.Any = js.native
  var lastSessionId: java.lang.String | scala.Null = js.native
  var `listens_`: js.Any = js.native
  var `log_`: js.Any = js.native
  var `maxReconnectDelay_`: js.Any = js.native
  var `onConnectStatus_`: js.Any = js.native
  var `onDataUpdate_`: js.Any = js.native
  var `onDisconnectRequestQueue_`: js.Any = js.native
  var `onServerInfoUpdate_`: js.Any = js.native
  var `outstandingPutCount_`: js.Any = js.native
  var `outstandingPuts_`: js.Any = js.native
  /** @private {?{
    *   sendRequest(Object),
    *   close()
    * }} */
  var `realtime_`: js.Any = js.native
  var `reconnectDelay_`: js.Any = js.native
  var `repoInfo_`: js.Any = js.native
  var `requestCBHash_`: js.Any = js.native
  var `requestNumber_`: js.Any = js.native
  var `securityDebugCallback_`: js.Any = js.native
  /** @private {boolean} */
  var `visible_`: js.Any = js.native
  /* private */ def `cancelSentTransactions_`(): js.Any = js.native
  /* private */ def `establishConnection_`(): js.Any = js.native
  /* private */ def `handleTimestamp_`(timestamp: js.Any): js.Any = js.native
  /**
    * @param {string} reason
    */
  def interrupt(reason: java.lang.String): scala.Unit = js.native
  /* private */ def `onAuthRevoked_`(statusCode: js.Any, explanation: js.Any): js.Any = js.native
  /**
    * @param {*} message
    * @private
    */
  /* private */ def `onDataMessage_`(message: js.Any): js.Any = js.native
  /* private */ def `onDataPush_`(action: js.Any, body: js.Any): js.Any = js.native
  /**
    * @param {!string} pathString
    * @param {Array.<*>=} query
    * @private
    */
  /* private */ def `onListenRevoked_`(pathString: js.Any): js.Any = js.native
  /* private */ def `onListenRevoked_`(pathString: js.Any, query: js.Any): js.Any = js.native
  /* private */ def `onOnline_`(online: js.Any): js.Any = js.native
  /* private */ def `onReady_`(timestamp: js.Any, sessionId: js.Any): js.Any = js.native
  /* private */ def `onRealtimeDisconnect_`(): js.Any = js.native
  /* private */ def `onSecurityDebugPacket_`(body: js.Any): js.Any = js.native
  /**
    * @param {boolean} visible
    * @private
    */
  /* private */ def `onVisible_`(visible: js.Any): js.Any = js.native
  def putInternal(
    action: java.lang.String,
    pathString: java.lang.String,
    data: js.Any,
    onComplete: js.Function2[/* a */ java.lang.String, /* b */ java.lang.String | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def putInternal(
    action: java.lang.String,
    pathString: java.lang.String,
    data: js.Any,
    onComplete: js.Function2[/* a */ java.lang.String, /* b */ java.lang.String | scala.Null, scala.Unit],
    hash: java.lang.String
  ): scala.Unit = js.native
  /**
    * @param {!string} credential
    * @private
    */
  /* private */ def `reduceReconnectDelayIfAdminCredential_`(credential: js.Any): js.Any = js.native
  /**
    * @param {!string} pathString
    * @param {!string} queryId
    * @return {{queries:Array.<Query>, onComplete:function(string)}}
    * @private
    */
  /* private */ def `removeListen_`(pathString: js.Any, queryId: js.Any): js.Any = js.native
  /* private */ def `restoreState_`(): js.Any = js.native
  /**
    * @param {string} reason
    */
  def resume(reason: java.lang.String): scala.Unit = js.native
  /* private */ def `scheduleConnect_`(timeout: js.Any): js.Any = js.native
  /**
    * Sends client stats for first connection
    * @private
    */
  /* private */ def `sendConnectStats_`(): js.Any = js.native
  /**
    * @param {!{onComplete(),
    *           hashFn():!string,
    *           query: !Query,
    *           tag: ?number}} listenSpec
    * @private
    */
  /* private */ def `sendListen_`(listenSpec: js.Any): js.Any = js.native
  /* private */ def `sendOnDisconnect_`(action: js.Any, pathString: js.Any, data: js.Any, onComplete: js.Any): js.Any = js.native
  /* private */ def `sendPut_`(index: js.Any): js.Any = js.native
  /**
    * @param {!string} action
    * @param {*} body
    * @param {function(*)=} onResponse
    * @protected
    */
  /* protected */ def sendRequest(action: java.lang.String, body: js.Any): scala.Unit = js.native
  /* protected */ def sendRequest(action: java.lang.String, body: js.Any, onResponse: js.Function1[/* a */ js.Any, scala.Unit]): scala.Unit = js.native
  /* private */ def `sendUnlisten_`(pathString: js.Any, queryId: js.Any, queryObj: js.Any, tag: js.Any): js.Any = js.native
  /**
    * @return {boolean}
    * @private
    */
  /* private */ def `shouldReconnect_`(): js.Any = js.native
  /**
    * Attempts to authenticate with the given credentials. If the authentication attempt fails, it's triggered like
    * a auth revoked (the connection is closed).
    */
  def tryAuth(): scala.Unit = js.native
}

@JSImport("@firebase/database/dist/src/core/PersistentConnection", "PersistentConnection")
@js.native
object PersistentConnection extends js.Object {
  /**
    * Counter for number of connections created. Mainly used for tagging in the logs
    * @type {number}
    * @private
    */
  var `nextConnectionId_`: js.Any = js.native
  /**
    * @private
    */
  var `nextPersistentConnectionId_`: js.Any = js.native
  /**
    * @param {*} payload
    * @param {!Query} query
    * @private
    */
  /* private */ def `warnOnListenWarnings_`(payload: js.Any, query: js.Any): js.Any = js.native
}

