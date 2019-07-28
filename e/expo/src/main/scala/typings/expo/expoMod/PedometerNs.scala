package typings.expo.expoMod

import typings.expo.Anon_Steps
import typings.fbemitter.fbemitterMod.EventSubscription
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Pedometer")
@js.native
object PedometerNs extends js.Object {
  def getStepCountAsync(start: Date, end: Date): js.Promise[Anon_Steps] = js.native
  def isAvailableAsync(): js.Promise[Boolean] = js.native
  def watchStepCount(callback: js.Function1[/* params */ Anon_Steps, Unit]): EventSubscription = js.native
}

