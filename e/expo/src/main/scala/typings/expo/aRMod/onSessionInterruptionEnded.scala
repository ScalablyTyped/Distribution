package typings.expo.aRMod

import typings.reactNative.mod.EmitterSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/AR", "onSessionInterruptionEnded")
@js.native
object onSessionInterruptionEnded extends js.Object {
  def apply(listener: js.Function1[/* event */ SessionInterruptionEndedEvent, Unit]): EmitterSubscription = js.native
}

