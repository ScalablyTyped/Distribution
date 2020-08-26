package typings.electron.Electron

import typings.electron.electronStrings.message
import typings.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagePortMain extends EventEmitter {
  @JSName("addListener")
  def addListener_message(event: message, listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type = js.native
  /**
    * Disconnects the port, so it is no longer active.
    */
  def close(): Unit = js.native
  // Docs: http://electronjs.org/docs/api/message-port-main
  /**
    * Emitted when a MessagePortMain object receives a message.
    */
  @JSName("on")
  def on_message(event: message, listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type = js.native
  @JSName("once")
  def once_message(event: message, listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type = js.native
  /**
    * Sends a message from the port, and optionally, transfers ownership of objects to
    * other browsing contexts.
    */
  def postMessage(message: js.Any): Unit = js.native
  def postMessage(message: js.Any, transfer: js.Array[MessagePortMain]): Unit = js.native
  @JSName("removeListener")
  def removeListener_message(event: message, listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type = js.native
  /**
    * Starts the sending of messages queued on the port. Messages will be queued until
    * this method is called.
    */
  def start(): Unit = js.native
}

