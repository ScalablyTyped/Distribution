package typings.expo.expoMod

import typings.expo.expoMod.GyroscopeNs.GyroscopeObject
import typings.fbemitter.fbemitterMod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Gyroscope")
@js.native
object GyroscopeNs extends js.Object {
  trait GyroscopeObject extends js.Object {
    var x: Axis
    var y: Axis
    var z: Axis
  }
  
  /** A callback that is invoked when an gyroscope update is available. */
  def addListener(listener: js.Function1[/* obj */ GyroscopeObject, _]): EventSubscription = js.native
  /** Remove all listeners. */
  def removeAllListeners(): Unit = js.native
  /** Subscribe for updates to the gyroscope. */
  def setUpdateInterval(intervalMs: Double): Unit = js.native
}

