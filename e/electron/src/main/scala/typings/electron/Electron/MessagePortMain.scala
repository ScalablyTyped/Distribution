package typings.electron.Electron

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagePortMain extends EventEmitter {
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_close")
  def addListener(event: "close", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_message")
  def addListener(event: "message", listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type = js.native
  
  /**
    * Disconnects the port, so it is no longer active.
    */
  def close(): Unit = js.native
  
  // Docs: https://electronjs.org/docs/api/message-port-main
  /**
    * Emitted when the remote end of a MessagePortMain object becomes disconnected.
    */
  @JSName("on")
  @scala.annotation.targetName("on_close")
  def on(event: "close", listener: js.Function): this.type = js.native
  /**
    * Emitted when a MessagePortMain object receives a message.
    */
  @JSName("on")
  @scala.annotation.targetName("on_message")
  def on(event: "message", listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_close")
  def once(event: "close", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_message")
  def once(event: "message", listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type = js.native
  
  /**
    * Sends a message from the port, and optionally, transfers ownership of objects to
    * other browsing contexts.
    */
  def postMessage(message: Any): Unit = js.native
  def postMessage(message: Any, transfer: js.Array[MessagePortMain]): Unit = js.native
  
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_close")
  def removeListener(event: "close", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_message")
  def removeListener(event: "message", listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type = js.native
  
  /**
    * Starts the sending of messages queued on the port. Messages will be queued until
    * this method is called.
    */
  def start(): Unit = js.native
}
