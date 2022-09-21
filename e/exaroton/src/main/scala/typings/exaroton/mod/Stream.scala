package typings.exaroton.mod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stream extends EventEmitter {
  
  /* private */ val client: WebsocketClient = js.native
  
  /**
    * Double event emitter for generic or specific event handling
    *
    * @param type
    * @param data
    */
  def emitEvent(`type`: String, data: js.Array[js.Object]): Unit = js.native
  
  def isStarted(): Boolean = js.native
  
  val name: String = js.native
  
  def onDataMessage(`type`: String, message: Any): Unit = js.native
  
  def onDisconnect(): Unit = js.native
  
  /**
    * Message event listener
    *
    * @param message
    */
  def onMessage(message: Message): Unit = js.native
  
  /**
    * Status change event
    */
  def onStatusChange(): Boolean = js.native
  
  def send(`type`: SubscriptionType, data: Any): Boolean = js.native
  
  /**
    * Should/can this stream be started
    */
  def shouldBeStarted(): js.Promise[Boolean] = js.native
  
  /* private */ var shouldStart: Boolean = js.native
  
  /**
    * Start this stream
    */
  def start(): Unit = js.native
  def start(data: Any): Unit = js.native
  
  val startData: js.Object | String = js.native
  
  val startStatuses: js.Array[StreamStatus] = js.native
  
  /* private */ var started: Boolean = js.native
  
  /**
    * Stop this stream
    */
  def stop(): Unit = js.native
  
  /**
    * Try to start if possible
    */
  def tryToStart(): js.Promise[Unit] = js.native
  
  /**
    * Try to stop this stream if possible
    */
  def tryToStop(): js.Promise[Boolean] = js.native
}
