package typings.electron.Electron

import typings.electron.electronStrings.message
import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentPort
  extends StObject
     with EventEmitter {
  
  @JSName("addListener")
  def addListener_message(event: message, listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type = js.native
  
  // Docs: https://electronjs.org/docs/api/parent-port
  /**
    * Emitted when the process receives a message. Messages received on this port will
    * be queued up until a handler is registered for this event.
    */
  @JSName("on")
  def on_message(event: message, listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type = js.native
  
  @JSName("once")
  def once_message(event: message, listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type = js.native
  
  /**
    * Sends a message from the process to its parent.
    */
  def postMessage(message: Any): Unit = js.native
  
  @JSName("removeListener")
  def removeListener_message(event: message, listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type = js.native
}
