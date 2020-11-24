package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.repoInfoMod.RepoInfo
import typings.firebaseDatabase.transportMod.Transport
import typings.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/realtime/WebSocketConnection", JSImport.Namespace)
@js.native
object webSocketConnectionMod extends js.Object {
  
  def setWebSocketImpl(impl: js.Any): Unit = js.native
  
  @js.native
  class WebSocketConnection protected () extends Transport {
    /**
      * @param connId identifier for this transport
      * @param repoInfo The info for the websocket endpoint.
      * @param applicationId The Firebase App ID for this project.
      * @param transportSessionId Optional transportSessionId if this is connecting to an existing transport
      *                                         session
      * @param lastSessionId Optional lastSessionId if there was a previous connection
      */
    def this(connId: String, repoInfo: RepoInfo) = this()
    def this(connId: String, repoInfo: RepoInfo, applicationId: String) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: js.UndefOr[scala.Nothing],
      transportSessionId: String
    ) = this()
    def this(connId: String, repoInfo: RepoInfo, applicationId: String, transportSessionId: String) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: js.UndefOr[scala.Nothing],
      transportSessionId: js.UndefOr[scala.Nothing],
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: js.UndefOr[scala.Nothing],
      transportSessionId: String,
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: String,
      transportSessionId: js.UndefOr[scala.Nothing],
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: String,
      transportSessionId: String,
      lastSessionId: String
    ) = this()
    
    var appendFrame_ : js.Any = js.native
    
    var applicationId: js.Any = js.native
    
    var connURL: String = js.native
    
    var everConnected_ : js.Any = js.native
    
    /**
      * Attempts to parse a frame count out of some text. If it can't, assumes a value of 1
      * @param {!String} data
      * @return {?String} Any remaining data to be process, or null if there is none
      * @private
      */
    var extractFrameCount_ : js.Any = js.native
    
    var frames: js.Array[String] | Null = js.native
    
    /**
      * Process a websocket frame that has arrived from the server.
      * @param mess The frame data
      */
    def handleIncomingFrame(mess: StringDictionary[js.Any]): Unit = js.native
    
    /**
      * @param {number} frameCount The number of frames we are expecting from the server
      * @private
      */
    var handleNewFrameCount_ : js.Any = js.native
    
    var isClosed_ : js.Any = js.native
    
    var keepaliveTimer: Double | Null = js.native
    
    var log_ : js.Any = js.native
    
    var mySock: WebSocket | Null = js.native
    
    var nodeAdmin: js.Any = js.native
    
    var onClosed_ : js.Any = js.native
    
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
      * @param {string} str String to send.
      * @private
      */
    var sendString_ : js.Any = js.native
    
    var shutdown_ : js.Any = js.native
    
    var stats_ : js.Any = js.native
    
    var totalFrames: Double = js.native
  }
  /* static members */
  @js.native
  object WebSocketConnection extends js.Object {
    
    /**
      * @param {RepoInfo} repoInfo The info for the websocket endpoint.
      * @param {string=} transportSessionId Optional transportSessionId if this is connecting to an existing transport
      *                                         session
      * @param {string=} lastSessionId Optional lastSessionId if there was a previous connection
      * @return {string} connection url
      * @private
      */
    var connectionURL_ : js.Any = js.native
    
    def forceDisallow(): Unit = js.native
    
    var forceDisallow_ : Boolean = js.native
    
    /**
      * Time to wait for the connection te become healthy before giving up.
      * @type {number}
      */
    var healthyTimeout: Double = js.native
    
    def isAvailable(): Boolean = js.native
    
    /**
      * Returns true if we previously failed to connect with this transport.
      * @return {boolean}
      */
    def previouslyFailed(): Boolean = js.native
    
    /**
      * Number of response before we consider the connection "healthy."
      * @type {number}
      */
    var responsesRequiredToBeHealthy: Double = js.native
  }
}
