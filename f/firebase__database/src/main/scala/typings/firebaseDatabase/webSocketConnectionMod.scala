package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.repoInfoMod.RepoInfo
import typings.firebaseDatabase.transportMod.Transport
import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webSocketConnectionMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/realtime/WebSocketConnection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/node-esm/src/realtime/WebSocketConnection", "WebSocketConnection")
  @js.native
  open class WebSocketConnection protected () extends Transport {
    /**
      * @param connId identifier for this transport
      * @param repoInfo The info for the websocket endpoint.
      * @param applicationId The Firebase App ID for this project.
      * @param appCheckToken The App Check Token for this client.
      * @param authToken The Auth Token for this client.
      * @param transportSessionId Optional transportSessionId if this is connecting
      * to an existing transport session
      * @param lastSessionId Optional lastSessionId if there was a previous
      * connection
      */
    def this(connId: String, repoInfo: RepoInfo) = this()
    def this(connId: String, repoInfo: RepoInfo, applicationId: String) = this()
    def this(connId: String, repoInfo: RepoInfo, applicationId: String, appCheckToken: String) = this()
    def this(connId: String, repoInfo: RepoInfo, applicationId: Unit, appCheckToken: String) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: String,
      appCheckToken: String,
      authToken: String
    ) = this()
    def this(connId: String, repoInfo: RepoInfo, applicationId: String, appCheckToken: Unit, authToken: String) = this()
    def this(connId: String, repoInfo: RepoInfo, applicationId: Unit, appCheckToken: String, authToken: String) = this()
    def this(connId: String, repoInfo: RepoInfo, applicationId: Unit, appCheckToken: Unit, authToken: String) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: String,
      appCheckToken: String,
      authToken: String,
      transportSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: String,
      appCheckToken: String,
      authToken: Unit,
      transportSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: String,
      appCheckToken: Unit,
      authToken: String,
      transportSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: String,
      appCheckToken: Unit,
      authToken: Unit,
      transportSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: Unit,
      appCheckToken: String,
      authToken: String,
      transportSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: Unit,
      appCheckToken: String,
      authToken: Unit,
      transportSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: Unit,
      appCheckToken: Unit,
      authToken: String,
      transportSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: Unit,
      appCheckToken: Unit,
      authToken: Unit,
      transportSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: String,
      appCheckToken: String,
      authToken: String,
      transportSessionId: String,
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: String,
      appCheckToken: String,
      authToken: String,
      transportSessionId: Unit,
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: String,
      appCheckToken: String,
      authToken: Unit,
      transportSessionId: String,
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: String,
      appCheckToken: String,
      authToken: Unit,
      transportSessionId: Unit,
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: String,
      appCheckToken: Unit,
      authToken: String,
      transportSessionId: String,
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: String,
      appCheckToken: Unit,
      authToken: String,
      transportSessionId: Unit,
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: String,
      appCheckToken: Unit,
      authToken: Unit,
      transportSessionId: String,
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: String,
      appCheckToken: Unit,
      authToken: Unit,
      transportSessionId: Unit,
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: Unit,
      appCheckToken: String,
      authToken: String,
      transportSessionId: String,
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: Unit,
      appCheckToken: String,
      authToken: String,
      transportSessionId: Unit,
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: Unit,
      appCheckToken: String,
      authToken: Unit,
      transportSessionId: String,
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: Unit,
      appCheckToken: String,
      authToken: Unit,
      transportSessionId: Unit,
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: Unit,
      appCheckToken: Unit,
      authToken: String,
      transportSessionId: String,
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: Unit,
      appCheckToken: Unit,
      authToken: String,
      transportSessionId: Unit,
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: Unit,
      appCheckToken: Unit,
      authToken: Unit,
      transportSessionId: String,
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: Unit,
      appCheckToken: Unit,
      authToken: Unit,
      transportSessionId: Unit,
      lastSessionId: String
    ) = this()
    
    /* private */ var appCheckToken: Any = js.native
    
    /* private */ var appendFrame_ : Any = js.native
    
    /* private */ var applicationId: Any = js.native
    
    /* private */ var authToken: Any = js.native
    
    var connURL: String = js.native
    
    /* private */ var everConnected_ : Any = js.native
    
    /**
      * Attempts to parse a frame count out of some text. If it can't, assumes a value of 1
      * @returns Any remaining data to be process, or null if there is none
      */
    /* private */ var extractFrameCount_ : Any = js.native
    
    var frames: js.Array[String] | Null = js.native
    
    /**
      * Process a websocket frame that has arrived from the server.
      * @param mess - The frame data
      */
    def handleIncomingFrame(mess: StringDictionary[Any]): Unit = js.native
    
    /**
      * @param frameCount - The number of frames we are expecting from the server
      */
    /* private */ var handleNewFrameCount_ : Any = js.native
    
    /* private */ var isClosed_ : Any = js.native
    
    var keepaliveTimer: Double | Null = js.native
    
    /* private */ var log_ : Any = js.native
    
    var mySock: WebSocket | Null = js.native
    
    /* private */ var nodeAdmin: Any = js.native
    
    /* private */ var onClosed_ : Any = js.native
    
    def onDisconnect(): Unit = js.native
    def onDisconnect(a: Boolean): Unit = js.native
    
    def onMessage(msg: js.Object): Unit = js.native
    
    /**
      * Kill the current keepalive timer and start a new one, to ensure that it always fires N seconds after
      * the last activity.
      */
    def resetKeepAlive(): Unit = js.native
    
    /**
      * Send a string over the websocket.
      *
      * @param str - String to send.
      */
    /* private */ var sendString_ : Any = js.native
    
    /* private */ var shutdown_ : Any = js.native
    
    /* private */ var stats_ : Any = js.native
    
    var totalFrames: Double = js.native
  }
  /* static members */
  object WebSocketConnection {
    
    @JSImport("@firebase/database/dist/node-esm/src/realtime/WebSocketConnection", "WebSocketConnection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param repoInfo - The info for the websocket endpoint.
      * @param transportSessionId - Optional transportSessionId if this is connecting to an existing transport
      *                                         session
      * @param lastSessionId - Optional lastSessionId if there was a previous connection
      * @returns connection url
      */
    @JSImport("@firebase/database/dist/node-esm/src/realtime/WebSocketConnection", "WebSocketConnection.connectionURL_")
    @js.native
    def connectionURL_ : Any = js.native
    inline def connectionURL__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionURL_")(x.asInstanceOf[js.Any])
    
    inline def forceDisallow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceDisallow")().asInstanceOf[Unit]
    
    @JSImport("@firebase/database/dist/node-esm/src/realtime/WebSocketConnection", "WebSocketConnection.forceDisallow_")
    @js.native
    def forceDisallow_ : Boolean = js.native
    inline def forceDisallow__=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceDisallow_")(x.asInstanceOf[js.Any])
    
    /**
      * Time to wait for the connection te become healthy before giving up.
      */
    @JSImport("@firebase/database/dist/node-esm/src/realtime/WebSocketConnection", "WebSocketConnection.healthyTimeout")
    @js.native
    def healthyTimeout: Double = js.native
    inline def healthyTimeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("healthyTimeout")(x.asInstanceOf[js.Any])
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
    
    /**
      * Returns true if we previously failed to connect with this transport.
      */
    inline def previouslyFailed(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("previouslyFailed")().asInstanceOf[Boolean]
    
    /**
      * Number of response before we consider the connection "healthy."
      */
    @JSImport("@firebase/database/dist/node-esm/src/realtime/WebSocketConnection", "WebSocketConnection.responsesRequiredToBeHealthy")
    @js.native
    def responsesRequiredToBeHealthy: Double = js.native
    inline def responsesRequiredToBeHealthy_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("responsesRequiredToBeHealthy")(x.asInstanceOf[js.Any])
  }
  
  inline def setWebSocketImpl(impl: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWebSocketImpl")(impl.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
