package typings.electron.Electron

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debugger extends EventEmitter {
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_detach")
  def addListener(event: "detach", listener: js.Function2[/* event */ Event, /* reason */ String, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_message")
  def addListener(
    event: "message",
    listener: js.Function4[/* event */ Event, /* method */ String, /* params */ Any, /* sessionId */ String, Unit]
  ): this.type = js.native
  
  /**
    * Attaches the debugger to the `webContents`.
    */
  def attach(): Unit = js.native
  def attach(protocolVersion: String): Unit = js.native
  
  /**
    * Detaches the debugger from the `webContents`.
    */
  def detach(): Unit = js.native
  
  /**
    * Whether a debugger is attached to the `webContents`.
    */
  def isAttached(): Boolean = js.native
  
  // Docs: https://electronjs.org/docs/api/debugger
  /**
    * Emitted when the debugging session is terminated. This happens either when
    * `webContents` is closed or devtools is invoked for the attached `webContents`.
    */
  @JSName("on")
  @scala.annotation.targetName("on_detach")
  def on(event: "detach", listener: js.Function2[/* event */ Event, /* reason */ String, Unit]): this.type = js.native
  /**
    * Emitted whenever the debugging target issues an instrumentation event.
    */
  @JSName("on")
  @scala.annotation.targetName("on_message")
  def on(
    event: "message",
    listener: js.Function4[/* event */ Event, /* method */ String, /* params */ Any, /* sessionId */ String, Unit]
  ): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_detach")
  def once(event: "detach", listener: js.Function2[/* event */ Event, /* reason */ String, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_message")
  def once(
    event: "message",
    listener: js.Function4[/* event */ Event, /* method */ String, /* params */ Any, /* sessionId */ String, Unit]
  ): this.type = js.native
  
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_detach")
  def removeListener(event: "detach", listener: js.Function2[/* event */ Event, /* reason */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_message")
  def removeListener(
    event: "message",
    listener: js.Function4[/* event */ Event, /* method */ String, /* params */ Any, /* sessionId */ String, Unit]
  ): this.type = js.native
  
  /**
    * A promise that resolves with the response defined by the 'returns' attribute of
    * the command description in the remote debugging protocol or is rejected
    * indicating the failure of the command.
    *
    * Send given command to the debugging target.
    */
  def sendCommand(method: String): js.Promise[Any] = js.native
  def sendCommand(method: String, commandParams: Any): js.Promise[Any] = js.native
  def sendCommand(method: String, commandParams: Any, sessionId: String): js.Promise[Any] = js.native
  def sendCommand(method: String, commandParams: Unit, sessionId: String): js.Promise[Any] = js.native
}
