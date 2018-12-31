package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Gyroscope")
@js.native
object GyroscopeNs extends js.Object {
  trait GyroscopeObject extends js.Object {
    var x: expoLib.expoMod.Axis
    var y: expoLib.expoMod.Axis
    var z: expoLib.expoMod.Axis
  }
  
  /** A callback that is invoked when an gyroscope update is available. */
  def addListener(listener: js.Function1[/* obj */ GyroscopeObject, _]): fbemitterLib.fbemitterMod.EventSubscription = js.native
  /** Remove all listeners. */
  def removeAllListeners(): scala.Unit = js.native
  /** Subscribe for updates to the gyroscope. */
  def setUpdateInterval(intervalMs: scala.Double): scala.Unit = js.native
}

