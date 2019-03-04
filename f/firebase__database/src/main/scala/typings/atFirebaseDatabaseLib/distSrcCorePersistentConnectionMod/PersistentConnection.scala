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
  def this(repoInfo_ : atFirebaseDatabaseLib.distSrcCoreRepoInfoMod.RepoInfo, onDataUpdate_ : js.Function4[
      /* a */ java.lang.String, 
      /* b */ js.Any, 
      /* c */ scala.Boolean, 
      /* d */ scala.Double | scala.Null, 
      scala.Unit
    ], onConnectStatus_ : js.Function1[/* a */ scala.Boolean, scala.Unit], onServerInfoUpdate_ : js.Function1[/* a */ js.Any, scala.Unit], authTokenProvider_ : atFirebaseDatabaseLib.distSrcCoreAuthTokenProviderMod.AuthTokenProvider) = this()
  def this(repoInfo_ : atFirebaseDatabaseLib.distSrcCoreRepoInfoMod.RepoInfo, onDataUpdate_ : js.Function4[
      /* a */ java.lang.String, 
      /* b */ js.Any, 
      /* c */ scala.Boolean, 
      /* d */ scala.Double | scala.Null, 
      scala.Unit
    ], onConnectStatus_ : js.Function1[/* a */ scala.Boolean, scala.Unit], onServerInfoUpdate_ : js.Function1[/* a */ js.Any, scala.Unit], authTokenProvider_ : atFirebaseDatabaseLib.distSrcCoreAuthTokenProviderMod.AuthTokenProvider, authOverride_ : js.Object) = this()
  var authOverride_ : js.UndefOr[js.Any] = js.native
  var authTokenProvider_ : js.Any = js.native
  /** @private {string|null} */
  var authToken_ : js.Any = js.native
  var cancelSentTransactions_ : js.Any = js.native
  var connected_ : js.Any = js.native
  /** @private {number|null} */
  var establishConnectionTimer_ : js.Any = js.native
  var establishConnection_ : js.Any = js.native
  var firstConnection_ : js.Any = js.native
  var forceTokenRefresh_ : js.Any = js.native
  var handleTimestamp_ : js.Any = js.native
  var id: scala.Double = js.native
  /** @private {Object} */
  var interruptReasons_ : js.Any = js.native
  var invalidAuthTokenCount_ : js.Any = js.native
  var lastConnectionAttemptTime_ : js.Any = js.native
  var lastConnectionEstablishedTime_ : js.Any = js.native
  var lastSessionId: java.lang.String | scala.Null = js.native
  var listens_ : js.Any = js.native
  var log_ : js.Any = js.native
  var maxReconnectDelay_ : js.Any = js.native
  var onAuthRevoked_ : js.Any = js.native
  var onConnectStatus_ : js.Any = js.native
  /**
    * @param {*} message
    * @private
    */
  var onDataMessage_ : js.Any = js.native
  var onDataPush_ : js.Any = js.native
  var onDataUpdate_ : js.Any = js.native
  var onDisconnectRequestQueue_ : js.Any = js.native
  /**
    * @param {!string} pathString
    * @param {Array.<*>=} query
    * @private
    */
  var onListenRevoked_ : js.Any = js.native
  var onOnline_ : js.Any = js.native
  var onReady_ : js.Any = js.native
  var onRealtimeDisconnect_ : js.Any = js.native
  var onSecurityDebugPacket_ : js.Any = js.native
  var onServerInfoUpdate_ : js.Any = js.native
  /**
    * @param {boolean} visible
    * @private
    */
  var onVisible_ : js.Any = js.native
  var outstandingPutCount_ : js.Any = js.native
  var outstandingPuts_ : js.Any = js.native
  /** @private {?{
    *   sendRequest(Object),
    *   close()
    * }} */
  var realtime_ : js.Any = js.native
  var reconnectDelay_ : js.Any = js.native
  /**
    * @param {!string} credential
    * @private
    */
  var reduceReconnectDelayIfAdminCredential_ : js.Any = js.native
  /**
    * @param {!string} pathString
    * @param {!string} queryId
    * @return {{queries:Array.<Query>, onComplete:function(string)}}
    * @private
    */
  var removeListen_ : js.Any = js.native
  var repoInfo_ : js.Any = js.native
  var requestCBHash_ : js.Any = js.native
  var requestNumber_ : js.Any = js.native
  var restoreState_ : js.Any = js.native
  var scheduleConnect_ : js.Any = js.native
  var securityDebugCallback_ : js.Any = js.native
  /**
    * Sends client stats for first connection
    * @private
    */
  var sendConnectStats_ : js.Any = js.native
  /**
    * @param {!{onComplete(),
    *           hashFn():!string,
    *           query: !Query,
    *           tag: ?number}} listenSpec
    * @private
    */
  var sendListen_ : js.Any = js.native
  var sendOnDisconnect_ : js.Any = js.native
  var sendPut_ : js.Any = js.native
  var sendUnlisten_ : js.Any = js.native
  /**
    * @return {boolean}
    * @private
    */
  var shouldReconnect_ : js.Any = js.native
  /** @private {boolean} */
  var visible_ : js.Any = js.native
  /**
    * @param {string} reason
    */
  def interrupt(reason: java.lang.String): scala.Unit = js.native
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
    * @param {string} reason
    */
  def resume(reason: java.lang.String): scala.Unit = js.native
  /**
    * @param {!string} action
    * @param {*} body
    * @param {function(*)=} onResponse
    * @protected
    */
  /* protected */ def sendRequest(action: java.lang.String, body: js.Any): scala.Unit = js.native
  /* protected */ def sendRequest(action: java.lang.String, body: js.Any, onResponse: js.Function1[/* a */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Attempts to authenticate with the given credentials. If the authentication attempt fails, it's triggered like
    * a auth revoked (the connection is closed).
    */
  def tryAuth(): scala.Unit = js.native
}

/* static members */
@JSImport("@firebase/database/dist/src/core/PersistentConnection", "PersistentConnection")
@js.native
object PersistentConnection extends js.Object {
  /**
    * Counter for number of connections created. Mainly used for tagging in the logs
    * @type {number}
    * @private
    */
  var nextConnectionId_ : js.Any = js.native
  /**
    * @private
    */
  var nextPersistentConnectionId_ : js.Any = js.native
  /**
    * @param {*} payload
    * @param {!Query} query
    * @private
    */
  var warnOnListenWarnings_ : js.Any = js.native
}

