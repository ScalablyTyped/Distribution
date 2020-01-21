package typings.expo.mod

import typings.expo.withExpoRootTypesMod.InitialProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "registerRootComponent")
@js.native
object registerRootComponent extends js.Object {
  def apply[P /* <: InitialProps */](component: ComponentType[P]): Unit = js.native
}

