package typings.electron.Electron

import typings.electron.electronStrings.close
import typings.electron.electronStrings.message
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagePortMain extends EventEmitter {
  
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_message(event: message, listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type = js.native
  
  /**
    * Disconnects the port, so it is no longer active.
    */
  def close(): Unit = js.native
  
  // Docs: https://electronjs.org/docs/api/message-port-main
  /**
    * Emitted when the remote end of a MessagePortMain object becomes disconnected.
    */
  @JSName("on")
  def on_close(event: close, listener: js.Function): this.type = js.native
  /**
    * Emitted when a MessagePortMain object receives a message.
    */
  @JSName("on")
  def on_message(event: message, listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type = js.native
  
  @JSName("once")
  def once_close(event: close, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_message(event: message, listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type = js.native
  
  /**
    * Sends a message from the port, and optionally, transfers ownership of objects to
    * other browsing contexts.
    */
  def postMessage(message: js.Any): Unit = js.native
  def postMessage(message: js.Any, transfer: js.Array[MessagePortMain]): Unit = js.native
  
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_message(event: message, listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type = js.native
  
  /**
    * Starts the sending of messages queued on the port. Messages will be queued until
    * this method is called.
    */
  def start(): Unit = js.native
}
