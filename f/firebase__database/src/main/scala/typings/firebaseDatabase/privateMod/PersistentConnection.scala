package typings.firebaseDatabase.privateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Firebase connection.  Abstracts wire protocol and handles reconnecting.
  *
  * NOTE: All JSON objects sent to the realtime connection must have property names enclosed
  * in quotes to make sure the closure compiler does not minify them.
  */
@js.native
trait PersistentConnection
  extends StObject
     with ServerActions {
  
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
