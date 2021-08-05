package typings.firebaseDatabase

import typings.firebaseDatabase.repoInfoMod.RepoInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionMod {
  
  @JSImport("@firebase/database/dist/src/realtime/Connection", "Connection")
  @js.native
  class Connection protected () extends StObject {
    /**
      * @param id - an id for this connection
      * @param repoInfo_ - the info for the endpoint to connect to
      * @param applicationId_ - the Firebase App ID for this project
      * @param onMessage_ - the callback to be triggered when a server-push message arrives
      * @param onReady_ - the callback to be triggered when this connection is ready to send messages.
      * @param onDisconnect_ - the callback to be triggered when a connection was lost
      * @param onKill_ - the callback to be triggered when this connection has permanently shut down.
      * @param lastSessionId - last session id in persistent connection. is used to clean up old session in real-time server
      */
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit]
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : Unit,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit]
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit],
      lastSessionId: String
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : Unit,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit],
      lastSessionId: String
    ) = this()
    
    /* private */ var applicationId_ : js.Any = js.native
    
    /**
      * Cleans up this connection, calling the appropriate callbacks
      */
    def close(): Unit = js.native
    
    /**
      *
      * @private
      */
    /* private */ var closeConnections_ : js.Any = js.native
    
    /* private */ var connReceiver_ : js.Any = js.native
    
    /* private */ var conn_ : js.Any = js.native
    
    var connectionCount: Double = js.native
    
    /* private */ var disconnReceiver_ : js.Any = js.native
    
    /* private */ var healthyTimeout_ : js.Any = js.native
    
    var id: String = js.native
    
    /* private */ var isHealthy_ : js.Any = js.native
    
    var lastSessionId: js.UndefOr[String] = js.native
    
    /* private */ var log_ : js.Any = js.native
    
    /**
      * @return {!string}
      * @private
      */
    /* private */ var nextTransportId_ : js.Any = js.native
    
    /* private */ var onConnectionEstablished_ : js.Any = js.native
    
    /**
      *
      * @param {boolean} everConnected Whether or not the connection ever reached a server. Used to determine if
      * we should flush the host cache
      * @private
      */
    /* private */ var onConnectionLost_ : js.Any = js.native
    
    /**
      *
      * @param {string} reason
      * @private
      */
    /* private */ var onConnectionShutdown_ : js.Any = js.native
    
    /* private */ var onControl_ : js.Any = js.native
    
    /* private */ var onDataMessage_ : js.Any = js.native
    
    /* private */ var onDisconnect_ : js.Any = js.native
    
    /**
      *
      * @param {Object} handshake The handshake data returned from the server
      * @private
      */
    /* private */ var onHandshake_ : js.Any = js.native
    
    /* private */ var onKill_ : js.Any = js.native
    
    /* private */ var onMessage_ : js.Any = js.native
    
    /* private */ var onPrimaryMessageReceived_ : js.Any = js.native
    
    /* private */ var onPrimaryResponse_ : js.Any = js.native
    
    /* private */ var onReady_ : js.Any = js.native
    
    /* private */ var onReset_ : js.Any = js.native
    
    /* private */ var onSecondaryConnectionLost_ : js.Any = js.native
    
    /* private */ var onSecondaryControl_ : js.Any = js.native
    
    /* private */ var onSecondaryMessageReceived_ : js.Any = js.native
    
    var pendingDataMessages: js.Array[js.Any] = js.native
    
    /* private */ var primaryResponsesRequired_ : js.Any = js.native
    
    /* private */ var proceedWithUpgrade_ : js.Any = js.native
    
    /* private */ var repoInfo_ : js.Any = js.native
    
    /* private */ var rx_ : js.Any = js.native
    
    /* private */ var secondaryConn_ : js.Any = js.native
    
    /* private */ var secondaryResponsesRequired_ : js.Any = js.native
    
    /* private */ var sendData_ : js.Any = js.native
    
    /* private */ var sendPingOnPrimaryIfNecessary_ : js.Any = js.native
    
    /**
      *
      * @param {Object} dataMsg An arbitrary data message to be sent to the server
      */
    def sendRequest(dataMsg: js.Object): Unit = js.native
    
    var sessionId: String = js.native
    
    /* private */ var startUpgrade_ : js.Any = js.native
    
    /**
      * Starts a connection attempt
      * @private
      */
    /* private */ var start_ : js.Any = js.native
    
    /* private */ var state_ : js.Any = js.native
    
    /* private */ var transportManager_ : js.Any = js.native
    
    def tryCleanupConnection(): Unit = js.native
    
    /* private */ var tryStartUpgrade_ : js.Any = js.native
    
    /* private */ var tx_ : js.Any = js.native
    
    /* private */ var upgradeIfSecondaryHealthy_ : js.Any = js.native
  }
}
