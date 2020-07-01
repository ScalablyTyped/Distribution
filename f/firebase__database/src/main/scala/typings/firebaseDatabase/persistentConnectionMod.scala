package typings.firebaseDatabase

import typings.firebaseDatabase.authTokenProviderMod.AuthTokenProvider
import typings.firebaseDatabase.repoInfoMod.RepoInfo
import typings.firebaseDatabase.serverActionsMod.ServerActions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/PersistentConnection", JSImport.Namespace)
@js.native
object persistentConnectionMod extends js.Object {
  @js.native
  class PersistentConnection protected () extends ServerActions {
    /**
      * @implements {ServerActions}
      * @param repoInfo_ Data about the namespace we are connecting to
      * @param applicationId_ The Firebase App ID for this project
      * @param onDataUpdate_ A callback for new data from the server
      */
    def this(
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      onDataUpdate_ : js.Function4[/* a */ String, /* b */ js.Any, /* c */ Boolean, /* d */ Double | Null, Unit],
      onConnectStatus_ : js.Function1[/* a */ Boolean, Unit],
      onServerInfoUpdate_ : js.Function1[/* a */ js.Any, Unit],
      authTokenProvider_ : AuthTokenProvider
    ) = this()
    def this(
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      onDataUpdate_ : js.Function4[/* a */ String, /* b */ js.Any, /* c */ Boolean, /* d */ Double | Null, Unit],
      onConnectStatus_ : js.Function1[/* a */ Boolean, Unit],
      onServerInfoUpdate_ : js.Function1[/* a */ js.Any, Unit],
      authTokenProvider_ : AuthTokenProvider,
      authOverride_ : js.Object
    ) = this()
    var applicationId_ : js.Any = js.native
    var authOverride_ : js.UndefOr[js.Any] = js.native
    var authTokenProvider_ : js.Any = js.native
    var authToken_ : js.Any = js.native
    var cancelSentTransactions_ : js.Any = js.native
    var connected_ : js.Any = js.native
    var establishConnectionTimer_ : js.Any = js.native
    var establishConnection_ : js.Any = js.native
    var firstConnection_ : js.Any = js.native
    var forceTokenRefresh_ : js.Any = js.native
    var handleTimestamp_ : js.Any = js.native
    var id: Double = js.native
    var interruptReasons_ : js.Any = js.native
    var invalidAuthTokenCount_ : js.Any = js.native
    var lastConnectionAttemptTime_ : js.Any = js.native
    var lastConnectionEstablishedTime_ : js.Any = js.native
    var lastSessionId: String | Null = js.native
    /** Map<path, Map<queryId, ListenSpec>> */
    val listens: js.Any = js.native
    var log_ : js.Any = js.native
    var maxReconnectDelay_ : js.Any = js.native
    var onAuthRevoked_ : js.Any = js.native
    var onConnectStatus_ : js.Any = js.native
    var onDataMessage_ : js.Any = js.native
    var onDataPush_ : js.Any = js.native
    var onDataUpdate_ : js.Any = js.native
    var onDisconnectRequestQueue_ : js.Any = js.native
    var onListenRevoked_ : js.Any = js.native
    var onOnline_ : js.Any = js.native
    var onReady_ : js.Any = js.native
    var onRealtimeDisconnect_ : js.Any = js.native
    var onSecurityDebugPacket_ : js.Any = js.native
    var onServerInfoUpdate_ : js.Any = js.native
    var onVisible_ : js.Any = js.native
    var outstandingPutCount_ : js.Any = js.native
    var outstandingPuts_ : js.Any = js.native
    var realtime_ : js.Any = js.native
    var reconnectDelay_ : js.Any = js.native
    var reduceReconnectDelayIfAdminCredential_ : js.Any = js.native
    var removeListen_ : js.Any = js.native
    var repoInfo_ : js.Any = js.native
    var requestCBHash_ : js.Any = js.native
    var requestNumber_ : js.Any = js.native
    var restoreState_ : js.Any = js.native
    var scheduleConnect_ : js.Any = js.native
    var securityDebugCallback_ : js.Any = js.native
    /**
      * Sends client stats for first connection
      */
    var sendConnectStats_ : js.Any = js.native
    var sendListen_ : js.Any = js.native
    var sendOnDisconnect_ : js.Any = js.native
    var sendPut_ : js.Any = js.native
    var sendUnlisten_ : js.Any = js.native
    var shouldReconnect_ : js.Any = js.native
    var visible_ : js.Any = js.native
    def interrupt(reason: String): Unit = js.native
    def putInternal(
      action: String,
      pathString: String,
      data: js.Any,
      onComplete: js.Function2[/* a */ String, /* b */ String | Null, Unit]
    ): Unit = js.native
    def putInternal(
      action: String,
      pathString: String,
      data: js.Any,
      onComplete: js.Function2[/* a */ String, /* b */ String | Null, Unit],
      hash: String
    ): Unit = js.native
    def resume(reason: String): Unit = js.native
    /* protected */ def sendRequest(action: String, body: js.Any): Unit = js.native
    /* protected */ def sendRequest(action: String, body: js.Any, onResponse: js.Function1[/* a */ js.Any, Unit]): Unit = js.native
    /**
      * Attempts to authenticate with the given credentials. If the authentication attempt fails, it's triggered like
      * a auth revoked (the connection is closed).
      */
    def tryAuth(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object PersistentConnection extends js.Object {
    /**
      * Counter for number of connections created. Mainly used for tagging in the logs
      */
    var nextConnectionId_ : js.Any = js.native
    var nextPersistentConnectionId_ : js.Any = js.native
    var warnOnListenWarnings_ : js.Any = js.native
  }
  
}

