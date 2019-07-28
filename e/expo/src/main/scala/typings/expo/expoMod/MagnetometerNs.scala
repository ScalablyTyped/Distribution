package typings.expo.expoMod

import typings.expo.expoMod.MagnetometerNs.MagnetometerObject
import typings.fbemitter.fbemitterMod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Magnetometer")
@js.native
object MagnetometerNs extends js.Object {
  trait MagnetometerObject extends js.Object {
    var x: Axis
    var y: Axis
    var z: Axis
  }
  
  def addListener(listener: js.Function1[/* obj */ MagnetometerObject, _]): EventSubscription = js.native
  def removeAllListeners(): Unit = js.native
  def setUpdateInterval(intervalMs: Double): Unit = js.native
}

