package typings.expo.expoMod

import typings.expo.buildLaunchWithExpoRootDotTypesMod.InitialProps
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "registerRootComponent")
@js.native
object registerRootComponent extends js.Object {
  def apply[P /* <: InitialProps */](component: ComponentType[P]): Unit = js.native
}

