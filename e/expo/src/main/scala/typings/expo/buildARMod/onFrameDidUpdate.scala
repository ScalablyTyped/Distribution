package typings.expo.buildARMod

import typings.reactDashNative.reactDashNativeMod.EmitterSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/AR", "onFrameDidUpdate")
@js.native
object onFrameDidUpdate extends js.Object {
  def apply(listener: js.Function1[/* event */ FrameDidUpdateEvent, Unit]): EmitterSubscription = js.native
}

