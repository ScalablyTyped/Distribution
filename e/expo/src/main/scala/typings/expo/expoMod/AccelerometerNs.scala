package typings.expo.expoMod

import typings.expo.expoMod.AccelerometerNs.AccelerometerObject
import typings.fbemitter.fbemitterMod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Accelerometer")
@js.native
object AccelerometerNs extends js.Object {
  trait AccelerometerObject extends js.Object {
    var x: Axis
    var y: Axis
    var z: Axis
  }
  
  /**
    * Subscribe for updates to the accelerometer.
    * @param listener A callback that is invoked when an accelerometer update is available. When invoked, the listener is provided a single argumument that is an object containing keys x, y, z.
    * @returns An EventSubscription object that you can call remove() on when you would like to unsubscribe the listener.
    */
  def addListener(listener: js.Function1[/* obj */ AccelerometerObject, _]): EventSubscription = js.native
  /** Remove all listeners. */
  def removeAllListeners(): Unit = js.native
  /**
    * Subscribe for updates to the accelerometer.
    * @param intervalMs Desired interval in milliseconds between accelerometer updates.
    */
  def setUpdateInterval(intervalMs: Double): Unit = js.native
}

