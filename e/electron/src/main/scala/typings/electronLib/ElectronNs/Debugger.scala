package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.Debugger")
@js.native
class Debugger () extends EventEmitter {
  @JSName("addListener")
  def addListener_detach(
    event: electronLib.electronLibStrings.detach,
    listener: js.Function2[/* event */ Event, /* reason */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_message(
    event: electronLib.electronLibStrings.message,
    listener: js.Function3[/* event */ Event, /* method */ java.lang.String, /* params */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
       * Attaches the debugger to the webContents.
       */
  def attach(): scala.Unit = js.native
  /**
       * Attaches the debugger to the webContents.
       */
  def attach(protocolVersion: java.lang.String): scala.Unit = js.native
  /**
       * Detaches the debugger from the webContents.
       */
  def detach(): scala.Unit = js.native
  def isAttached(): scala.Boolean = js.native
  // Docs: http://electron.atom.io/docs/api/debugger
  /**
       * Emitted when debugging session is terminated. This happens either when
       * webContents is closed or devtools is invoked for the attached webContents.
       */
  @JSName("on")
  def on_detach(
    event: electronLib.electronLibStrings.detach,
    listener: js.Function2[/* event */ Event, /* reason */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
       * Emitted whenever debugging target issues instrumentation event.
       */
  @JSName("on")
  def on_message(
    event: electronLib.electronLibStrings.message,
    listener: js.Function3[/* event */ Event, /* method */ java.lang.String, /* params */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_detach(
    event: electronLib.electronLibStrings.detach,
    listener: js.Function2[/* event */ Event, /* reason */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_message(
    event: electronLib.electronLibStrings.message,
    listener: js.Function3[/* event */ Event, /* method */ java.lang.String, /* params */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_detach(
    event: electronLib.electronLibStrings.detach,
    listener: js.Function2[/* event */ Event, /* reason */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_message(
    event: electronLib.electronLibStrings.message,
    listener: js.Function3[/* event */ Event, /* method */ java.lang.String, /* params */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
       * Send given command to the debugging target.
       */
  def sendCommand(method: java.lang.String): scala.Unit = js.native
  /**
       * Send given command to the debugging target.
       */
  def sendCommand(method: java.lang.String, commandParams: js.Any): scala.Unit = js.native
  /**
       * Send given command to the debugging target.
       */
  def sendCommand(
    method: java.lang.String,
    commandParams: js.Any,
    callback: js.Function2[/* error */ js.Any, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

