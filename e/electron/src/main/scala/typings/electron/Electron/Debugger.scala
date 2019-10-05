package typings.electron.Electron

import typings.electron.electronStrings.detach
import typings.electron.electronStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.Debugger")
@js.native
class Debugger () extends EventEmitter {
  @JSName("addListener")
  def addListener_detach(event: detach, listener: js.Function2[/* event */ Event, /* reason */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(
    event: message,
    listener: js.Function3[/* event */ Event, /* method */ String, /* params */ js.Any, Unit]
  ): this.type = js.native
  /**
    * Attaches the debugger to the webContents.
    */
  def attach(): Unit = js.native
  def attach(protocolVersion: String): Unit = js.native
  /**
    * Detaches the debugger from the webContents.
    */
  def detach(): Unit = js.native
  def isAttached(): Boolean = js.native
  // Docs: http://electronjs.org/docs/api/debugger
  /**
    * Emitted when debugging session is terminated. This happens either when
    * webContents is closed or devtools is invoked for the attached webContents.
    */
  @JSName("on")
  def on_detach(event: detach, listener: js.Function2[/* event */ Event, /* reason */ String, Unit]): this.type = js.native
  /**
    * Emitted whenever debugging target issues instrumentation event.
    */
  @JSName("on")
  def on_message(
    event: message,
    listener: js.Function3[/* event */ Event, /* method */ String, /* params */ js.Any, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_detach(event: detach, listener: js.Function2[/* event */ Event, /* reason */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_message(
    event: message,
    listener: js.Function3[/* event */ Event, /* method */ String, /* params */ js.Any, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_detach(event: detach, listener: js.Function2[/* event */ Event, /* reason */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_message(
    event: message,
    listener: js.Function3[/* event */ Event, /* method */ String, /* params */ js.Any, Unit]
  ): this.type = js.native
  /**
    * Send given command to the debugging target.
    */
  def sendCommand(method: String): js.Promise[_] = js.native
  def sendCommand(method: String, commandParams: js.Any): js.Promise[_] = js.native
  def sendCommand(
    method: String,
    commandParams: js.Any,
    callback: js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Send given command to the debugging target. Deprecated Soon
    */
  @JSName("sendCommand")
  def sendCommand_Unit(method: String): Unit = js.native
  @JSName("sendCommand")
  def sendCommand_Unit(method: String, commandParams: js.Any): Unit = js.native
}

