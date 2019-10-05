package typings.expo.buildARMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/AR", "startAsync")
@js.native
object startAsync extends js.Object {
  def apply(node: ReactNativeNodeHandle, configuration: TrackingConfiguration): js.Promise[ARStartResult] = js.native
  def apply(node: Component[js.Object, js.Object, _], configuration: TrackingConfiguration): js.Promise[ARStartResult] = js.native
}

