package typings.firebaseDatabase

import typings.firebaseDatabase.repoInfoMod.RepoInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/realtime/Connection", JSImport.Namespace)
@js.native
object connectionMod extends js.Object {
  @js.native
  class Connection protected () extends js.Object {
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : js.UndefOr[scala.Nothing],
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit]
    ) = this()
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
      applicationId_ : js.UndefOr[scala.Nothing],
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit],
      lastSessionId: String
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
    var applicationId_ : js.Any = js.native
    /**
      *
      * @private
      */
    var closeConnections_ : js.Any = js.native
    var connReceiver_ : js.Any = js.native
    var conn_ : js.Any = js.native
    var connectionCount: Double = js.native
    var disconnReceiver_ : js.Any = js.native
    var healthyTimeout_ : js.Any = js.native
    var id: String = js.native
    var isHealthy_ : js.Any = js.native
    var lastSessionId: js.UndefOr[String] = js.native
    var log_ : js.Any = js.native
    /**
      * @return {!string}
      * @private
      */
    var nextTransportId_ : js.Any = js.native
    var onConnectionEstablished_ : js.Any = js.native
    /**
      *
      * @param {boolean} everConnected Whether or not the connection ever reached a server. Used to determine if
      * we should flush the host cache
      * @private
      */
    var onConnectionLost_ : js.Any = js.native
    /**
      *
      * @param {string} reason
      * @private
      */
    var onConnectionShutdown_ : js.Any = js.native
    var onControl_ : js.Any = js.native
    var onDataMessage_ : js.Any = js.native
    var onDisconnect_ : js.Any = js.native
    /**
      *
      * @param {Object} handshake The handshake data returned from the server
      * @private
      */
    var onHandshake_ : js.Any = js.native
    var onKill_ : js.Any = js.native
    var onMessage_ : js.Any = js.native
    var onPrimaryMessageReceived_ : js.Any = js.native
    var onPrimaryResponse_ : js.Any = js.native
    var onReady_ : js.Any = js.native
    var onReset_ : js.Any = js.native
    var onSecondaryConnectionLost_ : js.Any = js.native
    var onSecondaryControl_ : js.Any = js.native
    var onSecondaryMessageReceived_ : js.Any = js.native
    var pendingDataMessages: js.Array[_] = js.native
    var primaryResponsesRequired_ : js.Any = js.native
    var proceedWithUpgrade_ : js.Any = js.native
    var repoInfo_ : js.Any = js.native
    var rx_ : js.Any = js.native
    var secondaryConn_ : js.Any = js.native
    var secondaryResponsesRequired_ : js.Any = js.native
    var sendData_ : js.Any = js.native
    var sendPingOnPrimaryIfNecessary_ : js.Any = js.native
    var sessionId: String = js.native
    var startUpgrade_ : js.Any = js.native
    /**
      * Starts a connection attempt
      * @private
      */
    var start_ : js.Any = js.native
    var state_ : js.Any = js.native
    var transportManager_ : js.Any = js.native
    var tryStartUpgrade_ : js.Any = js.native
    var tx_ : js.Any = js.native
    var upgradeIfSecondaryHealthy_ : js.Any = js.native
    /**
      * Cleans up this connection, calling the appropriate callbacks
      */
    def close(): Unit = js.native
    /**
      *
      * @param {Object} dataMsg An arbitrary data message to be sent to the server
      */
    def sendRequest(dataMsg: js.Object): Unit = js.native
    def tryCleanupConnection(): Unit = js.native
  }
  
}

