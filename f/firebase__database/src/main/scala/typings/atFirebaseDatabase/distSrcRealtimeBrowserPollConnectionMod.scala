package typings.atFirebaseDatabase

import typings.atFirebaseDatabase.atFirebaseDatabaseStrings.cb
import typings.atFirebaseDatabase.atFirebaseDatabaseStrings.close
import typings.atFirebaseDatabase.atFirebaseDatabaseStrings.d
import typings.atFirebaseDatabase.atFirebaseDatabaseStrings.dframe
import typings.atFirebaseDatabase.atFirebaseDatabaseStrings.disconn
import typings.atFirebaseDatabase.atFirebaseDatabaseStrings.id
import typings.atFirebaseDatabase.atFirebaseDatabaseStrings.pLPCommand
import typings.atFirebaseDatabase.atFirebaseDatabaseStrings.pRTLPCB
import typings.atFirebaseDatabase.atFirebaseDatabaseStrings.pw
import typings.atFirebaseDatabase.atFirebaseDatabaseStrings.seg
import typings.atFirebaseDatabase.atFirebaseDatabaseStrings.ser
import typings.atFirebaseDatabase.atFirebaseDatabaseStrings.start
import typings.atFirebaseDatabase.atFirebaseDatabaseStrings.ts
import typings.atFirebaseDatabase.distSrcCoreRepoInfoMod.RepoInfo
import typings.atFirebaseDatabase.distSrcRealtimePollingPacketReceiverMod.PacketReceiver
import typings.atFirebaseDatabase.distSrcRealtimeTransportMod.Transport
import typings.std.Document
import typings.std.HTMLIFrameElement
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/realtime/BrowserPollConnection", JSImport.Namespace)
@js.native
object distSrcRealtimeBrowserPollConnectionMod extends js.Object {
  @js.native
  class BrowserPollConnection protected () extends Transport {
    /**
      * @param {string} connId An identifier for this connection, used for logging
      * @param {RepoInfo} repoInfo The info for the endpoint to send data to.
      * @param {string=} transportSessionId Optional transportSessionid if we are reconnecting for an existing
      *                                         transport session
      * @param {string=}  lastSessionId Optional lastSessionId if the PersistentConnection has already created a
      *                                     connection previously
      */
    def this(connId: String, repoInfo: RepoInfo) = this()
    def this(connId: String, repoInfo: RepoInfo, transportSessionId: String) = this()
    def this(connId: String, repoInfo: RepoInfo, transportSessionId: String, lastSessionId: String) = this()
    var connectTimeoutTimer_ : js.Any = js.native
    var curSegmentNum: Double = js.native
    var everConnected_ : js.Any = js.native
    var id: String = js.native
    /**
      * Used to track the bytes received by this client
      * @param {*} args
      * @private
      */
    var incrementIncomingBytes_ : js.Any = js.native
    var isClosed_ : js.Any = js.native
    var lastSessionId: js.UndefOr[String] = js.native
    var log_ : js.Any = js.native
    var myDisconnFrame: HTMLIFrameElement = js.native
    var myPacketOrderer: PacketReceiver = js.native
    /**
      * Triggered when this transport is closed
      * @private
      */
    var onClosed_ : js.Any = js.native
    var onDisconnect_ : js.Any = js.native
    var password: String = js.native
    var repoInfo: RepoInfo = js.native
    var scriptTagHolder: FirebaseIFrameScriptHolder = js.native
    /**
      * Stops polling and cleans up the iframe
      * @private
      */
    var shutdown_ : js.Any = js.native
    var stats_ : js.Any = js.native
    var transportSessionId: js.UndefOr[String] = js.native
    /**
      * This is how we notify the server that we're leaving.
      * We aren't able to send requests with DHTML on a window close event, but we can
      * trigger XHR requests in some browsers (everything but Opera basically).
      * @param {!string} id
      * @param {!string} pw
      */
    def addDisconnectPingFrame(id: String, pw: String): Unit = js.native
    def urlFn(params: js.Object): String = js.native
  }
  
  @js.native
  class FirebaseIFrameScriptHolder protected () extends js.Object {
    /**
      * @param commandCB - The callback to be called when control commands are recevied from the server.
      * @param onMessageCB - The callback to be triggered when responses arrive from the server.
      * @param onDisconnect - The callback to be triggered when this tag holder is closed
      * @param urlFn - A function that provides the URL of the endpoint to send data to.
      */
    def this(
      commandCB: js.Function2[/* command */ String, /* repeated */ js.Any, Unit],
      onMessageCB: js.Function1[/* repeated */ js.Any, Unit],
      onDisconnect: js.Function0[Unit],
      urlFn: js.Function1[/* a */ js.Object, String]
    ) = this()
    /**
      * Add a script tag for a regular long-poll request.
      * @param {!string} url - The URL of the script tag.
      * @param {!number} serial - The serial number of the request.
      * @private
      */
    var addLongPollTag_ : js.Any = js.native
    var alive: Boolean = js.native
    var currentSerial: Double = js.native
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
    var newRequest_ : js.Any = js.native
    var outstandingRequests: Set[Double] = js.native
    var pendingSegs: js.Array[Anon_D] = js.native
    var sendNewPolls: Boolean = js.native
    var uniqueCallbackIdentifier: Double = js.native
    /**
      * Add an arbitrary script tag to the iframe.
      * @param {!string} url - The URL for the script tag source.
      * @param {!function()} loadCB - A callback to be triggered once the script has loaded.
      */
    def addTag(url: String, loadCB: js.Function0[Unit]): Unit = js.native
    /**
      * Cancel all outstanding queries and remove the frame.
      */
    def close(): Unit = js.native
    def commandCB(command: String, args: js.Any*): Unit = js.native
    /**
      * Queue a packet for transmission to the server.
      * @param segnum - A sequential id for this packet segment used for reassembly
      * @param totalsegs - The total number of segments in this packet
      * @param data - The data for this segment.
      */
    def enqueueSegment(segnum: Double, totalsegs: Double, data: js.Any): Unit = js.native
    def onDisconnect(): Unit = js.native
    def onMessageCB(args: js.Any*): Unit = js.native
    /**
      * Actually start the long-polling session by adding the first script tag(s) to the iframe.
      * @param {!string} id - The ID of this connection
      * @param {!string} pw - The password for this connection
      */
    def startLongPoll(id: String, pw: String): Unit = js.native
    def urlFn(a: js.Object): String = js.native
  }
  
  @js.native
  trait IFrameElement extends HTMLIFrameElement {
    var doc: Document = js.native
  }
  
  val FIREBASE_LONGPOLL_CALLBACK_ID_PARAM: cb = js.native
  val FIREBASE_LONGPOLL_CLOSE_COMMAND: close = js.native
  val FIREBASE_LONGPOLL_COMMAND_CB_NAME: pLPCommand = js.native
  val FIREBASE_LONGPOLL_DATA_CB_NAME: pRTLPCB = js.native
  val FIREBASE_LONGPOLL_DATA_PARAM: d = js.native
  val FIREBASE_LONGPOLL_DISCONN_FRAME_PARAM: disconn = js.native
  val FIREBASE_LONGPOLL_DISCONN_FRAME_REQUEST_PARAM: dframe = js.native
  val FIREBASE_LONGPOLL_ID_PARAM: id = js.native
  val FIREBASE_LONGPOLL_PW_PARAM: pw = js.native
  val FIREBASE_LONGPOLL_SEGMENTS_IN_PACKET: ts = js.native
  val FIREBASE_LONGPOLL_SEGMENT_NUM_PARAM: seg = js.native
  val FIREBASE_LONGPOLL_SERIAL_PARAM: ser = js.native
  val FIREBASE_LONGPOLL_START_PARAM: start = js.native
  /* static members */
  @js.native
  object BrowserPollConnection extends js.Object {
    var forceAllow_ : js.Any = js.native
    var forceDisallow_ : js.Any = js.native
    /**
      * Forces long polling to be considered as a potential transport
      */
    def forceAllow(): Unit = js.native
    /**
      * Forces longpolling to not be considered as a potential transport
      */
    def forceDisallow(): Unit = js.native
    def isAvailable(): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object FirebaseIFrameScriptHolder extends js.Object {
    /**
      * Each browser has its own funny way to handle iframes. Here we mush them all together into one object that I can
      * actually use.
      * @private
      * @return {Element}
      */
    var createIFrame_ : js.Any = js.native
  }
  
}

