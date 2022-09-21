package typings.firebaseDatabase

import typings.firebaseDatabase.anon.D
import typings.firebaseDatabase.coreRepoInfoMod.RepoInfo
import typings.firebaseDatabase.pollingPacketReceiverMod.PacketReceiver
import typings.firebaseDatabase.realtimeTransportMod.Transport
import typings.std.AddEventListenerOptions
import typings.std.Document
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLIFrameElement
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object realtimeBrowserPollConnectionMod {
  
  @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "BrowserPollConnection")
  @js.native
  open class BrowserPollConnection protected () extends Transport {
    /**
      * @param connId An identifier for this connection, used for logging
      * @param repoInfo The info for the endpoint to send data to.
      * @param applicationId The Firebase App ID for this project.
      * @param appCheckToken The AppCheck token for this client.
      * @param authToken The AuthToken to use for this connection.
      * @param transportSessionId Optional transportSessionid if we are
      * reconnecting for an existing transport session
      * @param lastSessionId Optional lastSessionId if the PersistentConnection has
      * already created a connection previously
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
    
    /**
      * This is how we notify the server that we're leaving.
      * We aren't able to send requests with DHTML on a window close event, but we can
      * trigger XHR requests in some browsers (everything but Opera basically).
      */
    def addDisconnectPingFrame(id: String, pw: String): Unit = js.native
    
    /* private */ var appCheckToken: Any = js.native
    
    /* private */ var applicationId: Any = js.native
    
    /* private */ var authToken: Any = js.native
    
    /* private */ var connectTimeoutTimer_ : Any = js.native
    
    var curSegmentNum: Double = js.native
    
    /* private */ var everConnected_ : Any = js.native
    
    var id: String = js.native
    
    /**
      * Used to track the bytes received by this client
      */
    /* private */ var incrementIncomingBytes_ : Any = js.native
    
    /* private */ var isClosed_ : Any = js.native
    
    var lastSessionId: js.UndefOr[String] = js.native
    
    /* private */ var log_ : Any = js.native
    
    var myDisconnFrame: HTMLIFrameElement = js.native
    
    var myPacketOrderer: PacketReceiver = js.native
    
    /**
      * Triggered when this transport is closed
      */
    /* private */ var onClosed_ : Any = js.native
    
    /* private */ var onDisconnect_ : Any = js.native
    
    var password: String = js.native
    
    var repoInfo: RepoInfo = js.native
    
    var scriptTagHolder: FirebaseIFrameScriptHolder = js.native
    
    /**
      * Stops polling and cleans up the iframe
      */
    /* private */ var shutdown_ : Any = js.native
    
    /* private */ var stats_ : Any = js.native
    
    var transportSessionId: js.UndefOr[String] = js.native
    
    def urlFn(params: js.Object): String = js.native
  }
  /* static members */
  object BrowserPollConnection {
    
    @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "BrowserPollConnection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Forces long polling to be considered as a potential transport
      */
    inline def forceAllow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceAllow")().asInstanceOf[Unit]
    
    @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "BrowserPollConnection.forceAllow_")
    @js.native
    def forceAllow_ : Boolean = js.native
    inline def forceAllow__=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceAllow_")(x.asInstanceOf[js.Any])
    
    /**
      * Forces longpolling to not be considered as a potential transport
      */
    inline def forceDisallow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceDisallow")().asInstanceOf[Unit]
    
    @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "BrowserPollConnection.forceDisallow_")
    @js.native
    def forceDisallow_ : Boolean = js.native
    inline def forceDisallow__=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceDisallow_")(x.asInstanceOf[js.Any])
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "FIREBASE_LONGPOLL_CALLBACK_ID_PARAM")
  @js.native
  val FIREBASE_LONGPOLL_CALLBACK_ID_PARAM: /* "cb" */ String = js.native
  
  @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "FIREBASE_LONGPOLL_CLOSE_COMMAND")
  @js.native
  val FIREBASE_LONGPOLL_CLOSE_COMMAND: /* "close" */ String = js.native
  
  @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "FIREBASE_LONGPOLL_COMMAND_CB_NAME")
  @js.native
  val FIREBASE_LONGPOLL_COMMAND_CB_NAME: /* "pLPCommand" */ String = js.native
  
  @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "FIREBASE_LONGPOLL_DATA_CB_NAME")
  @js.native
  val FIREBASE_LONGPOLL_DATA_CB_NAME: /* "pRTLPCB" */ String = js.native
  
  @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "FIREBASE_LONGPOLL_DATA_PARAM")
  @js.native
  val FIREBASE_LONGPOLL_DATA_PARAM: /* "d" */ String = js.native
  
  @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "FIREBASE_LONGPOLL_DISCONN_FRAME_PARAM")
  @js.native
  val FIREBASE_LONGPOLL_DISCONN_FRAME_PARAM: /* "disconn" */ String = js.native
  
  @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "FIREBASE_LONGPOLL_DISCONN_FRAME_REQUEST_PARAM")
  @js.native
  val FIREBASE_LONGPOLL_DISCONN_FRAME_REQUEST_PARAM: /* "dframe" */ String = js.native
  
  @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "FIREBASE_LONGPOLL_ID_PARAM")
  @js.native
  val FIREBASE_LONGPOLL_ID_PARAM: /* "id" */ String = js.native
  
  @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "FIREBASE_LONGPOLL_PW_PARAM")
  @js.native
  val FIREBASE_LONGPOLL_PW_PARAM: /* "pw" */ String = js.native
  
  @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "FIREBASE_LONGPOLL_SEGMENTS_IN_PACKET")
  @js.native
  val FIREBASE_LONGPOLL_SEGMENTS_IN_PACKET: /* "ts" */ String = js.native
  
  @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "FIREBASE_LONGPOLL_SEGMENT_NUM_PARAM")
  @js.native
  val FIREBASE_LONGPOLL_SEGMENT_NUM_PARAM: /* "seg" */ String = js.native
  
  @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "FIREBASE_LONGPOLL_SERIAL_PARAM")
  @js.native
  val FIREBASE_LONGPOLL_SERIAL_PARAM: /* "ser" */ String = js.native
  
  @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "FIREBASE_LONGPOLL_START_PARAM")
  @js.native
  val FIREBASE_LONGPOLL_START_PARAM: /* "start" */ String = js.native
  
  @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "FirebaseIFrameScriptHolder")
  @js.native
  open class FirebaseIFrameScriptHolder protected () extends StObject {
    /**
      * @param commandCB - The callback to be called when control commands are recevied from the server.
      * @param onMessageCB - The callback to be triggered when responses arrive from the server.
      * @param onDisconnect - The callback to be triggered when this tag holder is closed
      * @param urlFn - A function that provides the URL of the endpoint to send data to.
      */
    def this(
      commandCB: js.Function2[/* command */ String, /* repeated */ Any, Unit],
      onMessageCB: js.Function1[/* repeated */ Any, Unit],
      onDisconnect: js.Function0[Unit],
      urlFn: js.Function1[/* a */ js.Object, String]
    ) = this()
    
    /**
      * Add a script tag for a regular long-poll request.
      * @param url - The URL of the script tag.
      * @param serial - The serial number of the request.
      */
    /* private */ var addLongPollTag_ : Any = js.native
    
    /**
      * Add an arbitrary script tag to the iframe.
      * @param url - The URL for the script tag source.
      * @param loadCB - A callback to be triggered once the script has loaded.
      */
    def addTag(url: String, loadCB: js.Function0[Unit]): Unit = js.native
    
    var alive: Boolean = js.native
    
    /**
      * Cancel all outstanding queries and remove the frame.
      */
    def close(): Unit = js.native
    
    def commandCB(command: String, args: Any*): Unit = js.native
    
    var currentSerial: Double = js.native
    
    /**
      * Queue a packet for transmission to the server.
      * @param segnum - A sequential id for this packet segment used for reassembly
      * @param totalsegs - The total number of segments in this packet
      * @param data - The data for this segment.
      */
    def enqueueSegment(segnum: Double, totalsegs: Double, data: Any): Unit = js.native
    
    var myID: String = js.native
    
    var myIFrame: IFrameElement = js.native
    
    var myPW: String = js.native
    
    /**
      * This is called any time someone might want a script tag to be added. It adds a script tag when there aren't
      * too many outstanding requests and we are still alive.
      *
      * If there are outstanding packet segments to send, it sends one. If there aren't, it sends a long-poll anyways if
      * needed.
      */
    /* private */ var newRequest_ : Any = js.native
    
    def onDisconnect(): Unit = js.native
    
    def onMessageCB(args: Any*): Unit = js.native
    
    var outstandingRequests: Set[Double] = js.native
    
    var pendingSegs: js.Array[D] = js.native
    
    var sendNewPolls: Boolean = js.native
    
    /**
      * Actually start the long-polling session by adding the first script tag(s) to the iframe.
      * @param id - The ID of this connection
      * @param pw - The password for this connection
      */
    def startLongPoll(id: String, pw: String): Unit = js.native
    
    var uniqueCallbackIdentifier: Double = js.native
    
    def urlFn(a: js.Object): String = js.native
  }
  /* static members */
  object FirebaseIFrameScriptHolder {
    
    @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "FirebaseIFrameScriptHolder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Each browser has its own funny way to handle iframes. Here we mush them all together into one object that I can
      * actually use.
      */
    @JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", "FirebaseIFrameScriptHolder.createIFrame_")
    @js.native
    def createIFrame_ : Any = js.native
    inline def createIFrame__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createIFrame_")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IFrameElement
    extends StObject
       with HTMLIFrameElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var doc: Document = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
}
