package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcCoreAppCheckTokenProviderMod.AppCheckTokenProvider
import typings.firebaseDatabase.distSrcCoreAuthTokenProviderMod.AuthTokenProvider
import typings.firebaseDatabase.distSrcCoreRepoInfoMod.RepoInfo
import typings.firebaseDatabase.distSrcCoreServerActionsMod.ServerActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCorePersistentConnectionMod {
  
  @JSImport("@firebase/database/dist/src/core/PersistentConnection", "PersistentConnection")
  @js.native
  open class PersistentConnection protected () extends ServerActions {
    /**
      * @param repoInfo_ - Data about the namespace we are connecting to
      * @param applicationId_ - The Firebase App ID for this project
      * @param onDataUpdate_ - A callback for new data from the server
      */
    def this(
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      onDataUpdate_ : js.Function4[/* a */ String, /* b */ Any, /* c */ Boolean, /* d */ Double | Null, Unit],
      onConnectStatus_ : js.Function1[/* a */ Boolean, Unit],
      onServerInfoUpdate_ : js.Function1[/* a */ Any, Unit],
      authTokenProvider_ : AuthTokenProvider,
      appCheckTokenProvider_ : AppCheckTokenProvider
    ) = this()
    def this(
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      onDataUpdate_ : js.Function4[/* a */ String, /* b */ Any, /* c */ Boolean, /* d */ Double | Null, Unit],
      onConnectStatus_ : js.Function1[/* a */ Boolean, Unit],
      onServerInfoUpdate_ : js.Function1[/* a */ Any, Unit],
      authTokenProvider_ : AuthTokenProvider,
      appCheckTokenProvider_ : AppCheckTokenProvider,
      authOverride_ : js.Object
    ) = this()
    
    /* private */ var appCheckTokenProvider_ : Any = js.native
    
    /* private */ var appCheckToken_ : Any = js.native
    
    /* private */ var applicationId_ : Any = js.native
    
    /* private */ var authOverride_ : Any = js.native
    
    /* private */ var authTokenProvider_ : Any = js.native
    
    /* private */ var authToken_ : Any = js.native
    
    /* private */ var cancelSentTransactions_ : Any = js.native
    
    /* private */ var connected_ : Any = js.native
    
    /* private */ var establishConnectionTimer_ : Any = js.native
    
    /* private */ var establishConnection_ : Any = js.native
    
    /* private */ var firstConnection_ : Any = js.native
    
    /* private */ var forceTokenRefresh_ : Any = js.native
    
    /* private */ var handleTimestamp_ : Any = js.native
    
    var id: Double = js.native
    
    /* private */ var initConnection_ : Any = js.native
    
    def interrupt(reason: String): Unit = js.native
    
    /* private */ var interruptReasons_ : Any = js.native
    
    /* private */ var invalidAppCheckTokenCount_ : Any = js.native
    
    /* private */ var invalidAuthTokenCount_ : Any = js.native
    
    /* private */ var lastConnectionAttemptTime_ : Any = js.native
    
    /* private */ var lastConnectionEstablishedTime_ : Any = js.native
    
    var lastSessionId: String | Null = js.native
    
    /* private */ val listens: Any = js.native
    
    /* private */ var log_ : Any = js.native
    
    /* private */ var maxReconnectDelay_ : Any = js.native
    
    /* private */ var onAppCheckRevoked_ : Any = js.native
    
    /* private */ var onAuthRevoked_ : Any = js.native
    
    /* private */ var onConnectStatus_ : Any = js.native
    
    /* private */ var onDataMessage_ : Any = js.native
    
    /* private */ var onDataPush_ : Any = js.native
    
    /* private */ var onDataUpdate_ : Any = js.native
    
    /* private */ var onDisconnectRequestQueue_ : Any = js.native
    
    /* private */ var onListenRevoked_ : Any = js.native
    
    /* private */ var onOnline_ : Any = js.native
    
    /* private */ var onReady_ : Any = js.native
    
    /* private */ var onRealtimeDisconnect_ : Any = js.native
    
    /* private */ var onSecurityDebugPacket_ : Any = js.native
    
    /* private */ var onServerInfoUpdate_ : Any = js.native
    
    /* private */ var onVisible_ : Any = js.native
    
    /* private */ var outstandingGetCount_ : Any = js.native
    
    /* private */ var outstandingGets_ : Any = js.native
    
    /* private */ var outstandingPutCount_ : Any = js.native
    
    /* private */ var outstandingPuts_ : Any = js.native
    
    def putInternal(
      action: String,
      pathString: String,
      data: Any,
      onComplete: js.Function2[/* a */ String, /* b */ String | Null, Unit]
    ): Unit = js.native
    def putInternal(
      action: String,
      pathString: String,
      data: Any,
      onComplete: js.Function2[/* a */ String, /* b */ String | Null, Unit],
      hash: String
    ): Unit = js.native
    
    /* private */ var realtime_ : Any = js.native
    
    /* private */ var reconnectDelay_ : Any = js.native
    
    /* private */ var reduceReconnectDelayIfAdminCredential_ : Any = js.native
    
    def refreshAppCheckToken(): Unit = js.native
    
    /* private */ var removeListen_ : Any = js.native
    
    /* private */ var repoInfo_ : Any = js.native
    
    /* private */ var requestCBHash_ : Any = js.native
    
    /* private */ var requestNumber_ : Any = js.native
    
    /* private */ var restoreState_ : Any = js.native
    
    def resume(reason: String): Unit = js.native
    
    /* private */ var scheduleConnect_ : Any = js.native
    
    /* private */ var securityDebugCallback_ : Any = js.native
    
    /**
      * Sends client stats for first connection
      */
    /* private */ var sendConnectStats_ : Any = js.native
    
    /* private */ var sendGet_ : Any = js.native
    
    /* private */ var sendListen_ : Any = js.native
    
    /* private */ var sendOnDisconnect_ : Any = js.native
    
    /* private */ var sendPut_ : Any = js.native
    
    /* protected */ def sendRequest(action: String, body: Any): Unit = js.native
    /* protected */ def sendRequest(action: String, body: Any, onResponse: js.Function1[/* a */ Any, Unit]): Unit = js.native
    
    /* private */ var sendUnlisten_ : Any = js.native
    
    /* private */ var shouldReconnect_ : Any = js.native
    
    /**
      * Attempts to authenticate with the given token. If the authentication
      * attempt fails, it's triggered like the token was revoked (the connection is
      * closed).
      */
    def tryAppCheck(): Unit = js.native
    
    /**
      * Attempts to authenticate with the given credentials. If the authentication attempt fails, it's triggered like
      * a auth revoked (the connection is closed).
      */
    def tryAuth(): Unit = js.native
    
    /* private */ var visible_ : Any = js.native
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
    def nextConnectionId_ : Any = js.native
    inline def nextConnectionId__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextConnectionId_")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/database/dist/src/core/PersistentConnection", "PersistentConnection.nextPersistentConnectionId_")
    @js.native
    def nextPersistentConnectionId_ : Any = js.native
    inline def nextPersistentConnectionId__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextPersistentConnectionId_")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/database/dist/src/core/PersistentConnection", "PersistentConnection.warnOnListenWarnings_")
    @js.native
    def warnOnListenWarnings_ : Any = js.native
    inline def warnOnListenWarnings__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warnOnListenWarnings_")(x.asInstanceOf[js.Any])
  }
}
