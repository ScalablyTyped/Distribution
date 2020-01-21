package typings.expo.aRMod

import typings.reactNative.mod.EmitterSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/AR", "onAnchorsDidUpdate")
@js.native
object onAnchorsDidUpdate extends js.Object {
  def apply(listener: js.Function1[/* event */ AnchorsDidUpdateEvent, Unit]): EmitterSubscription = js.native
}

