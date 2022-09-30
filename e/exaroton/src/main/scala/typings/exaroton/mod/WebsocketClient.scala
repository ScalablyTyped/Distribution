package typings.exaroton.mod

import typings.exaroton.anon.Console
import typings.exaroton.exarotonInts.`3000`
import typings.exaroton.exarotonStrings.ws
import typings.exaroton.exarotonStrings.wss
import typings.node.eventsMod.EventEmitter
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc Websocket client to connect to the websocket for this server
  */
@js.native
trait WebsocketClient extends EventEmitter {
  
  /**
    * Automatically reconnect in cas of a disconnect
    */
  var autoReconnect: Boolean = js.native
  
  /* private */ var availableStreams: Console = js.native
  
  /* private */ var client: Client = js.native
  
  /**
    * Connect to websocket
    */
  def connect(): Unit = js.native
  
  /* private */ var connected: Boolean = js.native
  
  /**
    * Disconnect from the websocket and all streams
    */
  def disconnect(): Unit = js.native
  
  def getServer(): Server = js.native
  
  def getServerStatus(): js.Promise[Double] = js.native
  
  /**
    * Get a stream by name
    *
    * @param stream
    */
  def getStreams(stream: String): Boolean | Stream = js.native
  
  def hasStream(stream: String): Boolean = js.native
  
  def isConnected(): Boolean = js.native
  
  def isReady(): Boolean = js.native
  
  def onClose(): Unit = js.native
  
  def onError(error: js.Error): Boolean = js.native
  
  def onMessage(rawMessage: String): Unit = js.native
  
  def onOpen(): Unit = js.native
  
  val protocol: wss | ws = js.native
  
  /* private */ var ready: Boolean = js.native
  
  /* private */ var reconnectInterval: Any = js.native
  
  /**
    * Time to wait to reconnect
    *
    * Only change this with caution. A time too low here can
    * cause a spam in requests which can get your application
    * rate limited or even blocked.
    */
  var reconnectTimeout: `3000` | Double = js.native
  
  def removeStreams(stream: String): Unit = js.native
  
  /**
    * @param stream
    * @param type
    * @param data
    */
  def send(stream: String, `type`: String, data: String): Boolean = js.native
  
  /* private */ var server: Server = js.native
  
  /* private */ var serverConnected: Boolean = js.native
  
  /* private */ var shouldConnect: Boolean = js.native
  
  /* private */ var streams: js.Array[Stream] = js.native
  
  def tryToStartStreams(): Unit = js.native
  
  /* private */ var websocket: WebSocket = js.native
}
