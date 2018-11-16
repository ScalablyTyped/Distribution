package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Magnetometer")
@js.native
object MagnetometerNs extends js.Object {
  
  trait MagnetometerObject extends js.Object {
    var x: expoLib.expoMod.Axis
    var y: expoLib.expoMod.Axis
    var z: expoLib.expoMod.Axis
  }
  
  def addListener(listener: js.Function1[/* obj */ MagnetometerObject, _]): fbemitterLib.fbemitterMod.EventSubscription = js.native
  def removeAllListeners(): scala.Unit = js.native
  def setUpdateInterval(intervalMs: scala.Double): scala.Unit = js.native
}

