package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Pedometer")
@js.native
object PedometerNs extends js.Object {
  def getStepCountAsync(start: stdLib.Date, end: stdLib.Date): stdLib.Promise[expoLib.Anon_Steps] = js.native
  def isAvailableAsync(): stdLib.Promise[scala.Boolean] = js.native
  def watchStepCount(callback: js.Function1[/* params */ expoLib.Anon_Steps, scala.Unit]): fbemitterLib.fbemitterMod.EventSubscription = js.native
}

