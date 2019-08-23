package typings.expo.expoMod

import typings.expo.buildLaunchWithExpoRootDotTypesMod.InitialProps
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Linking: js.Any = js.native
  def apisAreAvailable(): Boolean = js.native
  def registerRootComponent[P /* <: InitialProps */](component: ComponentType[P]): Unit = js.native
}

