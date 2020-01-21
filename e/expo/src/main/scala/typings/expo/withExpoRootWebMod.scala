package typings.expo

import typings.expo.withExpoRootTypesMod.InitialProps
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/launch/withExpoRoot.web", JSImport.Namespace)
@js.native
object withExpoRootWebMod extends js.Object {
  def default[P /* <: InitialProps */](AppRootComponent: ComponentType[P]): ComponentClass[P, ComponentState] = js.native
}

