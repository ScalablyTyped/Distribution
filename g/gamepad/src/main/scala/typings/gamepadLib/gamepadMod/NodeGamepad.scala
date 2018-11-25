package typings
package gamepadLib.gamepadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGamepad
  extends nodeLib.eventsMod.EventEmitter {
  def detectDevices(): scala.Unit = js.native
  def deviceAtIndex(deviceIndex: scala.Double): GamepadInstance = js.native
  def init(): scala.Unit = js.native
  def numDevices(): scala.Double = js.native
  @JSName("on")
  def on_attach(
    event: gamepadLib.gamepadLibStrings.attach,
    listener: js.Function2[/* deviceID */ scala.Double, /* device */ GamepadInstance, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_down(
    event: gamepadLib.gamepadLibStrings.down,
    listener: js.Function3[
      /* deviceID */ scala.Double, 
      /* buttonID */ scala.Double, 
      /* timestamp */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_move(
    event: gamepadLib.gamepadLibStrings.move,
    listener: js.Function5[
      /* deviceID */ scala.Double, 
      /* axisID */ scala.Double, 
      /* value */ scala.Double, 
      /* lastValue */ scala.Double, 
      /* timestamp */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_remove(
    event: gamepadLib.gamepadLibStrings.remove,
    listener: js.Function1[/* deviceID */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_up(
    event: gamepadLib.gamepadLibStrings.up,
    listener: js.Function3[
      /* deviceID */ scala.Double, 
      /* buttonID */ scala.Double, 
      /* timestamp */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  def processEvents(): scala.Unit = js.native
  def shutdown(): scala.Unit = js.native
}

