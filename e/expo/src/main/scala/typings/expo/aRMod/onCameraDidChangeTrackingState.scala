package typings.expo.aRMod

import typings.reactNative.mod.EmitterSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/AR", "onCameraDidChangeTrackingState")
@js.native
object onCameraDidChangeTrackingState extends js.Object {
  def apply(listener: js.Function1[/* event */ CameraDidChangeTrackingStateEvent, Unit]): EmitterSubscription = js.native
}

