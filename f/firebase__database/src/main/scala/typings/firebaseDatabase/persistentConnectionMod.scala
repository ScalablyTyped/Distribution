package typings.firebaseDatabase

import typings.firebaseDatabase.authTokenProviderMod.AuthTokenProvider
import typings.firebaseDatabase.repoInfoMod.RepoInfo
import typings.firebaseDatabase.serverActionsMod.ServerActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object persistentConnectionMod {
  
  @JSImport("@firebase/database/dist/src/core/PersistentConnection", "PersistentConnection")
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
    
    /* private */ var applicationId_ : js.Any = js.native
    
    /* private */ var authOverride_ : js.Any = js.native
    
    /* private */ var authTokenProvider_ : js.Any = js.native
    
    /* private */ var authToken_ : js.Any = js.native
    
    /* private */ var cancelSentTransactions_ : js.Any = js.native
    
    /* private */ var connected_ : js.Any = js.native
    
    /* private */ var establishConnectionTimer_ : js.Any = js.native
    
    /* private */ var establishConnection_ : js.Any = js.native
    
    /* private */ var firstConnection_ : js.Any = js.native
    
    /* private */ var forceTokenRefresh_ : js.Any = js.native
    
    /* private */ var handleTimestamp_ : js.Any = js.native
    
    var id: Double = js.native
    
    def interrupt(reason: String): Unit = js.native
    
    /* private */ var interruptReasons_ : js.Any = js.native
    
    /* private */ var invalidAuthTokenCount_ : js.Any = js.native
    
    /* private */ var lastConnectionAttemptTime_ : js.Any = js.native
    
    /* private */ var lastConnectionEstablishedTime_ : js.Any = js.native
    
    var lastSessionId: String | Null = js.native
    
    /** Map<path, Map<queryId, ListenSpec>> */
    /* private */ val listens: js.Any = js.native
    
    /* private */ var log_ : js.Any = js.native
    
    /* private */ var maxReconnectDelay_ : js.Any = js.native
    
    /* private */ var onAuthRevoked_ : js.Any = js.native
    
    /* private */ var onConnectStatus_ : js.Any = js.native
    
    /* private */ var onDataMessage_ : js.Any = js.native
    
    /* private */ var onDataPush_ : js.Any = js.native
    
    /* private */ var onDataUpdate_ : js.Any = js.native
    
    /* private */ var onDisconnectRequestQueue_ : js.Any = js.native
    
    /* private */ var onListenRevoked_ : js.Any = js.native
    
    /* private */ var onOnline_ : js.Any = js.native
    
    /* private */ var onReady_ : js.Any = js.native
    
    /* private */ var onRealtimeDisconnect_ : js.Any = js.native
    
    /* private */ var onSecurityDebugPacket_ : js.Any = js.native
    
    /* private */ var onServerInfoUpdate_ : js.Any = js.native
    
    /* private */ var onVisible_ : js.Any = js.native
    
    /* private */ var outstandingGetCount_ : js.Any = js.native
    
    /* private */ var outstandingGets_ : js.Any = js.native
    
    /* private */ var outstandingPutCount_ : js.Any = js.native
    
    /* private */ var outstandingPuts_ : js.Any = js.native
    
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
    
    /* private */ var realtime_ : js.Any = js.native
    
    /* private */ var reconnectDelay_ : js.Any = js.native
    
    /* private */ var reduceReconnectDelayIfAdminCredential_ : js.Any = js.native
    
    /* private */ var removeListen_ : js.Any = js.native
    
    /* private */ var repoInfo_ : js.Any = js.native
    
    /* private */ var requestCBHash_ : js.Any = js.native
    
    /* private */ var requestNumber_ : js.Any = js.native
    
    /* private */ var restoreState_ : js.Any = js.native
    
    def resume(reason: String): Unit = js.native
    
    /* private */ var scheduleConnect_ : js.Any = js.native
    
    /* private */ var securityDebugCallback_ : js.Any = js.native
    
    /**
      * Sends client stats for first connection
      */
    /* private */ var sendConnectStats_ : js.Any = js.native
    
    /* private */ var sendGet_ : js.Any = js.native
    
    /* private */ var sendListen_ : js.Any = js.native
    
    /* private */ var sendOnDisconnect_ : js.Any = js.native
    
    /* private */ var sendPut_ : js.Any = js.native
    
    /* protected */ def sendRequest(action: String, body: js.Any): Unit = js.native
    /* protected */ def sendRequest(action: String, body: js.Any, onResponse: js.Function1[/* a */ js.Any, Unit]): Unit = js.native
    
    /* private */ var sendUnlisten_ : js.Any = js.native
    
    /* private */ var shouldReconnect_ : js.Any = js.native
    
    /**
      * Attempts to authenticate with the given credentials. If the authentication attempt fails, it's triggered like
      * a auth revoked (the connection is closed).
      */
    def tryAuth(): Unit = js.native
    
    /* private */ var visible_ : js.Any = js.native
  }
  /* static members */
  object PersistentConnection {
    
    @JSImport("@firebase/database/dist/src/core/PersistentConnection", "PersistentConnection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Counter for number of connections created. Mainly used for tagging in the logs
      */
    @JSImport("@firebase/database/dist/src/core/PersistentConnection", "PersistentConnection.nextConnectionId_")
    @js.native
    def nextConnectionId_ : js.Any = js.native
    inline def nextConnectionId__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextConnectionId_")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/database/dist/src/core/PersistentConnection", "PersistentConnection.nextPersistentConnectionId_")
    @js.native
    def nextPersistentConnectionId_ : js.Any = js.native
    inline def nextPersistentConnectionId__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextPersistentConnectionId_")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/database/dist/src/core/PersistentConnection", "PersistentConnection.warnOnListenWarnings_")
    @js.native
    def warnOnListenWarnings_ : js.Any = js.native
    inline def warnOnListenWarnings__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warnOnListenWarnings_")(x.asInstanceOf[js.Any])
  }
}
