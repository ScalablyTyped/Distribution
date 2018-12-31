package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Accelerometer")
@js.native
object AccelerometerNs extends js.Object {
  trait AccelerometerObject extends js.Object {
    var x: expoLib.expoMod.Axis
    var y: expoLib.expoMod.Axis
    var z: expoLib.expoMod.Axis
  }
  
  /**
    * Subscribe for updates to the accelerometer.
    * @param listener A callback that is invoked when an accelerometer update is available. When invoked, the listener is provided a single argumument that is an object containing keys x, y, z.
    * @returns An EventSubscription object that you can call remove() on when you would like to unsubscribe the listener.
    */
  def addListener(listener: js.Function1[/* obj */ AccelerometerObject, _]): fbemitterLib.fbemitterMod.EventSubscription = js.native
  /** Remove all listeners. */
  def removeAllListeners(): scala.Unit = js.native
  /**
    * Subscribe for updates to the accelerometer.
    * @param intervalMs Desired interval in milliseconds between accelerometer updates.
    */
  def setUpdateInterval(intervalMs: scala.Double): scala.Unit = js.native
}

